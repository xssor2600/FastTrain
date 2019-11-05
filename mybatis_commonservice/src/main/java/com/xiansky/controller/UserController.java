package com.xiansky.controller;

import com.xiansky.bo.User;
import com.xiansky.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: xianl
 * @Date: 2019/11/5 17:12
 */

@RestController
@RequestMapping("/user/*")
public class UserController {

	@Autowired
	UserServiceImpl userService;


	@RequestMapping("list")
	public List<User> list(User user) {
		return userService.list(user);
	}

	@RequestMapping("get")
	public User get(User user) {
		return userService.get(user);
	}

	@RequestMapping("update")
	public int update(User user) {
		return userService.update(user);
	}

	@RequestMapping("save")
	public int save(User user) {
		return userService.save(user);
	}

	@RequestMapping("delete")
	public int delete(User user) {
		return userService.delete(user);
	}

	@RequestMapping("/new/list")
	public List<User> listNew() {
		return userService.listUsers();
	}

}
