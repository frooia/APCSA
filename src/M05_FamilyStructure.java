/**
 * The purpose of this program is to calculate
 * the probability that a family with 2 children will have
 * 2 boys, a boy and a girl, or 2 girls.
 * 
 * @author Lydia Chung
 * @version 03/07/2018
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class M05_FamilyStructure
{
	public static void main(String [ ] args) throws IOException
	{
		String token;
		File fileName = new File("src/test1.txt");	//delete the src/ part of file path before running if you are on a different computer
		Scanner inFile = new Scanner(fileName);
		
		//initialize variables
		int numFamilies = 0;
		int bB = 0;
		int bG = 0;
		int gB = 0;
		int gG = 0;
		
		while (inFile.hasNext()) {
			token = inFile.next();
			if (token.equals("BB")) {
				bB++;
			}
			else if (token.equals("BG")) {
				bG++;
			}
			else if (token.equals("GB")) {
				gB++;
			}
			else if (token.equals("GG")) {
				gG++;
			}
			numFamilies++;
		}
		
		//displays results
		System.out.println("Family Composition Statistics");
		System.out.println("*****************************");
		System.out.println("Total number of families: " + numFamilies);
		System.out.println("Families with: ");
		System.out.println("2 boys: " + bB + "\t\t" + ((bB * 1000 / numFamilies) / 10.0) + "%");
		System.out.println("1 boy, 1 girl: " + (bG + gB) + "\t" + (((bG + gB) * 1000 / numFamilies) / 10.0) + "%");
		System.out.println("2 girls: " + gG + "\t\t" + ((gG * 1000 / numFamilies) / 10.0) + "%");
		
		inFile.close();
	}
}