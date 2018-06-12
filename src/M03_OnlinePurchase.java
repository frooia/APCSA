/**
 * The purpose of this program is to simulate buying teacups 
 * and print a receipt based on user input.
 * @author Lydia Chung
 * @version 12/06/2018
 * 
 */
import java.util.Scanner;
public class M03_OnlinePurchase 
{
	public static void main(String[ ] args) 
	{
		//create Scanner
		Scanner in = new Scanner(System.in);
		
		//user input prompts
		System.out.print("What is your name? "); //asks for name
		String firstName = in.next();
		String lastName = in.nextLine();
		System.out.print("What is today's date? (mm/dd/yyyy) "); //asks for date
		String date = in.next();
		date += in.nextLine();
		String month = date.substring(0, 2);
		String day = date.substring(3, 5);
		String year = date.substring(6);
		System.out.print("What color of teacups would you like to buy? (red/blue/green/yellow) "); //asks for color of teacups
		String color = in.next();
		System.out.print("How many teacups would you like to buy? "); //asks for teacups bought
		String teacupsString = in.next();
		int teacupsInt = Integer.parseInt(teacupsString);
		System.out.print("How much does one teacup cost? "); //asks for the price of one teacup
		String priceString = in.next();
		double priceDouble = Double.parseDouble(priceString);
		System.out.print("Enter your debit card information (#####-###-####): "); //asks for debit card #
		String debitString = in.next();
		debitString += in.nextLine();
		String debitString1 = debitString.substring(0, 5);
		String debitString2 = debitString.substring(6, 9);
		String debitString3 = debitString.substring(10);
		int debitInt1 = Integer.parseInt(debitString1);
		int debitInt2 = Integer.parseInt(debitString2);
		int debitInt3 = Integer.parseInt(debitString3);
		System.out.print("Enter your PIN (####): "); //asks for PIN
		String pin = in.next();
		
		//print statements
		System.out.println("******************* Receipt *******************");
		System.out.println("Order Number: " + debitString.substring(1, 4) + lastName.substring(1,3));
		System.out.println(month + "-" + day + "-" + year);
		System.out.println(firstName.substring(0, 1) + ". " + lastName);
		System.out.println();
		System.out.println("Teacups bought: " + teacupsInt);
		System.out.println("Color: " + color);
		System.out.println("Price of 1 teacup: " + priceDouble);
		System.out.println("Total cost: " + (teacupsInt * priceDouble));
		System.out.println("Account: XXXXX-XXX-" + debitString3);
		System.out.println();
		System.out.println("Thank you for your purchase. Your order should be delivered to you soon.");
		System.out.println("***********************************************");
	}
}
