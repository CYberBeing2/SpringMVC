package com.arena.pojo;

import java.util.List;

public class BankCardQueryVO {
	
  private Bankcard bankcard;
  private Custom custom;
  private Transfer transfer;
  private List<Bankcard> bankcardList;
  private List<Transfer> transferList;
public Bankcard getBankcard() {
	return bankcard;
}
public void setBankcard(Bankcard bankcard) {
	this.bankcard = bankcard;
}
public Custom getCustom() {
	return custom;
}
public void setCustom(Custom custom) {
	this.custom = custom;
}
public Transfer getTransfer() {
	return transfer;
}
public void setTransfer(Transfer transfer) {
	this.transfer = transfer;
}
public List<Bankcard> getBankcardList() {
	return bankcardList;
}
public void setBankcardList(List<Bankcard> bankcardList) {
	this.bankcardList = bankcardList;
}
public List<Transfer> getTransferList() {
	return transferList;
}
public void setTransferList(List<Transfer> transferList) {
	this.transferList = transferList;
}

  
  
  
  
}
