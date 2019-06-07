/**
 * Purpose: A class to display and sort M17_Movie objects in an array
 * using the merge sort algorithm.
 *
 * @author Lydia Chung
 * @version 06/06/2019
 *
 */
public class M17_MovieTester3
{
	public static void main(String [ ] args)
	{
		//declare array of movies
		M17_Movie [ ] movies = new M17_Movie [ ] {
				new M17_Movie("Spectre", 2015, "Eon Productions"),
				new M17_Movie("The Hitman's Bodyguard", 2017, "Millenium Films"),
				new M17_Movie("Tomb Raider", 2018, "Metro-Goldwyn-Meyer"),
				new M17_Movie("Deadpool", 2016, "Marvel Studios"),
				new M17_Movie("It", 2017, "Lin Pictures"),
				new M17_Movie("Avengers: Endgame", 2019, "Marvel Studios"),
				new M17_Movie("Skyfall", 2012, "Columbia Pictures"),
				new M17_Movie("The Girl Who Leapt Through Time", 2006, "Madhouse"),
				new M17_Movie("Snow White and the Seven Dwarves", 1937, "Walt Disney Productions"),
				new M17_Movie("Pacific Rim", 2013, "Legendary Pictures")
		};
		
		//methods
		System.out.println("Original Movie List:");
		printMovies(movies);
		System.out.println("\n<< Sort in ascending order by title >>\n");
		mergeSortTitle(movies, 0, movies.length - 1);
		printMovies(movies);
		System.out.println("\n<< Sort in ascending order by year >>\n");
		mergeSortYear(movies, 0, movies.length - 1);
		printMovies(movies);
		System.out.println("\n<< Sort in ascending order by studio >>\n");
		mergeSortStudio(movies, 0, movies.length - 1);
		printMovies(movies);
		
	}
	public static void printMovies(M17_Movie [ ] movies)
	{
		System.out.printf("%-35s %4s   %-20s", "Title", "Year", "Studio");
		System.out.println("\n" + "---------------------------------------------------------------------");
		for (M17_Movie movie : movies) {
			System.out.println(movie);
		}
	}
	public static void mergeSortTitle(M17_Movie [ ] movies, int low, int high)
	{
		if (low == high) {
			return;
		}
		int mid = (low + high) / 2;
		mergeSortTitle(movies, low, mid);
		mergeSortTitle(movies, mid + 1, high);
		mergeTitle(movies, low, mid, high);
	}
	public static void mergeTitle(M17_Movie [ ] movies, int low, int mid, int high)
	{
		M17_Movie [ ] temp = new M17_Movie [ high - low + 1 ];

        int i = low, j = mid + 1, n = 0;

        while( i <= mid || j <= high )
        {
            if( i > mid )
            {
                temp[ n ] = movies[ j ];
                j++;
            }
            else if( j > high )
            {
                temp[ n ] = movies[ i ];
                i++;
            }
            else if( movies[ i ].getTitle().compareTo(movies[ j ].getTitle()) < 0 )
            {
                temp[ n ] = movies[ i ];
                i++;
            }
            else
            {
                temp[ n ] = movies[ j ];
                j++;
            }
            n++;
        }

        for( int k = low ; k <= high ; k++ )
            movies[ k ] = temp[ k - low ];
	}
	public static void mergeSortYear(M17_Movie [ ] movies, int low, int high)
	{
		if (low == high) {
			return;
		}
		int mid = (low + high) / 2;
		mergeSortYear(movies, low, mid);
		mergeSortYear(movies, mid + 1, high);
		mergeYear(movies, low, mid, high);
	}
	public static void mergeYear(M17_Movie [ ] movies, int low, int mid, int high)
	{
		M17_Movie [ ] temp = new M17_Movie [ high - low + 1 ];

        int i = low, j = mid + 1, n = 0;

        while( i <= mid || j <= high )
        {
            if( i > mid )
            {
                temp[ n ] = movies[ j ];
                j++;
            }
            else if( j > high )
            {
                temp[ n ] = movies[ i ];
                i++;
            }
            else if( movies[ i ].getYear() < movies[ j ].getYear() )
            {
                temp[ n ] = movies[ i ];
                i++;
            }
            else
            {
                temp[ n ] = movies[ j ];
                j++;
            }
            n++;
        }

        for( int k = low ; k <= high ; k++ )
            movies[ k ] = temp[ k - low ];
	}
	public static void mergeSortStudio(M17_Movie [ ] movies, int low, int high)
	{
		if (low == high) {
			return;
		}
		int mid = (low + high) / 2;
		mergeSortStudio(movies, low, mid);
		mergeSortStudio(movies, mid + 1, high);
		mergeStudio(movies, low, mid, high);
	}
	public static void mergeStudio(M17_Movie [ ] movies, int low, int mid, int high)
	{
		M17_Movie [ ] temp = new M17_Movie [ high - low + 1 ];

        int i = low, j = mid + 1, n = 0;

        while( i <= mid || j <= high )
        {
            if( i > mid )
            {
                temp[ n ] = movies[ j ];
                j++;
            }
            else if( j > high )
            {
                temp[ n ] = movies[ i ];
                i++;
            }
            else if( movies[ i ].getStudio().compareTo(movies[ j ].getStudio()) < 0 )
            {
                temp[ n ] = movies[ i ];
                i++;
            }
            else
            {
                temp[ n ] = movies[ j ];
                j++;
            }
            n++;
        }

        for( int k = low ; k <= high ; k++ )
            movies[ k ] = temp[ k - low ];
	}
}