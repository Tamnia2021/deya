      package com.inheritance;



      public class creditaccount extends chekingAccount{

        protected void creditDetails() {
        	
        	
        SavingsAccount.initialbalance = 10000;
        SavingsAccount.withdraw = 300;
        SavingsAccount.deposit=400;
        SavingsAccount.balance = SavingsAccount.initialbalance - SavingsAccount.withdraw+SavingsAccount.deposit;
        
        
        System.out.println("Customer total credit account money : " + SavingsAccount.balance);

  }

  }