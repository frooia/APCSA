/**
 * This class creates contact objects with a name, relation, birthday, phone number, and email.
 * 
 * @author Lydia Chung
 * @version 06/12/2019
 */
public class M18_Contacts
{
	private String name;
	private String relation;
	private String birthday;
	private String phoneNum;
	private String email;
	public M18_Contacts(String name, String relation, String birthday, String phoneNum, String email) 
	{
		this.name = name;
		this.relation = relation;
		this.birthday = birthday;
		this.phoneNum = phoneNum;
		this.email = email;
	}
	public String getName()
	{
		return name;
	}
	public String getRelation()
	{
		return relation;
	}
	public String getBirthday()
	{
		return birthday;
	}
	public String getPhoneNum()
	{
		return phoneNum;
	}
	public String getEmail()
	{
		return email;
	}
	public String toString()
	{
		return String.format("%-25s %-15s %-10s %-12s %-25s", name, relation, birthday, phoneNum, email);
	}
}