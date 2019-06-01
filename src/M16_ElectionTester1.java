/**
 * This program creates an array to format M16_Candidate objects.
 * 
 * @author Lydia Chung
 * @version 06/01/2019
 */
public class M16_ElectionTester1
{
	public static void main(String [ ] args) 
	{
		//initiate array of candidates
		M16_Candidate [ ] candidates = new M16_Candidate [5];
		candidates[0] = new M16_Candidate("Harry Potter", 4000);
		candidates[1] = new M16_Candidate("Ron Weasley", 1800);
		candidates[2] = new M16_Candidate("Hermione Granger", 2700);
		candidates[3] = new M16_Candidate("Draco Malfoy", 3600);
		candidates[4] = new M16_Candidate("Luna Lovegood", 2200);
		
		//methods
		System.out.println("Original Results: ");
		makeTable(candidates);
		System.out.println("\n<< Changing Harry Potter to Voldemort >>\n");
		replaceName(candidates, "Harry Potter", "Voldemort");
		makeTable(candidates);
		System.out.println("\n<< Changing Ron Weasley votes to 3000 >>\n");
		replaceVotes(candidates, "Ron Weasley", 3000);
		makeTable(candidates);
		System.out.println("\n<< Changing Luna Lovegood and votes to Neville Longbottom >>\n");
		replaceBoth(candidates, "Luna Lovegood", "Neville Longbottom", 2500);
		makeTable(candidates);
	}
	public static void printArray(M16_Candidate [ ] candidates)
	{
		for (int i = 0; i < candidates.length; i++) {
			System.out.println(candidates[i]);
		}
	}
	public static int calcSum(M16_Candidate [ ] candidates)
	{
		int totalVotes = 0;
		for (int i = 0; i < candidates.length; i++) {
			totalVotes += candidates[i].getVotes();
		}
		return totalVotes;
	}
	public static void makeTable(M16_Candidate [ ] candidates) 
	{
		System.out.println("Candidate            Votes     % of Total");
		System.out.println("-----------------------------------------");
		int sum = calcSum(candidates);
		for (int i = 0; i < candidates.length; i++) {
			double percent = 100 * candidates[i].getVotes() / (double) sum;
			System.out.printf("%-20s %-11d %-10.2f", candidates[i].getName(), candidates[i].getVotes(), percent);
			System.out.println();
		}
		System.out.println();
		System.out.println("Total number of votes cast: " + calcSum(candidates));
	}
	public static void replaceName(M16_Candidate [ ] candidates, String find, String replace)
	{
		for (int i = 0; i < candidates.length; i++) {
			if (candidates[i].getName().equals(find)) {
				candidates[i].setName(replace);
			}
		}
	}
	public static void replaceVotes(M16_Candidate [ ] candidates, String find, int replace)
	{
		for (int i = 0; i < candidates.length; i++) {
			if (candidates[i].getName().equals(find)) {
				candidates[i].setVotes(replace);
			}
		}
	}
	public static void replaceBoth(M16_Candidate [ ] candidates, String find, String replaceName, int replaceVotes)
	{
		for (int i = 0; i < candidates.length; i++) {
			if (candidates[i].getName().equals(find)) {
				candidates[i].setName(replaceName);
				candidates[i].setVotes(replaceVotes);
			}
		}
	}
}