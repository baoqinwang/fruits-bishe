package com.zzti.fruits.service.iml;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.zzti.fruits.entity.PageResult;
import com.zzti.fruits.mapper.DdinfoMapper;
import com.zzti.fruits.pojo.Ddinfo;
import com.zzti.fruits.pojogroup.OrderPoiParam;
import com.zzti.fruits.util.ExcelUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import com.zzti.fruits.service.DdinfoService;


import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class DdinfoServiceImpl implements DdinfoService {

	@Autowired
	private DdinfoMapper ddinfoMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<Ddinfo> findAll() {
		return ddinfoMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<Ddinfo> page=   (Page<Ddinfo>) ddinfoMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(Ddinfo ddinfo) {
		ddinfoMapper.insert(ddinfo);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(Ddinfo ddinfo){
		ddinfoMapper.updateByPrimaryKeySelective(ddinfo);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public Ddinfo findOne(Long id){
		return ddinfoMapper.selectByPrimaryKey(id.intValue());
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			ddinfoMapper.deleteByPrimaryKey(id.intValue());
		}		
	}
	
	
		@Override
	public PageResult findPage(Ddinfo ddinfo, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);

		Page<Ddinfo> page= (Page<Ddinfo>)ddinfoMapper.Search(ddinfo.getDdno(),ddinfo.getMemberid(),ddinfo.getFhstatus(),ddinfo.getDdstate());
		return new PageResult(page.getTotal(), page.getResult());
	}

	@Override
	public void updateState(Ddinfo ddinfo) {
		ddinfoMapper.updateByPrimaryKeySelective(ddinfo);
	}

	@Override
	public PageResult findPoiPage(OrderPoiParam orderPoiParam, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum,pageSize);
		Page<Ddinfo> page= (Page<Ddinfo>)ddinfoMapper.searchReport(orderPoiParam);
		return new PageResult(page.getTotal(), page.getResult());

	}

	@Override
	public void excelPoiSearch(OrderPoiParam orderPoiParam, HttpServletResponse response) {
		List<Ddinfo> ddinfos = ddinfoMapper.searchReport(orderPoiParam);
		List<String> head = new ArrayList<>();
		head.add("序号");
		head.add("订单编号");
		head.add("用户名");
		head.add("交易金额");
		head.add("订单地址");
		head.add("修改地址");
		head.add("发货状态");
		head.add("用户备注");
		head.add("物流类型");
		head.add("物流编号");
		head.add("订单状态");
		head.add("订单时间");
		List<List<String>> body = new ArrayList<>();
		int i=0;
		for (Ddinfo ddinfo:
			 ddinfos) {
			i++;
			List<String> bodyValue = new ArrayList<>();
			bodyValue.add(String.valueOf(i+""));
            bodyValue.add(ddinfo.getDdno());
            bodyValue.add(ddinfo.getMemberid());
            bodyValue.add(ddinfo.getDdtotal());
            bodyValue.add(ddinfo.getLxfs());
            bodyValue.add(ddinfo.getNewadd());
            bodyValue.add(ddinfo.getFhstatus());
            bodyValue.add(ddinfo.getRemark());
            	if("SFEXPRESS".equals(ddinfo.getWltype()))
            		bodyValue.add("顺丰快递");
            	else  if("YTO".equals(ddinfo.getWltype()))
            		bodyValue.add("圆通快递");
            	else  if("STO".equals(ddinfo.getWltype()))
            		bodyValue.add("申通快递");
            	else  if("YUNDA".equals(ddinfo.getWltype()))
					bodyValue.add("韵达快递");
				else  if("HTKY".equals(ddinfo.getWltype()))
					bodyValue.add("百事快递");
				else  if("CHINAPOST".equals(ddinfo.getWltype()))
					bodyValue.add("中国邮政");
				else  if("others".equals(ddinfo.getWltype()))
					bodyValue.add("其他");
				else
					bodyValue.add("");
			bodyValue.add(ddinfo.getWlinfo());
		     if("00".equals(ddinfo.getDdstate()))
		     	bodyValue.add("交易成功");
		     else  if("01".equals(ddinfo.getDdstate()))
		     	bodyValue.add("待付款");
			 else  if("01".equals(ddinfo.getDdstate()))
				 bodyValue.add("待付款");
			 else  if("02".equals(ddinfo.getDdstate()))
				 bodyValue.add("已付款");
			 else  if("03".equals(ddinfo.getDdstate()))
				 bodyValue.add("运输中");
			 else  if("04".equals(ddinfo.getDdstate()))
				 bodyValue.add("退货申请中");
			 else  if("05".equals(ddinfo.getDdstate()))
				 bodyValue.add("退货中");
			 else  if("06".equals(ddinfo.getDdstate()))
				 bodyValue.add("退货成功");
			 else bodyValue.add(ddinfo.getDdstate());
			 bodyValue.add(ddinfo.getSavetime());
			//将数据添加到报表体中
			body.add(bodyValue);
		}

		String fileName = "订单统计.xls";
		HSSFWorkbook excel = ExcelUtils.expExcel(head,body);
		ExcelUtils.outFile(excel,"./"+fileName,response);
	}

	@Override
	public void shortageoOrderReport(HttpServletResponse response) {
		//设置表头
		List<String> head = new ArrayList<>();
		head.add("序号");
		head.add("订单编号");
		head.add("订单时间");
		head.add("买家姓名");
		head.add("商品名");
		head.add("商品价格");
		head.add("购买数量");
		head.add("订单地址");
		head.add("修改地址");
		head.add("买家备注");
		head.add("订单状态");
		int i=0;
		List<List<String>> body = new ArrayList<>();
		List<HashMap<String, Object>> hashMaps = ddinfoMapper.shortageoOrderReport();
		for (HashMap<String,Object> map:
				hashMaps) {
			i++;
			List<String> bodyValue = new ArrayList<>();
			bodyValue.add(String.valueOf(i+""));
			bodyValue.add((String)map.get("ddno"));
			bodyValue.add((String)map.get("savetime"));
			bodyValue.add((String)map.get("memberid"));
			bodyValue.add((String)map.get("goodname"));
			bodyValue.add((String)map.get("price"));
			bodyValue.add((String)map.get("num"));
			bodyValue.add((String)map.get("lxfs"));
			bodyValue.add((String)map.get("newadd"));
			bodyValue.add((String)map.get("remark"));


			if("00".equals((String)map.get("ddstate")))
				bodyValue.add("交易成功");
			else  if("01".equals((String)map.get("ddstate")))
				bodyValue.add("待付款");
			else  if("01".equals((String)map.get("ddstate")))
				bodyValue.add("待付款");
			else  if("02".equals((String)map.get("ddstate")))
				bodyValue.add("已付款");
			else  if("03".equals((String)map.get("ddstate")))
				bodyValue.add("运输中");
			else  if("04".equals((String)map.get("ddstate")))
				bodyValue.add("退货申请中");
			else  if("05".equals((String)map.get("ddstate")))
				bodyValue.add("退货中");
			else  if("06".equals((String)map.get("ddstate")))
				bodyValue.add("退货成功");
			else bodyValue.add((String)map.get("ddstate"));
			//将数据添加到报表体中
			body.add(bodyValue);
		}

		String fileName = "缺货订单统计.xls";
		HSSFWorkbook excel = ExcelUtils.expExcel(head,body);
		ExcelUtils.outFile(excel,"./"+fileName,response);
	}

}
