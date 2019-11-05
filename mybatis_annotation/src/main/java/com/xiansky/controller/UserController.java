package com.xiansky.controller;

import com.xiansky.bo.User;
import com.xiansky.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: xianl
 * @Date: 2019/11/5 16:23
 */
@RestController
@RequestMapping("/user/*")
public class UserController {

	@SuppressWarnings("all")
	@Autowired
	UserMapper userMapper;


	@GetMapping("list")
	public List<User> list() {
		return userMapper.list();
	}

	@GetMapping("list/{username}")
	public List<User> listByUsername(@PathVariable("username") String username) {
		return userMapper.listByUserName(username);
	}

	@GetMapping("get/{username}/{password}")
	public User get(@PathVariable("username") String username, @PathVariable("password") String password) {
		return userMapper.get(username, password);
	}

	@GetMapping("get/bad/{username}/{password}")
	public User getBadUser(@PathVariable("username") String username, @PathVariable("password") String password) {
		return userMapper.getBadUser(username, password);
	}


}
