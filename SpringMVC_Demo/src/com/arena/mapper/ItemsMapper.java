package com.arena.mapper;

import java.util.List;

import com.arena.pojo.Items;
import com.arena.pojo.ItemsQueryVo;

public interface ItemsMapper {

	//根据查询条件查询商品信息
	public  List<Items> findItemsList(ItemsQueryVo itemsqueryVo) throws Exception;
	
	    int deleteByPrimaryKey(Integer id);

	    int insert(Items record);

	    int insertSelective(Items record);
	    
	    Items selectByPrimaryKey(Integer id);

	    int updateByPrimaryKeySelective(Items record);

	    int updateByPrimaryKeyWithBLOBs(Items record);

	    int updateByPrimaryKey(Items record);
}
