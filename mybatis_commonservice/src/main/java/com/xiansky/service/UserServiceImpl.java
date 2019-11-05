package com.xiansky.service;

import com.xiansky.bo.User;
import com.xiansky.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: xianl
 * @Date: 2019/11/5 17:05
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<User>  {

	@Autowired
	private UserMapper mapper;

	// 自定义其他的dao操作
	public List<User> listUsers(){
		return mapper.listUsers();
	}
}
