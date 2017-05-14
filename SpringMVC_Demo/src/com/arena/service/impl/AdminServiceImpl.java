package com.arena.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.arena.mapper.AdminMapper;
import com.arena.pojo.Admin;
import com.arena.service.AdminService;

public class AdminServiceImpl implements AdminService{
	@Autowired
	private  AdminMapper  adminMapper;

	public boolean login(Admin admin) throws Exception {
		// TODO 自动生成的方法存根
		
		 Admin ad =adminMapper.selectByPrimaryKey(admin.getAid());
		if(ad==null){	
			return false;
			}
		
			if((admin.getAid()).equals(ad.getAid())&&(admin.getApwd()).equals(ad.getApwd())){
				return true;
			}else{
				return false;			
			}
	}

	@Override
	public Admin selectByPrimaryKey(String aid) throws Exception {
		// TODO 自动生成的方法存根
	Admin admin =	adminMapper.selectByPrimaryKey(aid);
         	return admin;
	}

}
