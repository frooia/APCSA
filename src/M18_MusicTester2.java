/**
 * Purpose: To search for songs by title, year, and artist using binary search
 *
 * @author Lydia Chung
 * @version 06/10/2019
 *
 */
public class M18_MusicTester2
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
		mergeSortTitle(songs, 0, songs.length - 1);
		int high = songs.length;
		int low = -1;
		int probe;
		while (high - low > 1) {
			probe = (high + low) / 2;
			if (songs[probe].getTitle().equals(toFind)) {
				System.out.println(songs[probe]);
				return;
			}
			else if (songs[probe].getTitle().compareTo(toFind) > 0) {
				high = probe;
			}
			else {
				low = probe;
			}
		}
		System.out.println("Not found");
	}
	public static void searchYear(M18_Music [ ] songs, int toFind)
	{
		mergeSortYear(songs, 0, songs.length - 1);
		int high = songs.length;
		int low = -1;
		int probe;
		while (high - low > 1) {
			probe = (high + low) / 2;
			if (songs[probe].getYear() == toFind) {
				linearPrintYear(songs, probe, toFind);
				return;
			}
			else if (songs[probe].getYear() > toFind) {
				high = probe;
			}
			else {
				low = probe;
			}
		}
		System.out.println("Not found");
	}
	public static void linearPrintYear(M18_Music [ ] songs, int probe, int toFind) 
	{
		int i;
		int start = probe;
		int end = probe;
		i = probe - 1;
		while (i >= 0 && songs[i].getYear() == toFind) {
			start = i;
			i--;
		}
		i = probe + 1;
		while (i < songs.length && songs[i].getYear() == toFind) {
			end = i;
			i++;
		}
		for (int j = start; j <= end; j++) {
			System.out.println(songs[j]);
		}
	}
	public static void searchArtist(M18_Music [ ] songs, String toFind)
	{
		mergeSortArtist(songs, 0, songs.length - 1);
		int high = songs.length;
		int low = -1;
		int probe;
		while (high - low > 1) {
			probe = (high + low) / 2;
			if (songs[probe].getArtist().compareTo(toFind) == 0) {
				linearPrintArtist(songs, probe, toFind);
				return;
			}
			else if (songs[probe].getArtist().compareTo(toFind) > 0) {
				high = probe;
			}
			else {
				low = probe;
			}
		}
		System.out.println("Not found");
	}
	public static void linearPrintArtist(M18_Music [ ] songs, int probe, String toFind)
	{
		int i;
		int start = probe;
		int end = probe;
		i = probe - 1;
		while (i >= 0 && songs[i].getArtist().compareTo(toFind) == 0) {
			start = i;
			i--;
		}
		i = probe + 1;
		while (i < songs.length && songs[i].getArtist().compareTo(toFind) == 0) {
			end = i;
			i++;
		}
		for (int j = start; j <= end; j++) {
			System.out.println(songs[j]);
		}
	}
	public static void mergeSortTitle(M18_Music [ ] songs, int low, int high)
	{
		if (low == high) {
			return;
		}
		int mid = (low + high) / 2;
		mergeSortTitle(songs, low, mid);
		mergeSortTitle(songs, mid + 1, high);
		mergeTitle(songs, low, mid, high);
	}
	public static void mergeTitle(M18_Music [ ] songs, int low, int mid, int high)
	{
		M18_Music [ ] temp = new M18_Music [ high - low + 1 ];

        int i = low, j = mid + 1, n = 0;

        while( i <= mid || j <= high )
        {
            if( i > mid )
            {
                temp[ n ] = songs[ j ];
                j++;
            }
            else if( j > high )
            {
                temp[ n ] = songs[ i ];
                i++;
            }
            else if( songs[ i ].getTitle().compareTo(songs[ j ].getTitle()) < 0 )
            {
                temp[ n ] = songs[ i ];
                i++;
            }
            else
            {
                temp[ n ] = songs[ j ];
                j++;
            }
            n++;
        }

        for( int k = low ; k <= high ; k++ )
            songs[ k ] = temp[ k - low ];
	}
	public static void mergeSortYear(M18_Music [ ] songs, int low, int high)
	{
		if (low == high) {
			return;
		}
		int mid = (low + high) / 2;
		mergeSortYear(songs, low, mid);
		mergeSortYear(songs, mid + 1, high);
		mergeYear(songs, low, mid, high);
	}
	public static void mergeYear(M18_Music [ ] songs, int low, int mid, int high)
	{
		M18_Music [ ] temp = new M18_Music [ high - low + 1 ];

        int i = low, j = mid + 1, n = 0;

        while( i <= mid || j <= high )
        {
            if( i > mid )
            {
                temp[ n ] = songs[ j ];
                j++;
            }
            else if( j > high )
            {
                temp[ n ] = songs[ i ];
                i++;
            }
            else if( songs[ i ].getYear() < songs[ j ].getYear() )
            {
                temp[ n ] = songs[ i ];
                i++;
            }
            else
            {
                temp[ n ] = songs[ j ];
                j++;
            }
            n++;
        }

        for( int k = low ; k <= high ; k++ )
            songs[ k ] = temp[ k - low ];
	}
	public static void mergeSortArtist(M18_Music [ ] songs, int low, int high)
	{
		if (low == high) {
			return;
		}
		int mid = (low + high) / 2;
		mergeSortArtist(songs, low, mid);
		mergeSortArtist(songs, mid + 1, high);
		mergeArtist(songs, low, mid, high);
	}
	public static void mergeArtist(M18_Music [ ] songs, int low, int mid, int high)
	{
		M18_Music [ ] temp = new M18_Music [ high - low + 1 ];

        int i = low, j = mid + 1, n = 0;

        while( i <= mid || j <= high )
        {
            if( i > mid )
            {
                temp[ n ] = songs[ j ];
                j++;
            }
            else if( j > high )
            {
                temp[ n ] = songs[ i ];
                i++;
            }
            else if( songs[ i ].getArtist().compareTo(songs[ j ].getArtist()) < 0 )
            {
                temp[ n ] = songs[ i ];
                i++;
            }
            else
            {
                temp[ n ] = songs[ j ];
                j++;
            }
            n++;
        }

        for( int k = low ; k <= high ; k++ )
            songs[ k ] = temp[ k - low ];
	}
}