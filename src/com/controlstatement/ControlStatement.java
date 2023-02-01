package com.controlstatement;

public class ControlStatement {
	
	public static void main(String[] args) {
		
		// 1) for loop
		
		 //    1        2       4
//		for(int i = 10; i>=1; i = i - 1) { // i = 1 , i = 2, i = 3, i = 4, i = 5
//			
//			// 3
//			
//			System.out.print(i + " ");
//			
//		}
		
		// 2) While loop  ---> entry control loop
		
//		int i = 1;   // 1 
//		
//		while(i<=10) {  // 2
//			
//			System.out.println(i);  // 3
//			
//			i++;  // 4
//			
//		}
		
		// do while loop --> exit control loop
		
//		int i = 100; // 1 
//		
//		do {    // 2  
//			
//			System.out.println(i); 
//			
//			i++;   // 3
//			
//		} while(i<=10);  //  4
		
		
		// Nested For Loop
		
	//         1        2	     8
		for(int i = 1; i<=5; i = i + 1) {  // outer loop is responsible for printing rows 
			
			//3 
			       
			   //   4         5    7
		     for(int j = 1; j<=5; j++) {   // inner loop is responsible for printing column or values 
		    	 
		    	 //   6
		    	 
		    	 System.out.print("*" + " ");
		    	 
		     }
		     
		     System.out.println();
			
		}
		
	}
	
}
