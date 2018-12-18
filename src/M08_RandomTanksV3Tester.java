/**
 * The purpose of this program is to use tank objects
 * and have the user produce a certain number of them.
 * 
 * @author Lydia Chung
 * @version 12/17/2018
 * 
 */
import java.util.Scanner;
public class M08_RandomTanksV3Tester
{
	public static void main(String [ ] args)
	{
		//instances
		M08_RandomTanksV3 tank1 = new M08_RandomTanksV3(54, "brown", 152.0, "Tiger 1");
		M08_RandomTanksV3 tank2 = new M08_RandomTanksV3(10, "pink", 37.5, "PS-1");
		M08_RandomTanksV3 tank3 = new M08_RandomTanksV3(25, "green", 88.0, "KwK 36");
		M08_RandomTanksV3 tank4 = new M08_RandomTanksV3(26, "black", 76.0, "T34");
		M08_RandomTanksV3 tank5 = new M08_RandomTanksV3(68, "yellow", 120.0, "M1 Abrams");
		
		//initiating arrays
		M08_RandomTanksV3 [ ] tankArray = {tank1, tank2, tank3, tank4, tank5};
		
		Scanner in = new Scanner(System.in);
		System.out.println("You are creating your own tank army. ");
		
		for (int i = 0; i < tankArray.length; i++) {
			//ask user for input
			System.out.println("How many " + tankArray[i].getType() + " tanks do you want?");
			tankArray[i].setNumber(in.nextInt());
			tankArray[i].setFormation(tankArray[i].unitSize(tankArray[i].getNumber()));
			tankArray[i].setUse(tankArray[i].tankPurpose(tankArray[i].getWeight()));
			tankArray[i].setSize(tankArray[i].tankPurpose(tankArray[i].getCaliber()));
		}
		
		//calculate min and max number of tanks
		int maxNum = Integer.MIN_VALUE;
		int minNum = Integer.MAX_VALUE;
		double sumNum = 0;
		for (int i = 0; i < tankArray.length; i++) {
			if (tankArray[i].getNumber() < minNum) {
				minNum = tankArray[i].getNumber();
			}
			if (tankArray[i].getNumber() > maxNum) {
				maxNum = tankArray[i].getNumber();
			}
			sumNum += tankArray[i].getNumber();
		}
		double averageNum = (double)sumNum / (double)tankArray.length;
		
		//display stuff
		System.out.printf("%-10s %-12s %-10s %-7s %-6s", "Type", "Formation", "Use", "Size", "Number");
		System.out.println();
		System.out.println("****************************************************");
		for (int i = 0; i < tankArray.length; i++) {
			System.out.println(tankArray[i]);
		}
		System.out.println("****************************************************");
		System.out.printf("%42s %-10d", "Minimum:   ", minNum);
		System.out.println();
		System.out.printf("%42s %-10d", "Maximum:   ", maxNum);
		System.out.println();
		System.out.printf("%42s %-10.1f", "Average:   ", averageNum);
		System.out.println();
		
	}
}