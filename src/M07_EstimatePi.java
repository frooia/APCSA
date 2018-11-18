/**
 * The purpose of this program is to simulate
 * a dart thrown at a circle to calculate pi.
 * 
 * @author Lydia Chung
 * @version 11/09/2018
 * 
 */
import java.util.Random;
import java.util.Scanner;
public class M07_EstimatePi
{
	public static double monteCarlo(long darts) //Monte Carlo method
	{
		Random randNumList = new Random();
		double x, y;
		double hit = 0.0;
		for (int i = 0; i < darts; i++) {
			x = randNumList.nextDouble();
			y = randNumList.nextDouble();
			if (Math.pow(x, 2) + Math.pow(y, 2) <= 1) {
				hit++;
			}
		}
		double pi = 4.0 * hit / darts;
		return pi;
	}
	public static double arrayAverage(double [] array) //averages elements in an array
	{
		double sum = 0;
		for (double element : array) {
			sum += element;
		}
		return sum / array.length;
	}
	public static void main(String [] args) 
	{
		//get user input
		Scanner in = new Scanner(System.in);
		System.out.println("How many trials?");
		int trials = in.nextInt();
		System.out.println("How many darts per trial?");
		long darts = in.nextLong();
		
		//for each trial, find pi for the number of darts
		double [] piValues = new double[trials];
		for (int i = 0; i < trials; i++) {
			piValues[i] = monteCarlo(darts);
			System.out.printf("%-7s%3d%3s%-8f", "Trial [", i + 1, "]: ", piValues[i]); 
			System.out.println();
		}
		
		//find average pi
		System.out.println("Average pi value: " + arrayAverage(piValues));
		
		//It takes about 100 trials at 10000000 darts per trial for the average pi value to approach 3.141592.

	}
}