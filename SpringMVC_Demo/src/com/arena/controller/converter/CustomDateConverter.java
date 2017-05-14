package com.arena.controller.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class CustomDateConverter implements Converter<String, Date> {

	@Override
	public Date convert(String source) {
		// TODO 自动生成的方法存根
		//将source转换成日期类型
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		try {
	   return	 sf.parse(source);
		} catch (ParseException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
     	return  null;
	}
	
}
