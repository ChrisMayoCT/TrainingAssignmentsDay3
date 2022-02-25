package assignmentPackage2;
/*
 * Assignment 14:- Create a class Vehicle. The class should have two fields-no_of_seats and no_of_wheels. Create two objects-
			 	Motorcycle and Car for this class. Your output should show the descriptions for Car and Motorcycle.
 */
public class Assignment14 {

	public static void main(String[] args) {
		Motorcycle m = new Motorcycle();
		Car c = new Car();
		m.description();
		c.description();
	}

	public static class Vehicle {
		protected int numSeats, numWheels;
		
		public void description() {
			System.out.println("Number of seats: " + numSeats + "\tNumber of wheels: " + numWheels);
		}
	}
	
	public static class Motorcycle extends Vehicle {
		public Motorcycle() {
			numSeats = 1;
			numWheels = 2;
		}
	}
	
	public static class Car extends Vehicle {
		public Car() {
			numSeats = 4;
			numWheels = 4;
		}
	}
}
