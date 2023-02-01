package com.exception;

import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;

public class ExceptionPractice {
	
	public static void main(String[] args) {
		
		// Exception
		
//		int a = 10;
//		
//		int b = 0;
//		
//		System.out.println(a/b);
	
	
	// Arithmetic Exception
	
	// +, -, *, / 
	
//	int a = 10;
//	
//	int b = 0;
//	
//	System.out.println(a/b);
	
	// Null Pointer Exception
		
//		String s = null;
//		
//		int le = s.length();
//		
//		System.out.println(le);
		
		// Input MisMatch Exception
		
//		Scanner sc = new Scanner(System.in);
//		
//        System.out.println("Enter any number:- ");
//		
//		int num = sc.nextInt();
//		
//	    System.out.println("the number you entered is:- " + num);
		
		// Array Index Out Of Bound Exception
		
//		float a[] = new float[5];
//		
//		a[0] = 4.5f;
//		
//		a[1] = 5.6f;
//
//		a[2] = 3.3f;
//		
//		a[3] = 2.5f;
//		
//		a[4] = 1.4f;
//		
//		a[5] = 23.4f;
//		
//        for (float it : a) {
//			
//			System.out.println(it);
//			
//		}
		
		// String Index Out Of Bound Exception
		
//		String s = "geetha";
//		
//		 char ca = s.charAt(6);
//		 
//		 System.out.println(ca);
		
		//  Index Out Of Bound Exception
		
//		List<Object> li = new ArrayList<Object>(); 
//		
//        li.add(24);
//		
//		li.add("Geetha");
//		
//		li.add("Java");
//		
//		li.add("5.5f");
//		
//		li.add(true);
//		
//
//    	System.out.println(li);
//		
//		Object ge = li.get(5);
//		
//		System.out.println(ge);
		
		//  Number Format Exception
		
		String s = "12345yt";
		
		System.out.println(s);
		
		int pi = Integer.parseInt(s);
		
		System.out.println(pi);
		
//		int b = 5;
//		
//		System.out.println(s + b);
	
   }

}