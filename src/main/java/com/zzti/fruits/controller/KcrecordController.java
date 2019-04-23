package com.zzti.fruits.controller;
import java.util.List;

import com.zzti.fruits.entity.PageResult;
import com.zzti.fruits.entity.Result;
import com.zzti.fruits.pojo.Kcrecord;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zzti.fruits.service.KcrecordService;


/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/kcrecord")
public class KcrecordController {

	@Autowired
	private KcrecordService kcrecordService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<Kcrecord> findAll(){
		return kcrecordService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult findPage(int page, int rows){
		return kcrecordService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param kcrecord
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody Kcrecord kcrecord){
		try {
			kcrecordService.add(kcrecord);
			if("in".equals(kcrecord.getType()))
			  return new Result(true, "入库成功");
			else
				return new Result(true, "出库成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "操作失败");
		}
	}
	
	/**
	 * 修改
	 * @param kcrecord
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody Kcrecord kcrecord){
		try {
			kcrecordService.update(kcrecord);
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
	public Kcrecord findOne(Long id){
		return kcrecordService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			kcrecordService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
		/**
	 * 查询+分页
	 * @param kcrecord
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search(@RequestBody Kcrecord kcrecord, int page, int rows  ){
		return kcrecordService.findPage(kcrecord, page, rows);
	}
	
}
