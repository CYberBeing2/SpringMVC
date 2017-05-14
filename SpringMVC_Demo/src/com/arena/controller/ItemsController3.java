package com.arena.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.arena.pojo.Items;


@Controller
public class ItemsController3  {
//为了方便维护，地址名写成方法名
@RequestMapping("/queryItems2")
	public ModelAndView queryItems() throws Exception{
		
		List<Items> itemsList = new ArrayList<Items>();
		Items items1 = new Items();
		items1.setName("联想笔记本");
		items1.setPrice(6000);
		items1.setDetail("thinkpad");
		
		Items items2 = new Items();
		items2.setName("方正笔记本");
		items2.setPrice(6000);
		items2.setDetail("他太懒了，什么也没留下");
		
		itemsList.add(items1);
		itemsList.add(items2);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("itemsList", itemsList);
		mv.setViewName("Items.jsp");
		
		return mv;
	}
		
	}


