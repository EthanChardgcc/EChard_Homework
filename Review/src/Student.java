/**
 * Class: Student.java
 * @author Ethan Chard
 * Version: 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: August 19, 2023
 * This class assigns a String and a int. Then a student will be created with a name and age. 
 * Once a name is given the value of "name" in the program is changed. The same concept will 
 * happen to the age. 
 *
 */
public class Student 
{
	private String name;
	private int age;
		
	public Student(String name, int age)
	{
		this.name = name;
		this.age = age;
		
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
			
}
