package com.zzti.fruits.service.iml;
import java.util.List;

import com.zzti.fruits.entity.PageResult;
import com.zzti.fruits.mapper.DdinfoMapper;
import com.zzti.fruits.pojo.Ddinfo;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import com.zzti.fruits.service.DdinfoService;


import org.springframework.stereotype.Service;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class DdinfoServiceImpl implements DdinfoService {

	@Autowired
	private DdinfoMapper ddinfoMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<Ddinfo> findAll() {
		return ddinfoMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<Ddinfo> page=   (Page<Ddinfo>) ddinfoMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(Ddinfo ddinfo) {
		ddinfoMapper.insert(ddinfo);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(Ddinfo ddinfo){
		ddinfoMapper.updateByPrimaryKeySelective(ddinfo);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public Ddinfo findOne(Long id){
		return ddinfoMapper.selectByPrimaryKey(id.intValue());
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			ddinfoMapper.deleteByPrimaryKey(id.intValue());
		}		
	}
	
	
		@Override
	public PageResult findPage(Ddinfo ddinfo, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);

		Page<Ddinfo> page= (Page<Ddinfo>)ddinfoMapper.Search(ddinfo.getDdno(),ddinfo.getMemberid(),ddinfo.getFhstatus(),ddinfo.getDdstate());
		return new PageResult(page.getTotal(), page.getResult());
	}

	@Override
	public void updateState(Ddinfo ddinfo) {
		ddinfoMapper.updateByPrimaryKeySelective(ddinfo);
	}

}
