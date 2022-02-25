package assignmentPackage2;
/*
 * Assignment 9:- WAP to print messages as "I am young", "I am middle Age" and "I am old" using 1 function call
		print().
 */
public class Assignment9 {

	public static void main(String[] args) {
		YoungPerson y1 = new YoungPerson();
		MiddleAgePerson m1 = new MiddleAgePerson();
		OldPerson o1 = new OldPerson();
		y1.print();
		m1.print();
		o1.print();
	}
	
	public static class Person {
		protected String ageRange; 
		
		public void print() {
			System.out.println(ageRange);
		}
	}
	
	public static class YoungPerson extends Person {
		public YoungPerson() {
			ageRange = "I am young.";
		}
	}
	
	public static class MiddleAgePerson extends Person {
		public MiddleAgePerson() {
			ageRange = "I am middle age.";
		}
	}
	
	public static class OldPerson extends Person {
		public OldPerson() {
			ageRange = "I am old.";
		}
	}

}
