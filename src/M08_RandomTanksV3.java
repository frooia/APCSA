/**
 * The purpose of this program is to use tank objects
 * and have the user produce a certain number of them.
 * 
 * @author Lydia Chung
 * @version 12/17/2018
 * 
 */
public class M08_RandomTanksV3
{
	private int tankWeight, tankNumber;
	private String tankColor;
	private double tankCaliber;
	private String tankType, tankFormation, tankUse, tankSize;
	
	public M08_RandomTanksV3(int weight, String color, double caliber, String type) //constructor
	{
		tankWeight = weight;
		tankColor = color;
		tankCaliber = caliber;
		tankType = type;
		tankNumber = 0;
	}
	
	//getter methods
	public int getWeight()
	{
		return tankWeight;
	}
	public int getNumber()
	{
		return tankNumber;
	}
	public String getColor() 
	{
		return tankColor;
	}
	public double getCaliber()
	{
		return tankCaliber;
	}
	public String getType()
	{
		return tankType;
	}
	public String getFormation()
	{
		return tankFormation;
	}
	public String getUse()
	{
		return tankUse;
	}
	public String getSize()
	{
		return tankSize;
	}
	
	//setter methods
	public void setNumber(int number)
	{
		tankNumber = number;
	}
	public void setFormation(String formation) 
	{
		tankFormation = formation;
	}
	public void setUse(String use)
	{
		tankUse = use;
	}
	public void setSize(String size)
	{
		tankSize = size;
	}
	
	public String unitSize(int size) //labels size of formation
	{
		if (size < 4) {
			return "platoon";
		}
		else if (size < 14) {
			return "company";
		}
		else if (size < 44) {
			return "battalion";
		}
		else if (size < 130) {
			return "brigade";
		}
		else if (size < 550) {
			return "division";
		}
		else {
			return "army";
		}
	}
	public String tankPurpose(int weight) 
	{
		if (weight < 20) {
			return "scouting";
		}
		else if (weight < 40) {
			return "battle";
		}
		else {
			return "spearhead";
		}
	}
	public String tankPurpose(double caliber) 
	{
		if (caliber < 50) {
			return "light";
		}
		else if (caliber < 100) {
			return "medium";
		}
		else {
			return "heavy";
		}
	}
	
	//print String
	public String toString()
	{
		return String.format("%-10s %-12s %-10s %-7s %-6d", tankType, tankFormation, tankUse, tankSize, tankNumber);
	}
}