package com.services.bank;

public class HdfcBank extends GenericBank implements WithdrawContract,DepositContract{

	public HdfcBank() {
		super();
	}
	
	public void welcome() {
		System.out.println("Welcome to HDFC Bank");
	}

}
