package com.problems;

import java.util.Scanner;

public class JavaInterviewProblems {
	
    public static void main(String[] args) {
		
    	// find whether the given number is odd or even
    	
//    	 Scanner sc = new Scanner(System.in);
//    	
//    	 System.out.println("Enter the Number:- ");
//    	 
//    	 int num = sc.nextInt();
    	 
//    	 if(num%2==0) {
//    		 
//    		 System.out.println("the number is even");
//    		 
//    	 } else {
//    		 
//    		 System.out.println("the number is odd");
//    		 
//    	 }
    	 
//    1) % ---> Modulus operator
    	 
 //   2) 2 ---> 0 or 1
    	 
 //   3) two dimensional array 
    //  a[10][5]
    	 
//     String[][] a = new String[10][10];
//     
//      a[0][0] = "even"; 
//      
//      a[1][0] = "odd";
    	
      String[][] a = {{"even"}, {"odd"}};
      
      int n = 10;
      
      System.out.println(a[n%2]);
     	
	}
}
