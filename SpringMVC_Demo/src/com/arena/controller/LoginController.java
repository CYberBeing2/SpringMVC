package com.arena.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.arena.pojo.Admin;
import com.arena.pojo.Custom;
import com.arena.service.AdminService;
import com.arena.service.CustomService;
import com.arena.service.impl.CustomServiceImpl;
import com.sun.org.glassfish.gmbal.ParameterNames;

@Controller
public class LoginController {
	@Autowired
	private AdminService adminService;
	@Autowired
	private CustomService customService;
     @RequestMapping("/login")
    
	public String login(HttpSession session,HttpServletRequest request,String username,String password,Integer mark) throws Exception
	{    //调用session保存用户身份信息
    	 session.setAttribute("username", username);
    	 if(mark==1){
		//调用service进行身份验证
		Admin admin = new Admin();
		admin.setApwd(password);
	    admin.setAid(username);
	    admin.setMark(mark);
		if(adminService.login(admin)==true){
			//直接返回一个jsp地址连接名
			return "redirect:/findCustomsList.action";
		}else{
			session.invalidate();
		    return "redirect:/findCustomById.action";
		}
		}else if(mark==2){
			Custom custom = new Custom();
			custom.setCpwd(password);
			custom.setCidcard(username);
			custom.setMark(mark);
			if(customService.login(custom)==true){
				//直接返回一个jsp地址连接名
				return "redirect:/selectBankCardByFK.action";
			}else{
				session.invalidate();
			    return "redirect:/findCustomById.action";
			}
		}
    	 session.invalidate();
		 return "redirect:/findCustomById.action";
		
	}
     
    @RequestMapping("/logout")
	public String logout(HttpSession session)throws Exception{	
		session.invalidate();
		return "redirect:/findCustomById.action";	
	}
	
	
}
