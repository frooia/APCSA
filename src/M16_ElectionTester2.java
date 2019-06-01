/**
 * This program creates an ArrayList to format M16_Candidate objects.
 * 
 * @author Lydia Chung
 * @version 06/01/2019
 */
import java.util.*;
public class M16_ElectionTester2
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
	public static void printArray(ArrayList<M16_Candidate> candidates)
	{
		for (int i = 0; i < candidates.size(); i++) {
			System.out.println(candidates.get(i));
		}
	}
	public static int calcSum(ArrayList<M16_Candidate> candidates)
	{
		int totalVotes = 0;
		for (int i = 0; i < candidates.size(); i++) {
			totalVotes += candidates.get(i).getVotes();
		}
		return totalVotes;
	}
	public static void makeTable(ArrayList<M16_Candidate> candidates) 
	{
		System.out.println("Candidate            Votes     % of Total");
		System.out.println("-----------------------------------------");
		int sum = calcSum(candidates);
		for (int i = 0; i < candidates.size(); i++) {
			double percent = 100 * candidates.get(i).getVotes() / (double) sum;
			System.out.printf("%-20s %-11d %-10.2f", candidates.get(i).getName(), candidates.get(i).getVotes(), percent);
			System.out.println();
		}
		System.out.println();
		System.out.println("Total number of votes cast: " + calcSum(candidates));
	}
	public static void replaceName(ArrayList<M16_Candidate> candidates, String find, String replace)
	{
		for (int i = 0; i < candidates.size(); i++) {
			if (candidates.get(i).getName().equals(find)) {
				candidates.get(i).setName(replace);
			}
		}
	}
	public static void replaceVotes(ArrayList<M16_Candidate> candidates, String find, int replace)
	{
		for (int i = 0; i < candidates.size(); i++) {
			if (candidates.get(i).getName().equals(find)) {
				candidates.get(i).setVotes(replace);
			}
		}
	}
	public static void replaceBoth(ArrayList<M16_Candidate> candidates, String find, String replaceName, int replaceVotes)
	{
		for (int i = 0; i < candidates.size(); i++) {
			if (candidates.get(i).getName().equals(find)) {
				candidates.get(i).setName(replaceName);
				candidates.get(i).setVotes(replaceVotes);
			}
		}
	}
}