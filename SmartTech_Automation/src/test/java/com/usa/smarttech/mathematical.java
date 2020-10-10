package com.usa.smarttech;


public class mathematical{
	//company requirement=who has automation experience more than 6 years
	//his base salary $1120000,coal 4000,lease break 3500
	//bonus $6000,increase salary after one year 4%
	
	
	
	public static void main(String[]args) {
		boolean b=true;
		char c='a';
		short a=125;
		int i=1234567;
		float f=12.4f;
		double d=10.99;
		
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("a="+a);
		System.out.println("i="+i);
		System.out.println("f="+f);
		System.out.println("d="+d);
				
int q=3;

System.out.println("a="+q);
	
	
	
		int x=20;
		int y=10;
		int min=Math.min(x,y);
		System.out.println("Minimum:" + min);
	
		int max=Math.max(x, y);
		System.out.println("Maximum:"+max);
				
	String lname= " Alam";
	String fname="Tamnia";
	String fullname = fname +   lname;
	System.out.println("this is our new employee:"+fullname);
	
	
	int salary=80000;
	int cola=2500;
	int lease=1500;
	int bonus=3000;
			
		int yearllySalary=salary+cola+lease+bonus;
		int monthlysalary=yearllySalary/12;
		int weeklysalary=monthlysalary/4;
		int onedaysalary=weeklysalary/5;
		int hourlysalary=onedaysalary/8;
		
		
		
		
		
	System.out.println("My total salary per enum: "+yearllySalary);
	System.out.println("my total salary per month:"+monthlysalary);
	System.out.println("my salary per week:"+weeklysalary);
	System.out.println("my salary per day:"+onedaysalary);
	System.out.println("my salary per hour:"+hourlysalary);
	}
}
	




	




 
	