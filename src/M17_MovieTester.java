/**
 * Purpose: A class to display and sort M17_Movie objects in an array.
 *
 * @author Lydia Chung
 * @version 06/04/2019
 *
 */
public class M17_MovieTester
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
		insertSortTitle(movies, 1);
		printMovies(movies);
		System.out.println("\n<< Sort in descending order by title >>\n");
		insertSortTitle(movies, 2);
		printMovies(movies);
		System.out.println("\n<< Sort in ascending order by year >>\n");
		insertSortYear(movies, 1);
		printMovies(movies);
		System.out.println("\n<< Sort in descending order by year >>\n");
		insertSortYear(movies, 2);
		printMovies(movies);
		System.out.println("\n<< Sort in ascending order by studio >>\n");
		insertSortStudio(movies, 1);
		printMovies(movies);
		System.out.println("\n<< Sort in descending order by studio >>\n");
		insertSortStudio(movies, 2);
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
	public static void insertSortTitle(M17_Movie [ ] movies, int param)
	{
		if (param == 1) {
			for( int i = 0 ; i < movies.length ; i++ )
	        {
	            M17_Movie next = movies[ i ];
	            int insertIndex = 0;
	            int k = i;
	            while( k > 0 && insertIndex == 0 )
	            {
	                if( next.getTitle().compareTo(movies[k-1].getTitle()) > 0)
	                {
	                    insertIndex = k;
	                }
	                else
	                {
	                    movies[ k ] = movies[ k - 1 ];
	                }
	                k--;
	            }

	            movies[ insertIndex ] = next;
	        }
		}
		else if (param == 2) {
			for( int i = 0 ; i < movies.length ; i++ )
	        {
	            M17_Movie next = movies[ i ];
	            int insertIndex = 0;
	            int k = i;
	            while( k > 0 && insertIndex == 0 )
	            {
	                if( next.getTitle().compareTo(movies[k-1].getTitle()) < 0)
	                {
	                    insertIndex = k;
	                }
	                else
	                {
	                    movies[ k ] = movies[ k - 1 ];
	                }
	                k--;
	            }

	            movies[ insertIndex ] = next;
	        }
		}
	}
	public static void insertSortYear(M17_Movie [ ] movies, int param)
	{
		if (param == 1) {
			for( int i = 0 ; i < movies.length ; i++ )
	        {
	            M17_Movie next = movies[ i ];
	            int insertIndex = 0;
	            int k = i;
	            while( k > 0 && insertIndex == 0 )
	            {
	                if(next.getYear() > movies[k-1].getYear())
	                {
	                    insertIndex = k;
	                }
	                else
	                {
	                    movies[ k ] = movies[ k - 1 ];
	                }
	                k--;
	            }

	            movies[ insertIndex ] = next;
	        }
		}
		else if (param == 2) {
			for( int i = 0 ; i < movies.length ; i++ )
	        {
	            M17_Movie next = movies[ i ];
	            int insertIndex = 0;
	            int k = i;
	            while( k > 0 && insertIndex == 0 )
	            {
	                if(next.getYear() < movies[k-1].getYear())
	                {
	                    insertIndex = k;
	                }
	                else
	                {
	                    movies[ k ] = movies[ k - 1 ];
	                }
	                k--;
	            }

	            movies[ insertIndex ] = next;
	        }
		}
	}
	public static void insertSortStudio(M17_Movie [ ] movies, int param)
	{
		if (param == 1) {
			for( int i = 0 ; i < movies.length ; i++ )
	        {
	            M17_Movie next = movies[ i ];
	            int insertIndex = 0;
	            int k = i;
	            while( k > 0 && insertIndex == 0 )
	            {
	                if( next.getStudio().compareTo(movies[k-1].getStudio()) > 0)
	                {
	                    insertIndex = k;
	                }
	                else
	                {
	                    movies[ k ] = movies[ k - 1 ];
	                }
	                k--;
	            }

	            movies[ insertIndex ] = next;
	        }
		}
		else if (param == 2) {
			for( int i = 0 ; i < movies.length ; i++ )
	        {
	            M17_Movie next = movies[ i ];
	            int insertIndex = 0;
	            int k = i;
	            while( k > 0 && insertIndex == 0 )
	            {
	                if( next.getStudio().compareTo(movies[k-1].getStudio()) < 0)
	                {
	                    insertIndex = k;
	                }
	                else
	                {
	                    movies[ k ] = movies[ k - 1 ];
	                }
	                k--;
	            }

	            movies[ insertIndex ] = next;
	        }
		}
	}
}