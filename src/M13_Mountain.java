/**
 * This class defines a basic Mountain, a subclass of Terrain.
 *
 * @author Lydia Chung
 * @version 03/05/2019
 */
public class M13_Mountain extends M13_Terrain
{
	private int mountains;
	public M13_Mountain(int l, int w, int m)
	{
		super(l, w);
		mountains = m;
	}
	public String getMountainSize()
    {
        return "Mountain " + getTerrainSize() + " and has " + mountains + " mountains";
    }
}