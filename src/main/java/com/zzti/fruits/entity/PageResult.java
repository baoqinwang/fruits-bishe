package com.zzti.fruits.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 分页返回的实体类
 * @author wangbaoqin
 *
 */
@Data
public class PageResult<T>  implements Serializable{
	private Long total;     // 总条数
	private Long totalPage; // 总页数
	private List<T> items;  // 当前页数据

	public PageResult() {
	}

	public PageResult(Long total, List<T> items) {
		this.total = total;
		this.items = items;
	}

	public PageResult(Long total, Long totalPage, List<T> items) {
		this.total = total;
		this.totalPage = totalPage;
		this.items = items;
	}
	
}
