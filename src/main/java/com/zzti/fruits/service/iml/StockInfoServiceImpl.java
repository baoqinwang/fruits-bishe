package com.zzti.fruits.service.iml;
import java.util.List;

import com.zzti.fruits.entity.PageResult;
import com.zzti.fruits.mapper.StockInfoMapper;
import com.zzti.fruits.pojo.StockInfo;
import com.zzti.fruits.pojo.StockInfoExample;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import com.zzti.fruits.service.StockInfoService;


import org.springframework.stereotype.Service;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class StockInfoServiceImpl implements StockInfoService {

	@Autowired
	private StockInfoMapper stockInfoMapper;

	/**
	 * 查询全部
	 */
	@Override
	public List<StockInfo> findAll() {
		return stockInfoMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		Page<StockInfo> page=   (Page<StockInfo>) stockInfoMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(StockInfo stockinfo) {
		stockInfoMapper.insert(stockinfo);
	}


	/**
	 * 修改
	 */
	@Override
	public void update(StockInfo stockinfo){
		stockInfoMapper.updateByPrimaryKey(stockinfo);
	}

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public StockInfo findOne(Long id){
		return stockInfoMapper.selectByPrimaryKey(id.toString());
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			stockInfoMapper.deleteByPrimaryKey(id.toString());
		}
	}


		@Override
	public PageResult findPage(StockInfo stockinfo, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);

		StockInfoExample example=new StockInfoExample();
		StockInfoExample.Criteria criteria = example.createCriteria();

		if(stockinfo!=null){
						if(stockinfo.getGoodsId()!=null && stockinfo.getGoodsId().length()>0){
				criteria.andGoodsIdLike("%"+stockinfo.getGoodsId()+"%");
			}
			if(stockinfo.getStorageLocation()!=null && stockinfo.getStorageLocation().length()>0){
				criteria.andStorageLocationLike("%"+stockinfo.getStorageLocation()+"%");
			}
			if(stockinfo.getCrtTlr()!=null && stockinfo.getCrtTlr().length()>0){
				criteria.andCrtTlrLike("%"+stockinfo.getCrtTlr()+"%");
			}
			if(stockinfo.getCrtTm()!=null && stockinfo.getCrtTm().length()>0){
				criteria.andCrtTmLike("%"+stockinfo.getCrtTm()+"%");
			}
			if(stockinfo.getUpTlr()!=null && stockinfo.getUpTlr().length()>0){
				criteria.andUpTlrLike("%"+stockinfo.getUpTlr()+"%");
			}
			if(stockinfo.getUpTm()!=null && stockinfo.getUpTm().length()>0){
				criteria.andUpTmLike("%"+stockinfo.getUpTm()+"%");
			}

		}

		Page<StockInfo> page= (Page<StockInfo>)stockInfoMapper.selectByExample(example);
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
