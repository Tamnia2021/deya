
          package com.inheritance;

          public class chekingAccount extends SavingsAccount {

          protected void chekingDetails() {
	
          SavingsAccount.initialbalance = 2000.99;

          SavingsAccount.deposit = 100;

         SavingsAccount.withdraw = 300.75;

         SavingsAccount.balance = SavingsAccount.initialbalance + SavingsAccount.deposit - SavingsAccount.withdraw;

        System.out.println("Customer total checking account money : " + SavingsAccount.balance);

   }



  }