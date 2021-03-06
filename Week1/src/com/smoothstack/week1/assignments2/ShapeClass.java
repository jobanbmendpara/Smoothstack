/**
 * 
 */
package com.smoothstack.week1.assignments2;

import java.util.Scanner;

/**
 * @author jobanmendpara
 *
 */

interface Shape {
	void input();

	void calculateArea();

	void display();
}

class Circle implements Shape {
	double radius = 0, area = 0, pi = 3.14;

	public void input() {
		Scanner input = new Scanner(System.in);

		try {
			System.out.print("Circle --- Enter radius: ");
			radius = Double.parseDouble(input.nextLine());
		} catch (Exception e) {
			System.out.println("Error. Program will exit now.");
			System.exit(0);
		}
	}

	public void calculateArea() {
		area = pi * (Math.pow(radius, 2));
	}

	public void display() {
		System.out.println("\nArea of Circle: " + area);
		System.out.println("--------------------");
	}
}

class Rectangle extends Circle {
	double length = 0, width = 0;

	public void input() {
		Scanner input = new Scanner(System.in);

		try {
			System.out.print("Rectangle --- Enter length: ");
			length = Double.parseDouble(input.nextLine());

			System.out.print("Rectangle --- Enter width: ");
			width = Double.parseDouble(input.nextLine());
		} catch (Exception e) {
			System.out.println("Error. Program will exit now.");
			System.exit(0);
		}

	}

	public void calculateArea() {
		area = length * width;
	}

	public void display() {
		System.out.println("\nArea of Rectangle: " + area);
		System.out.println("--------------------");
	}
}

class Triangle extends Rectangle {

	public void input() {
		Scanner input = new Scanner(System.in);

		try {
			System.out.print("Triangle --- Enter height: ");
			length = Double.parseDouble(input.nextLine());

			System.out.print("Triangle --- Enter base: ");
			width = Double.parseDouble(input.nextLine());
		} catch (Exception e) {
			System.out.println("Error. Program will exit now.");
			System.exit(0);
		}

	}

	public void calculateArea() {
		area = (length * width) / 2;
	}

	public void display() {
		System.out.println("\nArea of Triangle: " + area);
		System.out.println("--------------------");
	}
}

public class ShapeClass {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle circTest = new Circle();
		Rectangle recTest = new Rectangle();
		Triangle triTest = new Triangle();

		circTest.input();
		circTest.calculateArea();
		circTest.display();

		recTest.input();
		recTest.calculateArea();
		recTest.display();

		triTest.input();
		triTest.calculateArea();
		triTest.display();
	}
}
