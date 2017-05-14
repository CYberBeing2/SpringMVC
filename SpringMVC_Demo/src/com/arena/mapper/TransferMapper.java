package com.arena.mapper;

import com.arena.pojo.Transfer;
import com.arena.pojo.TransferExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TransferMapper {
    int countByExample(TransferExample example);

    int deleteByExample(TransferExample example);

    int deleteByPrimaryKey(Integer tid);

    int insert(Transfer record);

    int insertSelective(Transfer record);

    List<Transfer> selectByExample(TransferExample example);

    Transfer selectByPrimaryKey(Integer tid);

    int updateByExampleSelective(@Param("record") Transfer record, @Param("example") TransferExample example);

    int updateByExample(@Param("record") Transfer record, @Param("example") TransferExample example);

    int updateByPrimaryKeySelective(Transfer record);

    int updateByPrimaryKey(Transfer record);
}