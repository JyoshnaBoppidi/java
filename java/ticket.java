package sample;

import java.util.Scanner;

public class ticket {
	public static void main(String[] args) {
		int ticketprice=400;
		int ticketcount=0;
		double discount = 0.1;
		double total = 0;
		Scanner scan = new Scanner(System.in);	
		System.out.println("enter number of tickets");
		int num = scan.nextInt();
if(num>10) {
	total = ticketprice*num-(ticketprice*num)*discount;	
	System.out.println("eligible for discount: "+ total );
}
else {
	
System.out.println("not eligible for discount");
System.out.println("Total price without discount: "+ (ticketprice*num));
}
	}
}
