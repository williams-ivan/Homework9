package classesInheritance;

import java.util.Scanner;

public class DriverClass {
	
	public static void main(String[] args) {
		// ToDo 5: Fix the error
		
		// ToDo 6: Fix the constructor of Student class
		
		// ToDo 7: Add a toString method for Student class
		
		Student std1= new Student("James", (short)20);
		
		// ToDo 8: Set the gpa of the student using the scanner and user
		// 			input and then print the output.
		System.out.print("Enter GPA: ");
		Scanner sc = new Scanner(System.in); //scanner for retrieving the input
		std1.setGPA(sc.nextDouble()); //sets the gpa variable
		
		System.out.println(std1);
		
		// ToDo 9: add comments and explain your code
		
		// ToDo 10: submit using a pull request.
	}

}
