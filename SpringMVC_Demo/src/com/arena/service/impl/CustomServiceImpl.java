package com.arena.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.arena.mapper.BankcardMapper;
import com.arena.mapper.CustomMapper;
import com.arena.mapper.TransferMapper;
import com.arena.pojo.Bankcard;
import com.arena.pojo.BankcardExample;
import com.arena.pojo.BankcardExample.Criteria;
import com.arena.pojo.Custom;
import com.arena.pojo.Transfer;
import com.arena.pojo.TransferExample;
import com.arena.service.CustomService;

public class CustomServiceImpl implements CustomService{
@Autowired
 private  CustomMapper customMapper;
@Autowired
 private BankcardMapper bankcardMapper; 
@Autowired
private TransferMapper transferMapper;

public boolean login(Custom custom) throws Exception {
	// TODO 自动生成的方法存根
	
	 Custom cs =customMapper.selectByPrimaryKey(custom.getCidcard());
	if(cs==null){	
		return false;
		}
	
		if(cs.getCstatus().equals("正常")&&(custom.getCidcard()).equals(cs.getCidcard())&&custom.getCpwd().equals(cs.getCpwd())){
			return true;
		}else{
			return false;			
		}
	
}
@Override
public List<Custom> findCustomsList() throws Exception {
	// TODO 自动生成的方法存根
	List<Custom> customList  = customMapper.selectByExample(null);
	return customList;
}
@Override
public Custom findCustomByPrimaryKey(String cidcard) throws Exception {
	// TODO 自动生成的方法存根
	Custom custom = customMapper.selectByPrimaryKey(cidcard);
	return custom;
}
@Override
public void updateCustom(Custom custom) throws Exception {
	// TODO 自动生成的方法存根
	customMapper.updateByPrimaryKey(custom);
}
@Override
public List<Bankcard> findbankcardList(String cid) throws Exception {
	// TODO 自动生成的方法存根
	BankcardExample example = new BankcardExample();
    BankcardExample.Criteria criteria = 	example.createCriteria();
    criteria.andBcidcardEqualTo(cid);
    List<Bankcard> list = bankcardMapper.selectByExample(example);
	return list;
}
@Override
public void transfer() throws Exception {
	// TODO 自动生成的方法存根
	
}
@Override
public Bankcard findBankcard(String bcid) throws Exception {
	// TODO 自动生成的方法存根
	Bankcard bankcard= bankcardMapper.selectByPrimaryKey(bcid);
	return bankcard;
}
@Override
public void updateBankcard(Bankcard bankcard) throws Exception {
	// TODO 自动生成的方法存根
	bankcardMapper.updateByPrimaryKeySelective(bankcard);
}
@Override
public void insertTransferDetail(Transfer transfer) throws Exception {
	// TODO 自动生成的方法存根
	transferMapper.insertSelective(transfer);
}
@Override
public List<Transfer> selectTransferDetailById(String tid) throws Exception {
	// TODO 自动生成的方法存根
	TransferExample example = new TransferExample ();
	TransferExample.Criteria criteria = example.createCriteria();
	criteria.andTinidEqualTo(tid);
	TransferExample.Criteria criteria2 = example.createCriteria();
	criteria2.andToutidEqualTo(tid);
	example.or(criteria);
	example.or(criteria2);
	List<Transfer> list = transferMapper.selectByExample(example);
	return list;
}



}