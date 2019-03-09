/**
 * This class defines a basic Winter Mountain, a direct subclass of Mountain 
 * and indirect subclass of Terrain.
 *
 * @author Lydia Chung
 * @version 03/05/2019
 */
public class M13_WinterMountain extends M13_Mountain
{
	private double temperature;
	public M13_WinterMountain(int l, int w, int m, double temp)
	{
		super(l, w, m);
		temperature = temp;
	}
	public String getWinterMountainSize()
    {
        return "Winter " + getMountainSize() + " and is " + temperature + " degrees in temperature";
    }
}