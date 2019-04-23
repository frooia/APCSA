/**
 * This class instantiates carbon footprint objects with three private instance variables.
 * It contains mutator methods to calculate the tons and pounds of CO2 used, given gallons of gas used.
 * It contains getter methods for each private instance variable.
 * Private instance variables include gallons, myTonsCO2, and myPoundsCO2.
 * 
 * @author Lydia Chung
 * @version 04/07/2019
 *
 */
class ThisThat
{
    //declaration of private instance variables
	private double gallons, myTonsCO2, myPoundsCO2;

	/**
	 * Constructor for objects of type M08_CO2Footprint
	 * @param gallons gallons of gas used
	 * Precondition: gallons is a positive value
	 */
    public ThisThat(double gallons)
    {
        this.gallons = gallons;
    }

    /**
     * Mutator method to calculate the tons of CO2 produced (no parameters).
     */
    public void calcTonsCO2()
    {
        myTonsCO2 = (8.78 * Math.pow(10, -3)) * this.gallons;
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
        return this.gallons;
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
/**
 * This class tests the M08_CO2Footprint class.
 * 
 * @author Lydia Chung
 * @version 04/07/2019
 * 
 */
public class M14_ThisThat
{
    public static void main(String[] args)
    {
        double gallonsOfGas = 2410; //entire program based off this number

        //define object, call methods
        ThisThat footprint = new ThisThat(gallonsOfGas);
        footprint.calcTonsCO2();
        footprint.convertTonsToPounds();

        //display table
        System.out.println("           CO2 Emissions");
        System.out.println("  Gallons   Pounds      Tons");
        System.out.println("  of Gas   from Gas   from Gas");
        System.out.println("  ****************************");
        System.out.printf("  %6.1f   %8.2f    %6.3f", footprint.getGallons(),
                                                      footprint.getPoundsCO2(),
                                                      footprint.getTonsCO2());

        System.out.println();
    }
}
