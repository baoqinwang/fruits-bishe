package com.zzti.fruits.service;
import java.util.List;

import com.zzti.fruits.entity.PageResult;
import com.zzti.fruits.pojo.Ddinfo;
import com.zzti.fruits.pojogroup.OrderPoiParam;

import javax.servlet.http.HttpServletResponse;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface DdinfoService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<Ddinfo> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(Ddinfo ddinfo);
	
	
	/**
	 * 修改
	 */
	public void update(Ddinfo ddinfo);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public Ddinfo findOne(Long id);
	
	
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
	public PageResult findPage(Ddinfo ddinfo, int pageNum, int pageSize);

	/**
	 * 更新订单状态
	 * @param ddinfo
	 */
    void updateState(Ddinfo ddinfo);

    PageResult findPoiPage(OrderPoiParam orderPoiParam, int page, int rows);

    void excelPoiSearch(OrderPoiParam orderPoiParam, HttpServletResponse response);

    void shortageoOrderReport(HttpServletResponse response);
}
