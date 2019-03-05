/**
 * This class tests the recursive method for
 * the given Piecewise function.
 *
 * @author Lydia Chung
 * @version 02/27/2019
 */
class Recursion
{
    Recursion()          // default constructor
    {
    }

    public int function(int n)
    {
    	if (n >= 10) {
    		return 13;
    	}
    	else {
    		System.out.println(n + 3);
    		return function(n + 2);
    	}
    }
}

public class M12_ChallengeExam
{
    public static void main(String[] args)
    {
        Recursion obj = new Recursion();
        System.out.println(obj.function(0));
    }
}