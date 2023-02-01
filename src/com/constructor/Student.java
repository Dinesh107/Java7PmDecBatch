package com.constructor;

public class Student {
	
	public Student() {   // non parameterized constructor
		
		System.out.println("Default Constructor");
		
	}
	
	public Student(String name) {       // parameterized constructor
		
		System.out.println(name);
		
	}
	
	public void method1() {

		System.out.println("parent method");
		
	}
	
	public static void main(String[] args) {
		
		Student obj1 = new Student();
		
		Student obj2 = new Student("Geetha");
		
		obj1.method1();
		
	}

}
