/**
 * This class tests all of the Rectangle classes.
 * 
 * @author Lydia Chung
 * @version 03/17/2019
 */
import java.util.ArrayList;
public class M13_ShapesTester
{
	public static void showEffectBoth(M13_Rectangle r)
	{
		System.out.println(r); //same effect as System.out.println(rect.toString());
	}
	public static void compare(M13_Rectangle rect1, M13_Rectangle rect2)
	{
		if (rect1.equals(rect2)) {
			System.out.println(rect1 + " IS the same size as " + rect2);
		}
		else {
			System.out.println(rect1 + " is NOT the same size as " + rect2);
		}
	}
	public static void main(String [ ] args) 
	{
		M13_Rectangle one = new M13_Rectangle(4, 8);
		M13_Rectangle two = new M13_Box(2, 8, 10);
		M13_Rectangle three = new M13_Cube(5, 5, 5);
		M13_Rectangle four = new M13_GiftBox(6, 2, 3, "red");
		M13_Rectangle five = new M13_Screen(48, 36, 60);
		M13_Rectangle six = new M13_Box(5, 5, 5);
		
		ArrayList<M13_Rectangle> rects = new ArrayList<M13_Rectangle>();
		rects.add(one);
		rects.add(two);
		rects.add(three);
		rects.add(four);
		rects.add(five);
		rects.add(six);
		
		for (M13_Rectangle rect : rects) {
			showEffectBoth(rect);
		}
		
		System.out.println();
		System.out.println("Test for equality:");
		compare(two, three);
		compare(six, three);
	}
}