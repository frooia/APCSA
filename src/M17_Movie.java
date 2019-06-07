/**
 * Purpose: A class for movies with year, title, and studio.
 *
 * @author Lydia Chung
 * @version 06/06/2019
 *
 */
public class M17_Movie
{
    // instance variables
    private int year;
    private String title;
    private String studio;

    // Constructor for objects of class Movie
    public M17_Movie(String title, int year, String studio)
    {
        // initialize instance variables
        this.title = title;
        this.year = year;
        this.studio = studio;
    }

    public String getTitle()
    {
        return title;
    }
    
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    public String getStudio()
    {
        return studio;
    }
    
    public void setStudio(String studio)
    {
        this.studio = studio;
    }
    
    public int getYear()
    {
        return year;
    }
   
    public void setYear(int year)
    {
        this.year = year;
    }
   
    public String toString()
    {
        String str = String.format("%-35s %4d   %-20s", title, year, studio);
        return str;
    }
}