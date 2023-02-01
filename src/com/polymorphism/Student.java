package com.polymorphism;

public class Student {
	
	
	public void studentDetails(String name) {  // datatype

		System.out.println(name);
		
	}
	
	
    public void studentDetails(float height, char initial, String fn) {  // datatype order

		System.out.println(height + " " + initial + " " + fn);

	}
   
    
    public void studentDetails(int m1, int m2, int m3) {   // datatype count

		System.out.println(m1 + " " + m2 + " " + m3);
		
	}
   
    public static void main(String[] args) {
		
    	Student obj = new Student();
    	
    	obj.studentDetails("Ganesh");
    	
    	obj.studentDetails(5.5f, 's', "siva");
    	
    	obj.studentDetails(100, 99, 97);
    	
    	
    	obj.add(10,20);
    	
    	obj.add(20,20,30);
    	
    	obj.add(40,50,30,10);
    	
    	System.out.println(obj.add(20, 10));
    	
    	System.out.println(obj.add(30, 30, 60));
    	
    	System.out.println(obj.add(10, 20, 20, 50));
	}


	public int add(int i, int j) {

		return i + j;
		
	}
	
	public int add(int i, int j, int k) {

		return i + j + k;
		
	}
	
	public int add(int i, int j, int k, int l) {

		return i + j + k + l;
		
		
	}
}
