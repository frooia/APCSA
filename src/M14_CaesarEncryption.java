/**
 * The purpose of this program is to encrypt messages
 * with a Caesar cipher.
 * @author Lydia Chung
 * @version 03/27/2019
 */
public class M14_CaesarEncryption
{
	private static int myKey;
	public static final char [ ] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
	private static char [ ] cipherbet = new char[26];
	public M14_CaesarEncryption(int key)
	{
		myKey = 26 - key;
	}
	public static void setCipherbet()
	{
		for (int i = 0; i < 26; i++) {
			cipherbet[i] = (char)(((alphabet[i] + myKey) - 97) % 26 + 97);
		}
	}
	public static void printAlphabet()
	{
		for (char letter : alphabet) {
			System.out.print(letter + " ");
		}
		System.out.println();
	}
	public static void printCipherbet()
	{
		for (char letter : cipherbet) {
			System.out.print(letter + " ");
		}
		System.out.println();
	}
	public static void encrypt(String word) 
	{
		char [ ] message = word.toCharArray();
		String coded = "";
		for (int j = 0; j < message.length; j++) {
			coded += (char)(((message[j] - 97 + myKey) % 26) + 97);
		}
		System.out.print(coded + " ");
	}
	public static void encrypt(String word, int key) 
	{
		char [ ] message = word.toCharArray();
		String coded = "";
		for (int j = 0; j < message.length; j++) {
			coded += (char)(((message[j] - 97 + key) % 26) + 97);
		}
		System.out.print(coded + " ");
	}
}

