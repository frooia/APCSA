/**
 * This class defines a GiftBox object by extending
 * Box and includes color.
 * The toString method has been added.
 *
 * @author Lydia Chung
 * @version 03/17/2019
 */
public class M13_GiftBox extends M13_Box
{
    // instance variables
    private String color;

    // Constructor for objects of class Box
    public M13_GiftBox(int l, int w, int h, String c)
    {
        // call superclass
        super(l, w, h);

        // initialize instance variables
        color = c;
    }

    // return the side length
    public String getColor()
    {
        return color;
    }

    // String to display when object is printed.
    public String toString()
    {
        return "Gift Box - " + getColor() + ", " + getLength() + " X " + getWidth() + " X " + getHeight();
    }
    
}