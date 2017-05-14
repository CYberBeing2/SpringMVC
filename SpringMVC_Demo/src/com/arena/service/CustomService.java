package com.arena.service;

import java.util.List;
import com.arena.pojo.Bankcard;
import com.arena.pojo.Custom;
import com.arena.pojo.Transfer;

public interface CustomService {
	//登陆服务
	public boolean login(Custom custom) throws Exception;
	//查询列表服务
    public List<Custom> findCustomsList() throws Exception;
	//查询个人信息
	public Custom findCustomByPrimaryKey(String cidcard) throws Exception;
   //更改个人信息服务
	public void updateCustom(Custom custom) throws Exception;
	//查询个人银行卡服务
	public List<Bankcard> findbankcardList(String cid) throws Exception;
	//转账服务
	public void transfer()throws Exception;
	//查找银行卡
	public Bankcard findBankcard(String bcid) throws Exception;
	//更新银行卡
	public void updateBankcard(Bankcard bankcard)throws Exception;
	//写入交易记录服务
	public void insertTransferDetail(Transfer transfer)throws Exception;
	//查询交易记录服务
	public List<Transfer> selectTransferDetailById(String tid)throws Exception;
	
}
