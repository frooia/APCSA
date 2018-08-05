/**
 * The purpose of this program is to 
 * simulate the number of fox squirrels spotted in a park
 * using the Monte Carlo method.
 * @author Lydia Chung
 * @version 05/08/2018
 */
/*
 * Pseudocode:
 * if trials >= 100
 * 		allow continue 
 * else return error
 * for every trial
 * 		generate random number
 * 		make arbitrary variable called counts
 * 		while random number is not 0
 * 			add 1 to counts
 * 			generate a new random number
 * 		put counts into the new text file
 * read the list of counts from text file
 * add them up
 * divide sum by trials
 * print the average
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
		File outFile = new File("src/output.txt");
		PrintWriter file = new PrintWriter(outFile);
		
		//initiate variables
		Random randNumList = new Random();
		
		System.out.println("Squirrel Observation Simulator");
		System.out.println("How many trials do you want to simulate? (at least 1000) ");
		int trials = in.nextInt();
		if (trials >= 1000) {
			for (int i = 0; i < trials; i++) {
				int randNum = randNumList.nextInt(10); //initiates a randNum, later resets it in while loop
				int counts = 0; //amount of random numbers it takes to get a 0
				while (randNum != 0) {
					counts++;
					randNum = randNumList.nextInt(10); 
				}
				file.println(counts); //adds counts to the file as a new entry
			}
			file.close();
			
			//prints results
			int token;
			double sum = 0;
			in = new Scanner(outFile);
			while (in.hasNext()) {
				token = in.nextInt();
				sum += token;
			}
			double average = sum / trials;
			System.out.println("An average number of " + average + " squirrels were seen before spotting a fox squirrel.");  
		}
		else {
			System.out.println("You did not simulate enough trials. Try again.");
			file.close();
		}
	}
}