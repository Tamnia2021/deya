package com.polymorphisom;

public class method_overriding1 extends  method_overriding2 {
	
	public void getAddress () {
		
		System.out.println("93-15 210th place");
		
	}
	
	public static void main(String[] args) {
		
		
		 method_overriding1 obj= new  method_overriding1()	;
		 
		 
		 obj.getName();
		 obj.getAge();
		 obj.getSalary();
		 obj.getMedicate();
		 obj.getAddress();
		 obj.getID();
		
	}

}
