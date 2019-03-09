/**
 * This class defines a basic Forest, a subclass of Terrain.
 *
 * @author Lydia Chung
 * @version 03/05/2019
 */
public class M13_Forest extends M13_Terrain
{
	private int trees;
	public M13_Forest(int l, int w, int t)
	{
		super(l, w);
		trees = t;
	}
	public String getForestSize()
    {
        return "Forest " + getTerrainSize() + " and has " + trees + " trees";
    }
}