/**
 * The purpose of this program is to calculate the 
 * total daily energy expenditure (TDEE) of a person based on 
 * their gender, activity level, and basal metabolic rate (BMR).
 *
 * @author Lydia Chung
 * @version 20/06/2018
 */
import java.util.Scanner;
public class M04_TDEE
{
	public static void main(String [ ] args)
	{
		//define scanner
		Scanner in = new Scanner(System.in);
		
		//prompt user for input
		System.out.print("What is your name: ");
		String name = in.next();
		name += in.nextLine();
		System.out.print("What is your basal metabolic rate (BMR): ");
		int bmr = in.nextInt();
		System.out.print("What is your gender (m/f): ");
		String genderString = in.next(); //gender is string not char so can fit requirement -_-'
		if (!(genderString.equals("m") || genderString.equals("M") || genderString.equals("f") || genderString.equals("F")))
			System.out.println("You chose an option that was not on the list. Please try again.");
		
		//prints menu and accepts input
		System.out.println("What is your activity level: ");
		System.out.println("a. Resting: (sleeping, reclining, etc.)");
		System.out.println("b. Sedentary: (minimal movement, mainly sitting/lying down)");
		System.out.println("c. Light: (office work, sitting, walking, laundry)");
		System.out.println("d. Moderate: (light manual labour, cycling, gardening)");
		System.out.println("e. Very active: (team sports, climing, agriculture labour)");
		System.out.println("f. Extremely active: (full-time athletes, construction workers)");
		String choiceString = in.next();
		char choiceChar = choiceString.charAt(0);
		if (!(choiceChar == 'a' || choiceChar == 'A' || choiceChar == 'b' || choiceChar == 'B' || choiceChar == 'c' || choiceChar == 'C' || choiceChar == 'd' || choiceChar == 'D' || choiceChar == 'e' || choiceChar == 'E' || choiceChar == 'f' || choiceChar == 'f'))
			System.out.println("You chose an option that was not on the list. Please try again.");
		double activityFactor = 0; //default value
		
		//assigns activity factor based on gender and activity level
		if (choiceChar == 'a' || choiceChar == 'A') {
			activityFactor = 1.0;
		}
		else if (choiceChar == 'b' || choiceChar == 'B') {
			activityFactor = 1.3;
		}
		else if (choiceChar == 'c' || choiceChar == 'C') {
			if (genderString.equals("m") || genderString.equals("M")) {
				activityFactor = 1.6;
			}
			else if (genderString.equals("f") || genderString.equals("F")) {
				activityFactor = 1.5;
			}
		}
		else if (choiceChar == 'd' || choiceChar == 'D') {
			if (genderString.equals("m") || genderString.equals("M")) {
				activityFactor = 1.7;
			}
			else if (genderString.equals("f") || genderString.equals("F")) {
				activityFactor = 1.6;
			}
		}
		else if (choiceChar == 'e' || choiceChar == 'E') {
			if (genderString.equals("m") || genderString.equals("M")) {
				activityFactor = 2.1;
			}
			else if (genderString.equals("f") || genderString.equals("F")) {
				activityFactor = 1.9;
			}
		}
		else if (choiceChar == 'f' || choiceChar == 'F') {
			if (genderString.equals("m") || genderString.equals("M")) {
				activityFactor = 2.4;
			}
			else if (genderString.equals("f") || genderString.equals("F")) {
				activityFactor = 2.2;
			}
		}
		
		//calculates TDEE and prints results
		double tdee = bmr * activityFactor;
		System.out.println("Results: ");
		System.out.println("Name: " + name);
		System.out.println("Gender: " + genderString);
		System.out.println("BMR: " + bmr);
		System.out.println("Activity Factor: " + activityFactor);
		System.out.println("TDEE: " + tdee);
	}
}