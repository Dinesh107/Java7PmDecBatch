package com.castinginbobject;

public class Child extends Parent {
	
	public void method2() {

		System.out.println("Child Mehtod 1");
		
	}
	
	public static void main(String[] args) {
		
		Child obj = new Child();
		
	//	Child obj = new Parent();  // ---> Downcasting
		
	    Parent obj1 = new Child(); // ---> Upcasting  ---> we can only call parent class methods	
		
		obj1.method1();

	}

}
