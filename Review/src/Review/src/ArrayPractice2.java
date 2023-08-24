/**
 * Class: ArrayPractice2.java
 * @author Ethan Chard
 * Version: 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: August 19, 2023
 * In this program an integer array is created and a for statement is used to go through the 
 * array list. Than a if statement is used to determine the max in the array. Once the max is found 
 * in the array it prints the max out to the console.
 *
 */
public class ArrayPractice2 
{
	public static void main(String[] args)
	{
		int array[] = {5,10,15,20,25};
		int max = array[0];
		
		for(int i = 1; i < array.length; i++)
		{
			if(array[i] > max)
			{
				max = array[i];
			}
		}
		System.out.print("The maximum of the array is " + max);
	}
}