/**
 * This program modifies an ArrayList to format M16_Candidate objects.
 * 
 * @author Lydia Chung
 * @version 06/01/2019
 */
import java.util.*;
public class M16_ElectionTester4
{
	public static void main(String [ ] args) 
	{
		//initiate array of candidates
		ArrayList<M16_Candidate> candidates = new ArrayList<M16_Candidate>();
		candidates.add(new M16_Candidate("Harry Potter", 4000));
		candidates.add(new M16_Candidate("Ron Weasley", 1800));
		candidates.add(new M16_Candidate("Hermione Granger", 2700));
		candidates.add(new M16_Candidate("Draco Malfoy", 3600));
		candidates.add(new M16_Candidate("Luna Lovegood", 2200));
		
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
	public static void printArray(ArrayList<M16_Candidate> candidates)
	{
		for (int i = 0; i < candidates.size(); i++) {
			if (candidates.get(i) != null) {
				System.out.println(candidates.get(i));
			}
		}
	}
	public static int calcSum(ArrayList<M16_Candidate> candidates)
	{
		int totalVotes = 0;
		for (int i = 0; i < candidates.size(); i++) {
			if (candidates.get(i) != null) {
				totalVotes += candidates.get(i).getVotes();
			}
		}
		return totalVotes;
	}
	public static void makeTable(ArrayList<M16_Candidate> candidates) 
	{
		System.out.println("Candidate            Votes     % of Total");
		System.out.println("-----------------------------------------");
		int sum = calcSum(candidates);
		for (int i = 0; i < candidates.size(); i++) {
			if (candidates.get(i) != null) {
				double percent = 100 * candidates.get(i).getVotes() / (double) sum;
				System.out.printf("%-20s %-11d %-10.2f", candidates.get(i).getName(), candidates.get(i).getVotes(), percent);
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("Total number of votes cast: " + calcSum(candidates));
	}
	public static void replaceName(ArrayList<M16_Candidate> candidates, String find, String replace)
	{
		for (int i = 0; i < candidates.size(); i++) {
			if (candidates.get(i) != null && candidates.get(i).getName().equals(find)) {
				candidates.get(i).setName(replace);
			}
		}
	}
	public static void replaceVotes(ArrayList<M16_Candidate> candidates, String find, int replace)
	{
		for (int i = 0; i < candidates.size(); i++) {
			if (candidates.get(i) != null && candidates.get(i).getName().equals(find)) {
				candidates.get(i).setVotes(replace);
			}
		}
	}
	public static void replaceBoth(ArrayList<M16_Candidate> candidates, String find, String replaceName, int replaceVotes)
	{
		for (int i = 0; i < candidates.size(); i++) {
			if (candidates.get(i) != null && candidates.get(i).getName().equals(find)) {
				candidates.get(i).setName(replaceName);
				candidates.get(i).setVotes(replaceVotes);
			}
		}
	}
	public static void insertPos(ArrayList<M16_Candidate> candidates, int pos, String name, int votes)
	{
		candidates.add(pos, new M16_Candidate(name, votes));
	}
	public static void insertBefore(ArrayList<M16_Candidate> candidates, String before, String name, int votes)
	{
		int pos = 0;
		for (int i = 0; i < candidates.size(); i++) {
			if (candidates.get(i).getName().equals(before)) {
				pos = i;
			}
		}
		insertPos(candidates, pos, name, votes);
	}
	public static void deletePos(ArrayList<M16_Candidate> candidates, int pos)
	{
		candidates.remove(pos);
	}
	public static void deleteName(ArrayList<M16_Candidate> candidates, String name) 
	{
		int pos = 0;
		for (int i = 0; i < candidates.size(); i++) {
			if (candidates.get(i).getName().equals(name)) {
				pos = i;
				break;
			}
		}
		deletePos(candidates, pos);
	}
}