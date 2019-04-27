package com.zzti.fruits.service.iml;
import java.util.List;

import com.zzti.fruits.entity.PageResult;
import com.zzti.fruits.mapper.PingjiaMapper;
import com.zzti.fruits.pojo.Pingjia;
import com.zzti.fruits.pojo.PingjiaExample;
import com.zzti.fruits.util.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import com.zzti.fruits.service.PingjiaService;


import org.springframework.stereotype.Service;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class PingjiaServiceImpl implements PingjiaService {

	@Autowired
	private PingjiaMapper pingjiaMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<Pingjia> findAll() {
		return pingjiaMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<Pingjia> page=   (Page<Pingjia>) pingjiaMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(Pingjia pingjia) {
		pingjiaMapper.insert(pingjia);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(Pingjia pingjia){
		pingjia.setResponsetm(DateUtils.DT_DAY()+" "+DateUtils.times());
		pingjiaMapper.updateByPrimaryKeySelective(pingjia);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public Pingjia findOne(Long id){
		return pingjiaMapper.selectByPrimaryKey(id.intValue());
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			pingjiaMapper.deleteByPrimaryKey(id.intValue());
		}		
	}
	
	
		@Override
	public PageResult findPage(Pingjia pingjia, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);

		
		Page<Pingjia> page= (Page<Pingjia>)pingjiaMapper.Search(pingjia.getMemberid(),pingjia.getGoodsid());
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
