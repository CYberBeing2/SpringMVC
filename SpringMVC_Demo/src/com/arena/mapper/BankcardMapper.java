package com.arena.mapper;

import com.arena.pojo.BankCardQueryVO;
import com.arena.pojo.Bankcard;
import com.arena.pojo.BankcardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BankcardMapper {
	//根据身份证号查询银行卡
	//List<BankCardQueryVO>findBankCardList(String cid); 
	
    int countByExample(BankcardExample example);

    int deleteByExample(BankcardExample example);

    int deleteByPrimaryKey(String bcid);

    int insert(Bankcard record);

    int insertSelective(Bankcard record);

    List<Bankcard> selectByExample(BankcardExample example);

    Bankcard selectByPrimaryKey(String bcid);

    int updateByExampleSelective(@Param("record") Bankcard record, @Param("example") BankcardExample example);

    int updateByExample(@Param("record") Bankcard record, @Param("example") BankcardExample example);

    int updateByPrimaryKeySelective(Bankcard record);

    int updateByPrimaryKey(Bankcard record);
}