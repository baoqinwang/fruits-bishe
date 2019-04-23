package com.zzti.fruits.service.iml;
import java.util.Date;
import java.util.List;

import com.zzti.fruits.entity.PageResult;
import com.zzti.fruits.mapper.StockInfoMapper;
import com.zzti.fruits.pojo.Goods;
import com.zzti.fruits.pojo.StockInfo;
import com.zzti.fruits.pojo.StockInfoExample;
import com.zzti.fruits.pojogroup.GroupStockInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import com.zzti.fruits.service.StockInfoService;


import org.springframework.stereotype.Service;

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
	
}
