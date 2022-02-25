package assignmentPackage2;

import java.util.Scanner;

/*
 * Assignment 2:- WAP to accept Reader's Information like Reader's ID, Name, City using a function call "getInfo()" and 
 * print the same using another function call "printInfo()"
 */
public class Assignment2 {
	
	int readerID;
	String readerName, readerCity;

	public static void main(String[] args) {
		Assignment2 a = new Assignment2();
		a.getInfo();
		a.printInfo();
	}
	public void getInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Reader ID: ");
		readerID = sc.nextInt();
		sc.nextLine(); // to clear scanner, since it will read as having an unprocessed newline
		System.out.println("Enter Reader Name: ");
		readerName = sc.nextLine();
		System.out.println("Enter Reader City: ");
		readerCity = sc.nextLine();
		sc.close();
	}
	
	public void printInfo() {
		System.out.println("ID: " + readerID + "\tName: " + readerName + "\tCity: " + readerCity);
	}

}
