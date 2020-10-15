package com.polymorphisom;

public class Constructor_class {
	
	String name;
	String gender;
	int age ;
	String Address;
	int id;
	
	Constructor_class(){
		
		System.out.println("there is no value");
		
	}
	
	Constructor_class(String n,String g,int a,String A,int i){
		
		//variable initialize
		
		name=n;
		gender=g;
		age=a;
		Address=A;
		id=i;
		
	}
	public void displaymethod() {
		
	System.out.println("my name is:"+name);	
	System.out.println("gender is:"+gender);	
	System.out.println("my age is:"+age);	
	System.out.println("my Address is:"+Address);	
	System.out.println("my id is:"+id);	



		
	}
}
