package com.inheritance;



public class SavingsAccount {

	static String name;
	
	static double deposit;
	static double initialbalance;
	static double withdraw;
	static double balance ;

	protected void openAccount() {

        String name = "Tamnia Alam";
		int id = 9080;
		int acc = 90987685;
		String address = "177-44 106 avenue jamaica NY";

		System.out.println("customer name:"+name);
		System.out.println("customer address:"+address);
		System.out.println("customer account number:"+acc);
		System.out.println("Customer ID number is:"+id);
	}

protected void savingDetails() {
	
	initialbalance=1500.99;
	deposit=1050;
	withdraw=700.60;
	balance=initialbalance+deposit-withdraw;
	System.out.println("customer total savings;"+balance);
}

	
}
	

	

	


