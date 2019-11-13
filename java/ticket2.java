package sample;

import java.util.Scanner;

public class ticket2 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);	
		System.out.println("enter name of the ticket");
		 String ticket1 = scan. nextLine();
if(ticket1=="golden") {
	
	System.out.println("golden ticket: " +(200*2) );
}
else {
	
System.out.println("silver ticket: "+ (150*2));

}
	}
}
