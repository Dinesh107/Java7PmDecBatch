package com.castinginbobject;

public class Parent {
	
	public void method1() {

		System.out.println("Parent Method1");
		
	}
	
	public static void main(String[] args) {
		
//    class reference   class object		
		Parent obj1 = new Parent();
		
		obj1.method1();
	}

}
