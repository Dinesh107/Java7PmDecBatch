package com.oops;       // package

public class OopsPractice {   // class
	
	public void vintageCar() {  // method
		
		System.out.println("Italian Fiat");  // printing statement
		
	}	
	
	public void vintageBike() {   // method
		
		System.out.println("Royal Enfield 500,  1990 Model");  // printing statement
		
	}
	
	public static void main(String[] args) {  // main method
		
		OopsPractice obj = new OopsPractice();    // object
		
		obj.vintageCar();    // method calling using object
		
		obj.vintageBike();  // method calling using object
	}
	
}
