package sample;

import java.util.Scanner;

public class ifloop {
	public static void main (String args[])
	{
//		vote
		int age=0;
		Scanner scan = new Scanner(System.in);	
		System.out.println("enter any number");
		age = scan.nextInt();
if(age>=18) {
	System.out.println("eligible");
}
else {
	
System.out.println("not eligible");
}
//positive and negative

int x=0;
Scanner scan1 = new Scanner(System.in);
System.out.println("enter any number");
x = scan.nextInt();
if(x>0) {
	System.out.println("positive");
}
else {
	
System.out.println("negative");
}


//Extend the previous program to check whether the given number is positive, zero or negative.
int x1=0;
Scanner scan2 = new Scanner(System.in);
System.out.println("enter any number");
x = scan.nextInt();
if(x>0) {
	System.out.println("positive");
}
else if(x<0) {
	
System.out.println("negative");
}

else {
	System.out.println("other");
}

// largest of two numbers
int a,b;
Scanner scan3 = new Scanner(System.in);	
System.out.println("enter first number");
a = scan.nextInt();
System.out.println("enter second number");
b = scan.nextInt();
if(a>b) {
	System.out.println("largest=" +a);
}
else if(b>a) {
	
System.out.println("largest=" +b);
}

else {
	System.out.println("equal");
}

//even or odd
int n;
Scanner scan4 = new Scanner(System.in);	
System.out.println("enter any number");
n = scan.nextInt();

if(n%2==0) {
	System.out.println("even");
}
else  {
	
System.out.println("odd");
}


	}
}
