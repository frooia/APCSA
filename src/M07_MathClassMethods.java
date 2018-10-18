/**
 * The purpose of this program is to calculate
 * the (x, y) coordinates of points on a circle
 * of a given radius
 * 
 * @author Lydia Chung
 * @version 10/18/2018
 */
import java.util.Scanner;
public class M07_MathClassMethods
{
	public static void main(String [ ] args) 
	{
		//prompt user for radius and increment
		Scanner in = new Scanner(System.in);
		System.out.println("What is the radius? ");
		double radius = in.nextDouble();
		System.out.println("What is the increment of the x-value? ");
		double increment = in.nextDouble();
		int length = (int)(radius * 2 / increment + 1);
		
		//initialize arrays
		double [ ] x = new double[length];
		double [ ] y1 = new double[length];
		double [ ] y2 = new double[length];
		for (int i = 0; i < length; i++) {
			x[i] = radius - increment * i;
		}
		for (int i = 0; i < length; i++) {
			y1[i] = Math.sqrt(Math.pow(radius, 2) - Math.pow(x[i], 2)); //Pythagorean Theorem for positive y
		}
		for (int i = 0; i < length; i++) {
			y2[i] = -Math.sqrt(Math.pow(radius, 2) - Math.pow(x[i], 2)); //Pythagorean Theorem for negative y
		}
		
		//display data
		System.out.println("Coordinate Points on a Circle with Radius " + radius);
		System.out.printf("%12s %12s %12s", "x", "y1", "y2");
		System.out.println("\n**********************************************");
		for (int i = 0; i < length; i++) {
			System.out.printf("%12.3f %12.3f %12.3f", x[i], y1[i], y2[i]); //3 decimal places
			System.out.println();
		}
		
	}
}