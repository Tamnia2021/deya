package com.inheritance;

public class AccountSummary extends creditaccount{

public static void main(String[] args) {
// if We need both class property then we need to be create child class object
	
	
AccountSummary obj = new AccountSummary();

obj.openAccount();
obj.savingDetails();
obj.chekingDetails();
obj.creditDetails();


}

}





