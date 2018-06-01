/**
 * The Currency class converts an amount of money from a specific
 * country into the equivalent currency of another country given 
 * the current exchange rate.
 * USD to Hong Kong dollars, euros (yuros in Yurop), Mexican pesos
 *
 * @author Lydia Chung
 * @version 01/06/2018
 */
public class M02_Currency
{
    public static void main(String [ ] args)
    {
        //Declare and initialize local variables
        double startingUsDollars = 6500.00;		// starting US Dollars

        //Mexico variables
        double pesosSpent = 7210.25;            // Mexican Pesos spent
        double pesoExchangeRate = 19.94;     // 1 US dollar = 19.94 Pesos
        double dollarsSpentInMexico = pesosSpent / pesoExchangeRate;      // US dollars spent in Mexico
        double dollarsAfterMexico = startingUsDollars - dollarsSpentInMexico;        // US dollars remaining after Mexico
        
        //HK variables
        double hkdSpent = 10349.23;
        double hkdExchangeRate = 7.85;
        double dollarsSpentInHK = hkdSpent / hkdExchangeRate;
        double dollarsAfterHK = dollarsAfterMexico - dollarsSpentInHK;
        
        //Yurop variables
        double yurosSpent = 2043.75;
        double yuroExchangeRate = 0.86;
        double dollarsSpentInYurop = yurosSpent / yuroExchangeRate;
        double dollarsAfterYurop = dollarsAfterHK - dollarsSpentInYurop;

        // Message to user stating purpose
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money\nfrom a specific country into the equivalent\ncurrency of another country given the current\nexchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        
        System.out.println("Starting US dollars: " + startingUsDollars); //displays starting amount
        System.out.println();

        //Money spent in Mexico
        System.out.println("Mexico:");
        System.out.println(" Pesos spent:\t\t" + pesosSpent);
        System.out.println(" US dollars equivalent:\t" + dollarsSpentInMexico);
        System.out.println(" US dollars remaining:\t" + dollarsAfterMexico);
        System.out.println();
        
        //Money spent in Hong Kong
        System.out.println("Hong Kong:");
        System.out.println(" HKD spent:\t\t" + hkdSpent);
        System.out.println(" US dollars equivalent:\t" + dollarsSpentInHK);
        System.out.println(" US dollars remaining:\t" + dollarsAfterHK);
        System.out.println();
        
        //Money spent in Yurop
        System.out.println("Germany:");
        System.out.println(" Euros spent:\t" + yurosSpent);
        System.out.println(" US dollars equivalent:\t" + dollarsSpentInYurop);
        System.out.println(" US dollars remaining:\t" + dollarsAfterYurop);
        System.out.println("==========================================");
        System.out.println("Remaining US dollars: " + dollarsAfterYurop);
        System.out.println();
        System.out.println();
        
        // Complete the code below for Souvenir Purchases
 		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Souvenir Purchases");
		System.out.println(" (all values in US Dollars) ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		//Calculations for Souvenir #1
		int costItem1 = 12;  						//cost per item of first souvenir
		int budget1 = 100;   						//budget for first item
		int totalItems1 = (int) (budget1 / costItem1); 		//how many items can be purchased
		int fundsRemaining1 = budget1 % costItem1;  //how much of the budget is left

		System.out.println("Item 1");
		System.out.println("   Cost per item: $" + costItem1 );
		System.out.println("   Budget: $"+ budget1);
		System.out.println("   Total items purchased: " +  totalItems1);
		System.out.println("   Funds remaining: $"  +  fundsRemaining1);
     	System.out.println();

		//Calculations for Souvenir #2
		double costItem2 = 29.99;  						//cost per item of second souvenir
		int budget2 = 500;   							//budget for second item
		int totalItems2 = (int) (budget2 / costItem2); 	//how many items can be purchased
		double fundsRemaining2 = budget2 % costItem2;  	//how much of the budget is left

		System.out.println("Item 2");
		System.out.println("   Cost per item: $" + costItem2 );
		System.out.println("   Budget: $"+ budget2);
		System.out.println("   Total items purchased: " +  totalItems2);
		System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class
