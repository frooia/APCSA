/**
 * The purpose of this program is to test the
 * Caesar cipher encryption and decryption classes.
 * @author Lydia Chung
 * @version 03/27/2019
 */
import java.util.Scanner;
public class M14_CaesarTester
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to the Caesar shift cipher machine.");
		System.out.println("Input a shift key from 0-25: ");
		int key = in.nextInt();
		M14_CaesarDecryption code = new M14_CaesarDecryption(key);
		M14_CaesarDecryption.setCipherbet();
		System.out.println("[1] Encrypt a message");
		System.out.println("[2] Decrypt a message");
		System.out.println("[3] Quit");
		int choice = in.nextInt();
		while (choice != 3) {
			//get key and print alphabets
			System.out.println("Regular alphabet:");
			M14_CaesarEncryption.printAlphabet();
			System.out.println("Cipher alphabet:");
			M14_CaesarDecryption.printCipherbet();
			//encryption
			if (choice == 1) {
				System.out.println("What message do you want to encrypt?");
				String [ ] message = (in.next() + in.nextLine()).split(" ");
				System.out.print("Encrypted message: ");
				for (String word : message) {
					M14_CaesarEncryption.encrypt(word);
				}
				System.out.println();
			}
			//decryption
			else if (choice == 2) {
				System.out.println("What message do you want to decrypt?");
				String [ ] message = (in.next() + in.nextLine()).split(" ");
				System.out.print("Decrypted message: ");
				for (String word : message) {
					M14_CaesarDecryption.decrypt(word);
				}
				System.out.println();
			}
			//display menu again
			System.out.println("Do it again!");
			System.out.println("[1] Encrypt a message");
			System.out.println("[2] Decrypt a message");
			System.out.println("[3] Quit");
			choice = in.nextInt();
		}
		System.out.println("Thank you for using the Caesar cipher!");
	}
}