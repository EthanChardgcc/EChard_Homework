/**
 * Class: CircleTester.java
 * @author Ethan Chard
 * Version: 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: August 19, 2023
 * This program is used to test the Circle class. It creates a circle then uses the calculateArea formula 
 * found in the circle class. After the calculations are done it prints out the area of the created circle.
 *
 */
public class CircleTester 
{
	public static void main(String[] args) 
	{
		Circle cr = new Circle(10.0);
		double area = cr.calculateArea();
		System.out.println("The area of the circle is: " + area);
	}
}
