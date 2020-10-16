package com.abstruction;

public class Abstructsub extends Abstructmain {

	@Override
	void getcountryname() {
		
		System.out.println("Bangladesh");
		// TODO Auto-generated method stub
		
	}

	@Override
	void region() {
		System.out.println("islam");
		// TODO Auto-generated method stub
		
	}
	
  public static void main(String[] args) {
	
	  Abstructsub obj=new Abstructsub ();
	  
	  
	  obj.getcountryname();
	  obj.region();
	  obj.subcontinent();
	  obj.reglion();
}
}
