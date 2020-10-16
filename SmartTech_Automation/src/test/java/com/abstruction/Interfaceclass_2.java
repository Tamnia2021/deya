package com.abstruction;

public class Interfaceclass_2 implements Interfaceclass1,Companyidea_4 {

	@Override
	public void name() {
		
		System.out.println("Deya,Urme,teresa");
		
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void color() {
		
		System.out.println("RED,pink,blue");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void address() {
		System.out.println("177_44 106 avenue,barlinway,montreey creek");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void City() {
		System.out.println("jamaica,queens,bronx");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void state() {
		System.out.println("new york,north carolina,florida");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void zipcode() {
		System.out.println("11433,11428,11476");
		// TODO Auto-generated method stub
		
	}
	
public static void main(String[] args) {
	
	 Interfaceclass_2 obj=new  Interfaceclass_2();
	 obj.address();
	 obj.City();
	 obj.name();
	 obj.color();
	 obj.state();
	 obj.zipcode();
	
}

	
}

