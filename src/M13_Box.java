/**
 * This class defines a Box object by extending
 * Rectangle and includes height.
 * The toString method has been added.
 *
 * @author Lydia Chung
 * @version 03/17/2019
 */
public class M13_Box extends M13_Rectangle
{
    // instance variables
    private int height;

    // Constructor for objects of class Box
    public M13_Box(int l, int w, int h)
    {
        // call superclass
        super(l, w);

        // initialize instance variables
        height = h;
    }

    // return the height
    public int getHeight()
    {
        return height;
    }

    // String to display when object is printed.
    public String toString()
    {
        return "Box - " + getLength() + " X " + getWidth() + " X " + height;
    }
    
    public boolean equals(M13_Box box)
    {
    	if (this.equals(box) && this.getHeight() == box.getHeight()) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
}