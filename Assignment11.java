package assignmentPackage2;
/*
 * Assignment 11:- WAP to print 3 type of dance forms using same method called "dance()" in 3 different classes
 */
public class Assignment11 {

	public static void main(String[] args) {
		Ireland i = new Ireland();
		Spain s = new Spain();
		Cuba c = new Cuba();
		i.dance();
		s.dance();
		c.dance();
	}
	
	public static class Ireland {
		public void dance() {
			System.out.println("Stepdance");
		}
	}
	
	public static class Spain {
		public void dance() {
			System.out.println("Flamenco");
		}
	}
	
	public static class Cuba {
		public void dance() {
			System.out.println("Salsa");
		}
	}
}
