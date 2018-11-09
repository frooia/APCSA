/** 
 * The purpose of this program is to calculate 
 * the surface gravity of each planet in our solar system.
 * 
 * @author Lydia Chung
 * @version 10/29/2018
 */
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
public class M07_PlanetGravity
{
	public static double surfaceGravity(double m, double r) //surface gravity method
	{
		double ugc = 6.67e-11;
		return ugc * m / Math.pow(r, 2);
	}
	public static void printResults(String name, double diameter, double mass, double surfaceGravity)
	{
		//System.out.printf("%-12s %9.1d %15.2d %10.2d", name, diameter, mass, surfaceGravity);
		System.out.printf("%-12s %9.1f %17.2e %10.2f", name, diameter, mass, surfaceGravity);
		System.out.println();
	}
	public static void makeFile(double [] input) throws IOException
	{
		File results = new File("gravities.txt");
		PrintWriter file = new PrintWriter(results);
		for ( double d : input) {
			file.println(d);
		}
		file.close();
	}
	public static void main(String [ ] args) throws IOException //main method
	{
		//assign values to arrays
		String [] names = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
		double [] diameters = {4880, 12103.6, 12756.3, 6794, 142984, 120536, 51118, 49532};
		double [] radiiM = new double[diameters.length];
		for (int i = 0; i < diameters.length; i++) {
			radiiM[i] = diameters[i] * 1000.0 / 2.0; //converts diameters in km to radii in meters
		}
		double [] masses = {3.30e23, 4.869e24, 5.972e24, 6.4219e23, 1.900e27, 5.68e26, 8.683e25, 1.0247e26};
		double [] surfaceGravities = new double[diameters.length];
		for (int i = 0; i < surfaceGravities.length; i++) {
			surfaceGravities[i] = surfaceGravity(masses[i], radiiM[i]);
		}
		
		//display table
		System.out.println("\t\t    Planetary Data");
		System.out.printf("%-12s %9s %13s %12s", "Planet", "Diameter (km)", "Mass (kg)", "g (m/s^2)");
		System.out.println();
		System.out.println("*****************************************************");
		for (int i = 0; i < names.length; i++) {
			printResults(names[i], diameters[i], masses[i], surfaceGravities[i]);
			
		}
		
		makeFile(surfaceGravities);
		
	}
}