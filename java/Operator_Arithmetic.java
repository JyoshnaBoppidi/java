package sample;

import java.util.Scanner;

public class Operator_Arithmetic {
	
	 public static void main(String[] args) {
	        
	        // Create scanner class object
	        Scanner in = new Scanner(System.in);

	        // Input two numbers from user
	        System.out.println("Enter first number :");
	        int num1 = in.nextInt();
	        System.out.println("Enter second number :");
	        int num2 = in.nextInt();
	        

	        // Perform arithmetic operations.
	        int addition 		= num1 + num2;
	        int subtraction 	= num1 - num2;
	        int multiplication 	= num1 * num2;
	        int division	= num1 / num2;
	        int inc	    = ++num1;
	        int dec = --num1;
	        

	        // Print result to console.
	      
	        System.out.println("Addition : "  + addition);
	        System.out.println("Subtraction : "  + subtraction);
	        System.out.println("Multiplication : "     + multiplication);
	        System.out.println("Division : "    + division);
	        System.out.println("Increment : " + inc);
	   	  System.out.println("Decrement : " + dec);
	 }
		
	}




