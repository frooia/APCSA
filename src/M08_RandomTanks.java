/**
 * The purpose of this program is to generate
 * a random tank type and have the user produce
 * a certain number of them.
 * 
 * @author Lydia Chung
 * @version 11/20/2018
 * 
 */
import java.util.Random;
import java.util.Scanner;
public class M08_RandomTanks
{
	public M08_RandomTanks() //default constructor
	{
		
	}
	public static String randomChoice(String [ ] array) //picks a random element
	{
		Random randNumList = new Random();
		int i = randNumList.nextInt(array.length);
		return array[i];
	}
	public static String unitSize(int size) //labels size of formation
	{
		if (size < 4) {
			return "platoon";
		}
		else if (size < 14) {
			return "company";
		}
		else if (size < 44) {
			return "battalion";
		}
		else if (size < 130) {
			return "brigade";
		}
		else if (size < 550) {
			return "division";
		}
		else {
			return "army";
		}
	}
	public static void main(String [ ] args)
	{
		M08_RandomTanks tank = new M08_RandomTanks();
		Scanner in = new Scanner(System.in);
		String [ ] tankTypes = {"M1 Abrams", "T14 Armata", "Leopard 2", "T90S", "Challenger 2", "AMX-56 Leclerc"};
		
		//ask user for input
		String type = tank.randomChoice(tankTypes);
		System.out.println("You are creating your own tank army. How many " + type + " tanks do you want?");
		int number = in.nextInt();
		String formation = tank.unitSize(number);
		System.out.printf("%50s", "Congratulations, you have produced a " + formation + " of " + number + " " + type + " tanks.");
		
	}
}