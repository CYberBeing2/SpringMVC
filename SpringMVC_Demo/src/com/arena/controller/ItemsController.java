package com.arena.controller;


import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.arena.pojo.Items;
import com.arena.pojo.ItemsCustom;
import com.arena.service.ItemsService;


@Controller
//为了对路径进行分类，对controller定义一个根路径
@RequestMapping("/items")
public class ItemsController  {
	@Autowired
	private ItemsService itemsService;
	
	//为了方便维护，地址名写成方法名
	@RequestMapping("/queryItems")
	public ModelAndView queryItems() throws Exception{

		List<Items> itemsList = itemsService.findItemsList(null);
		ModelAndView mv = new ModelAndView();
		mv.addObject("itemsList", itemsList);
		mv.setViewName("Items");
		return mv;
	}	
	
	
	//基于方法，所以controller中每个方法都有地址
	
	//@RequestMapping("/editItems")
	
	//限定http请求的方法
	@RequestMapping(value="/editItems",method={RequestMethod.POST,RequestMethod.GET})
	//商品修改页面显示
	public ModelAndView editItems() throws Exception{
		//调用service查询商品信息
		//先写一个静态数据，指定死id
		//springmvc就是从客户端请求key-value数据。经过参数绑定，将key-value数据绑定到controller方法的形参上。
		//接收页面提供的数据是用方法的形参来接收，而不是定义成员变量.
		//是通过一个叫converter的组件实现的，spring中有很多converter，可以实现任意类型的转换，通常需要自定义
		ItemsCustom itemsCustom = itemsService.findItemsById(1);
	  //返回modelandview
		ModelAndView  mv  = new ModelAndView();
		
		//将商品信息放到model中
		mv.addObject("itemsCustom",itemsCustom);
	 //商品修改页面
		mv.setViewName("editItems");
		return mv;
	}
	
	//商品信息修改提交
	//绑定pojo，提交参数时使用
	//pojo绑定的时候遇到一些问题,post乱码
	@RequestMapping("/editItemsSubmit")
	
	public String editItemsSubmit(HttpServletRequest request,Integer id,ItemsCustom itemsCustom) throws Exception{
		//调用service更新商品信息，页面需要将商品信息传到此方法
		itemsService.updateItems(id, itemsCustom);
		//return "redirect:queryItems.action";
		return "success";
		//request.getParameter("id");
		//return "forward:queryItems.action",地址栏不变，request可以共享
	}

	//商品信息修改提交，返回值还可以为String，表示返回逻辑视图名
	@RequestMapping(value="/editItems2",method={RequestMethod.POST,RequestMethod.GET})
	//商品修改页面显示,参数绑定可以绑定很多类型的东西
	public String editItems2(@RequestParam(value="id",required=true,defaultValue="2") Integer id,Model model) throws Exception{
		//调用service查询商品信息
		//先写一个静态数据，指定死id
		//springmvc就是从客户端请求key-value数据。经过参数绑定，将key-value数据绑定到controller方法的形参上。
		//接收页面提供的数据是用方法的形参来接收，而不是定义成员变量.
		//是通过一个叫converter的组件实现的，spring中有很多converter，可以实现任意类型的转换，通常需要自定义
		//默认支持4种类型：1：HttpServletRequest。2：HttpServletResponse。3：HttpServletSession。4：Model
		ItemsCustom itemsCustom = itemsService.findItemsById(id);
		//将商品信息放到model中，model的作用是将模型数据填充到request域，内部就是个map
		model.addAttribute("itemsCustom", itemsCustom);
	    //商品修改页面
		return "editItems";
	}
		//商品信息修改提交，返回值还可以为void

	
}


