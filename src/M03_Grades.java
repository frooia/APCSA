/**
 * The purpose of this program is to
 * accept user-input test grades,
 * calculate the average of the test grades, 
 * and calculate the total points for all tests combined.
 * 
 * @author Lydia Chung 
 * @version 12/06/2018
 */
import java.util.Scanner;
import java.util.ArrayList;
public class M03_Grades
{
    public static void main(String[ ] args)
    {
        //the gradeList
    	ArrayList<Integer> gradeList = new ArrayList<Integer>();
    	
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
    	for (int i = 0; i < 100; i++) {
    		System.out.print("What score do you want to input (type q to display averages): ");
        	String input = in.next();
    		if (input.equals("q")) {
    			break;
    		}
    		else {
    			int testScore = Integer.parseInt(input);
                gradeList.add(testScore); 
                System.out.println(gradeList);
    		}
    	}
    	
    	//local variables
    	int numTests = gradeList.size();	//counts the number of tests
    	int testIndex = 0;	//test #
    	int testGrade = 0;	//individual test grade
    	int totalPoints = 0;//total points for all tests
    	double average = 0;	//average grade
    	
    	//beginning header
    	System.out.println(name + "\t" + subject + "\t" + "\tGrade " + gradeLevel);
    	
    	//actually prints scores
    	for (int j = 0; j < (numTests); j++) {
    		testIndex++;
    		testGrade = gradeList.get(j);
    		totalPoints += testGrade;
    		average = (double) totalPoints / (double) testIndex; //calculates average of all grades so far
    		System.out.println("Test #" + testIndex + "\t\tTest grade: " + gradeList.get(j) + "\t\tTotal points: " + totalPoints + "\tAverage: " + average);
    	}
    }//end of main method
}//end of class