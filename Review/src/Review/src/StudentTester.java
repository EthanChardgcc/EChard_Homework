/**
 * Class: StudentTester.java
 * @author Ethan Chard
 * Version: 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: August 19, 2023
 * This program is used to test the Students class. It goes througb the Student array and 
 * checks. If the students are older than 20 the program will print out their name and age.
 *
 */
public class StudentTester 
{
	public static void main(String[] args)
	{
		Student[] students =
			{
					new Student("Samantha" , 21),
					new Student("John", 22),
					new Student("Ethan" , 15),
					new Student("Stephen" , 18),
					new Student("Sierra" , 17),
					new Student("Tila" , 23),
			};
		for(Student student : students)
		{
			if(student.getAge() > 20)
			{
				System.out.println(student.getName());
			}
		}
	}
	
}
