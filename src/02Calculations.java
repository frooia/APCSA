/**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 *  
 * @author Lydia Chung
 * @version 29/05/2018
 */
public class CalculationsV1
{
    public static void main(String[ ] args)
    {
        int iNum1 = 25;
        int iNum2 = 9;
        double dNum1 = 43.21;
        double dNum2 = 3.14;
        
    	// Addition
        System.out.println("Addition");
        System.out.println(iNum1 + " + " + iNum2 + " = " + (25 + 9));
        System.out.println(dNum1 + " + " + dNum2 + " + 10.0 = " + (dNum1 + dNum2 + 10.0));
        System.out.println();
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.println("11 - " + iNum2 + " - " + iNum1 + " = " + (11 - 9 - 25));
        System.out.println(dNum2 + " - 10.0 = " + (dNum2 - 10.0));
        System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.println(iNum1 + " * " + iNum2 + " = " + (25 * 9)); 
        System.out.println(dNum2 + " * 10.0 * 10.0 = " + (dNum2 * 10.0 * 10.0));
        System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.println(iNum2 + " / " + iNum1 + " = " + (9 / 25));
        System.out.println(dNum1 + " / 10.0 = " + (dNum1 / 10.0));
        System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.println("11 mod " + iNum2 + " = " + (11 % 9));
        System.out.println("10.0 mod " + dNum2 + " = " + (10.0 % dNum2));
        System.out.println();
               
    } // end of main method
} // end of class
