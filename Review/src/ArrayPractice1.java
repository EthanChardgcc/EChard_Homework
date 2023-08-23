/**
 * Class: ArrayPractice.java
 * @author Ethan Chard
 * Version: 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: August 19, 2023
 * This class creates an array of integers and then it goes through the length of the array 
 * which would be 4. Next it assigns 0 to "sum". After that it creates a for statement which says 
 *  if the i is less than the array length than it moves to the next integer. Once it goes through
 *  the statement it adds up all of the integers and prints it out.
 *
 */
public class ArrayPractice1 
{
	public static void main(String[] args)
	{
		int[] array = {5,10,15,20,25};
		int length = array.length;
		int sum = 0;
		for(int i = 0; i < length; i++)
		{
			sum = sum + array[i];
		}
		System.out.println("Sum of the array: " + sum);
	}
}
