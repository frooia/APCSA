
 /**
 * This class defines a basic Terrain.
 *
 * @author Lydia Chung
 * @version 03/05/2019
 */

public class M13_Terrain
{
    // instance variables
    private int length, width;

    // Constructor for objects of class Terrain
    public M13_Terrain(int l, int w)
    {
        // initialize instance variables
        length = l;
        width = w;
    }

    public String getTerrainSize()
    {
        return "Land has dimensions " + length + " X " + width;
    }
}