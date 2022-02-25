package assignmentPackage2;
/*
 * Assignment 6:- Write  a program in java with class Employee and do the following operations on it
		1) Create two constructors; one default and one with Object as parameter to initialize class variables.
		2) Create a function calculate which calculates the pf and allowances on the salary of employee 
			and return the all values as an object 
		3) Print all the employee object associated values returned from calculate functions
 */
public class Assignment6 {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setSalary(25000);
		e1.printSalary();
		Employee e2 = new Employee(e1);
		e2.printSalary();

	}

	public static class Employee{
		private int salary;
		
		public Employee() {
			
		}
		
		public Employee(Employee a) {
			salary = a.salary;
		}
		
		public void setSalary(int i) {
			salary = i;
		}
		
		public void printSalary() { // not exactly sure what step 2 of the instructions means, hopefully this is close enough
			System.out.println(salary);
		}
	}
}
