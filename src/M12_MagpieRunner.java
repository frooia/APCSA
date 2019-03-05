/**
 * A simple class to run the Magpie class.

 * Code adapted from work by Laurie White for the College Board.
 *
 * @author Lydia Chung
 * @version 03/02/2019
 */
import java.util.Scanner;
public class M12_MagpieRunner
{

    /**
     * Create a Magpie, give it user input, and print its replies.
     */
    public static void main(String[] args)
    {
        M12_Magpie maggie = new M12_Magpie();

        System.out.println (maggie.getGreeting());
        Scanner in = new Scanner (System.in);
        String statement = in.nextLine();

        while (!statement.equals("Bye"))
        {
            System.out.println (maggie.getResponse(statement));
            statement = in.nextLine();
        }
    }

}