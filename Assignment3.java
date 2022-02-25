package assignmentPackage2;

import java.util.Scanner;

/*
 * Assignment 3:- WAP to accept Book's Information like Book ID, Name, Type_of_book using a constructor and print 
 * the same using another function call "printInfo()"
 */
public class Assignment3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Book ID: ");
		int bID = sc.nextInt();
		sc.nextLine(); // to clear scanner, since it will read as having an unprocessed newline
		System.out.println("Enter Book Name: ");
		String bName = sc.nextLine();
		System.out.println("Enter Book Type: ");
		String bType = sc.nextLine();
		sc.close();
		Book b = new Book(bID, bName, bType);
		b.printInfo();
	}

	public static class Book {
		
		private int bookId;
		private String bookName, bookType;

		public Book(int id, String name, String type) {
			bookId = id;
			bookName = name;
			bookType = type;
		}
		
		public void printInfo() {
			System.out.println("Book ID: " + bookId + "\tBook Name: " + bookName + "\tBook Type: " + bookType);
		}
	}
}

