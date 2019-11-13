package sample;

import java.util.Scanner;

public class forloop {
	public static void main (String args[])
	{
//Write a program to print 10 even numbers and 10 odd numbers
		int i;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter given number:\n");
		int num=scan.nextInt();
		System.out.print("even numbers are: \n");
		for (int j = 1; j <= num; j++) {
		 
		   if (j % 2 == 0) {
			System.out.print(j + " ");
		   }
		}
		int i1;
		System.out.print("\n"+"Enter given number:\n");
		int num1=scan.nextInt();
		System.out.print("odd numbers are: \n");
		for (int j = 1; j <= num; j++) {
		 
		   if (j % 2 == 1) {
			System.out.print(j + " "+"\n");
		   }
		}
		
//Write a program to find factorial of a number.
		int n=5;
		int i2, fact=1;
		
		
		System.out.println("\n"+"enter any number");
		n= scan.nextInt();
		for(i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("factorials of"+n+"is:"+fact );
		
		
//Write a program to generate tables of 10.
		int c;
	    System.out.println("Enter an integer");
	   
	    n = scan.nextInt();
	    System.out.println("Multiplication table of " + n);
	 
	    for (c = 1; c <= 10; c++) {
	      System.out.println(n + "*" + c + " = " + (n*c));
	  }
	  //Write a program to add the digits of a number.
	    int m,  sum;
     
        System.out.print("Enter the number:");
        m = scan.nextInt();
        
       for(sum=0; m!= 0;m/=10)
        {
           sum+=m%10;
      
        }
       System.out.println("Sum of Digits:"+sum);
       
       
 //Write a program to reverse the digits of a number
        int num3=0;
        int reversenum =0;
        System.out.println("enter the number");
        Scanner scan6 = new Scanner(System.in);
        num = scan.nextInt();
        for( ;num != 0; )
        {
            reversenum = reversenum * 10;
            reversenum = reversenum + num%10;
            num = num/10;
        }

        System.out.println("Reverse of specified number is: "+reversenum);
        
//Write a program to generate 10 Fibonacci numbers.
        int n3 = 10, t1 = 0, t2 = 1;
        System.out.print("First " + n3 + " terms: ");
        for (int i3 = 1; i3 <= n3; ++i3)
        {
            System.out.print(t1 + " + ");
            int sum1 = t1 + t2;
            t1 = t2;
            t2 = sum1;
        }
     
	      
	    }
}
