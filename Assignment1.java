package assignmentPackage2;
/*
 * Assignment 1:- WAP to show all features of OOP
 */
public class Assignment1 {

	public static void main(String[] args) {
		ClassB b = new ClassB(); // This is an object
		b.print();
		b.printA(true);
		System.out.println("This message is a needed thing that is focused on - Abstraction");
		//This message is an unneeded thing that is hidden from the user - Encapsulation

	}
	
	public static class ClassA { // This is a class
		public void print() {
			System.out.println("This is inheritence");
		}
	}
	
	public static class ClassB extends ClassA {
		public void printA() {
			System.out.println("A");
		}
		
		public void printA(boolean a) {
			System.out.println("This is polymorphism.");
		}
	}
}
