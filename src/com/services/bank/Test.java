package com.services.bank;

public class Test {

	public static void main(String[] args) {
		GenericBank hb = new HdfcBank();
		GenericBank hb1 = new GenericBank();
		hb.welcome();
		hb1.welcome();
		System.out.println("Output after creating the method function of Hdfc");
		hb.welcome();
		hb1.welcome();
		System.out.println("Deposit");
		hb.deposit(5000);
		System.out.println("Withdraw");
		hb.withdraw(400);
		System.out.println("Check Balance ");
		hb.checkBalance();
	}

}

/*------------------Output------------------*/
//Welcome to HDFC Bank
//Welcome to Generic Bank
//Output after creating the method function of Hdfc
//Welcome to HDFC Bank
//Welcome to Generic Bank
//Deposit
//Your Bank Balance after depositing : 5000.0
//Withdraw
//Your Bank Balance after withdrawing : 4600.0
//Check Balance 
//The amount of money in your account is : 4600.0

