package assignmentPackage2;
/*
 * Assignment 8:- Create a class Student with following operations
		1) create parameterized constructor to initialize the objects 
		2) create a function isEqual() to check whether the two objects are equal or not which returns
			the boolean value and gets two objects
		3) print the result in main method if objects are equal or not (take variables as your assumption)
 */
public class Assignment8 {

	public static void main(String[] args) {
		Student s1 = new Student(10252);
		Student s2 = new Student(10421);
		Student s3 = new Student(10252);
		
		System.out.println(s1.isEqual(s2));
		System.out.println(s2.isEqual(s3));
		System.out.println(s1.isEqual(s3));
	}
	
	public static class Student{
		private int studentID;
		public Student(int id) {
			studentID = id;
		}
		
		public boolean isEqual(Student a) {
			if (this.studentID == a.studentID){
				return true;
			}
			return false;
		}
	}
}
