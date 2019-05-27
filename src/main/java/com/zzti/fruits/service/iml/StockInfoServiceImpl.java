package com.zzti.fruits.service.iml;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.zzti.fruits.entity.PageResult;
import com.zzti.fruits.mapper.StockInfoMapper;
import com.zzti.fruits.pojo.Goods;
import com.zzti.fruits.pojo.StockInfo;
import com.zzti.fruits.pojogroup.GroupStockInfo;
import com.zzti.fruits.util.ExcelUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import com.zzti.fruits.service.StockInfoService;


import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class StockInfoServiceImpl implements StockInfoService {

	@Autowired
	private StockInfoMapper stockInfoMapper;

	/**
	 * 查询全部
	 */
	@Override
	public List<StockInfo> findAll() {
		return stockInfoMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		Page<StockInfo> page=   (Page<StockInfo>) stockInfoMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(StockInfo stockinfo) {
		stockInfoMapper.insert(stockinfo);
	}


	/**
	 * 修改
	 */
	@Override
	public void update(StockInfo stockinfo){
		stockinfo.setUpTlr("admin");
		stockinfo.setUpTm(new Date());
		stockInfoMapper.updateByPrimaryKey(stockinfo);
	}

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public StockInfo findOne(Long id){
		return stockInfoMapper.selectByPrimaryKey(id.toString());
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			stockInfoMapper.deleteByPrimaryKey(id.toString());
		}
	}


		@Override
	public PageResult findPage(Goods goods, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);

             if(StringUtils.isNotBlank(goods.getGoodname()))
             	goods.setGoodname("%"+goods.getGoodname()+"%");
			Page<GroupStockInfo> page= (Page<GroupStockInfo>) stockInfoMapper.Search(goods.getGoodname(), goods.getFid(), goods.getSid());
			return new PageResult(page.getTotal(), page.getResult());
	}

	@Override
	public PageResult searchPoi(int page, int rows, String stockCount, String fid, String sid) {
		PageHelper.startPage(page, rows);
     if(stockCount.equals("undefined"))
     	stockCount="";
     if(fid.equals("undefined"))
          fid="";
     if(sid.equals("undefined"))
     	sid="";
		Page<GroupStockInfo> pageResult= (Page<GroupStockInfo>) stockInfoMapper.searchPoi(stockCount, fid,sid);
		return new PageResult(pageResult.getTotal(), pageResult.getResult());
	}

	@Override
	public void stockInfoReport(HttpServletResponse response,String stockCount,String fid,String sid) {

		//设置表头
		List<String> head = new ArrayList<>();
		head.add("序号");
		head.add("商品名称");
		head.add("一级分类");
		head.add("二级分类");
		head.add("库存数量");
		head.add("最小库存量");
		head.add("存储地点");


		int i=0;
		List<List<String>> body = new ArrayList<>();
		List<GroupStockInfo> groupStockInfos = stockInfoMapper.searchPoi(stockCount, fid, sid);
		for (GroupStockInfo item:
				groupStockInfos) {
			i++;
			List<String> bodyValue = new ArrayList<>();
			bodyValue.add(String.valueOf(i+""));
			bodyValue.add(item.getGoodName());
			bodyValue.add(item.getFname());
			bodyValue.add(item.getSname());
			bodyValue.add(item.getStockCount()+"");
			bodyValue.add(item.getMinStockCount()+"");
			bodyValue.add(item.getStorageLocation());

			
			body.add(bodyValue);
		}

		String fileName = "低库存汇总.xls";
		HSSFWorkbook excel = ExcelUtils.expExcel(head,body);
		ExcelUtils.outFile(excel,"./"+fileName,response);
	}

}
