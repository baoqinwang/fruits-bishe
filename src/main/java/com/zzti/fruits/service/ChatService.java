package com.zzti.fruits.service;
import java.util.List;

import com.zzti.fruits.entity.PageResult;
import com.zzti.fruits.pojo.Chat;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface ChatService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<Chat> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(Chat chat);
	
	
	/**
	 * 修改
	 */
	public void update(Chat chat);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public Chat findOne(Long id);
	
	
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
	public PageResult findPage(Chat chat, int pageNum, int pageSize);
	
}
