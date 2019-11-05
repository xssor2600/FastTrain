package com.xiansky.service;

import java.util.List;

/**
 * 通用service
 * @Author: xianl
 * @Date: 2019/11/5 16:59
 */
public interface BaseService<T> {

	public List<T> list(T entity) ;

	public T get(T entity);

	public int update(T entity);

	public int save(T entity);

	public int delete(T entity) ;

}
