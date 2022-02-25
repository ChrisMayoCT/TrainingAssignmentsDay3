package assignmentPackage2;
/*
 * Assignment 12:-WAP to calculate the area of circle, area of square, area of rectangle area of triangle using 
		a function call "area()".
 */
public class Assignment12 {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		Rectangle r1 = new Rectangle();
		Square s1 = new Square();
		Triangle t1 = new Triangle();
		
		c1.area(2);
		r1.area(4, 6.2);
		s1.area(5);
		s1.area(6,6);
		t1.area(2, 5);
	}

	public static class Circle {
		public void area(double r) {
			System.out.println(Math.PI*r*r);
		}
	}
	public static class Rectangle {
		public void area(double l, double w) {
			System.out.println(l*w);
		}
	}
	public static class Square extends Rectangle {
		public void area(double l) {
			System.out.println(l*l);
		}
	}
	public static class Triangle {
		public void area(double b, double h) {
			System.out.println((b*h)/2);
		}
	}
}
