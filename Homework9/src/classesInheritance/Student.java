package classesInheritance;

public class Student extends Person {
	// ToDo 1: Make this class a child of Person
	
	// ToDo 2: Fix the resulting errors
	
	public Student(String name, short age) { //constructor
		super(name, age); //sets the name and age variables for the parent class
	}
	
	public String getAddress() { //override method from the parent class
		return null;
	}
	
	public void setAddress(String address) {} //override method from the parent class
	
	// ToDo 3: Add a field for GPA and create setter and getter
	private double gpa; //double variable for gpa
	
	public double getGPA() { //getter
		return gpa;
	}
	
	public void setGPA(double gpa) { //setter
		this.gpa = gpa;
	}
	
	// ToDo 4: Add comments to your code
	public String toString() {
		return "Name: " + getName() + "\nAge: " + getAge() + "\nGPA: " + getGPA();
	}
}
