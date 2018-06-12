/**
 * This is a GPA calculator I made in my free time. It is based on 5.0, 4.5, and 4.0 classes taken.
 * This calculates the weighted GPA.
 * @author lydia
 *
 */
import java.util.Scanner;
public class GPA_Calc
{
	public static void main(String[ ] args)
	{
		//defines scanner
		Scanner in = new Scanner(System.in);
		
		//header
		System.out.println("******************* GPA Calculator *******************");
		
		//asks user for classes
		System.out.println("How many AP classes have you taken? ");
		int apsTaken = in.nextInt();
		System.out.println("How many Pre-IB or Honors classes have you taken? ");
		int honorsTaken = in.nextInt();
		System.out.println("How many regular or Standard classes have you taken? ");
		int regularTaken = in.nextInt();
		double gpa;
		
		//calculates GPA
		gpa = ((5 * apsTaken) + (4.5 * honorsTaken) + (4 * regularTaken)) / (apsTaken + honorsTaken + regularTaken);
		System.out.println("Your GPA is " + gpa + ".");
	}//end of main method
}//end of class