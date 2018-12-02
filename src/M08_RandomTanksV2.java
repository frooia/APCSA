/**
 * The purpose of this program is to generate
 * a random tank type and have the user produce
 * a certain number of them.
 * 
 * @author Lydia Chung
 * @version 12/02/2018
 * 
 */
public class M08_RandomTanksV2
{
	private int tankWeight;
	private String tankColor;
	private double tankCaliber;
	private String tankType;
	
	public M08_RandomTanksV2(int weight, String color, double caliber, String type) //constructor
	{
		tankWeight = weight;
		tankColor = color;
		tankCaliber = caliber;
		tankType = type;
	}
	
	//get methods
	public int getWeight()
	{
		return tankWeight;
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
}