package com.zzti.fruits.service;
import java.util.List;

import com.zzti.fruits.entity.PageResult;
import com.zzti.fruits.pojo.Dddetail;
import com.zzti.fruits.pojogroup.GroupDdDet;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface DddetailService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<Dddetail> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(Dddetail dddetail);
	
	
	/**
	 * 修改
	 */
	public void update(Dddetail dddetail);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public Dddetail findOne(Long id);
	
	
	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Long[] ids);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(Dddetail dddetail, int pageNum, int pageSize);

	List<GroupDdDet> searchDet(String ddno);
}
