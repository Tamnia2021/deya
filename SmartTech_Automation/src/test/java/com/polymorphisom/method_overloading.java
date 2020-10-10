package com.polymorphisom;

public class method_overloading {
	
	
	public void getName(String name,int ID ,String address) {
		
		System.out.println("My name:" + name +"My ID :"+ID +"My address is :"+address);
		
	}
	
	public void getName(int salary,int age,int id) {
		
	}
	
	public void getName(int address,String name,int id) {
		
	}
	
	public static void main(String[] args) {
		
		 method_overloading	obj = new  method_overloading();
		 
		 
		 obj.getName("(Tamnia)", 22,"(177-44 106 avenue)");
		 
		 
		
	}
	}


	
	
