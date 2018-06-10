/**
 * The purpose of this program is to 
 * calculate the average of test grades 
 * and total points for each test added.
 * 
 * @author Lydia Chung 
 * @version 07/06/2018
 */
import java.util.Scanner;
public class M03_Grades
{
    public static void main(String[ ] args)
    {
        //makes scanner and scanner variables
    	Scanner in = new Scanner(System.in);
    	System.out.print("What is your name: ");
    	String name = in.next();
    	name += in.nextLine();
    	System.out.print("What subject are your tests from: ");
    	String subject = in.next();
    	subject += in.nextLine();
    	System.out.print("What grade are you in: ");
    	int gradeLevel = in.nextInt();
    	
    	//add user test score input
    	
    	//local variables
    	int[] gradeList = {95, 73, 91, 83, 100, 93, 89, 70, 79};
    	int numTests = gradeList.length;	//counts the number of tests
    	int testIndex = 0;	//test #
    	int testGrade = 0;	//individual test grade
    	int totalPoints = 0;//total points for all tests
    	double average = 0;	//average grade
    	
    	//print beginning header
    	System.out.println(name + "\t" + subject + "\t" + "\tGrade " + gradeLevel);
    	
    	//actually prints scores, is a for loop
    	for (int i = 0; i < (numTests); i++) {
    		testIndex++;
    		testGrade = gradeList[i];
    		totalPoints += testGrade;
    		average = (double) totalPoints / (double) testIndex; //calculates average of all grades so far
    		System.out.println("Test #" + testIndex + "\t\tTest grade: " + gradeList[i] + "\t\tTotal points: " + totalPoints + "\tAverage: " + average);
    	}
    }//end of main method
}//end of class