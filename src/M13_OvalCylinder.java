/**
 * This class defines an Oval Cylinder object that extends an Oval.
 *
 * @author Poly Morphism
 * @version 06/13/17
 */

public class M13_OvalCylinder extends M13_Oval
{
    // instance variables
    private int height;

    // Constructor for objects of class OvalCylinder
    public M13_OvalCylinder(int x, int y, int rad1, int rad2, int h)
    {
        // call superclass
        super(x, y, rad1, rad2);

        // initialize instance variables
        height = h;
    }

    public int getHeight()
    {
        return height;
    }
}