package com.selenium.automation;
import java.util.Arrays;

public class looping {
	
	public static void singleArrayMethod() {
	int[] num = new int[6]; // it is fix
	int[] number = { 1, 2, 3, 4, 5, 6 };//i can do this also its update

	num[0] = 10;
	num[1] = 20;
	num[2] = 30;
	num[3] = 40;
	num[4] = 50;
	num[5] = 60;
	System.out.println(Arrays.toString(num));//all numbers
	System.out.println(num[3]);//fixed which one

	for (int i = 0; i < num.length; i++) { // i j k   //regular for loop
		
	System.out.println(i);
	}
	for (int j : num) { //advance for
	System.out.println(j);
	}
	}

	public static void multiArrayMethod() {

	String[][] names = { { "Mr. ", "Mrs. ", "Ms. " }, { "Alam", "Juma", "Tasvir" }, { "Alam", "Juma", "Tasvir" },
	{ "Alam", "Juma", "Tasvir" }, { "Alam", "Juma", "Tasvir" } };

	System.out.println(names[0][0] + names[1][2]);//first row then column

	System.out.println(names[0][1] + names[1][1]);
	}

	public static void loopIncreaseValue() {
	for (int i = 0; i <= 1000; i++) {
	System.out.println(i);
	}
	}

	public static void loopDecreaseValue() {
	for(int i =100; i>1; i-- ) {
	System.out.println(i);

	}}
	public static void whileLoop() {
	int i =1;
	while(true) {
	System.out.println(i);
	i++ ;}
	}

	public static void main(String[] args) {
	whileLoop();
	//loopDecreaseValue();
	/*
	* int a = 20; int b = 30; int c= 40; int d = 50; System.out.println(a);
	* System.out.println(b); System.out.println(c); System.out.println(d);
	*/
	}

	}

