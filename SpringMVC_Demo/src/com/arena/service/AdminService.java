package com.arena.service;

import com.arena.pojo.Admin;

public interface AdminService {

	//登陆服务
	public boolean login(Admin admin) throws Exception;
	
	//查询个人信息服务
	 public Admin selectByPrimaryKey(String aid) throws Exception;
	 
	//更改个人信息服务
	
}