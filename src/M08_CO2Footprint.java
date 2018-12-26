/**
 * This class instantiates carbon footprint objects with three private instance variables.
 * It contains mutator methods to calculate the tons and pounds of CO2 used, given gallons of gas used.
 * It contains getter methods for each private instance variable.
 * Private instance variables include myGallonsUsed, myTonsCO2, and myPoundsCO2.
 * 
 * @author Lydia Chung
 * @version 12/24/2018
 *
 */
public class M08_CO2Footprint
{
    //declaration of private instance variables
	private double myGallonsUsed, myTonsCO2, myPoundsCO2;

	/**
	 * Constructor for objects of type M08_CO2Footprint
	 * @param gallons gallons of gas used
	 * Precondition: gallons is a positive value
	 */
    public M08_CO2Footprint(double gallons)
    {
        myGallonsUsed = gallons;
    }

    /**
     * Mutator method to calculate the tons of CO2 produced (no parameters).
     */
    public void calcTonsCO2()
    {
        myTonsCO2 = (8.78 * Math.pow(10, -3)) * myGallonsUsed;
    }

    /**
     * Mutator method to convert tons of CO2 to pounds (no parameters).
     */
    public void convertTonsToPounds()
    {
        myPoundsCO2 = myTonsCO2 * 2205;
    }

    /**
     * Getter method to return the number of gallons of gas used (no parameters).
     * @return the gallons of gas used.
     */
    public double getGallons()
    {
        return myGallonsUsed;
    }

    /**
     * Getter method to return the tons of CO2 produced (no parameters).
     * @return the tons of CO2 produced.
     */
    public double getTonsCO2()
    {
        return myTonsCO2;
    }

    /**
     * Getter method to return the pounds of CO2 produced (no parameters).
     * @return the pounds of CO2 produced.
     */
    public double getPoundsCO2()
    {
        return myPoundsCO2;
    }
}
