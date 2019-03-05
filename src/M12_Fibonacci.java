/**
 * This program calculates the nth Fibonacci number.
 * 
 * @author Lydia Chung
 * @version 02/21/2019
 * 
 */
import java.util.Scanner;
class Rabbits
{
	public void ask()
	{
		
		int n = 0;
		
		int fNum;
		/*
		if (n == -1) {
			System.out.println("Thank you for generating Fibonacci numbers.");
		}
		else {
			fNum = calcNum(n);
			ask();
		}
		System.out.println(fNum);
		*/

		Scanner in = new Scanner(System.in);
		System.out.print("Enter which Fibonacci number you want, between 1st and 45th number ('-1' to quit): ");
		n = in.nextInt();
		while (n != -1) {
			if (n > 45) {
				System.out.println("This number is too big.");
			}
			else {
				fNum = calcNum(n);
				System.out.println(fNum);
			}
			System.out.print("Enter which Fibonacci number you want, between 1st and 45th number ('-1' to quit): ");
			n = in.nextInt();
		}
		System.out.println("Thank you for generating Fibonacci numbers!");
	}
	
	public int calcNum(int n)
	{
		if (n > 45) {
			System.out.print(" This number was too big to be generated.");
			return -1;
		}
		else if (n == 0) {
			return 0;
		}
		else if (n == 1) {
			return 1;
		}
		else {
			return calcNum(n - 1) + calcNum(n - 2);
		}
	}
}
public class M12_Fibonacci
{
	public static void main(String [] args)
	{
		Rabbits farm = new Rabbits();
		
		farm.ask();
		
	}
}