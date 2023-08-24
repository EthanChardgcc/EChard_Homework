/**
 * @author Ethan Chard
 * Version: 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: August 19, 2023
 * This program asks the user to enter a name. Once a name is entered it prints out Hello "name"! 
 *
 */
import java.util.Scanner;
public class MyReview 
{
	static void printName()
	{
		Scanner name = new Scanner(System.in);
		System.out.println("Enter a name");
		String nm = name.nextLine();
		System.out.println("Hello," + nm +"!");
	}
	public static void main(String[] args)
	{
		printName();
	}
}
