package com.encaptulation;

public class encapsulationC {
	
	private String Name="Urme";
	private String Accounttype  ="savings account";
	private int Accountnumber =123456;
	
	public String getName() {
		return Name;
	}
	public String getAccounttype() {
		return Accounttype;
	}
	public int getAccountnumber() {
		return Accountnumber;
	}
	
	public static void main(String[] args) {
		
		encapsulationC obj=new encapsulationC();
		System.out.println("name is: Urme");
		System.out.println("accounttype is: savings account");
		System.out.println("accountnumb er: is 123456");
		
		
		obj.getName();
		obj.getAccounttype();
		obj.getAccountnumber();
		
		
		
	}
	

}
