/**
 * 
 */
package com.smoothstack.week1.miniLMS;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author Joban Mendpara
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int userChoice;

		while (true) {
			Scanner input = new Scanner(System.in);
			
			System.out.println("MiniLMS Menu");
			System.out.println("--------------------");

			System.out.println("1. Create a record\n");
			System.out.println("2. Read all records\n");
			System.out.println("3. Update a record\n");
			System.out.println("4. Delete a record\n");
			System.out.println("5. Quit MiniLMS\n");

			System.out.println("--------------------");
			System.out.print("Enter input: ");
			userChoice = Integer.parseInt(input.nextLine());
			input.close();

			switch (userChoice) {

			case 1:
				// Create
				System.out.println("\n********************\n");
				createRecords();
				System.out.println("\n********************\n");
				break;
			case 2:
				// Read
				System.out.println("\n********************\n");
				readRecords();
				System.out.println("\n********************\n");
				break;
			case 3:
				// Update
				break;
			case 4:
				// Delete
				break;
			case 5:
				// Exit
				Runtime.getRuntime().exit(0);
			}
		}
	}

	static void createRecords() {
		String bookTitle, bookAuthor, bookPublisher;
		
		Scanner createInput = new Scanner(System.in);
		
		System.out.println("Enter book's title: ");
		bookTitle = createInput.nextLine();
		System.out.println("Enter the book's author: ");
		bookAuthor = createInput.nextLine();
		System.out.println("Enter the book's publisher: ");
		bookPublisher = createInput.nextLine();
		
		
	}
	static void readRecords() {
		// Reads in and prints out books
		try (BufferedReader buffStream1 = new BufferedReader(new FileReader("resources/miniLMS/input/book.txt"))) {
			String bookLine = buffStream1.readLine();
			while (bookLine != null) {
				String bookName = bookLine.substring(bookLine.indexOf("\t") + 1, bookLine.length());
				System.out.println(bookName + "\n");
				bookLine = buffStream1.readLine();
			}
		} catch (Exception e) {
			System.out.println("Failed to read");
		}

		/*
		// Reads in and prints out authors
		try (BufferedReader buffStream2 = new BufferedReader(new FileReader("resources/miniLMS/input/author.txt"))) {
			String authorLine = buffStream2.readLine();
			while (authorLine != null) {
				String authorName = authorLine.substring(authorLine.indexOf("\t") + 1, authorLine.length());
				System.out.println(authorName);
				authorLine = buffStream2.readLine();
			}
		} catch (Exception e) {
			System.out.println("Failed to read");
		}
		// Reads in and prints out publishers
		try (BufferedReader buffStream3 = new BufferedReader(new FileReader("resources/miniLMS/input/publisher.txt"))) {
			String publisherLine = buffStream3.readLine();
			while (publisherLine != null) {
				String publisherName = publisherLine.substring(publisherLine.indexOf("\t") + 1, publisherLine.length());
				System.out.println(publisherName);
				publisherLine = buffStream3.readLine();
			}
		} catch (Exception e) {
			System.out.println("Failed to read");
		}
		*/
	}
}
