package com.scannerclass;

import java.util.Scanner;

public class UserInput {
	
	public static void main(String[] args) {
		
		// Scanner Class
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Name:- ");
		
		String name = sc.nextLine();
		
		System.out.println("Your Name is :- " + name);
		
		System.out.println("Enter Your Age:- ");
		
		int age = sc.nextInt();
		
	    System.out.println("your age is:- " + age);
	    
	    System.out.println("Enter Your Height :- ");
	    
	    float height = sc.nextFloat();
	    
	    System.out.println("Your Height is:- " + height);
	    
	    System.out.println("Enter Your Initial:- ");
	    
	    char initial  = sc.next().charAt(0);
	    
	    System.out.println("Your Initial is:- " + initial);
	    
	    System.out.println("Enter Your Gender:- ");
	    
	    String gender = sc.next();
	    
	    System.out.println("Your Gender is:- " + gender);
		
//		System.out.println("Enter the 1st no:- ");
//		
//		int no1 = sc.nextInt();
//		
//        System.out.println("Enter the 2nd no:- ");
//		
//		int no2 = sc.nextInt();
//		
//		int ans = no1 + no2;
//		
//		System.out.println("The addition of two number is:- " + ans);
	}

}
