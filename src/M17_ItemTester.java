/**
 * This program sorts M17_Item objects in different orders with different sorting algorithms.
 * 
 * @author Lydia Chung
 * @version 06/06/2019
 *
 */
public class M17_ItemTester
{
	public static void main(String [ ] args) 
	{
		//declare items in array
		M17_Item [ ] items = new M17_Item [ ] {
				new M17_Item("Towel", 4387, 2.99, 20),
				new M17_Item("Samsung Galaxy 8s", 4300, 353.00, 9),
				new M17_Item("Water bottle", 1992, 8.99, 32),
				new M17_Item("Broom", 2353, 12.65, 8),
				new M17_Item("Cabbage", 5545, 2.99, 44),
				new M17_Item("Macbook Pro", 4828, 999.99, 3),
				new M17_Item("Laundry detergent", 9919, 27.58, 21),
				new M17_Item("Hair dryer", 1022, 50.30, 12),
				new M17_Item("Nike running shoes", 8325, 88.94, 17),
				new M17_Item("Organic steak", 7553, 12.55, 29)
		};
		
		//methods
		System.out.println("Original list:");
		printArray(items);
		System.out.println("\n<< Sort in ascending order by product number >>\n");
		insertionSortNumber(items, 1);
		printArray(items);
		System.out.println("\n<< Sort in descending order by product number >>\n");
		insertionSortNumber(items, 2);
		printArray(items);
		System.out.println("\n<< Sort in ascending order by price >>\n");
		selectionSortPrice(items, 1);
		printArray(items);
		System.out.println("\n<< Sort in descending order by price >>\n");
		selectionSortPrice(items, 2);
		printArray(items);
		System.out.println("\n<< Sort in ascending order by name >>\n");
		mergeSortName(items, 0, items.length - 1);
		printArray(items);
		
	}
	public static void printArray(M17_Item [ ] items)
	{
		System.out.printf("%-15s %9s %9s %9s", "Item", "Number", "Price", "Quantity");
		System.out.println("\n" + "----------------------------------------------");
		for (M17_Item item : items) {
			System.out.println(item);
		}
	}
	public static void insertionSortNumber(M17_Item [ ] items, int param)
	{
		if (param == 1) {
			for( int i = 0 ; i < items.length ; i++ )
	        {
	            M17_Item next = items[ i ];
	            int insertIndex = 0;
	            int k = i;
	            while( k > 0 && insertIndex == 0 )
	            {
	                if(next.getNum() > items[k-1].getNum())
	                {
	                    insertIndex = k;
	                }
	                else
	                {
	                    items[ k ] = items[ k - 1 ];
	                }
	                k--;
	            }

	            items[ insertIndex ] = next;
	        }
		}
		else if (param == 2) {
			for( int i = 0 ; i < items.length ; i++ )
	        {
	            M17_Item next = items[ i ];
	            int insertIndex = 0;
	            int k = i;
	            while( k > 0 && insertIndex == 0 )
	            {
	                if(next.getNum() < items[k-1].getNum())
	                {
	                    insertIndex = k;
	                }
	                else
	                {
	                    items[ k ] = items[ k - 1 ];
	                }
	                k--;
	            }

	            items[ insertIndex ] = next;
	        }
		}
	}
	public static void selectionSortPrice(M17_Item [ ] items, int param) 
	{
		if (param == 1) {
			int i;
	        int k;
	        int posMax;
	        M17_Item temp;

	        for ( i = items.length - 1 ; i >= 0 ; i-- )
	        {
	            // find largest element in the i elements
	            posMax = 0;
	            for ( k = 0 ; k <= i ; k++ )
	            {
	                if ( items[ k ].getPrice() > items[ posMax ].getPrice())
	                    posMax = k;
	            }
	            temp = items[ i ];
	            items[ i ] = items[posMax ];
	            items[ posMax ] = temp;
	        }
		}
		else if (param == 2) {
			int i;
	        int k;
	        int posMax;
	        M17_Item temp;

	        for ( i = items.length - 1 ; i >= 0 ; i-- )
	        {
	            // find largest element in the i elements
	            posMax = 0;
	            for ( k = 0 ; k <= i ; k++ )
	            {
	                if ( items[ k ].getPrice() < items[ posMax ].getPrice())
	                    posMax = k;
	            }
	            temp = items[ i ];
	            items[ i ] = items[posMax ];
	            items[ posMax ] = temp;
	        }
		}
	}

	public static void mergeSortName(M17_Item [ ] items, int low, int high)
	{
		if (low == high) {
			return;
		}
		int mid = (low + high) / 2;
		mergeSortName(items, low, mid);
		mergeSortName(items, mid + 1, high);
		mergeName(items, low, mid, high);
	}
	public static void mergeName(M17_Item [ ] items, int low, int mid, int high)
	{
		M17_Item [ ] temp = new M17_Item [ high - low + 1 ];

        int i = low, j = mid + 1, n = 0;

        while( i <= mid || j <= high )
        {
            if( i > mid )
            {
                temp[ n ] = items[ j ];
                j++;
            }
            else if( j > high )
            {
                temp[ n ] = items[ i ];
                i++;
            }
            else if( items[ i ].getName().compareTo(items[ j ].getName()) < 0 )
            {
                temp[ n ] = items[ i ];
                i++;
            }
            else
            {
                temp[ n ] = items[ j ];
                j++;
            }
            n++;
        }

        for( int k = low ; k <= high ; k++ )
            items[ k ] = temp[ k - low ];
	}
}