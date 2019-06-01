/**
 * This is an abstract class with methods for wrapping paper.
 * 
 * @version 05/12/2019
 * @author Lydia Chung
 */
public abstract class M15_Wrapping implements M15_Product
{
	public String name;
	public double cost;
	public M15_Wrapping() 
	{
		cost = 0;
		name = "none";
	}
	public String getName()
	{
		return name;
	}
	public abstract void setName();
	public abstract void setCost();
	public double getCost()
	{
		return cost;
	}
}