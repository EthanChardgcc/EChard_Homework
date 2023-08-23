/**
 * Class: Loops.java
 * @author Ethan Chard
 * Version: 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: August 19, 2023
 * This class uses a for loop to go through the range until i is >= 10. While the for loop 
 * is operating it says if i divided by 2 doesn't equal 1 print it out.
 *
 */
public class Loops {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			if (i % 2 != 1) {
				System.out.println(i);
			}
		}
	}
}
