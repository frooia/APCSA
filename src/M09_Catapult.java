/**
 * This class instantiates fruit projectile objects with three private instance variables.
 * It contains a mutator method to calculate the range of a projectile given the launch speed and angle.
 * It contains getter methods for each private instance variable.
 * Private instance variables include mySpeed, myAngle, and myRange.
 * 
 * @author Lydia Chung
 * @version 01/16/2019
 * 
 */
public class M09_Catapult
{
	//declaration of private instance variables
	private double mySpeed, myAngle, myRange;
	
	/**
	 * Constructor for objects of type M09_Catapult
	 * @param speed speed in mph of projectile at launch
	 * @param angle angle in degrees of projectile from the ground at launch
	 * Precondition: speed and angle are positive values
	 */
	public M09_Catapult(double speed, double angle)
	{
		mySpeed = speed;
		myAngle = angle;
	}
	
	/**
	 * Mutator method to calculate the range of a projectile (no parameters).
	 */
	public void calcRange()
	{
		double rangeMeters = Math.pow((mySpeed / 2.237), 2) * Math.sin(2 * Math.toRadians(myAngle)) / 9.81; //2.237 is a constant for converting from mph to m/s
		myRange = rangeMeters * 3.2808; //convert meters to feet
	}
	
	/**
	 * Getter method to return the speed of a projectile in mph (no parameters).
	 * @return the speed of a projectile in mph
	 */
	public double getSpeed()
	{
		return mySpeed;
	}
	
	/**
	 * Getter method to return the angle of a projectile in degrees (no parameters).
	 * @return the angle of a projectile in degrees
	 */
	public double getAngle()
	{
		return myAngle;
	}
	
	/**
	 * Getter method to return the range of a projectile in feet (no parameters).
	 * @return the range of a projectile in feet
	 */
	public double getRange()
	{
		return myRange;
	}
}