/**
 * 
 */
package com.smoothstack.week1.assignments2;

import java.util.Scanner;
/**
 * @author jobanmendpara
 *
 */
public class Array2D {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner input = new Scanner(System.in);
		int[][] fillArray = new int[3][3];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print("Enter a value for index (" + i + ", " + j + "): ");
				try {
					fillArray[i][j] = Integer.parseInt(input.nextLine());
				}
				catch(Exception e) {
					System.out.println("Error!");
				}
			}
		}
		
		getMaxVal(fillArray);
	}
	
	public static void getMaxVal(int[][] numbers) {
        int maxVal = numbers[0][0];
        int rowVal = 0;
        int colVal = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] > maxVal) {
                    maxVal = numbers[i][j];
                    rowVal = i;
                    colVal = j;
                }
            }
        }
        System.out.println("--------------------");
        System.out.println("Max value is " + maxVal + " found at ( " + rowVal + " , " + colVal + ").");
        System.out.println("--------------------");
    }
}
