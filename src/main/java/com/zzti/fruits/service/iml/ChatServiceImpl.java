package com.zzti.fruits.service.iml;
import java.util.List;

import com.zzti.fruits.entity.PageResult;
import com.zzti.fruits.mapper.ChatMapper;
import com.zzti.fruits.pojo.Chat;
import com.zzti.fruits.pojo.ChatExample;
import com.zzti.fruits.pojo.Ddinfo;
import com.zzti.fruits.util.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import com.zzti.fruits.service.ChatService;

import org.springframework.stereotype.Service;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class ChatServiceImpl implements ChatService {

	@Autowired
	private ChatMapper chatMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<Chat> findAll() {
		return chatMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<Chat> page=   (Page<Chat>) chatMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(Chat chat) {
		chatMapper.insert(chat);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(Chat chat){
		chat.setHfstate("1");
		chat.setHfsavetime(DateUtils.DT_DAY()+" "+DateUtils.times());
		chatMapper.updateByPrimaryKeySelective(chat);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public Chat findOne(Long id){
		return chatMapper.selectByPrimaryKey(id.intValue());
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			chatMapper.deleteByPrimaryKey(id.intValue());
		}		
	}
	
	
		@Override
	public PageResult findPage(Chat chat, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);

			Page<Chat> page= (Page<Chat>)chatMapper.Search(chat.getMemberid(),chat.getHfstate());

		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
