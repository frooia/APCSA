/**
 * This is a class for Computer Science homework assignments.
 * 
 * @author Lydia Chung
 * @version 05/08/2019
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
		this.setType("AP Computer Science A");
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