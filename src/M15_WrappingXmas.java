/**
 * This is a class with methods for Christmas wrapping paper.
 * 
 * @version 05/12/2019
 * @author Lydia Chung
 */
public class M15_WrappingXmas extends M15_Wrapping
{
	private String name;
	private double cost;
	public M15_WrappingXmas()
	{
		super();
		cost = 0;
		name = "none";
	}
	@Override
	public void setName() 
	{
		super.name = "Christmas";
	}
	public void setCost() 
	{
		super.cost = 3.99;
	}
}