/**
 * This is a class with methods for hammers.
 * 
 * @version 05/12/2019
 * @author Lydia Chung
 */
public class M15_Hammer implements M15_Product, Comparable<M15_Hammer>
{
	private String name;
	private double cost;
	public M15_Hammer()
	{
		cost = 0;
		name = "none";
	}
	public String getName()
	{
		return name;
	}
	public void setName() 
	{
		name = "hammer";
	}
	public double getCost()
	{
		return cost;
	}
	public void setCost()
	{
		cost = 10.89;
	}
	public void setCost(double cost)
	{
		this.cost = cost;
	}
	public int compareTo(M15_Hammer o)
	{
		if (this.getCost() == o.getCost()) {
			return 0;
		}
		else if (this.getCost() > o.getCost()) {
			return 1;
		}
		else {
			return -1;
		}
	}
}