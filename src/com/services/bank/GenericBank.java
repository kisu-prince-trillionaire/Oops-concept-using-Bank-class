package com.services.bank;

public class GenericBank {
	protected double bankBalance;

	public void welcome() {
		System.out.println("Welcome to Generic Bank");

	}

	public void deposit(int amount) {
		bankBalance = +amount;
		System.out.println("Your Bank Balance after depositing : " + bankBalance);
	}

	public void withdraw(int amount) {
		bankBalance = bankBalance-amount;
		System.out.println("Your Bank Balance after withdrawing : " + bankBalance);
	}

	public void checkBalance() {
		System.out.println("The amount of money in your account is : " + bankBalance);
	}
}
