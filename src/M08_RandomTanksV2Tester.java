/**
 * The purpose of this program is to generate
 * a random tank type and have the user produce
 * a certain number of them.
 * 
 * @author Lydia Chung
 * @version 12/02/2018
 * 
 */
import java.util.Scanner;
public class M08_RandomTanksV2Tester
{
	public static void main(String [ ] args)
	{
		//instances
		M08_RandomTanksV2 tank1 = new M08_RandomTanksV2(54, "brown", 152.0, "Tiger 1");
		M08_RandomTanksV2 tank2 = new M08_RandomTanksV2(10, "pink", 37.5, "PS-1");
		M08_RandomTanksV2 tank3 = new M08_RandomTanksV2(25, "green", 88.0, "KwK 36");
		
		//initiating arrays
		M08_RandomTanksV2 [ ] tankArray = {tank1, tank2, tank3};
		String[ ] formations = new String[3];
		int [ ] numbers = new int[3];
		String [ ] uses = new String[3];
		String [ ] sizes = new String[3];
		
		Scanner in = new Scanner(System.in);
		System.out.println("You are creating your own tank army. ");
		
		for (int i = 0; i < tankArray.length; i++) {
			//ask user for input
			System.out.println("How many " + tankArray[i].getType() + " tanks do you want?");
			numbers[i] = in.nextInt();
			formations[i] = tankArray[i].unitSize(numbers[i]);
			uses[i] = tankArray[i].tankPurpose(tankArray[i].getWeight());
			sizes[i] = tankArray[i].tankPurpose(tankArray[i].getCaliber());
		}
		
		
		//display stuff
		System.out.printf("%-8s %-12s %-10s %-7s %-6s", "Type", "Formation", "Use", "Size", "Number");
		System.out.println();
		System.out.println("************************************************");
		for (int i = 0; i < tankArray.length; i++) {
			System.out.printf("%-8s %-12s %-10s %-7s %-6d", tankArray[i].getType(), formations[i], uses[i], sizes[i], numbers[i]);
			System.out.println();
		}
		
		
	}
}