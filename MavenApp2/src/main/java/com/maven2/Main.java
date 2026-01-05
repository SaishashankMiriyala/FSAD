package com.maven2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Bank bank;
	        bank = new SBI();
	        System.out.println("SBI Intrest Rate: " + bank.getIntrestRate() + "%");
	        bank = new HDFC();
	        System.out.println("HDFC Intrest Rate: " + bank.getIntrestRate() + "%");
	    }
	}


