package com.abstruction;

public class employees_1 implements companyidea,companyidea_2 {

		
	public void getEmployees() {
		
		System.out.println("Employees name:Tamnia");
	}
		public void getSalary() {
			
			System.out.println("Employees salary:100000");
		}
		
		public void getCar() {
			
			System.out.println("Employees get:New car");
		}
		
	public	void getMedicare() {
		
		System.out.println("Employeesget:Full coverage");
	}

	
		
	public	void Engine() {
		System.out.println("engine  of  car is:nissan");
	}
		public void Model() {
			System.out.println("Car model is:model A");
		}
		
		
		public void carbody() {
			System.out.println("carbody is:XY");
			
			
		}
		//complete method/concrete method/abstract class=public void get salary("){}
		
		
 public static void main(String[] args) {
	
	 employees_1 obj=new employees_1();



  
	obj.getEmployees();
   	obj.getMedicare();
   	obj.getSalary();
   	obj.getCar();
   	obj.Engine();
   	obj.carbody();
   	obj.Model();
		
	}
}
	



