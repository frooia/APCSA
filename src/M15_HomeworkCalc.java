/**
 * This is a class for Calculus homework assignments.
 * 
 * @author Lydia Chung
 * @version 05/01/2019
 */
public class M15_HomeworkCalc extends M15_Homework
{
	private int pages;
	private String type;
	public M15_HomeworkCalc()
	{
		super();
		pages = 0;
		type = "none";
	}
	public void createAssignment(int pages)
	{
		type = "Calculus";
		this.pages = pages;
	}
}