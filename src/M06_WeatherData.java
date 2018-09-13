/**
 * The purpose of this program is to 
 * display the average temperature and 
 * annual precipitation based on location.
 * 
 * @author Lydia Chung
 * @version 09/13/2018
 */
import java.util.Scanner;
public class M06_WeatherData 
{
	public static void main(String [ ] args) 
	{
		//months array, temperature and precipitation for Orlando
		String location = "Orlando, FL";
		String [ ] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		double [ ] ordTemp = {60.9, 62.6, 67.4, 71.5, 77.1, 81.2, 82.4, 82.5, 81.1, 75.3, 68.8, 63.0};
		double [ ] ordPrecip = {2.4, 2.4, 3.5, 2.4, 3.7, 7.4, 7.2, 6.3, 5.8, 2.7, 2.3, 2.3};
		
		//temperature and precipitation for Gainesville
		//String location = "Gainesville, FL";
		//double [ ] ordTemp = {54.3, 57.0, 62.5, 67.6, 74.3, 79.2, 80.9, 80.4, 77.8, 70.1, 62.8, 56.3};
		//double [ ] ordPrecip = {3.5, 3.4, 4.3, 2.9, 3.2, 6.8, 6.1, 6.6, 4.4, 2.5, 2.2, 2.6};
		
		//accept input
		Scanner in = new Scanner(System.in);
		System.out.println("Choose Fahrenheit or Celsius (F or C): ");
		String tempScale = in.next();
		System.out.println("Choose inches or centimeters (i or c): ");
		String precipScale = in.next();
		
		//average temperature and total precipitation
		double ordTotalTemp = 0;
		for (int i = 0; i < ordTemp.length; i++) {
			ordTotalTemp += ordTemp[i];
		}
		double ordAverageTemp = ordTotalTemp / 12; 
		
		double ordTotalPrecip = 0;
		for (int i = 0; i < ordPrecip.length; i++) {
			ordTotalPrecip += ordPrecip[i];
		}
		
		//display data
		System.out.println("Weather Data");
		System.out.println("Location: " + location);
		
		if (tempScale.equals("c") || tempScale.equals("C")) {
			if (precipScale.equals("c") || precipScale.equals("C")) {
				//Celsius and cm
				System.out.println("Month\tTemperature (C)\tPrecipitation (cm.)");
				System.out.println("---------------------------------------------");
				for (int i = 0; i < months.length; i++) {
					System.out.printf("%-8s%10s%15s%n", months[i] + ".", (int)((ordTemp[i] - 32) * 50 / 9) / 10.0, (int)(ordPrecip[i] * 25.4) / 10.0);
				}
				System.out.println("---------------------------------------------");
				System.out.println("     Average: " + (int)((ordAverageTemp - 32) * 50 / 9) / 10.0 + "  Annual: " + (int)(ordTotalPrecip * 25.4) / 10.0);
			}
			else {
				//Celsius and inches
				System.out.println("Month\tTemperature (C)\tPrecipitation (in.)");
				System.out.println("---------------------------------------------");
				for (int i = 0; i < months.length; i++) {
					System.out.printf("%-8s%10s%15s%n", months[i] + ".", (int)((ordTemp[i] - 32) * 50 / 9) / 10.0, ordPrecip[i]);
				}
				System.out.println("---------------------------------------------");
				System.out.println("     Average: " + (int)((ordAverageTemp - 32) * 50 / 9) / 10.0 + "   Annual: " + ordTotalPrecip);
			}
		}
		else {
			if (precipScale.equals("c") || precipScale.equals("C")) {
				//Fahrenheit and cm
				System.out.println("Month\tTemperature (F)\tPrecipitation (cm.)");
				System.out.println("---------------------------------------------");
				for (int i = 0; i < months.length; i++) {
					System.out.printf("%-8s%10s%15s%n", months[i] + ".", ordTemp[i], (int)(ordPrecip[i] * 25.4) / 10.0);
				}
				System.out.println("---------------------------------------------");
				System.out.println("     Average: " + (int)(ordAverageTemp * 10) / 10.0 + "  Annual: " + (int)(ordTotalPrecip * 25.4) / 10.0);
			}
			else {
				//Fahrenheit and inches
				System.out.println("Month\tTemperature (F)\tPrecipitation (in.)");
				System.out.println("---------------------------------------------");
				for (int i = 0; i < months.length; i++) {
					System.out.printf("%-8s%10s%15s%n", months[i] + ".", ordTemp[i], ordPrecip[i]);
				}
				System.out.println("---------------------------------------------");
				System.out.println("     Average: " + (int)(ordAverageTemp * 10) / 10.0 + "   Annual: " + ordTotalPrecip);
			}
		}
		
	}
}