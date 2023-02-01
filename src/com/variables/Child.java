package com.variables;

public class Child extends VariablesPractice {
	
//	@Override
//	public void method1() {
//
//		System.out.println("300");
//		
//	}
	
	
	int b = 90;
	
	public void method1() {

		System.out.println(this.b);  // current class refrence
		
		System.out.println(super.b);  // parent class refrence
		
	}

	public static void main(String[] args) {

		Child obj = new Child();
		
		obj.method1();
		
	}

}
