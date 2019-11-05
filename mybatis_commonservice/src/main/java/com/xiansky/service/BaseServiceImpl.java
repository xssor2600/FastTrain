package com.xiansky.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: xianl
 * @Date: 2019/11/5 16:56
 */
@Component
public class BaseServiceImpl<T> implements BaseService<T> {

	@Autowired
	private tk.mybatis.mapper.common.Mapper<T> mapper;

	public List<T> list(T entity) {
		return mapper.select(entity);
	}

	public T get(T entity) {
		return mapper.selectOne(entity);
	}

	public int update(T entity) {
		return mapper.updateByPrimaryKeySelective(entity);
	}

	public int save(T entity) {
		return mapper.insertSelective(entity);
	}

	public int delete(T entity) {
		return mapper.deleteByPrimaryKey(entity);
	}
}
