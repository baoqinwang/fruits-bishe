package com.zzti.fruits.service;
import java.util.List;

import com.zzti.fruits.entity.PageResult;
import com.zzti.fruits.pojo.Goods;
import com.zzti.fruits.pojo.StockInfo;
import com.zzti.fruits.pojogroup.GroupStockInfo;

import javax.servlet.http.HttpServletResponse;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface StockInfoService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<StockInfo> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(StockInfo stockinfo);
	
	
	/**
	 * 修改
	 */
	public void update(StockInfo stockinfo);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public StockInfo findOne(Long id);
	
	
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
	public PageResult findPage(Goods goods, int pageNum, int pageSize);

    PageResult searchPoi(int page, int rows, String stockCount, String fid, String sid);

	void stockInfoReport(HttpServletResponse response,String stockCount,String fid,String sid);
}
