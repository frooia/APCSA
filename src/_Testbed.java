
/**
 * This class tests the recursive method for
 * the given Piecewise function.
 *
 * @author Elle Navan
 * @version 06/12/17
 */
class RecursiveMethods
{
    RecursiveMethods()          // default constructor
    {
    }

    public int numDigits(int n)
    {
    	if (n <= 9) {
    		return 1;
    	}
    	else {
    		return 1 + numDigits(n/10);
    	}
    }
}

public class _Testbed
{
    public static void main(String[] args)
    {
        RecursiveMethods obj = new RecursiveMethods();
        System.out.println(obj.numDigits(987532));
    }
}