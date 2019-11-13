package sample;

import java.util.Scanner;

public class array1 {
	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
        System.out.println("Enter five employee Id's separated by spaces: ");
        String line1 = scan.nextLine();
        String[] ids = line1.split(" ");
        
        System.out.println("length: "+ids.length);
        for(int i=0;i<ids.length;i++){
            System.out.println("array ids are: "+ids[i]);
        }
        System.out.println("Enter five employee names separated by spaces: ");
        String line2 = scan.nextLine();
        String[] names = line2.split(" ");
        System.out.println("length: "+names.length);
        for(int j=0;j<names.length;j++){
            System.out.println("array names are: "+names[j]);
        }
        
        System.out.println("Enter five employee salaries separated by spaces: ");
        String line3 = scan.nextLine();
        String[] salaries = line3.split(" ");
        System.out.println("length: "+salaries.length);
        for(int k=0;k<salaries.length;k++){
            System.out.println("Array salaries are: "+salaries[k]);
        } 
        System.out.println("ID "+"\t\t"+"Name \t\t"+"Salary \t\t");
        for(int l=0;l<ids.length;l++){
           display(ids[l],names[l],salaries[l]); 
        }   
    }
    
    public static void display(String empId,String empName, String empSal){
            System.out.println(empId+"\t\t"+empName+"\t\t"+empSal);
    }

}












    