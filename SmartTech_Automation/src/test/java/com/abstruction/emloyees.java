package com.abstruction;



public class emloyees implements companyidea {
	//interface  thats why implements
	//interface implement the class
	//interface cannot contain complete/concrete method.
	
	
public void getEmployees() {
	
	System.out.println("Employee name is:Tamnia Alam");
}
	public void getSalary() {
		
		System.out.println("employee salary:120000");
	}
	
	public void getCar() {
		
		System.out.println("Employees get:New car");
		
		
	}
	
	public void getMedicare() {
		
		System.out.println("Employees get:full coverage");
	}
		
	public static void main(String[]args) {
		
		
		
		
		emloyees obj=new emloyees();
		
    	obj.getEmployees();
		obj.getMedicare();
		obj.getSalary();
	    obj.getCar();
	    
	    
	}

}

	
	


