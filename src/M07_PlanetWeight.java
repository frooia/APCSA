/** 
 * The purpose of this program is to calculate
 * the weight of someone on each of the planets.
 * 
 * @author Lydia Chung
 * @version 11/08/2018
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class M07_PlanetWeight
{
	public static double [] read(File file, double [] array) throws IOException //reads data from file
	{
		Scanner inFile = new Scanner(file);
		double token;
		int counter = 0;
		while (inFile.hasNext()) {
			token = inFile.nextDouble();
			array[counter] = token;
			counter++;
		}
		return array;
	}
	public static double weightToMass(double weight) //returns mass in grams
	{
		return weight * 453.59237;
	}
	public static double massToWeight(double mass, double gravity) //returns weight on planets based on mass
	{
		return mass * (gravity / 9.807) / 453.59237;
	}
	public static void printResults(String name, double surfaceGravity, double weight) 
	{
		System.out.printf("%-12s %9.2f %17.2f", name, surfaceGravity, weight);
		System.out.println();
	}
	public static void main(String [ ] args) throws IOException
	{
		//assign arrays, read gravities from file
		String [] names = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
		double [] surfaceGravities = new double[names.length];
		File gravities = new File("gravities.txt");
		read(gravities, surfaceGravities);
		
		//ask user for weight, calculate mass
		Scanner in = new Scanner(System.in);
		System.out.println("What is your weight in pounds?");
		double weightLb = in.nextDouble();
		double massG = weightToMass(weightLb);
		
		//assign weights to array
		double [] planetWeights = new double[names.length];
		for (int i = 0; i < planetWeights.length; i++) {
			planetWeights[i] = massToWeight(massG, surfaceGravities[i]);
		}
		
		//display results
		System.out.println("\tYour Weight on the Planets");
		System.out.printf("%-12s %9s %17s", "Name", "Gravity", "Weight (lbs)");
		System.out.println();
		System.out.println("*****************************************");
		for (int i = 0; i < names.length; i++) {
			printResults(names[i], surfaceGravities[i], planetWeights[i]);
		}
		
	}
}