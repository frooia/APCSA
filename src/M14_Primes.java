/**
 * This program calculates the primes within a user-given range.
 * 
 * @author Lydia Chung
 * @version 04/17/2019
 */
import java.util.*;
class PrimesCalc
{
	private int low;
	private int high;
	private ArrayList<Integer> primes = new ArrayList<Integer>();
	
	//constructor
	public PrimesCalc(int low, int high)
	{
		this.low = low;
		this.high = high;
	}
	
	public void sieve()
	{
		for(int i = low; i <= high; i++) {
			boolean isPrime = true;
			if (i == 1) {
				isPrime = false; 
			}
			for (int j = 2; j <= (int)(Math.sqrt(i + 1.00)); j++) {
				if (i % j == 0) {
					isPrime = false;
				}
			}
			if (isPrime) {
				primes.add(i);
			}
		}
	}
	public void printPrimes()
	{
		System.out.println("There are " + primes.size() + " primes in this range. They are: ");
		for(int n : primes) {
			System.out.println(n);
		}
	}
	
}
public class M14_Primes
{
	public static void main(String args [ ])
	{
		//prompt user for bounds
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a lower bound: ");
		int low = in.nextInt();
		System.out.println("Enter an upper bound: ");
		int high = in.nextInt();
		
		//do calculations
		PrimesCalc obj = new PrimesCalc(low, high);
		obj.sieve();
		obj.printPrimes();
	}
}