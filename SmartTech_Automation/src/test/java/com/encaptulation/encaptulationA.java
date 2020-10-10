package com.encaptulation;

//can you create the private class?
//-no.i cannot create class as private.But we can create as final.

//Final means nobody can reuse,rechange,no over writing,no over reading,nobody have access.

//in stead of private i can create final.

//what we need in encapsulation?
//1.we have to declare the value
//2.we need garter and setter method.
//3.we have to finish within class.


public class encaptulationA {
	
	private String name ="tamnia alam";
	
	private String jobtitle="QA tester";

	private int salary=85000;
	
	public String getName() {
		return name ;
	}
	public String getjobtitle() {
		return jobtitle;
	}
	public int getsalary() {
      return salary;
	}
	
	
	public static void main(String[] args) {
		
		encaptulationA obj=new encaptulationA();
		
		System.out.println("My Job Title is:"+obj.getjobtitle());
		
		System.out.println("my name is:"+obj.getName());
		
		System.out.println("my salary is:"+obj.getsalary());
		
		
	}
}
	
	
