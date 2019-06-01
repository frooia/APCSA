import java.util.ArrayList;

/**
 * This program modifies an array to format M16_Candidate objects.
 * 
 * @author Lydia Chung
 * @version 06/01/2019
 */
public class M16_ElectionTester3
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
		System.out.println("\n<< In position 1, add Seamus Finnigan, 2100 votes >>\n");
		insertPos(candidates, 1, "Seamus Finnigan", 2100);
		makeTable(candidates);
		System.out.println("\n<< Before Harry Potter, add Grindelwald, 6700 votes >>\n");
		insertBefore(candidates, "Harry Potter", "Grindelwald", 6700);
		makeTable(candidates);
		System.out.println("\n<< Delete position 3 >>\n");
		deletePos(candidates, 3);
		makeTable(candidates);
		System.out.println("\n<< Delete Hermione Granger >>\n");
		deleteName(candidates, "Hermione Granger");
		makeTable(candidates);
	}
	public static void printArray(M16_Candidate [ ] candidates)
	{
		for (int i = 0; i < candidates.length; i++) {
			if (candidates[i] != null) {
				System.out.println(candidates[i]);
			}
		}
	}
	public static int calcSum(M16_Candidate [ ] candidates)
	{
		int totalVotes = 0;
		for (int i = 0; i < candidates.length; i++) {
			if (candidates[i] != null) {
				totalVotes += candidates[i].getVotes();
			}
		}
		return totalVotes;
	}
	public static void makeTable(M16_Candidate [ ] candidates) 
	{
		System.out.println("Candidate            Votes     % of Total");
		System.out.println("-----------------------------------------");
		int sum = calcSum(candidates);
		for (int i = 0; i < candidates.length; i++) {
			if (candidates[i] != null) {
				double percent = 100 * candidates[i].getVotes() / (double) sum;
				System.out.printf("%-20s %-11d %-10.2f", candidates[i].getName(), candidates[i].getVotes(), percent);
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("Total number of votes cast: " + calcSum(candidates));
	}
	public static void replaceName(M16_Candidate [ ] candidates, String find, String replace)
	{
		for (int i = 0; i < candidates.length; i++) {
			if (candidates[i] != null && candidates[i].getName().equals(find)) {
				candidates[i].setName(replace);
			}
		}
	}
	public static void replaceVotes(M16_Candidate [ ] candidates, String find, int replace)
	{
		for (int i = 0; i < candidates.length; i++) {
			if (candidates[i] != null && candidates[i].getName().equals(find)) {
				candidates[i].setVotes(replace);
			}
		}
	}
	public static void replaceBoth(M16_Candidate [ ] candidates, String find, String replaceName, int replaceVotes)
	{
		for (int i = 0; i < candidates.length; i++) {
			if (candidates[i] != null && candidates[i].getName().equals(find)) {
				candidates[i].setName(replaceName);
				candidates[i].setVotes(replaceVotes);
			}
		}
	}
	public static void insertPos(M16_Candidate [ ] candidates, int pos, String name, int votes)
	{
		for (int i = candidates.length - 1; i >= pos + 1; i--) {
			candidates[i] = candidates[i - 1];
		}
		candidates[pos] = new M16_Candidate(name, votes);
	}
	public static void insertBefore(M16_Candidate [ ] candidates, String before, String name, int votes)
	{
		int pos = 0;
		for (int i = 0; i < candidates.length; i++) {
			if (candidates[i].getName().equals(before)) {
				pos = i;
			}
		}
		insertPos(candidates, pos, name, votes);
	}
	public static void deletePos(M16_Candidate [ ] candidates, int pos)
	{
		for (int i = pos; i < candidates.length - 1; i++) {
			candidates[i] = candidates[i + 1];
		}
		candidates[candidates.length - 1] = null;
	}
	public static void deleteName(M16_Candidate [ ] candidates, String name) 
	{
		int pos = 0;
		for (int i = 0; i < candidates.length; i++) {
			if (candidates[i].getName().equals(name)) {
				pos = i;
				break;
			}
		}
		deletePos(candidates, pos);
	}
}