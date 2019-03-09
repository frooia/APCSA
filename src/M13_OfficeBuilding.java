/**
 * This class defines a basic Office Building, a direct subclass of Building 
 * and indirect subclass of Terrain.
 *
 * @author Lydia Chung
 * @version 03/05/2019
 */
public class M13_OfficeBuilding extends M13_Building
{
	private String company;
	public M13_OfficeBuilding(int l, int w, int m, String c)
	{
		super(l, w, m);
		company = c;
	}
	public String getOfficeBuildingSize()
    {
        return "Office " + getBuildingSize() + " and belongs to the " + company + " company";
    }
}