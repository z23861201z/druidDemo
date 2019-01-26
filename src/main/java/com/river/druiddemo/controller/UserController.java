package com.river.druiddemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.river.druiddemo.dao.UserDao;

@Controller
@RequestMapping("user/")
public class UserController {
	
	@Autowired
	private UserDao userDao;
	
	
	@RequestMapping("loadUser")
	@ResponseBody
	public String loadUser(){
		Long count = userDao.getUserCount();
		return "查询结果为："+count;
	}
}
