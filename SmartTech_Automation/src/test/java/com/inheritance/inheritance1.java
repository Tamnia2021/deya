package com.inheritance;

public class inheritance1 {


	
	static String name;
	static int id;
	static String schoolName;
	static double result;
	String Totalinfo;
	
	
	protected void schooldetails() {
	name="Tamnia";
	id=101;
	schoolName="BBG";
	result=4.50;
	 Totalinfo = name + id + schoolName + result;
	 
	 
	System.out.println("student information:"  +  Totalinfo);
}
}
