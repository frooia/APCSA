/**
 * The purpose of this program is to test the M14_FrequencyDecoding class.
 * 
 * Decoded message: 
 * first i believe that this nation should commit itself to achieving 
 * the goal before this decade is out of landing a man on the moon and 
 * returning him safely to the earth
 * 
 * Answers to evaluation questions:
 * 1. I had difficulty getting the computer to scan the files correctly every time. I had to refer
 * to old programs for using the File and PrintWriter classes.
 * 2. The frequencies of letters in the plaintext and ciphertext corresponded quite accurately. If
 * larger plaintext and ciphertext samples was used, they would correspond closer to the actual 
 * distributions of letters and to each other.
 * 3. A possible solution is to use a statistical analysis method like a chi squared test to 
 * determine the fit for each combination of letters. A possible model can be constructed by 
 * ordering the letters of ciphertext from highest frequency to lowest and then comparing it to
 * the plaintext model with a chi squared test. Multiple models may be constructed, and the model 
 * with the lowest deviation will be used as the key to decode the message. 
 * 
 * @author Lydia Chung
 * @version 04/22/2019
 */
import java.util.*;
import java.io.*;
public class M14_FrequencyDecodingTester
{
	public static void main(String [ ] args) throws IOException
	{
		//prompt user for file input
		System.out.println("This program will find the percent frequency of each letter in a plain text document.");
		System.out.println("Name of plain text document (no extension): ");
		Scanner in = new Scanner(System.in);
		String fileName = in.next();
		File subset = new File(fileName + ".txt");
		in = new Scanner(subset);
		File frequencies = new File(fileName + "Freq.txt");
		
		//calculate frequencies
		M14_FrequencyDecoding obj = new M14_FrequencyDecoding(subset, frequencies);
		obj.calcFrequencies(frequencies);
		in = new Scanner(frequencies);
		String token;
		while (in.hasNext()) {
			token = in.next() + in.nextLine();
			System.out.println(token);
		}
	}
}
//Decrypt Key: IPJQKSCUTWAXBMFVHYLGZDNROE
//Encrypt Key: KMGVZOTQACESNWYBDXFIHPJLRU