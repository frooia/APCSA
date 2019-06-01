/**
 * The purpose of this program is to test the M15_Product classes.
 * 
 * @version 05/12/2019
 * @author Lydia Chung
 */
import java.util.*;
public class M15_ProductTester
{
	public static void inventory(ArrayList<M15_Product> a) 
	{
		int xmasWrapCount = 0;
		int bdayWrapCount = 0;
		int hammerCount = 0;
		double xmasWrapCost = 0.0;
		double bdayWrapCost = 0.0;
		double hammerCost = 0.0;
		for (M15_Product product : a) {
			if (product.getName().equals("Christmas")) {
				xmasWrapCount++;
				xmasWrapCost += product.getCost();
			}
			else if (product.getName().equals("birthday")) {
				bdayWrapCount++;
				bdayWrapCost += product.getCost();
			}
			else if (product.getName().equals("hammer")) {
				hammerCount++;
				hammerCost += product.getCost();
			}
		}
		System.out.println("Christmas wrapping paper: Quantity = " + xmasWrapCount + ", Total cost = $" + xmasWrapCost);
		System.out.println("Birthday wrapping paper: Quantity = " + bdayWrapCount + ", Total cost = $" + bdayWrapCost);
		System.out.println("Hammers: Quantity = " + hammerCount + ", Total cost = $" + hammerCost);
	}
	public static void main(String [ ] args) 
	{
		//create instances
		M15_WrappingXmas xmas1 = new M15_WrappingXmas();
		M15_WrappingXmas xmas2 = new M15_WrappingXmas();
		M15_WrappingXmas xmas3 = new M15_WrappingXmas();
		M15_WrappingBday bday1 = new M15_WrappingBday();
		M15_WrappingBday bday2 = new M15_WrappingBday();
		M15_Hammer hammer = new M15_Hammer();
		
		//add to ArrayList
		ArrayList<M15_Product> products = new ArrayList<M15_Product>();
		products.add(xmas1);
		products.add(xmas2);
		products.add(xmas3);
		products.add(bday1);
		products.add(bday2);
		products.add(hammer);
		
		//set names and costs
		for (M15_Product product : products) {
			product.setName();
			product.setCost();
		}
		
		System.out.println("Inventory:");
		inventory(products);
		
		M15_Hammer hammer1 = new M15_Hammer();
		M15_Hammer hammer2 = new M15_Hammer();
		hammer1.setCost(9.99);
		hammer2.setCost(11.49);
		System.out.println();
		System.out.println("Comparing costs:");
		System.out.print("The first hammer costs");
		if (hammer1.compareTo(hammer2) == 0) {
			System.out.print(" the SAME as ");
		}
		else if (hammer1.compareTo(hammer2) < 0) {
			System.out.print(" LESS than ");
		}
		else {
			System.out.print(" GREATER than ");
		}
		System.out.print("the second hammer.");
	}
}