/**
 * This is an abstract class that acts as a template for homework assignments.
 * 
 * @author Lydia Chung
 * @version 05/08/2019
 */
public abstract class M15_Homework implements M15_HomeworkDo, Comparable<M15_Homework>
{
	private int pages;
	private String type;
	public M15_Homework()
	{
		pages = 0;
		type = "none";
	}
	
	public abstract void createAssignment(int pages);
	public abstract void doHW(int pgRead);
	
	public int getPages()
	{
		return pages;
	}
	
	public void setPages(int pages)
	{
		this.pages = pages;
	}
	public String getType() 
	{
		return type;
	}
	public void setType(String type) 
	{
		this.type = type;
	}
	public String toString()
	{
		return type + " homework: read " + pages + " pages";
	}
	public int compareTo(M15_Homework o)
	{
		if (o.getPages() == this.getPages()) {
			return 0;
		}
		else if (o.getPages() > this.getPages()) {
			return -1;
		}
		else {
			return 1;
		}
	}
}