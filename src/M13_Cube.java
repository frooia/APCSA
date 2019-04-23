/**
 * This class defines a Cube object by extending
 * Box and having the same side length.
 * The toString method has been added.
 *
 * @author Lydia Chung
 * @version 03/17/2019
 */
public class M13_Cube extends M13_Box
{
    // instance variables
    private int side;

    // Constructor for objects of class Box
    public M13_Cube(int l, int w, int h)
    {
        // call superclass
        super(l, w, h);

        // initialize instance variables
        side = l;
    }

    // return the side length
    public int getSide()
    {
        return side;
    }

    // String to display when object is printed.
    public String toString()
    {
        return "Cube - " + getSide() + " X " + getSide() + " X " + getSide();
    }
    
}