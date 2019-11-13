package sample;

import java.util.Scanner;

public class dowhileloop {
	public static void main (String args[])
	{
//Write a program to print 10 even numbers and 10 odd numbers
		int i;
		Scanner scan=new Scanner(System.in);

		System.out.print("Enter given number:\n");
		  int num=scan.nextInt();
		System.out.print("odd numbers are: \n");
		i=1;
		do{               //loop for iterate from 1 to maximum
		    if(i%2==1){
		System.out.print(i+"\n");
		}
		i++;
		}
		while(i<=num);
		
		int i1;
		

		System.out.print("Enter given number:\n");
		 int num1 =scan.nextInt();
		System.out.print("even numbers are: \n");
		i=1;
		do{               
		    if(i%2==0){
		System.out.print(i+"\n");
		}
		i++;
		}
		while(i<=num1);
		
//Write a program to find factorial of a number
		int n=5;   
		int i2=1, fact=1;
		   System.out.println("enter any number");
			n= scan.nextInt();
        do
        {
            fact = fact * i;
            i++;
        } while (i <= n);

    	System.out.println("factorials of"+n+"is:"+fact );
       
//Write a program to generate tables of 10
    	int num2, c=0;
	    System.out.println("Enter an integer");
	   
	    n = scan.nextInt();
	    System.out.println("Multiplication table of " + n);
	 do {
			c++; 
			  System.out.println(n + "*" + c + " = " + (n*c));
	 }
	    while(c<10);
	    
//Write a program to add the digits of a number
	 
	 int m, n1, sum = 0;
	
     System.out.print("Enter the number:");
     m = scan.nextInt();
     do {
    	  n = m % 10;
          sum = sum + n;
          m = m / 10;
      
     
     }
     while(m > 0);
     System.out.println("Sum of Digits:"+sum);
       
//Write a program to reverse the digits of a number
     int num3=0;
     int reverse =0;
     System.out.println("enter the number: ");
  
     num = scan.nextInt();
     do {
    	 reverse = reverse * 10;
         reverse = reverse + num%10;
         num = num/10;
     }
     while( num != 0 );
     System.out.println("Reverse of input number is: "+reverse);
//Write a program to generate 10Fibonacci numbers.
     int i3=1;
     int n2 = 10, t1 = 0, t2 = 1;
     System.out.print("First " + n2 + " terms: ");
     do {
    	 System.out.print(t1 + " + ");
         int sum1 = t1 + t2;
         t1 = t2;
         t2 = sum1; 
         ++i3;
     }
     while(i3<=n2);
        
     
}
}