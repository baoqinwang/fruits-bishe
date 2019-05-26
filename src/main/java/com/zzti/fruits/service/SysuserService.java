package com.zzti.fruits.service;
import com.zzti.fruits.entity.PageResult;
import com.zzti.fruits.pojo.Sysuser;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface SysuserService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<Sysuser> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(Sysuser sysuser);
	
	
	/**
	 * 修改
	 */
	public void update(Sysuser sysuser);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public Sysuser findOne(Long id);
	
	
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
	public PageResult findPage(Sysuser sysuser, int pageNum, int pageSize);

    Sysuser check(String userName, String passWord);
}
