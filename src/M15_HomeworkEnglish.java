/**
 * This is a class for English homework assignments.
 * 
 * @author Lydia Chung
 * @version 05/08/2019
 */
public class M15_HomeworkEnglish extends M15_Homework
{
	private int pages;
	private String type;
	public M15_HomeworkEnglish()
	{
		super();
		pages = 0;
		type = "none";
	}
	public void createAssignment(int pages)
	{
		this.setType("English");
		this.setPages(pages);
	}
	public String toString()
	{
		return getType() + " homework: read " + getPages() + " pages";
	}
	@Override
	public void doHW(int pgRead) {
		pages -= pgRead;
	}
}