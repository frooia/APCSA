/**
 * This class instantiates person objects with five private instance variables. 
 * It contains mutator methods to calculate BMI. 
 * It contains getter methods for each private instance variable. 
 * It contains a toString method to display data in a table. 
 * Private instance variables include myName, myWeightStatus, myHeight, myWeight, and myBMI.
 * 
 * @author Lydia Chung
 * @version 12/28/2018
 * 
 */
//import java.util.Scanner;
public class M08_BMICalcRewrite
{
	private String myName, myWeightStatus;
	private int myHeight, myWeight;
	private double myBMI;
	
	/**
	 * Constructor for objects of type M08_BMICalcRewrite
	 * @param name name of person
	 * @param height height of person in inches
	 * @param weight weight of person in pounds
	 */
	M08_BMICalcRewrite(String name, int height, int weight)
	{
		myName = name;
		myHeight = height;
		myWeight = weight;
	}
	
	/**
	 * Mutator method to calculate weight status from BMI (no parameters)
	 */
	public void calcWeightStatus()
	{
		if (myBMI < 18.5) {
			myWeightStatus = "Underweight";
		}
		else if (myBMI < 24.9) {
			myWeightStatus = "Normal weight";
		}
		else if (myBMI < 29.9) {
			myWeightStatus = "Overweight";
		}
		else {
			myWeightStatus = "Obese";
		}
	}
	
	/**
	 * Mutator method to calculate BMI from height and weight (no parameters)
	 */
	public void calcBMI()
	{
		myBMI = 703 * (double)myWeight / Math.pow((double)myHeight, 2); //703 takes metric-customary conversions into account
	}
	
	/**
	 * Getter method to return the person's name (no parameters)
	 */
	public String getName()
	{
		return myName;
	}
	
	/**
	 * Getter method to return the person's height (no parameters)
	 */
	public int getHeight()
	{
		return myHeight;
	}
	
	/**
	 * Getter method to return the person's weight (no parameters)
	 */
	public int getWeight()
	{
		return myWeight;
	}
	
	/**
	 * Getter method to return the person's BMI (no parameters)
	 */
	public double getBMI()
	{
		return myBMI;
	}
	
	/**
	 * Getter method to return the person's weight status (no parameters)
	 */
	public String getWeightStatus()
	{
		return myWeightStatus;
	}
	
	/**
	 * Displays data in a table
	 */
	public String toString()
	{
		return String.format("%1s %-8s %1s %7d %7s %7d %6s %4.1f %1s %-14s %-2s", "|", 
				myName, "|", 
				myHeight, "  |  ", 
				myWeight, "|", 
				myBMI, "|", 
				myWeightStatus, " |");
	}
}