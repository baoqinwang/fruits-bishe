package com.zzti.fruits.controller;
import java.util.List;

import com.zzti.fruits.entity.PageResult;
import com.zzti.fruits.entity.Result;
import com.zzti.fruits.pojo.StockInfo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zzti.fruits.service.StockInfoService;


/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/stockinfo")
public class StockinfoController {


	private StockInfoService stockInfoService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<StockInfo> findAll(){
		return stockInfoService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult findPage(int page, int rows){
		return stockInfoService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param stockinfo
	 * @returnStockInfo
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody StockInfo stockinfo){
		try {
			stockInfoService.add(stockinfo);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param stockinfo
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody StockInfo stockinfo){
		try {
			stockInfoService.update(stockinfo);
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
	public StockInfo findOne(Long id){
		return stockInfoService.findOne(id);
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			stockInfoService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
		/**
	 * 查询+分页
	 * @param stockinfo
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search(@RequestBody StockInfo stockinfo, int page, int rows  ){
		return stockInfoService.findPage(stockinfo, page, rows);
	}
	
}
