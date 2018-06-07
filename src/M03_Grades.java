/**
 * The purpose of this program is to 
 * calculate the average of test grades 
 * and total points for each test added.
 * 
 * @author Lydia Chung 
 * @version 07/06/2018
 */
public class M03_Grades
{
    public static void main(String[ ] args)
    {
        //local variables
    	int[] gradeList = {95, 73, 91, 83, 100, 93, 89, 70, 79};
    	int numTests = gradeList.length;	//counts the number of tests
    	int testIndex = 0;	//test #
    	int testGrade = 0;	//individual test grade
    	int totalPoints = 0;//total points for all tests
    	double average = 0;	//average grade
    	
    	for (int i = 0; i < (numTests); i++) {
    		testIndex++;
    		testGrade = gradeList[i];
    		totalPoints += testGrade;
    		average = (double) totalPoints / (double) testIndex; //calculates average of all grades so far
    		System.out.println("Test #" + testIndex + "\t\tTest grade: " + gradeList[i] + "\t\tTotal points: " + totalPoints + "\tAverage: " + average);
    	}
    }//end of main method
}//end of class