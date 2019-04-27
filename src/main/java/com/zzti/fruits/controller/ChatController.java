package com.zzti.fruits.controller;
import java.util.List;

import com.zzti.fruits.entity.PageResult;
import com.zzti.fruits.entity.Result;
import com.zzti.fruits.pojo.Chat;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.zzti.fruits.service.ChatService;


/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/chat")
public class ChatController {

	@Autowired
	private ChatService chatService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<Chat> findAll(){			
		return chatService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult findPage(int page, int rows){
		return chatService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param chat
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody Chat chat){
		try {
			chatService.add(chat);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param chat
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody Chat chat){
		try {
			chatService.update(chat);
			return new Result(true, "回复成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "回复失败");
		}
	}	
	
	/**
	 * 获取实体
	 * @param id
	 * @return
	 */
	@RequestMapping("/findOne")
	public Chat findOne(Long id){
		return chatService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			chatService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
		/**
	 * 查询+分页
	 * @param chat
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search(@RequestBody Chat chat, int page, int rows  ){
		return chatService.findPage(chat, page, rows);		
	}
	
}
