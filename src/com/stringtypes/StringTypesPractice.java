package com.stringtypes;

public class StringTypesPractice {
	
	public static void main(String[] args) {
		
		// Immutable 
		
//		String s1 = "Welcome To Java";
//		
//		System.out.println(System.identityHashCode(s1));
//		
//		String s2 = "Welcome To Java";
//		
//		System.out.println(System.identityHashCode(s2));  // memory is shared
//		
//		System.out.println(s1 + " " + s2); 
//		
//		System.out.println(System.identityHashCode(s1 + " " + s2));  // new memory is created
		
		// Mutable String 
		
		StringBuffer s1 = new StringBuffer("Geetha");
		
		System.out.println(System.identityHashCode(s1));
		
        StringBuffer s2 = new StringBuffer("Geetha");   // new memory is created
		
		System.out.println(System.identityHashCode(s2));
		
		System.out.println(s1.append(s2));
		
		System.out.println(System.identityHashCode(s1.append(s2))); // memory is shared
		
	}

}
