package assignmentPackage2;
/*
 * Assignment 7:- Create a person inherit two classes from it as politician & sportsman provide constructors & 
     		print their salary using printSalary() functions.
 */
public class Assignment7 {

	public static void main(String[] args) {
		Sportsman s1 = new Sportsman();
		s1.setSalary(800000);
		Politician p1 = new Politician();
		p1.setSalary(175000);
		s1.printSalary();
		p1.printSalary();
	}

	public static class Person {
		private int salary;

		public Person() {
			salary = 0;
		}
		
		public void printSalary() {
			System.out.println("Salary: " + salary);
		}

		public void setSalary(int salary) {
			this.salary = salary;
		}
	
	}
	
	public static class Politician extends Person {
		
	}
	
	public static class Sportsman extends Person {
		
	}
}
