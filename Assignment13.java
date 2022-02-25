package assignmentPackage2;

import java.util.ArrayList;

/*
 * Assignment 13:- Using methods charAt() & length() of String class, write a program to print the frequency 
	    of each character in a string.

	    “Hello friend”

	    Output should be
    		d: 1
    		e: 2
    		f: 1
 	(continued for all character in the string)
 */
public class Assignment13 {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList(); //HashMap would be more efficient but wanted to keep within scope of the question
		String input = "Hello friend";
		for(int i = 0; i < input.length(); i++) {
			char testing = input.charAt(i);
			if(arr.indexOf(testing) == -1) {
				arr.add(testing);
				int charCount = 0;
				for(int j = 0; j < input.length(); j++) {
					if(input.charAt(j) == testing) {
						charCount += 1;
					}
				}
				System.out.println(testing + ": " + charCount);
			}
		}

	}

}
