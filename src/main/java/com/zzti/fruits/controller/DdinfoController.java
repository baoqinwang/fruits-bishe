package com.zzti.fruits.controller;
import java.util.List;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.zzti.fruits.entity.PageResult;
import com.zzti.fruits.entity.Result;
import com.zzti.fruits.pojo.Ddinfo;
import com.zzti.fruits.pojogroup.OrderPoiParam;
import com.zzti.fruits.util.ApiKdwlUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zzti.fruits.service.DdinfoService;

import javax.servlet.http.HttpServletResponse;


/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/ddinfo")
public class DdinfoController {

	@Autowired
	private DdinfoService ddinfoService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<Ddinfo> findAll(){
		return ddinfoService.findAll();
	}
	
	

	
	/**
	 * 增加
	 * @param ddinfo
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody Ddinfo ddinfo){
		try {
			ddinfoService.add(ddinfo);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param ddinfo
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody Ddinfo ddinfo){
		try {
			ddinfoService.update(ddinfo);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}	
	
	/**
	 * 获取实体
	 * @param id
	 * @return
	 */
	@RequestMapping("/findOne")
	public Ddinfo findOne(Long id){
		return ddinfoService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			ddinfoService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
		/**
	 * 查询+分页
	 * @param ddinfo
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search(@RequestBody Ddinfo ddinfo, int page, int rows  ){
		return ddinfoService.findPage(ddinfo, page, rows);		
	}

	/**
	 * 查询物流信息
	 * @param wltype
	 * @param wlinfo
	 * @return
	 */
	@RequestMapping("/searchwl")
	public Result searchWl(String wltype,String wlinfo ){
		String kdwl = ApiKdwlUtils.getKdwl(wltype, wlinfo);
		JSONObject jsonObject = (JSONObject) JSONObject.parse(kdwl);
		String msg = jsonObject.getString("msg");
		System.out.println(msg);
		if(!msg.equals("没有信息"))
		{
			JSONArray jsonArray = jsonObject.getJSONObject("result").getJSONArray("list");
			String s = jsonArray.toJSONString();
			System.out.println(s);
			return new Result(true, s);
		}else
		return new Result(false, "没有信息");
	}
	/**
	 * 修改订单状态
	 * @param ddinfo
	 * @return
	 */
	@RequestMapping("/updateState")
	public Result updateState(@RequestBody Ddinfo ddinfo){
		try {
			ddinfoService.updateState(ddinfo);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}
	/**
	 * 查询报表+分页
	 * @param orderPoiParam
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/findPoiPage")
	public PageResult findPoiPage(@RequestBody OrderPoiParam orderPoiParam, int page, int rows  ){
		return ddinfoService.findPoiPage(orderPoiParam, page, rows);
//        return null;
	}

	/**
	 *
	 *订单汇总报表下载
	 * @param beginTime
	 * @param endTime
	 * @param ddstate
	 * @param response
	 */
	@RequestMapping("/excelPoiSearch")
	public void excelPoiSearch(String beginTime,String endTime,String ddstate,HttpServletResponse response){

		ddinfoService.excelPoiSearch(new OrderPoiParam(beginTime,endTime,ddstate),response);
//        return null;
	}

	/**
	 * 订单查询导出
	 * @param ddno
	 * @param memberid
	 * @param fhstatus
	 * @param ddstate
	 * @param response
	 */
	@RequestMapping("exportList")
	public void exportList(String ddno,String memberid,String fhstatus,String ddstate,HttpServletResponse response){
		Ddinfo ddinfo=new Ddinfo();
		ddinfo.setDdno(ddno);
		ddinfo.setMemberid(memberid);
		ddinfo.setFhstatus(fhstatus);
		ddinfo.setDdstate(ddstate);
		ddinfoService.exportList(ddinfo,response);
	}
	/**
	 * 缺货订单报表统计
	 * @param response
	 */
	@RequestMapping("/shortageoOrderReport")
	public void shortageoOrderReport(HttpServletResponse response){
		ddinfoService.shortageoOrderReport(response);
	}
}
