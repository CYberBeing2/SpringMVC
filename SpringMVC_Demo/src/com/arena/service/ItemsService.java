package com.arena.service;

import java.util.List;

import com.arena.pojo.Items;
import com.arena.pojo.ItemsCustom;
import com.arena.pojo.ItemsQueryVo;

public interface ItemsService {

	//商品查询列表
	public List<Items> findItemsList(ItemsQueryVo queryVo) throws Exception;
	
	//根据id查询商品信息
	public ItemsCustom findItemsById(int id) throws Exception;
	
	//修改商品信息
	public void updateItems(int id,ItemsCustom itemsCustom) throws Exception;
	
}
