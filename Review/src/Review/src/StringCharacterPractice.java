/**
 * Class: Strings.java
 * @author Ethan Chard
 * Version: 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: August 19, 2023
 * This class assigns a message and then prints it out how many characters are in the message.
 *  After that it assigns a quote to a String and then prints the quote and the tenth character 
 *  of the quote.
 *
 */
public class StringCharacterPractice 
{
	public static void main(String[] args) 
	{
		String message = "Hello World!";
		System.out.println(message.length());
		String quote = "Live in the present not the past";
		char tenthChar = quote.charAt(9);
		System.out.print(quote + " " + tenthChar);
	}
}
