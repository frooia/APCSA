/**
 * The purpose of this program is to calculate the average
 * category, pressure, and wind speed of hurricanes within 
 * a given year range, and tally up storms of each category.
 * 
 * @author Lydia Chung
 * @version 09/23/2018
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
public class M06_HurricaneSelector
{
	public static void main(String [] args) throws IOException
	{
		//make scanner
		Scanner in = new Scanner(System.in);
		File hurricaneData = new File("hurricanedata.txt");
		Scanner inFile = new Scanner(hurricaneData);
		
		//make arrays
		int [] years = new int[156];
		String [] months = new String[156];
		int [] pressure = new int[156];
		double [] windSpeedkt = new double[156];
		double [] windSpeedmph = new double[156];
		String [] names = new String[156];
		int [] cat = new int[156];
		
		//read file into arrays
		int row = 0;
		while (inFile.hasNext()) {
			years[row] = inFile.nextInt();
			months[row] = inFile.next();
			pressure[row] = inFile.nextInt();
			windSpeedkt[row] = inFile.nextDouble();
			names[row] = inFile.next();
			row++;
		}
		inFile.close();
		
		//convert knots to mph
		for (int i = 0; i < windSpeedkt.length; i++) {
			windSpeedmph[i] = windSpeedkt[i] * 1.15078;
		}
		
		//calculate storm category (1-5 on Saffir-Simpson scale)
		for (int i = 0; i < windSpeedmph.length; i++) {
			if (windSpeedmph[i] > 74 && windSpeedmph[i] <= 95) {
				cat[i] = 1;
			}
			else if (windSpeedmph[i] > 95 && windSpeedmph[i] <= 110) {
				cat[i] = 2;
			}
			else if (windSpeedmph[i] > 110 && windSpeedmph[i] <= 129) {
				cat[i] = 3;
			}
			else if (windSpeedmph[i] > 129 && windSpeedmph[i] <= 156) {
				cat[i] = 4;
			}
			else {
				cat[i] = 5;
			}
			
		}
		
		//accept user input for years
		System.out.println("What range of hurricane data do you want to see (years)?\nLower bound: ");
		int lower = in.nextInt();
		System.out.println("Upper bound: ");
		int upper = in.nextInt();
		int lowerIndex = 0;
		int upperIndex = 0;
		
		//indexOf functions to convert bounds into indices
		for (int i = 0; i < years.length; i++) {
			if (years[i] == lower) {
				lowerIndex = i;
				break;
			}
		}
		for (int i = 0; i < years.length; i++) {
			if (upper == 2015) {
				upperIndex = years.length;
			}
			else if (years[i] == upper + 1) {
				upperIndex = i; //inclusive
				break;
			}
		}
		
		//create sub-arrays within user's range
		int yearsChoice[] = Arrays.copyOfRange(years, lowerIndex, upperIndex);
		String namesChoice[] = Arrays.copyOfRange(names, lowerIndex, upperIndex);
		int catChoice[] = Arrays.copyOfRange(cat, lowerIndex, upperIndex);
		double windSpeedmphChoice[] = Arrays.copyOfRange(windSpeedmph, lowerIndex, upperIndex);
		int pressureChoice[] = Arrays.copyOfRange(pressure, lowerIndex, upperIndex);
		
		//averages, DP = decimal place
		int numTerms = upperIndex - lowerIndex + 1;
		double catChoiceSum = 0;
		for (int category : catChoice) {
			catChoiceSum += category;
		}
		double catAverage = (int)(10 * catChoiceSum / numTerms) / 10.0; //average category, 1 DP
		
		double windChoiceSum = 0;
		for (double speed : windSpeedmphChoice) {
			windChoiceSum += speed;
		}
		double windAverage = (int)(100 * windChoiceSum / numTerms) / 100.0; //average wind speed, 2 DP
		
		double pressureChoiceSum = 0;
		for (int pressures : pressureChoice) {
			pressureChoiceSum += pressures;
		}
		double pressureAverage = (int)(10 * pressureChoiceSum / numTerms) / 10.0; //average pressure, 1 DP
		
		//calculate mins and maxes
		int catMin = Integer.MAX_VALUE;
		int catMax = Integer.MIN_VALUE;
		for (int i = 0; i < catChoice.length; i++) {
			if (catChoice[i] < catMin) {
				catMin = catChoice[i];
			}
			if (catChoice[i] > catMax) {
				catMax = catChoice[i];
			}
		}
		
		double windMin = Integer.MAX_VALUE;
		double windMax = Integer.MIN_VALUE;
		for (int i = 0; i < windSpeedmphChoice.length; i++) {
			if (windSpeedmphChoice[i] < windMin) {
				windMin = windSpeedmphChoice[i];
			}
			if (windSpeedmphChoice[i] > windMax) {
				windMax = windSpeedmphChoice[i];
			}
		}
		
		int pressureMin = Integer.MAX_VALUE;
		int pressureMax = Integer.MIN_VALUE;
		for (int i = 0; i < pressureChoice.length; i++) {
			if (pressureChoice[i] < pressureMin) {
				pressureMin = pressureChoice[i];
			}
			if (pressureChoice[i] > pressureMax) {
				pressureMax = pressureChoice[i];
			}
		}
		
		//display
		System.out.println("Hurricane Data for Years " + lower + " - " + upper);
		System.out.println("***************************************************");
		
	}
}