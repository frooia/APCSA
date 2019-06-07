/**
 * This program is for item objects that include a name, product number, price, and quantity.
 * 
 * @author Lydia Chung
 * @version 06/06/2019
 */
import java.text.DecimalFormat;
public class M17_Item
{
	private static DecimalFormat df = new DecimalFormat("0.00");
	private String name;
	private int productNum;
	private double price;
	private int quantity;
	public M17_Item (String name, int productNum, double price, int quantity)
	{
		this.name = name;
		this.productNum = productNum;
		this.price = price;
		this.quantity = quantity;
	}
	public String getName()
	{
		return name;
	}
	public int getNum()
	{
		return productNum;
	}
	public double getPrice()
	{
		return price;
	}
	public int getQuantity() 
	{
		return quantity;
	}
	public String toString()
	{
		String costString = "$" + df.format(price);
		return String.format("%-20s %4d %9s %6d", name, productNum, costString, quantity);
	}
}