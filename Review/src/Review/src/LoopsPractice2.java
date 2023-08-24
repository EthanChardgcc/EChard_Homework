/**
 * Class: LoopsPractice2.java
 * @author Ethan Chard
 * Version: 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: August 19, 2023
 *In this program it asks the user to enter a number and then the if statement decides 
 *the integer the user entered is a positive or negative. The program  will continuously ask for 
 *a number until a negative number is enter. Once it stops asking for a number it adds all of the
 *positive numbers and prints it out.  
 *
 */
import java.util.Scanner;
public class LoopsPractice2 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		while(true)
		{
			System.out.print("Enter a number: ");
			int number = sc.nextInt();
			
			if (number < 0)
			{
				break;
			}
			if (number >= 0)
			{
				sum += number;
			}
			
		}
		System.out.println("The sum all of the positive numbers is " + sum);
	}
}