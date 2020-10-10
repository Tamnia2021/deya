package com.encaptulation;

public class encaptulationB {
	
	private String name ="Shaila";
	
     private int routernumber= 076;
     
     private int totalmoney=12000;
     
     

     private String getName() {
    	 return name;
     }
     
     private int getRouternumber() {
    	 return routernumber;
     }
     
    private int getTotalmoney() {
    	return totalmoney;
    }
    
   public static void main(String[] args) {
	
	   encaptulationB obj=new  encaptulationB();
	   
	   System.out.println("my customer name is:"+obj.getName());
	   
	  System.out.println(" router number is:"+obj.getRouternumber());
	  
	  System.out.println("total balance is:"+obj.getTotalmoney());
} 
}
