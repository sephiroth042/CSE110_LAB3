/*------------------------------------------------------------
// AUTHOR: MORRIS, CHRIS
// FILENAME: LAB3
// SPECIFICATION: IF-ELSE
// FOR: CSE 110- Lab #3
// TIME SPENT: 74 minutes//--------------------
---------------------------------------*/
import java.util.Scanner;

public class Lab3 {
	public static void main(String[] args) 
	{
		double hwGrade = 0.00, midtermGrade = 0.00, finalExamGrade = 0.00, totalWeightedGrade = 0.00;
		Scanner input = new Scanner(System.in);	
		final double MINIMUM_GRADE = 50; 
		
		double scoreCount = 0;
		while (scoreCount < 2)
		{
			if (scoreCount == 0) 
			{
				
				System.out.println("Enter your HOMEWORK grade: ");
				hwGrade = input.nextDouble();
				if (0 <= hwGrade && hwGrade <= 100) 
				{
					scoreCount++;
				}
				else 
				{
					System.out.println("[ERR] Invalid input. A homework grade should be in [0, 100].");
					System.out.println("Enter your HOMEWORK grade: ");
					hwGrade = input.nextDouble();
				}	
			}
			
			if (scoreCount == 1) 
			{
				System.out.println("Enter your MIDTERM EXAM grade: ");
				midtermGrade = input.nextDouble();
				if (0 <= midtermGrade && midtermGrade <= 100) 
				{
					scoreCount++;
				}
				else 
				{
					System.out.println("[ERR] Invalid input. A midterm exam grade should be in [0, 100].");
					System.out.println("Enter your MIDTERM EXAM grade: ");
					midtermGrade = input.nextDouble();
				}
			}
				
			if (scoreCount == 2) 
			{
				System.out.println("Enter your FINAL EXAM grade: ");
				finalExamGrade = input.nextDouble();
				if (0 <= finalExamGrade && finalExamGrade <= 200) 
				{
					scoreCount++;
				}
				else
				{
					System.out.println("[ERR] Invalid input. A final exam grade should be in [0, 200].");
					System.out.println("Enter your FINAL EXAM grade: ");
					finalExamGrade = input.nextDouble();
				}
			}
		}
			
		
		totalWeightedGrade = ((finalExamGrade/200 * 50 ) + (midtermGrade * .25) + (hwGrade * .25));
		System.out.println("[INFO] Student's Weighted Total is " + totalWeightedGrade);
		
		if(totalWeightedGrade >= MINIMUM_GRADE) 
		{
			System.out.println("[INFO] Student PASSED the class");
		}
		else
		{
			System.out.println("[INFO] Student FAILED the class");
		}
		
	}
}
