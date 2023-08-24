/**
 * Class: Circle.java
 * @author Ethan Chard
 * Version: 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: August 19, 2023
 * This class says radius is going to be a double which means there will be a decimal. Next 
 * it says this.radius that is going to be found in the tester will equal radius in this class.
 * Next it creats the calculateArea formula which is pI * radius * radius equals area.
 * 
 *
 */
public class Circle 
{
	private double radius;
	
	public Circle(double radius) 
	{
		this.radius = radius;
	}
	public double calculateArea()
	{
		return Math.PI * radius * radius;
	}
}
