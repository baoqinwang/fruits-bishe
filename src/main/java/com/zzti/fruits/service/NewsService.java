package com.zzti.fruits.service;
import com.zzti.fruits.entity.PageResult;
import com.zzti.fruits.pojo.News;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface NewsService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<News> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(News news);
	
	
	/**
	 * 修改
	 */
	public void update(News news);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public News findOne(Long id);
	
	
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
	public PageResult findPage(News news, int pageNum, int pageSize);
	
}
