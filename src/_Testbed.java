
/**
 * This program demonstrates the use of the Integer class constants
 * MIN_VALUE and MAX_VALUE when finding the minimum and maximum
 * value within a numeric array.
 *
 * @author David J. Farber
 * @version 06/06/17
 */

public class _Testbed
{
    public static void main(String[] args)
    {
    	
    	int[] a = new int[ 12 ]; 
        int i = 0; 

        a[ i ] = 5; 
        i++; 
        a[ i ] = a[ i - 1]; 
        i++; 
        a[ i ] = a[ 0 ] + 2;
        
    }
}
