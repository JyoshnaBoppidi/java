package sample;

import java.util.Scanner;

public class whileloop {

	public static void main(String[] args) {
		
//Write a program to print 10 even numbers and 10 odd numbers
		int i;
		Scanner scan=new Scanner(System.in);

		System.out.print("Enter given number:\n");
		int num=scan.nextInt();
		System.out.print("odd numbers are: \n");
		i=1;
		while(i<=num){
		if(i%2==1){
		System.out.print(i+"\n");
		}
		 i++;
		}
		
		int i1;
		
		System.out.print("Enter given number:\n");
		int num1=scan.nextInt();
		System.out.print("even numbers are: \n");
		i=1;
		while(i<=num){
		if(i%2==0){
		System.out.print(i+"\n");
		}
		 i++;
		}
		
		
		
//Write a program to find factorial of a number
		int n=5;
		int i2=1, fact=1;
		
		System.out.println("enter any number");
		n= scan.nextInt();
		while(i2<=n) {
			fact=fact*i2;
			i2++;
		}
		System.out.println("factorials of"+n+"is:"+fact );
	
//Write a program to generate tables of 10
		int c=0;
	    System.out.println("Enter an integer");
	    
	    n = scan.nextInt();
	    System.out.println("Multiplication table of " + n);
	 
	    while(c<10) {
	    	c++;
	      System.out.println(n + "*" + c + " = " + (n*c));
	  }
//Write a program to add the digits of a number.
	    int m, n2, sum = 0;
       
        System.out.print("Enter the number:");
        m = scan.nextInt();
        while(m > 0)
        {
            n = m % 10;
            sum = sum + n;
            m = m / 10;
        }
        System.out.println("Sum of Digits:"+sum);
//Write a program to reverse the digits of a number.
        
        int num3=0;
        int reverse =0;
        System.out.println("enter the number: ");
        
        num3 = scan.nextInt();
        while( num3 != 0 )
        {
            reverse = reverse * 10;
            reverse = reverse + num3%10;
            num3 = num3/10;
        }

        System.out.println("Reverse of input number is: "+reverse);
//Write a program to generate 10 Fibonacci numbers.
	int i3=1;
        int n3 = 10, t1 = 0, t2 = 1;
        System.out.print("First " + n3 + " terms: ");
        while(i3<=n3)
        {
        	++i3;
            System.out.print(t1 + " + ");
            int sum1 = t1 + t2;
            t1 = t2;
            t2 = sum1;
        }
       
	
		}
		}
	
	

