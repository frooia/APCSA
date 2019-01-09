/**
 * This class tests the M08_BMICalcRewrite class.
 * 
 * @author Lydia Chung
 * @version 12/28/2018
 */
import java.util.Scanner;
import java.util.ArrayList;
public class M08_BMICalcRewriteTester
{
	public static void main(String [ ] args)
	{
		//header
		System.out.println("Body Mass Index Calculator");
		System.out.println("**************************");
		
		//define ArrayList and 10 objects
		ArrayList<M08_BMICalcRewrite> people = new ArrayList<M08_BMICalcRewrite>();
		people.add(new M08_BMICalcRewrite("Sally", 61, 105));
		people.add(new M08_BMICalcRewrite("Tim", 69, 166));
		people.add(new M08_BMICalcRewrite("Nathan", 54, 100));
		people.add(new M08_BMICalcRewrite("Joceline", 62, 112));
		people.add(new M08_BMICalcRewrite("Adam", 72, 188));
		people.add(new M08_BMICalcRewrite("Bella", 57, 92));
		people.add(new M08_BMICalcRewrite("Alexei", 67, 129));
		people.add(new M08_BMICalcRewrite("Natalie", 60, 99));
		people.add(new M08_BMICalcRewrite("Samuel", 65, 143));
		people.add(new M08_BMICalcRewrite("Anton", 64, 134));
		
		//define scanner
		Scanner in = new Scanner(System.in);
		
		/*
		//ask for user input, create new person object
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
		people.add(new M08_BMICalcRewrite(name, feetInt + inchesInt, pounds));
		*/
		
		//mins, maxes, and averages, display data
		double minHeight = Integer.MAX_VALUE, minWeight = Integer.MAX_VALUE, minBMI = Integer.MAX_VALUE;
		double maxHeight = Integer.MIN_VALUE, maxWeight = Integer.MIN_VALUE, maxBMI = Integer.MIN_VALUE;
		double sumHeight = 0.0, sumWeight = 0.0, sumBMI = 0.0;
		System.out.println("|   Name   | Height (in) |  Weight (lbs)  |  BMI |  Weight Status  |");
	    System.out.println("|----------|-------------|----------------|------|-----------------|");
	    for (M08_BMICalcRewrite person : people) {
	    	person.calcBMI();
	    	person.calcWeightStatus();
	    	System.out.println(person);
	    	
	    	//calculate mins, maxes, and averages
	    	if (person.getHeight() < minHeight) {
	    		minHeight = person.getHeight();
	    	}
	    	if (person.getHeight() > maxHeight) {
	    		maxHeight = person.getHeight();
	    	}
	    	if (person.getWeight() < minWeight) {
	    		minWeight = person.getWeight();
	    	}
	    	if (person.getWeight() > maxWeight) {
	    		maxWeight = person.getWeight();
	    	}
	    	if (person.getBMI() < minBMI) {
	    		minBMI = person.getBMI();
	    	}
	    	if (person.getBMI() > maxBMI) {
	    		maxBMI = person.getBMI();
	    	}
	    	sumHeight += person.getHeight();
	    	sumWeight += person.getWeight();
	    	sumBMI += person.getBMI();
	    }
	    
	    //find averages
	    double avgHeight = sumHeight / people.size();
	    double avgWeight = sumWeight / people.size();
	    double avgBMI = sumBMI / people.size();
	    
    	System.out.println("********************************************************************");

    	//display summary data
    	System.out.printf("%10s %1s %7.0f %-10s %4.0f %6s %4.1f %1s", 
				"Minimums", ":",
				minHeight, "      ", 
				minWeight, " ", 
				minBMI, " ");
    	System.out.println();
    	System.out.printf("%10s %1s %7.0f %-10s %4.0f %6s %4.1f %1s", 
				"Maximums", ":",
				maxHeight, "      ", 
				maxWeight, " ", 
				maxBMI, " ");
    	System.out.println();
    	System.out.printf("%10s %1s %7.0f %-10s %4.0f %6s %4.1f %1s", 
				"Averages", ":",
				avgHeight, "      ", 
				avgWeight, " ", 
				avgBMI, " ");
    	
		/*
		//display outputs
		System.out.println("Results");
		System.out.println("*******");
		System.out.println("Name: " + name);
		System.out.println("Height (meters): " + meters);
		System.out.println("Weight (kilograms): " + kgs);
		System.out.println("BMI: " + bmi);
		System.out.println("Weight status: " + weightStatus);
		*/
	}
}