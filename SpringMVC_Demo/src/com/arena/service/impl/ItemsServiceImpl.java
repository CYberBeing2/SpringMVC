package com.arena.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.arena.mapper.ItemsMapper;
import com.arena.pojo.Items;
import com.arena.pojo.ItemsCustom;
import com.arena.pojo.ItemsQueryVo;
import com.arena.service.ItemsService;


public class ItemsServiceImpl implements ItemsService{

	@Autowired
	private ItemsMapper itemsMapper;
	
	@Override
	public List<Items> findItemsList(ItemsQueryVo queryVo) throws Exception {
		// TODO 自动生成的方法存根
		return itemsMapper.findItemsList(queryVo);
	}
    
	@Override
	public ItemsCustom findItemsById(int id) throws Exception {
		// TODO 自动生成的方法存根
		Items items = itemsMapper.selectByPrimaryKey(id);
		//最终返回的是拓展类
		ItemsCustom itemsCustom = new ItemsCustom();
		BeanUtils.copyProperties(items,itemsCustom );
		return itemsCustom;
	}

	@Override
	public void updateItems(int id, ItemsCustom itemsCustom) throws Exception {
		// TODO 自动生成的方法存根
		//添加一些业务的校验，如果为空，就抛出异常
		//使用它可以更新所有字段，包括大文本类型,要求必须传入id
		
		itemsCustom.setId(id);
		itemsMapper.updateByPrimaryKeyWithBLOBs(itemsCustom);
		
	}

	
}
