package com.polymorphisom;

public class constructor_subclass {
	
	public static void main(String[] args) {
		
		
		Constructor_class obj=new Constructor_class("Deya","Female",23,"177-44 106 avenue",1001);
		obj.displaymethod();
		
		
		Constructor_class obj1=new Constructor_class("Heya","Female",18,"177-44 106 avenue",1002);
		
		obj1.displaymethod();
		
		Constructor_class obj2=new Constructor_class("Jahid","male",25,"177-44 106 avenue",1003);
		
		obj2.displaymethod();
		
		Constructor_class obj3=new Constructor_class();
		
		obj3.displaymethod();


	}
 
}
