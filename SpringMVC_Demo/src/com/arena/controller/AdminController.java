package com.arena.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.arena.pojo.Admin;
import com.arena.pojo.Custom;
import com.arena.service.AdminService;
import com.arena.service.CustomService;

@Controller

public class AdminController {
@Autowired
private AdminService adminService;
@Autowired
private CustomService customService;
@RequestMapping("/findCustomById")
	public ModelAndView findCustomById() throws Exception{
	ModelAndView mv = new ModelAndView();
	mv.setViewName("adminFindUser");
	return mv;
	}

@RequestMapping("/findAdminById")
   public ModelAndView findAdminById(HttpSession session) throws Exception{
	ModelAndView mv = new ModelAndView();
	Admin admin = adminService.selectByPrimaryKey((String)session.getAttribute("username"));
	mv.addObject(admin);
	mv.setViewName("AdminInfomation");
	 return mv;
   }
@RequestMapping("/findCustomsList")
       public ModelAndView findCustomsList() throws Exception{
	ModelAndView mv = new ModelAndView();
	List<Custom> customList = customService.findCustomsList();
	mv.addObject(customList);
	mv.setViewName("CustomInfomation");
	return mv;
}
@RequestMapping("/findCustomByPrimaryKey")
public  ModelAndView findCustomByPrimaryKey(String cidcard)throws Exception{
	ModelAndView mv = new ModelAndView();
	Custom custom = customService.findCustomByPrimaryKey(cidcard);
	mv.addObject(custom);
	mv.setViewName("CustomBeforeEdit");
	return mv;
}
@RequestMapping("/adminCustomEdit")
public String adminCustomEdit(Custom custom)throws Exception{
	customService.updateCustom(custom);
	return "redirect:/findCustomsList.action";
}




}
