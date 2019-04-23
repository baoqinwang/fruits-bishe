package com.zzti.fruits.service.iml;
import java.util.List;

import com.github.pagehelper.Page;
import com.sun.org.apache.xpath.internal.operations.String;
import com.zzti.fruits.entity.PageResult;
import com.zzti.fruits.mapper.KcrecordMapper;
import com.zzti.fruits.mapper.StockInfoMapper;
import com.zzti.fruits.pojo.Goods;
import com.zzti.fruits.pojo.Kcrecord;
import com.zzti.fruits.pojo.KcrecordExample;
import com.zzti.fruits.pojo.StockInfo;
import com.zzti.fruits.util.DateUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;

import com.zzti.fruits.service.KcrecordService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class KcrecordServiceImpl

 implements KcrecordService {

	@Autowired
	private KcrecordMapper kcrecordMapper;
	@Autowired
	private StockInfoMapper stockInfoMapper;
	/**
	 * 查询全部
	 */
	@Override
	public List<Kcrecord> findAll() {
		return kcrecordMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		Page<Kcrecord> page=   (Page<Kcrecord>) kcrecordMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	@Transactional
	public void add(Kcrecord kcrecord) {
        kcrecord.setSavetime(DateUtils.DT_DAY()+" "+DateUtils.times());
		kcrecordMapper.insert(kcrecord);
		if(StringUtils.isNotBlank(kcrecord.getType()))
		{
			StockInfo stockInfo = stockInfoMapper.selectByPrimaryKey(kcrecord.getGid());
			if("in".equals(kcrecord.getType()))
				stockInfo.setStockCount(stockInfo.getStockCount().intValue()+ Integer.parseInt(kcrecord.getHappennum()));
			else
				stockInfo.setStockCount(stockInfo.getStockCount().intValue()- Integer.parseInt(kcrecord.getHappennum()));
              stockInfoMapper.updateByPrimaryKeySelective(stockInfo);
		}
	}


	/**
	 * 修改
	 */
	@Override
	public void update(Kcrecord kcrecord){
		kcrecordMapper.updateByPrimaryKey(kcrecord);
	}

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public Kcrecord findOne(Long id){
		return kcrecordMapper.selectByPrimaryKey(id.intValue());
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			kcrecordMapper.deleteByPrimaryKey(id.intValue());
		}
	}


		@Override
	public PageResult findPage(Kcrecord kcrecord, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);

		KcrecordExample example=new KcrecordExample();
		if(StringUtils.isNotBlank(kcrecord.getGid()))
		{
		KcrecordExample.Criteria criteria = example.createCriteria();

				criteria.andGidEqualTo(kcrecord.getGid());

		}
         example.setOrderByClause("savetime DESC");
			List<Kcrecord> kcrecords = kcrecordMapper.selectByExample(example);

			Page<Kcrecord> page= (Page<Kcrecord>) kcrecords;
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
