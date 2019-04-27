package com.zzti.fruits.controller;
import java.util.List;

import com.zzti.fruits.entity.PageResult;
import com.zzti.fruits.entity.Result;
import com.zzti.fruits.pojo.Pingjia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zzti.fruits.service.PingjiaService;


/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/pingjia")
public class PingjiaController {

	@Autowired
	private PingjiaService pingjiaService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<Pingjia> findAll(){
		return pingjiaService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult findPage(int page, int rows){
		return pingjiaService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param pingjia
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody Pingjia pingjia){
		try {
			pingjiaService.add(pingjia);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param pingjia
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody Pingjia pingjia){
		try {
			pingjiaService.update(pingjia);
			return new Result(true, "评价成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "评价失败");
		}
	}	
	
	/**
	 * 获取实体
	 * @param id
	 * @return
	 */
	@RequestMapping("/findOne")
	public Pingjia findOne(Long id){
		return pingjiaService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			pingjiaService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
		/**
	 * 查询+分页
	 * @param pingjia
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search(@RequestBody Pingjia pingjia, int page, int rows  ){
		return pingjiaService.findPage(pingjia, page, rows);		
	}
	
}
