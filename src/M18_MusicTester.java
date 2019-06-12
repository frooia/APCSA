/**
 * Purpose: To search for songs by title, year, and artist
 *
 * @author Lydia Chung
 * @version 06/07/2019
 *
 */
public class M18_MusicTester
{
	public static void main(String [ ] args) 
	{
		//declare array and initialize objects
		M18_Music [ ] songs = {
				new M18_Music("The Twist", 1960, "Chubby Checker"),
				new M18_Music("Uptown Funk!", 2015, "Mark Ronson"),
				new M18_Music("I Gotta Feeling", 2009, "The Black Eyed Peas"),
				new M18_Music("Shape of You", 2017, "Ed Sheeran"),
				new M18_Music("Closer", 2016, "Chainsmokers"),
				new M18_Music("Hey Jude", 1968, "The Beatles"),
				new M18_Music("Blank Space", 2014, "Taylor Swift"),
				new M18_Music("Bad Liar", 2017, "Selena Gomez"),
				new M18_Music("The Spectre", 2017, "Alan Walker"),
				new M18_Music("Look What You Made Me Do", 2017, "Taylor Swift"),
		};
		
		//methods
		System.out.println("Original list:");
		printArray(songs);
		System.out.println("\n<< Find Uptown Funk! >>\n");
		searchTitle(songs, "Uptown Funk!");
		System.out.println("\n<< Find Bad Blood >>\n");
		searchTitle(songs, "Bad Blood");
		System.out.println("\n<< Find all 2017 songs >>\n");
		searchYear(songs, 2017);
		System.out.println("\n<< Find all 1991 songs >>\n");
		searchYear(songs, 1991);
		System.out.println("\n<< Find all Taylor Swift songs >>\n");
		searchArtist(songs, "Taylor Swift");
		System.out.println("\n<< Find all Charlie Puth songs >>\n");
		searchArtist(songs, "Charlie Puth");
	}
	public static void printArray(M18_Music [ ] songs) {
		System.out.printf("%-25s %4s   %-20s", "Title", "Year", "Artist");
		System.out.println("\n" + "---------------------------------------------------------------------");
		for (M18_Music song : songs) {
			System.out.println(song);
		}
	}
	public static void searchTitle(M18_Music [ ] songs, String toFind)
	{
		for (M18_Music song : songs) {
			if (song.getTitle().equals(toFind)) {
				System.out.println(song);
				return;
			}
		}
		System.out.println("Not found");
	}
	public static void searchYear(M18_Music [ ] songs, int toFind)
	{
		int count = 0;
		for (M18_Music song : songs) {
			if (song.getYear() == toFind) {
				System.out.println(song);
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Not found");
		}
	}
	public static void searchArtist(M18_Music [ ] songs, String toFind)
	{
		int count = 0;
		for (M18_Music song : songs) {
			if (song.getArtist().equals(toFind)) {
				System.out.println(song);
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Not found");
		}
	}
}