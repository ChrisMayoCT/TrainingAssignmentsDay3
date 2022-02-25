package assignmentPackage2;
/*
 * Assignment 5:-  Define a “Clock” class that does the following: -
    			a. Accept hours, minutes and seconds.
    			b. Check the validity of the numbers.
 */
public class Assignment5 {

	public static void main(String[] args) {
		Clock c1 = new Clock(25,4,2);
		Clock c2 = new Clock(2,499,2);
		Clock c3 = new Clock(2,4,-300);
		Clock c4 = new Clock(24,1,0);
		Clock c5 = new Clock(9,20,12);
		Clock c6 = new Clock(24,0,0);
	}
	
	public static class Clock {
		
		private int hours, minutes, seconds;
		public Clock(int hr, int min, int sec) {
			if(hr < 0 || hr > 24 || hr == 24 && (min != 0 || sec != 0)) {
				System.out.println("Invalid Input. Hours must be between 0-24, and no greater than 24:00:00");
			}
			else if(min < 0 || min > 59) {
				System.out.println("Invalid Input. Minutes must be between 0-59");
			}
			else if(sec < 0 || sec > 59) {
				System.out.println("Invalid Input. Seconds must be between 0-59");
			}
			else {
				hours = hr;
				minutes = min;
				seconds = sec;
				System.out.println("Time sucessfully set to " + hours + ":" + minutes + ":" + seconds);
			}
		}
		
	}
}
