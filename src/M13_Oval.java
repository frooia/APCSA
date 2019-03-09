/**
 * This class defines an Oval object by extending Circle.
 *
 * @author Poly Morphism
 * @version 06/13/17
 */

public class M13_Oval extends M13_Circle
{
    // instance variables
    private int radius2;

    // Constructor for objects of class Oval
    public M13_Oval(int x, int y, int rad1, int rad2)
    {
        // call superclass
        super(x, y, rad1);

        // initialize instance variables
        radius2 = rad2;
    }

    public int getRadius2()
    {
        return radius2;
    }
}