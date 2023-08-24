/**
 * Class: MyReviewFix.java
 * @author Ethan Chard
 * Version: 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: August 19, 2023
 * This program takes in the word it prints it backwards while doubling the a letter.
 *
 */
public class MyReviewFix 
{
	public class MyReview {
		public static void main(String[] args) {
		System.out.println(reverseDoubleChar("The"));
		System.out.println(reverseDoubleChar2("AABB"));
		System.out.println(reverseDoubleChar3("String"));
		}

		public static String reverseDoubleChar(String word)
		{
		String result = "";
		for(int i = word.length() - 1; i >= 0 ; i--)
		{
		result = result + (word.charAt(i) + word.charAt(i));
		}
		return result;

		}

		public static String reverseDoubleChar2(String word)
		{
		String result = "";
		for(int i = word.length()- 1; i >= 0; i--)
		{
		result = result  + word.charAt(i) + word.charAt(i);
		}
		return result;

		}

		public static String reverseDoubleChar3(String word){
		String result = "";
		for(int i = word.length() - 1 ; i >= 0 ; i--)
		{
		result += word.charAt(i) + word.charAt(i);
		}
		return result;
		}
		}
}
