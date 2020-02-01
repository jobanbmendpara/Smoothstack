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
public class MiniLMS {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		while (true) {

			int userChoice;

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
				System.out.println("\n********************\n");
				updateRecords();
				System.out.println("\n********************\n");
				break;
			case 4:
				// Delete
				System.out.println("\n********************\n");
				deleteRecords();
				System.out.println("\n********************\n");
				break;
			case 5:
				// Exit
				input.close();
				Runtime.getRuntime().exit(0);
			}
		}
	}

	private static void createRecords() {
			Scanner createRecordInput = new Scanner(System.in);
			
			
	}
	
	private static void readRecords() {
		System.out.println("I do nothing as of right now.");
	}
	
	private static void updateRecords() {
		System.out.println("I do nothing as of right now.");
	}
	
	private static void deleteRecords() {
		System.out.println("I do nothing as of right now.");
	}
}
