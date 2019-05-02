/**
 * This is a class for Computer Science homework assignments.
 * 
 * @author Lydia Chung
 * @version 05/01/2019
 */
public class M15_HomeworkCSA extends M15_Homework
{
	private int pages;
	private String type;
	public M15_HomeworkCSA()
	{
		super();
	}
	public void createAssignment(int pages)
	{
		type = "AP Computer Science A";
		this.pages = pages;
	}
}