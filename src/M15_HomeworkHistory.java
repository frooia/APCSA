/**
 * This is a class for History homework assignments.
 * 
 * @author Lydia Chung
 * @version 05/01/2019
 */
public class M15_HomeworkHistory extends M15_Homework
{
	private int pages;
	private String type;
	public M15_HomeworkHistory()
	{
		super();
		pages = 0;
		type = "none";
	}
	public void createAssignment(int pages)
	{
		type = "History";
		this.pages = pages;
	}
}