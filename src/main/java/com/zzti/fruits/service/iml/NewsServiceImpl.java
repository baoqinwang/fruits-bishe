package com.zzti.fruits.service.iml;
import java.util.List;

import com.zzti.fruits.entity.PageResult;
import com.zzti.fruits.mapper.NewsMapper;
import com.zzti.fruits.pojo.News;
import com.zzti.fruits.pojo.NewsExample;
import com.zzti.fruits.util.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zzti.fruits.service.NewsService;


import org.springframework.stereotype.Service;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class NewsServiceImpl implements NewsService {

	@Autowired
	private NewsMapper newsMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<News> findAll() {
		return newsMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<News> page=   (Page<News>) newsMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(News news) {
		news.setState("00");
		news.setSavetime(DateUtils.DT_DAY()+" "+DateUtils.times());
		newsMapper.insert(news);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(News news){
		news.setUpdatetime(DateUtils.DT_DAY()+" "+DateUtils.times());
		newsMapper.updateByPrimaryKeyWithBLOBs(news);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public News findOne(Long id){
		return newsMapper.selectByPrimaryKey(id.intValue());
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			newsMapper.deleteByPrimaryKey(id.intValue());
		}		
	}
	
	
		@Override
	public PageResult findPage(News news, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		NewsExample example=new NewsExample();
		NewsExample.Criteria criteria = example.createCriteria();
		
		if(news!=null){			
						if(news.getTitle()!=null && news.getTitle().length()>0){
				criteria.andTitleLike("%"+news.getTitle()+"%");
			}

			if(news.getType()!=null && news.getType().length()>0){
				criteria.andTypeEqualTo(news.getType());
			}
	
		}
		
		Page<News> page= (Page<News>)newsMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
