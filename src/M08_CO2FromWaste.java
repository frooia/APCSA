/**
 * This class instantiates house objects with eight private instance variables. 
 * It contains mutator methods to calculate total CO2 emissions, emission reduction from recycling, and net emissions.
 * It contains getter methods for each private instance variable.
 * Private instance variables include myNumPeople, myPaper, myPlastic, myGlass, myCans, myEmissions, myReduction, and myNetEmissions.
 *
 * @author Lydia Chung
 * @version 12/26/2018
 *
 */
public class M08_CO2FromWaste
{
   private int myNumPeople;
   private boolean myPaper, myPlastic, myGlass, myCans;
   private double myEmissions, myReduction, myNetEmissions;

   /**
    * Constructor for objects of type CO2FromWaste
    * @param numPeople number of people in a household
    * @param paper whether or not paper is recycled
    * @param plastic whether or not plastic is recycled
    * @param glass whether or not glass is recycled
    * @param cans whether or not cans are recycled
    */
   M08_CO2FromWaste(int numPeople, boolean paper, boolean plastic, boolean glass, boolean cans)
   {
	   myNumPeople = numPeople;
	   myPaper = paper;
	   myPlastic = plastic;
	   myGlass = glass;
	   myCans = cans;
   }

   /**
    * Mutator method to calculate the total emissions, without any recycling (no parameters)
    */
   public void calcGrossWasteEmission()
   {
	   myEmissions = myNumPeople * 1018;
   }

   /**
    * Mutator method to calculate the emission reduction from recycling (no parameters)
    */
   public void calcWasteReduction()
   {
       if (myPaper)
       {
           myReduction += (184.0 * myNumPeople);
       }
       if (myPlastic) {
    	   myReduction += (25.6 * myNumPeople);
       }
       if (myGlass) {
    	   myReduction += (46.6 * myNumPeople);
       }
       if (myCans) {
    	   myReduction += (165.8 * myNumPeople);
       }
   }

   /**
    * Mutator method to calculate the net emissions (no parameters)
    */
   public void calcNetWasteReduction()
   {
        myNetEmissions = myEmissions - myReduction;
   }

   /**
    * Getter method to return the number of people (no parameters)
    */
   public int getNumPeople()
   {
       return myNumPeople;
   }

   /**
    * Getter method to return paper's recycled status (true or false) (no parameters)
    */
   public boolean getPaper()
   {
       return myPaper;
   }

   /**
    * Getter method to return glass's recycled status (true or false) (no parameters)
    */
   public boolean getGlass()
   {
       return myGlass;
   }

   /**
    * Getter method to return plastic's recycled status (true or false) (no parameters)
    */
   public boolean getPlastic()
   {
       return myPlastic;
   }

   /**
    * Getter method to return cans' recycled status (true or false) (no parameters)
    */
   public boolean getCans()
   {
       return myCans;
   }

   /**
    * Getter method to return the total emissions (no parameters)
    */
   public double getEmissions()
   {
       return myEmissions;
   }

   /**
    * Getter method to return the reduction amount (no parameters)
    */
   public double getReduction()
   {
       return myReduction;
   }

   /**
    * Getter method to return the net emissions (no parameters)
    */
   public double getNetEmissions()
   {
       return myNetEmissions;
   }
}
