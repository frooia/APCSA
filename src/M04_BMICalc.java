/**
 * The purpose of this program is to calculate the Body Mass Index (BMI)
 * given a person's height and weight.
 * 
 * @author Lydia Chung
 * @version 19/06/2018
 */
import java.util.Scanner;
public class M04_BMICalc
{
	public static void main(String [ ] args)
	{
		//header
		System.out.println("Body Mass Index Calculator");
		System.out.println("**************************");
		
		//define scanner
		Scanner in = new Scanner(System.in);
		
		//ask for user input
		System.out.print("What is your name: "); //user's name
		String name = in.next();
		name += in.nextLine();
		System.out.print("What is your height in feet and inches (5 4 is 5 feet 4 inches): "); //user's height
		String height = in.next();
		height += in.nextLine();
		String feetString = height.substring(0, 1);
		String inchesString = height.substring(2);
		int feetInt = Integer.parseInt(feetString);
		int inchesInt = Integer.parseInt(inchesString);
		System.out.print("What is your weight in pounds: "); //user's weight
		int pounds = in.nextInt();
		
		//metric conversions
		double meters = 0.0254 * (feetInt * 12 + inchesInt);
		double kgs = pounds * 0.4536;
		
		//calculate BMI and weight status
		double bmi = kgs / (meters * meters);
		String weightStatus;
		if (bmi < 18.5) {
			weightStatus = "Underweight";
		}
		else if (bmi < 24.9) {
			weightStatus = "Normal weight";
		}
		else if (bmi < 29.9) {
			weightStatus = "Overweight";
		}
		else {
			weightStatus = "Obese";
		}
		
		//display outputs
		System.out.println("Results");
		System.out.println("*******");
		System.out.println("Name: " + name);
		System.out.println("Height (meters): " + meters);
		System.out.println("Weight (kilograms): " + kgs);
		System.out.println("BMI: " + bmi);
		System.out.println("Weight status: " + weightStatus);
	}
}