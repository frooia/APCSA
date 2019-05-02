/**
 * This is an abstract class that acts as a template for homework assignments.
 * 
 * @author Lydia Chung
 * @version 05/01/2019
 */
public abstract class M15_Homework
{
	private int pages;
	private String type;
	public M15_Homework()
	{
		pages = 0;
		type = "none";
	}
	
	public abstract void createAssignment(int pages);
	
	public int getPages()
	{
		return pages;
	}
	
	public void setPages(int pages)
	{
		this.pages = pages;
	}
	
	public String toString()
	{
		return type + " homework: read " + pages + " pages";
	}
}