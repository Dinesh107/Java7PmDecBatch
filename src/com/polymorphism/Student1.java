package com.polymorphism;

public class Student1 extends College {

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
    	
    	Student1 obj = new Student1();
    	
    	obj.studentName("ganesh");
    	
    	obj.studentDetails(26,"siva", "12-12-1991");
    	
    	obj.studentMarks(490, 1980);
		
	}
       	
}
