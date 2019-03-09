/**
 * This class defines a basic Building, a subclass of Terrain.
 *
 * @author Lydia Chung
 * @version 03/05/2019
 */
public class M13_Building extends M13_Terrain
{
	private int stories;
	public M13_Building(int l, int w, int s)
	{
		super(l, w);
		stories = s;
	}
	public String getBuildingSize()
    {
        return "Building " + getTerrainSize() + " and has " + stories + " stories";
    }
}