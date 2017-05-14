package com.arena.controller;


import java.io.File;
import java.math.BigDecimal;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.arena.pojo.Bankcard;
import com.arena.pojo.Transfer;
import com.arena.service.CustomService;

@Controller
public class CustomController {
@Autowired
private CustomService customService;
@Autowired
private Transfer transfer;
@	RequestMapping("/selectCustomByPrimarykey")
public ModelAndView selectCustomByPrimarykey(String cid)throws Exception{
		ModelAndView mv = new ModelAndView();
        return mv;
     }

@RequestMapping("/selectBankCardByFK")
public ModelAndView selectBankCardByFK(HttpSession session,HttpServletRequest request)throws Exception{
	ModelAndView mv = new ModelAndView();
	String username=(String) session.getAttribute("username");
	List<Bankcard> bankcardList = customService.findbankcardList(username);
	mv.addObject("bankcardList", bankcardList);
	mv.setViewName("CustomBankList");
	return mv;
}

@RequestMapping("/transferBefore")
public ModelAndView transferBefore(HttpSession session,String tid)throws Exception{
	ModelAndView mv = new ModelAndView();
	String username=(String) session.getAttribute("username");
	List<Bankcard> bankcardList = customService.findbankcardList(username);
	mv.addObject("bankcardList", bankcardList);
	mv.setViewName("TransferBefore");
	return mv;
}

@RequestMapping("/transferAfter")
public String transferAfter(HttpSession session,HttpServletRequest request,String tid)throws Exception{
	String counterIdcard = (String)request.getParameter("counterBankcard");
    String selfIdcard = (String)request.getParameter("bcid");
    String moneys = (String)request.getParameter("money");
    double moneyd =Double.parseDouble(moneys);
    BigDecimal m = BigDecimal.valueOf(moneyd);
	//获取账户余额
	Bankcard bankcard1 =customService.findBankcard(counterIdcard);
	Bankcard bankcard2 = customService.findBankcard(selfIdcard);
	BigDecimal moneyp =bankcard1.getBmoney();
	BigDecimal money2 =bankcard2.getBmoney();
	
	//增长操作，接下来将两个对象更新即可
	double moneyb= moneyp.doubleValue();
	double money3= money2.doubleValue();
	double money  = moneyb + moneyd;
	double money4= money3 -moneyd;
	if(money4<0){
		return "fail";
	}else{
	BigDecimal moneyn = BigDecimal.valueOf(money);
	BigDecimal money5 = BigDecimal.valueOf(money4);
	
    bankcard2.setBmoney(money5);
	bankcard1.setBmoney(moneyn);
	//交易记录写入数据库
	transfer.setTinid(counterIdcard);
	transfer.setToutid(selfIdcard);
	transfer.setTdate(new Date());
	transfer.setTmoney(m);
	customService.insertTransferDetail(transfer);
	customService.updateBankcard(bankcard1);
	customService.updateBankcard(bankcard2);
	return "success";
}
	
}
@RequestMapping("/selectTransferBefore")
public ModelAndView selectTransferBefore(HttpSession session,HttpServletRequest request)throws Exception{
	ModelAndView mv = new ModelAndView();
	String username=(String) session.getAttribute("username");
	List<Bankcard> bankcardList = customService.findbankcardList(username);
	mv.addObject("bankcardList", bankcardList);
	mv.setViewName("TransferDetailBefore");
	return mv;
}
@RequestMapping("/selectTransferByPrimaryKey")
public ModelAndView selectTransferByPrimaryKey(HttpServletRequest request,HttpSession session)throws Exception{
	ModelAndView mv = new ModelAndView();
	String tid  = (String)request.getParameter("bcid");
	session.setAttribute("typeid",tid);
	List<Transfer> transferList = customService.selectTransferDetailById(tid);
	mv.addObject("transferList",transferList);
	mv.setViewName("TransferDetailList");
	return mv;
}
@RequestMapping("/typeTransferList")
public String typeTransferList(HttpServletRequest request,HttpSession session) throws Exception{
	String tid  = (String)session.getAttribute("typeid");
	List<Transfer> list = customService.selectTransferDetailById(tid);
		WritableWorkbook book = Workbook.createWorkbook(new File("F:/works/测试.xls"));
		WritableSheet sheet = book.createSheet("第一页", 0);
		for(int i =1,j=0;j<list.size();i++,j++){
		Label label = new Label(0,i,list.get(j).getTinid());
		sheet.addCell(label);
		Label label2 = new Label(1,i,String.valueOf(list.get(j).getTinid()));
		sheet.addCell(label2);	
		Label label4 = new Label(2,i,String.valueOf(list.get(j).getToutid()));
		sheet.addCell(label4);	
		Label label3= new Label(3,i,String.valueOf(list.get(j).getTmoney()));
		sheet.addCell(label3);
		Label label5 = new Label(4,i,String.valueOf(list.get(j).getTdate()));
		sheet.addCell(label5);	
		}
		book.write();
		book.close();
	
	return "tsuccess";
}
}
