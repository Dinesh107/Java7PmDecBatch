package com.polymorphism;

public class Student2 extends College {
	
	@Override
	public void studentName(String name) {

		super.studentName(name);
		
	}

	@Override
	public void studentDetails(int age, String fn, String dob) {

		super.studentDetails(age, fn, dob);
		
	}

	@Override
	public void studentMarks(int tm, int twm) {
		
		super.studentMarks(tm, twm);
		
	}
	
	public static void main(String[] args) {
		
		Student2 obj = new Student2();
		
		obj.studentName("Murugan");
		
		obj.studentDetails(20, "siva", "10-02-1995");
		
		obj.studentMarks(490, 1150);
		
	}

}
