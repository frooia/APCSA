/**
 * The purpose of this program is to generate 
 * passwords from a character set chosen by the user.
 * 
 * @author Lydia Chung
 * @version 19/08/2018
 */
import java.util.Scanner;
import java.util.Random;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
public class M05_PasswordGenerator
{
	public static void main(String [ ] args) throws IOException
	{
		//introduction
		System.out.println("Random Password Generator");
		System.out.println("*************************");
		System.out.println("Choose a character set that you wish your password to contain: ");
		String menu = "(1) Lowercase letters\n(2) Uppercase and lowercase letters\n(3) Uppercase and numbers\n(4) Lowercase and numbers\n(5) All of the above\n(6) Quit";
		System.out.println(menu);
		
		//create scanner and file
		File passwords = new File("passwords.txt");
		PrintWriter file = new PrintWriter(passwords);
		Scanner in = new Scanner(System.in);
		int charSet = in.nextInt();
		
		//constants
		int offset0 = 48; //beginning of ASCII numbers
		int offset1 = 7; //between numbers and uppercase
		int offset2 = 6; //between uppercase and lowercase
		int offset3 = 39; //between numbers and lowercase
		int offset4 = 65; //start of uppercase letters
		int offset5 = 97; //start of lowercase letters
		
		while (charSet != 6) {
			if ((charSet <= 5 && charSet >= 1) || (charSet == 6)) {
				System.out.println("How many characters do you want in your password? (6 or more) ");
				int length = in.nextInt();
				if (length >= 6) {
					for (int i = 1; i <= length; i++) {
						Random randNumList = new Random();
						int randomNum;
						int randomChar = 0;
						if (charSet == 1) {
							//lowercase only
							randomNum = randNumList.nextInt(26);
							randomChar = randomNum + offset5;
						}
						else if (charSet == 2) {
							//upper and lowercase
							randomNum = randNumList.nextInt(52);
							if (randomNum < 26) {
								//upper
								randomChar = randomNum + offset4;
							}
							else if (randomNum >= 26) {
								//lower
								randomChar = randomNum + offset4 + offset2; 
							}
						}
						else if (charSet == 3) {
							//upper and numbers
							randomNum = randNumList.nextInt(36);
							if (randomNum < 10) {
								//numbers
								randomChar = randomNum + offset0;
							}
							else if (randomNum >= 10) {
								//uppercase
								randomChar = randomNum + offset0 + offset1;
							}
						}
						else if (charSet == 4) {
							//lower and numbers
							randomNum = randNumList.nextInt(36);
							if (randomNum < 10) {
								//numbers
								randomChar = randomNum + offset0;
							}
							else if (randomNum >= 10) {
								//lowercase
								randomChar = randomNum + offset0 + offset3;
							}
						}
						else if (charSet == 5) {
							//upper, lower, and numbers
							randomNum = randNumList.nextInt(62);
							if (randomNum < 10) {
								//numbers
								randomChar = randomNum + offset0;
							}
							else if (randomNum >= 10 && randomNum < 36) {
								//uppercase
								randomChar = randomNum + offset0 + offset1;
							}
							else if (randomNum >= 36) {
								//lowercase
								randomChar = randomNum + offset0 + offset1 + offset2;
							}
						}
						file.print((char)randomChar);
					}
					file.println();
					
					//repeat until quit
					System.out.println("Create another password! Choose a character set:\n" + menu);
					charSet = in.nextInt();
				}
				else {
					System.out.println("Sorry, your password is too short. Please try again.");
				}
			}
			else {
				System.out.println("Sorry, your input is invalid. Please try again.");
			}
		}
		
		file.close();
		System.out.println("Thank you for using the password generator! Your passwords are: ");
		in = new Scanner(passwords);
		String token;
		while (in.hasNext()) {
			token = in.next();
			System.out.println(token);
		}
		
	}
}