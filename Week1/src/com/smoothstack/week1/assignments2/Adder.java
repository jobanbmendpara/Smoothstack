/**
 * 
 */
package com.smoothstack.week1.assignments2;

import java.util.Scanner;

/**
 * @author jobanmendpara
 *
 */
public class Adder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		int iterVal = 1;

		Scanner input = new Scanner(System.in);

		while (iterVal <= 5) {
			System.out.print("Enter #" + iterVal + ": ");
			try {
				total += Integer.parseInt(input.nextLine());
			} catch (Exception e) {
				System.out.println("\n--------------------\n");
				System.out.println("Error.");
				System.out.println("\n--------------------\n");
				break;
			}

			System.out.println("\n--------------------\n");
			iterVal++;
		}

		System.out.println(">> Total is " + total + ".");
	}

}
