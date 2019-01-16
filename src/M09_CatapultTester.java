/**
 * This class tests the M09_Catapult class.
 * 
 * @author Lydia Chung
 * @version 01/16/2019
 * 
 */
import java.util.ArrayList;
public class M09_CatapultTester
{
	public static void main(String [ ] args)
	{
		//initialize speed and angles arrays, and projectile ArrayList
		double [ ] speeds = {10, 15, 20, 25, 30, 35, 40};
		double [ ] angles = {20, 25, 30, 35, 40, 45, 50, 55, 60};
		ArrayList<ArrayList<M09_Catapult>> projectiles = new ArrayList<ArrayList<M09_Catapult>>(speeds.length);
		
		//add objects to projectile ArrayList
		for (int i = 0; i < speeds.length; i++) {
			ArrayList<M09_Catapult> speedAngles = new ArrayList<M09_Catapult>(angles.length);
			for (int j = 0; j < angles.length; j++) {
				M09_Catapult projectile = new M09_Catapult(speeds[i], angles[j]);
				projectile.calcRange();
				speedAngles.add(projectile);
			}
			projectiles.add(speedAngles);
		}
		
		//display stuff
		System.out.printf("%75s", "Projectile Distance (feet)");
		System.out.println();
		System.out.print("    MPH       ");
		for (double angle : angles) {
			System.out.printf("%12s", angle + " deg     ");
		}
		System.out.println();
		System.out.println("================================================================================================================================");
		for (int i = 0; i < speeds.length; i++) {
			System.out.print("   " + speeds[i]);
			for (int j = 0; j < angles.length; j++) {
				projectiles.get(2).get(3).calcRange();
				//System.out.print(projectiles.get(2).get(3).getRange() + "          ");
				System.out.printf("%13.2f", projectiles.get(i).get(j).getRange());
			}
			System.out.println();
		}
		
	}
}