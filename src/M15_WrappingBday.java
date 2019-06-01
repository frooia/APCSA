/**
 * This is a class with methods for birthday wrapping paper.
 * 
 * @version 05/12/2019
 * @author Lydia Chung
 */
public class M15_WrappingBday extends M15_Wrapping
{
	private String name;
	private double cost;
	public M15_WrappingBday()
	{
		super();
		cost = 0;
		name = "none";
	}
	public void setName() 
	{
		super.name = "birthday";
	}
	public void setCost()
	{
		super.cost = 2.99;
	}
}