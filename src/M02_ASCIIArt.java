/**
 * This program prints a drawing of a large W using W ASCII characters.
 * @author Lydia Chung
 * @version 04/06/2018
 * 
 */
public class M02_ASCIIArt
{
	public static void main(String[ ] args)
	{
		String row01 = "WWW\t\t\t\tWWW\n";
		String row02 = " WWW\t\t\t       WWW\n";
		String row03 = "  WWW\t\t\t      WWW\n";
		String row04 = "   WWW\t\t\t     WWW\n";
		String row05 = "    WWW\t\t\t    WWW\n";
		String row06 = "     WWW\t\t   WWW\n";
		String row07 = "      WWW       WWWW      WWW\n";
		String row08 = "       WWW     WWWWWW    WWW\n";
		String row09 = "        WWWWWWWW   WWWWWWWW\n";
		String row10 = "         WWWWW\t     WWWWW";
		String name = "\tLydia Chung";
		System.out.print(row01 + row02 + row03 + row04 + row05 + row06 + row07 + row08 + row09 + row10 + name);
	}
}