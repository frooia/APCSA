/**
 * This class defines a Cylinder object by extending a Circle.
 *
 * @author Poly Morphism
 * @version 06/13/17
 */

public class M13_Cylinder extends M13_Circle
{
    // instance variables
    private int height;

    // Constructor for objects of class Cylinder
    public M13_Cylinder(int x, int y, int rad, int h)
    {
        // call superclass
        super(x, y, rad);

        // initialize instance variables
        height = h;
    }

    public int getHeight()
    {
        return height;
    }
}
