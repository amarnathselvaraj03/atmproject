package com.atmProject;

import java.util.Scanner;

public class AnthoerProject {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("Enter Your PinNumber ");
		int in=sc.nextInt();
		if(in==2034) {
			System.out.println("Correct pinNumber :"+in);
		}
		else {
			System.out.println("Incorrect PinNumber");
			break;
		}
		
		System.out.println();
		System.out.println("Savings");
		System.out.println();
		System.out.println("Withdrawal");
		System.out.println();
		System.out.println("Enter Your Deposit amount");
		int de=sc.nextInt();
		
		System.out.println("deposited amount :"+de);
		
		System.out.println();
		System.out.println("If you want exit Y/N");
		String s=sc.next();
		if(s.equals("Y")) {
			System.exit(de);
		}
		}
	}
}
