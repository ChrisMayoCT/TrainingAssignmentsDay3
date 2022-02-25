package assignmentPackage2;
/*
 * Assignment 10 :-  Create a abstract class employee, having its properties & abstract function for calculating 
     		net salary and displaying the information.  Drive manager & clerk class from this abstract 
     		class & implement the abstract method net salary and override the display method.

 */
public class Assignment10 {

	public static void main(String[] args) {
		Assignment10 a = new Assignment10();
		Manager m = a.new Manager(75000,3000);
		Clerk c = a.new Clerk(55000,2000);
		System.out.println(m.netSalary());
		System.out.println(c.netSalary());
	}
	
	public abstract class Employee {
		protected int grossSalary, deductions;
		
		abstract int netSalary();
	}
	
	public class Manager extends Employee {

		public Manager(int gross, int d) {
			grossSalary = gross;
			deductions = d;
		}
		
		int netSalary() {
			return grossSalary - deductions;
		}
		
	}
	
	public class Clerk extends Employee {

		public Clerk(int gross, int d) {
			grossSalary = gross;
			deductions = d;
		}
		
		int netSalary() {
			return grossSalary - deductions;
		}
		
	}
}
