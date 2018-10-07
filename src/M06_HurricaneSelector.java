/**
 * The purpose of this program is to calculate the average
 * category, pressure, and wind speed of hurricanes within 
 * a given year range, and tally up storms of each category.
 * 
 * @author Lydia Chung
 * @version 10/06/2018
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
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
		if (lower < 1995) {
			System.out.println("Your lower bound was not within the data range. Try again.");
		}
		else {
			System.out.println("Upper bound: ");
			int upper = in.nextInt();
			if (upper > 2015 || upper < lower) {
				System.out.println("Your upper bound was not within the data range. Try again.");
			}
			else {
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
				int numTerms = upperIndex - lowerIndex;
				double catChoiceSum = 0;
				for (int category : catChoice) {
					catChoiceSum += category;
				}
				double catAverage = catChoiceSum / numTerms; //average category, 1 DP
				
				double windChoiceSum = 0;
				for (double speed : windSpeedmphChoice) {
					windChoiceSum += speed;
				}
				double windAverage = windChoiceSum / numTerms; //average wind speed, 2 DP
				
				double pressureChoiceSum = 0;
				for (int i = 0; i < pressureChoice.length; i++) {
					pressureChoiceSum += pressureChoice[i];
				}
				double pressureAverage = pressureChoiceSum / numTerms; //average pressure, 1 DP
				
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
				System.out.println("\t\tHurricane Data for Years " + lower + "-" + upper);
				System.out.println("*********************************************************************");
				System.out.printf("%-8s %-12s %-12s %-17s %-16s", "Years", "Hurricane", "Category", "Pressure (mb)", "Wind Speed (mph)");
				System.out.println();
				System.out.println("*********************************************************************");
				for (int i = 0; i < yearsChoice.length; i++) {
					System.out.printf("%-8d %-12s %4d %14d %22.2f", yearsChoice[i], namesChoice[i], catChoice[i], pressureChoice[i], windSpeedmphChoice[i]);
					System.out.println();
				}
				System.out.println("*********************************************************************");
				
				//put summary stats into a file
				File summaryStats = new File("summarystats.txt");
				PrintWriter file = new PrintWriter(summaryStats);
				file.printf("%-10s %10.1f %14.1f %20.2f", "\tAverage:", catAverage, pressureAverage, windAverage);
				file.println();
				file.printf("%-10s %8d %14d %22.2f", "\tMinimum:", catMin, pressureMin, windMin);
				file.println();
				file.printf("%-10s %8d %14d %22.2f", "\tMaximum:", catMax, pressureMax, windMax);
				file.println();
				
				//count categories
				int ones = 0;
				int twos = 0;
				int threes = 0;
				int fours = 0;
				int fives = 0;
				for (int hurricane : catChoice) {
					if (hurricane == 1) {
						ones++;
					}
					else if (hurricane == 2) {
						twos++;
					}
					else if (hurricane == 3) {
						threes++;
					}
					else if (hurricane == 4) {
						fours++;
					}
					else {
						fives++;
					}
				}
				file.println("Year Range: " + lower + "-" + upper);
				file.println("Counts for each category: ");
				file.println("   Category 1: " + ones);
				file.println("   Category 2: " + twos);
				file.println("   Category 3: " + threes); 
				file.println("   Category 4: " + fours);
				file.println("   Category 5: " + fives);
				
				file.close();
				
				//display summary stats
				Scanner inStats = new Scanner(summaryStats);
				String token;
				while (inStats.hasNext()) {
					token = inStats.nextLine();
					System.out.println(token);
				}
				
			}//end of upper if statement
			
		}//end of lower if statement
		
	}//end of method
}//end of class