/**
 * This class tests Circle objects.
 *
 * @author Lydia Chung
 * @version 03/09/2019
 */
import java.util.ArrayList;
public class M13_CircleTester
{
	/**
	 * Prints the result of the getCenter() method of the M13_Circle class
	 * @param circle
	 */
	public static void showCenter(M13_Circle circle)
	{
		System.out.print(circle.getCenter());
	}
	public static void main(String [ ] args) 
	{
		ArrayList<M13_Circle> circles = new ArrayList<M13_Circle>();
		circles.add(new M13_Circle(2, 4, 5));
		circles.add(new M13_Cylinder(10, 15, 12, 35));
		circles.add(new M13_Oval(25, 10, 3, 4));
		circles.add(new M13_OvalCylinder(40, 10, 25, 35, 15));
		
		for (M13_Circle circle : circles) {
			System.out.print("For this " + circle.getClass().getName() + " the ");
			showCenter(circle);
			System.out.println();
		}
	}
}