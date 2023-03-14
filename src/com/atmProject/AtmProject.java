package com.atmProject;


import java.util.Scanner;

public class AtmProject {
	
	static void atmInterface()
	{
		System.out.println();
		System.out.println("If you want deposit press 1");
		System.out.println("If you want check balance press 2");
		System.out.println("If you want withdrawal press 3");
		
	}

	public static void main(String[] args) {
		
		
		
		Scanner s=new Scanner(System.in);
		
		int balance=0;
		int with=0;
		int balan=0;
		while(true) {
		int deposit=0;
		System.out.println("Enter your pinNumber");
		for(int i=0;i<1;i++) {
		int in;
		in=s.nextInt();
	
		if(in==2003) {
	
			System.out.println("Your pinNumber correct :"+in);
			
		}
		else {
			System.out.println("Incorrect pinNumber");
		System.exit(in);
		}	
		}	
		
		AtmProject.atmInterface();
		int a=0;
		int sw=s.nextInt();
		
	    switch(sw)
	    
	    {
		case 1:
		
		
		System.out.println("Enter your deposit amount");
		deposit=s.nextInt();
		
		System.out.println("Successfully deposit amount ="+deposit);
		balance=deposit+balance;
		System.out.println();
		break;
		case 2:
		System.out.println("Balance check ");
		
		System.out.println();
		
		
		System.out.println("Balance ="+balance);
		
		break;
		case 3:
		System.out.println("Withdrawal amount");
		int wi=s.nextInt();
		if(wi<balance && wi>0) {
			balance=balance-wi;
			System.out.println("Balance amount="+balance);
		}
		else {
			System.out.println();
			System.out.println("Not Enough Balance");
		}
		break;
	
	    }
	    System.out.println("if you want exit press Y/N");
	    String ex=s.next();
	    if(ex.equals("Y")) {
	    	System.exit(a);
	    }
				}
			}
	}

	
		
	


