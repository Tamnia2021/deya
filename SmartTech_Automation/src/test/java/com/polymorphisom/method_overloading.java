package com.polymorphisom;

     public class method_overloading {
	
	
	public void getName(String name,int ID ,String address) {
		
		System.out.println("  My name : "+ name +"  My ID :"+ID  +    "  My address is :"+address);
		
	}
	
	public void getName(int salary,int age,int id) {
	
		System.out.println("  My salary : " + salary +  "  My age:"+ age +      "  My id is :"+id);
	}
	
	public void getName(Float salary,int id,String name) {
		
		System.out.println("My salary:  "  +salary + "   My ID:" +id  +    " My name : "   +name);
		
	}
	
	public static void main(String[] args) {
		
		 method_overloading	obj = new  method_overloading();
		 
		 
		 obj.getName("(Tamnia)", 22,"(177-44 106 avenue)");
		 
		 obj.getName(100000, 23, 1003);
		 
		 obj.getName(100000.56f,23,  ("Tamnia"));
		 
		 
		
	}
	
     }
	
	


	
	
