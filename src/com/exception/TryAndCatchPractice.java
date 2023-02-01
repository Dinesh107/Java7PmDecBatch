package com.exception;

public class TryAndCatchPractice {
	
	public static void main(String[] args) {
		
		try {
			
			int a = 10;
			
			int b = 2;
			
			System.out.println(a/b);
			
		} catch (Exception e) {

			e.printStackTrace();
			
		} 
		
		finally {
			
			System.out.println("this is the ArithmeticException which is catched in catch block");
			
		}
		
		System.out.println("------------*------------*----------");
		
		System.out.println("Remaining code");
		
        int c = 10;
		
		int d = 2;
		
		System.out.println(c + d);
	
	}

}
