/**
 * The purpose of this program is to 
 * simulate the number of fox squirrels spotted in a park
 * using the Monte Carlo method.
 * @author Lydia Chung
 * @version 27/07/2018
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
import java.util.Random;

class M05_MonteCarloMethod
{
	public static void main(String [ ] args) throws IOException
	{
		//make scanner and file
		Scanner in = new Scanner(System.in);
		PrintWriter file = new PrintWriter(new File("counts.txt"));
		
		//initiate variables
		Random randNumList = new Random();
		
		System.out.println("Squirrel Observation Simulator");
		System.out.println("How many trials do you want to simulate? (at least 1000) ");
		int trials = in.nextInt();
		if (trials >= 1000) {
			for (int i = 0; i < trials; i++) {
				//insert code for counting trials
			}
		}
		else {
			System.out.println("You did not simulate enough trials. Try again.");
		}
	}
}