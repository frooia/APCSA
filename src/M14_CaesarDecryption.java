/**
 * The purpose of this program is to decrypt messages
 * with a Caesar cipher.
 * @author Lydia Chung
 * @version 03/27/2019
 */
public class M14_CaesarDecryption extends M14_CaesarEncryption
{
	private static int myKey;
	private static char [ ] cipherbet = new char[26];
	public M14_CaesarDecryption(int key)
	{
		super(-key);
		myKey = 26 - key;
	}
	public static void setCipherbet()
	{
		for (int i = 0; i < 26; i++) {
			cipherbet[i] = (char)(((alphabet[i] + myKey) - 97) % 26 + 97);
		}
	}
	public static void printCipherbet()
	{
		for (char letter : cipherbet) {
			System.out.print(letter + " ");
		}
		System.out.println();
	}
	public static void decrypt(String word) 
	{
		encrypt(word, myKey);
	}
}