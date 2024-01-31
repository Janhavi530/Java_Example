package Java_Ex;

import java.util.Scanner;

public class If_Else {

	public static void main(String[] args) {
		int age;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your age:");
		 age= sc.nextInt();
		 if((age>=5)&&(age<=16))
		 {
			 System.out.println("school admission is allowed.");
		 }
		 else if((age>16)&&(age<=21))
		 {
		     System.out.println("college admission is allowed.");
		 }
		 else 
		 {
			 System.out.println("Admission not allowed");
		 }
	}

}
