import java.util.Scanner;
public class _Testbed
{
	public static void main(String [ ] args) 
	{
		Scanner iangay = new Scanner(System.in);
		int testNum = iangay.nextInt();
		for (int i = 0; i < testNum; i++) {
			String string = iangay.next() + iangay.nextLine();
			int sum = 0;
			String [ ] splitted = string.split(" ");
			for (String word : splitted) {
				int num = Integer.parseInt(word);
				sum += num;
			}
			System.out.println("Case #" + (i + 1) + ": " + sum);
		}
		
	}
}