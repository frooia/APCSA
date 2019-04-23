
/**
 * This class defines a Rectangle object using
 * length and width.
 * The toString method has been added.
 *
 *
 * @author Lydia Chung
 * @version 03/17/2019
 */
public class M13_Rectangle
{
    // instance variables
    private int length;
    private int width;

    // Constructor for objects of class Rectangle
    public M13_Rectangle(int l, int w)
    {
        // initialize instance variables
        length = l;
        width = w;
    }

    // return the height
    public int getLength()
    {
        return length;
    }

    // return the width
    public int getWidth()
    {
        return width;
    }

    // String to display when object is printed.
    public String toString()
    {
        return "Rectangle - " + length + " X " + width;
    }
    
    public boolean equals(M13_Rectangle rect)
    {
    	if (rect.getLength() == this.getLength() && rect.getWidth() == this.getWidth()) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
}