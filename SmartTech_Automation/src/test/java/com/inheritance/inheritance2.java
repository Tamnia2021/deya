package com.inheritance;

public class inheritance2 extends inheritance1 {
	

	String guardianName;
	String address;
	int zipcod;
	int fmalyMember;
	String parentsInfo;
	protected void homedetails() {

	guardianName="Abc";
	address="basa";
	zipcod=277;
	fmalyMember=5;
	
	parentsInfo=guardianName + address + zipcod + fmalyMember;
	
	System.out.println("Student parents info:  "  +  parentsInfo);
	}


	}

