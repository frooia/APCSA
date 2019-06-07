/**
 * Purpose: A class to display and sort M17_Movie objects in an array
 * using the selection sort algorithm.
 *
 * @author Lydia Chung
 * @version 06/04/2019
 *
 */
public class M17_MovieTester2
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
		selectionSortTitle(movies, 1);
		printMovies(movies);
		System.out.println("\n<< Sort in descending order by title >>\n");
		selectionSortTitle(movies, 2);
		printMovies(movies);
		System.out.println("\n<< Sort in ascending order by year >>\n");
		selectionSortYear(movies, 1);
		printMovies(movies);
		System.out.println("\n<< Sort in descending order by year >>\n");
		selectionSortYear(movies, 2);
		printMovies(movies);
		System.out.println("\n<< Sort in ascending order by studio >>\n");
		selectionSortStudio(movies, 1);
		printMovies(movies);
		System.out.println("\n<< Sort in descending order by studio >>\n");
		selectionSortStudio(movies, 2);
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
	public static void selectionSortTitle(M17_Movie [ ] movies, int param)
	{
		if (param == 1) {
			int i;
	        int k;
	        int posMax;
	        M17_Movie temp;

	        for ( i = movies.length - 1 ; i >= 0 ; i-- )
	        {
	            // find largest element in the i elements
	            posMax = 0;
	            for ( k = 0 ; k <= i ; k++ )
	            {
	                if ( movies[ k ].getTitle().compareTo(movies[ posMax ].getTitle()) > 0)
	                    posMax = k;
	            }
	            temp = movies[ i ];
	            movies[ i ] = movies[posMax ];
	            movies[ posMax ] = temp;
	        }
		}
		else if (param == 2) {
			int i;
	        int k;
	        int posMax;
	        M17_Movie temp;

	        for ( i = movies.length - 1 ; i >= 0 ; i-- )
	        {
	            // find largest element in the i elements
	            posMax = 0;
	            for ( k = 0 ; k <= i ; k++ )
	            {
	                if ( movies[ k ].getTitle().compareTo(movies[ posMax ].getTitle()) < 0)
	                    posMax = k;
	            }
	            temp = movies[ i ];
	            movies[ i ] = movies[posMax ];
	            movies[ posMax ] = temp;
	        }
		}
	}
	public static void selectionSortYear(M17_Movie [ ] movies, int param) 
	{
		if (param == 1) {
			int i;
	        int k;
	        int posMax;
	        M17_Movie temp;

	        for ( i = movies.length - 1 ; i >= 0 ; i-- )
	        {
	            // find largest element in the i elements
	            posMax = 0;
	            for ( k = 0 ; k <= i ; k++ )
	            {
	                if ( movies[ k ].getYear() > movies[ posMax ].getYear())
	                    posMax = k;
	            }
	            temp = movies[ i ];
	            movies[ i ] = movies[posMax ];
	            movies[ posMax ] = temp;
	        }
		}
		else if (param == 2) {
			int i;
	        int k;
	        int posMax;
	        M17_Movie temp;

	        for ( i = movies.length - 1 ; i >= 0 ; i-- )
	        {
	            // find largest element in the i elements
	            posMax = 0;
	            for ( k = 0 ; k <= i ; k++ )
	            {
	                if ( movies[ k ].getYear() < movies[ posMax ].getYear())
	                    posMax = k;
	            }
	            temp = movies[ i ];
	            movies[ i ] = movies[posMax ];
	            movies[ posMax ] = temp;
	        }
		}
	}
	public static void selectionSortStudio(M17_Movie [ ] movies, int param)
	{
		if (param == 1) {
			int i;
	        int k;
	        int posMax;
	        M17_Movie temp;

	        for ( i = movies.length - 1 ; i >= 0 ; i-- )
	        {
	            // find largest element in the i elements
	            posMax = 0;
	            for ( k = 0 ; k <= i ; k++ )
	            {
	                if ( movies[ k ].getStudio().compareTo(movies[ posMax ].getStudio()) > 0)
	                    posMax = k;
	            }
	            temp = movies[ i ];
	            movies[ i ] = movies[posMax ];
	            movies[ posMax ] = temp;
	        }
		}
		else if (param == 2) {
			int i;
	        int k;
	        int posMax;
	        M17_Movie temp;

	        for ( i = movies.length - 1 ; i >= 0 ; i-- )
	        {
	            // find largest element in the i elements
	            posMax = 0;
	            for ( k = 0 ; k <= i ; k++ )
	            {
	                if ( movies[ k ].getStudio().compareTo(movies[ posMax ].getStudio()) < 0)
	                    posMax = k;
	            }
	            temp = movies[ i ];
	            movies[ i ] = movies[posMax ];
	            movies[ posMax ] = temp;
	        }
		}
	}
}