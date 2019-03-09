/**
 * This class tests all of the Terrain classes.
 *
 * @author Lydia Chung
 * @version 03/05/2019
 */
public class M13_TerrainTester
{
	public static void main(String [] args) 
	{
		M13_Terrain one = new M13_Terrain(400, 400);
		M13_Mountain two = new M13_Mountain(400, 200, 180);
		M13_Forest three = new M13_Forest(100, 200, 58);
		M13_WinterMountain four = new M13_WinterMountain(250, 300, 9, 34);
		M13_Building five = new M13_Building(150, 205, 8);
		M13_OfficeBuilding six = new M13_OfficeBuilding(200, 200, 4, "Microsoft");
		
		System.out.println(one.getTerrainSize());
		System.out.println(two.getMountainSize());
		System.out.println(three.getForestSize());
		System.out.println(four.getWinterMountainSize());
		System.out.println(five.getBuildingSize());
		System.out.println(six.getOfficeBuildingSize());
	}
}