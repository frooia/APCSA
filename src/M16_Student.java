/**
 * This is a class of student objects that have a name and 5 quiz scores.
 * 
 * @author Lydia Chung
 * @version 06/03/2019
 */
public class M16_Student
{
	private String name;
	private int [ ] scores;
	public M16_Student(String name, int [ ] scores)
	{
		this.name = name;
		this.scores = scores;
	}
	public int getScore(int quiz) 
	{
		return scores[quiz - 1];
	}
	public void setScore(int quiz, int score)
	{
		scores[quiz - 1] = score;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String toString()
	{
		return String.format("%-20s %4d %7d %7d %7d %7d", name, scores[0], scores[1], scores[2], scores[3], scores[4]);
	}
}