package com.zzti.fruits.controller;
import java.util.List;

import com.zzti.fruits.entity.PageResult;
import com.zzti.fruits.entity.Result;
import com.zzti.fruits.pojo.Dddetail;
import com.zzti.fruits.pojogroup.GroupDdDet;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zzti.fruits.service.DddetailService;


/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/dddetail")
public class DddetailController {

	@Autowired
	private DddetailService dddetailService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<Dddetail> findAll(){
		return dddetailService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult findPage(int page, int rows){
		return dddetailService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param dddetail
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody Dddetail dddetail){
		try {
			dddetailService.add(dddetail);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param dddetail
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody Dddetail dddetail){
		try {
			dddetailService.update(dddetail);
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
	public Dddetail findOne(Long id){
		return dddetailService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			dddetailService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
		/**
	 * 查询+分页
	 * @param dddetail
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search(@RequestBody Dddetail dddetail, int page, int rows  ){
		return dddetailService.findPage(dddetail, page, rows);		
	}

	/**
	 * 通过订单编号查询详细
	 * @param ddno
	 * @return
	 */
	@RequestMapping("/searchDet")
	public List<GroupDdDet> search(String ddno){

		return dddetailService.searchDet(ddno);
	}
	
}
