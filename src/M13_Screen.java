/**
 * This class defines a Screen object by extending
 * Rectangle and includes screen dimension.
 * The toString method has been added.
 *
 * @author Lydia Chung
 * @version 03/17/2019
 */
public class M13_Screen extends M13_Rectangle
{
    // instance variables
    private int dimension;

    // Constructor for objects of class Box
    public M13_Screen(int l, int w, int d)
    {
        // call superclass
        super(l, w);

        // initialize instance variables
        dimension = d;
    }

    // return the height
    public int getDimension()
    {
        return dimension;
    }

    // String to display when object is printed.
    public String toString()
    {
        return "Screen - " + getDimension() + " inches, " + getLength() + " X " + getWidth();
    }
    
}