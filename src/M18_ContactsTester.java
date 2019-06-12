/**
 * The purpose of this program is to search for relatives 
 * based on name, relation, birthday, phone number, and email.
 * 
 * @author Lydia Chung
 * @version 06/12/2019
 */
public class M18_ContactsTester
{
	public static void main(String [ ] args) 
	{
		//declare array and create objects
		M18_Contacts [ ] contacts = {
				new M18_Contacts("Harry Potter", "uncle", "Jul 31", "4705342919", "harryp@msn.com"),
				new M18_Contacts("Hermione Granger", "aunt", "Sep 19", "9479281897", "hermanab@yahoo.ca"),
				new M18_Contacts("Severus Snape", "father", "Jan 9", "6534821486", "yxing@sbcglobal.net"),
				new M18_Contacts("Albus Dumbledore", "grandfather", "Aug 1", "3784919408", "budinger@yahoo.com"),
				new M18_Contacts("Ginny Weasley", "sister", "Aug 11", "4509383145", "sscorpio@icloud.com"),
				new M18_Contacts("Ron Weasley", "brother", "Mar 1", "2709940010", "danneng@hotmail.com"),
				new M18_Contacts("Sirius Black", "godfather", "Nov 3", "2913999809", "siriusb@yahoo.ca"),
				new M18_Contacts("James Potter", "uncle", "Mar 27", "3197842705", "jamesp@msn.com"),
				new M18_Contacts("Sybill Trelawney", "grandmother", "Mar 9", "6134379004", "divinestar@comcast.net"),
				new M18_Contacts("Luna Lovegood", "aunt", "Feb 13", "7738468016", "cgcra@live.com"),
		};
		
		//methods
		System.out.println("Original list:");
		printArray(contacts);
		System.out.println("\n<< Find Sirius Black >>\n");
		searchName(contacts, "Sirius Black");
		System.out.println("\n<< Find Lily Potter >>\n");
		searchName(contacts, "Lily Potter");
		System.out.println("\n<< Find all uncles >>\n");
		searchRelation(contacts, "uncle");
		System.out.println("\n<< Find all nephews >>\n");
		searchRelation(contacts, "nephew");
		System.out.println("\n<< Find all August birthdays >>\n");
		searchBirthday(contacts, "Aug");
		System.out.println("\n<< Find all April birthdays >>\n");
		searchBirthday(contacts, "Apr");
		System.out.println("\n<< Find all phone numbers of 4509383145 >>\n");
		searchPhoneNum(contacts, "4509383145");
		System.out.println("\n<< Find all phone numbers of 6392223464 >>\n");
		searchPhoneNum(contacts, "6392223464");
		System.out.println("\n<< Find all emails of divinestar@comcast.net >>\n");
		searchEmail(contacts, "divinestar@comcast.net");
		System.out.println("\n<< Find all emails of sleepingmandrake@gmail.com >>\n");
		searchEmail(contacts, "sleepingmandrake@gmail.com");
		
	}
	public static void printArray(M18_Contacts [ ] array)
	{
		System.out.printf("%-25s %-14s %-10s %-16s %-25s", "Name", "Relation", "Birthday", "Phone Number", "Email");
		System.out.println("\n----------------------------------------------------------------------------------------");
		for (M18_Contacts item : array) {
			System.out.println(item);
		}
	}
	//if param == 1 then sort by name, if param == 2 then sort by relation
	public static void mergeSort(M18_Contacts [ ] contacts, int low, int high, int param)
	{
		if (low == high) {
			return;
		}
		int mid = (low + high) / 2;
		mergeSort(contacts, low, mid, param);
		mergeSort(contacts, mid + 1, high, param);
		merge(contacts, low, mid, high, param);
	}
	public static void merge(M18_Contacts [ ] contacts, int low, int mid, int high, int param)
	{
		M18_Contacts [ ] temp = new M18_Contacts [ high - low + 1 ];

        int i = low, j = mid + 1, n = 0;

        while( i <= mid || j <= high )
        {
            if( i > mid )
            {
                temp[ n ] = contacts[ j ];
                j++;
            }
            else if( j > high )
            {
                temp[ n ] = contacts[ i ];
                i++;
            }
            else if( contacts[ i ].getName().compareTo(contacts[ j ].getName()) < 0 && param == 1)
            {
                temp[ n ] = contacts[ i ];
                i++;
            }
            else if( contacts[ i ].getRelation().compareTo(contacts[ j ].getRelation()) < 0 && param == 2)
            {
                temp[ n ] = contacts[ i ];
                i++;
            }
            else
            {
                temp[ n ] = contacts[ j ];
                j++;
            }
            n++;
        }

        for( int k = low ; k <= high ; k++ )
            contacts[ k ] = temp[ k - low ];
	}
	public static void searchName(M18_Contacts [ ] contacts, String toFind)
	{
		mergeSort(contacts, 0, contacts.length - 1, 1);
		int high = contacts.length;
		int low = -1;
		int probe;
		while (high - low > 1) {
			probe = (high + low) / 2;
			if (contacts[probe].getName().equals(toFind)) {
				System.out.println(contacts[probe]);
				return;
			}
			else if (contacts[probe].getName().compareTo(toFind) > 0) {
				high = probe;
			}
			else {
				low = probe;
			}
		}
		System.out.println("Not found");
	}
	public static void searchRelation(M18_Contacts [ ] contacts, String toFind)
	{
		mergeSort(contacts, 0, contacts.length - 1, 2);
		int high = contacts.length;
		int low = -1;
		int probe;
		while (high - low > 1) {
			probe = (high + low) / 2;
			if (contacts[probe].getRelation().compareTo(toFind) == 0) {
				linearPrintRelation(contacts, probe, toFind);
				return;
			}
			else if (contacts[probe].getRelation().compareTo(toFind) > 0) {
				high = probe;
			}
			else {
				low = probe;
			}
		}
		System.out.println("Not found");
	}
	public static void linearPrintRelation(M18_Contacts [ ] contacts, int probe, String toFind)
	{
		int i;
		int start = probe;
		int end = probe;
		i = probe - 1;
		while (i >= 0 && contacts[i].getRelation().compareTo(toFind) == 0) {
			start = i;
			i--;
		}
		i = probe + 1;
		while (i < contacts.length && contacts[i].getRelation().compareTo(toFind) == 0) {
			end = i;
			i++;
		}
		for (int j = start; j <= end; j++) {
			System.out.println(contacts[j]);
		}
	}
	public static void searchBirthday(M18_Contacts [ ] contacts, String toFind)
	{
		int count = 0;
		for (M18_Contacts contact : contacts) {
			if (contact.getBirthday().substring(0, 3).equals(toFind)) {
				System.out.println(contact);
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Not found");
		}
	}
	public static void searchPhoneNum(M18_Contacts [ ] contacts, String toFind)
	{
		int count = 0;
		for (M18_Contacts contact : contacts) {
			if (contact.getPhoneNum().equals(toFind)) {
				System.out.println(contact);
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Not found");
		}
	}
	public static void searchEmail(M18_Contacts [ ] contacts, String toFind)
	{
		int count = 0;
		for (M18_Contacts contact : contacts) {
			if (contact.getEmail().equals(toFind)) {
				System.out.println(contact);
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Not found");
		}
	}
}