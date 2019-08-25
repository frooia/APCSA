/**
 * This class creates student objects with 
 * a first name, last name, letter grade, and scores.
 * 
 * @author Lydia Chung
 * @version 06/12/2019
 */
public class M19_Student
{
	private String firstName;
	private String lastName;
	private String letterGrade;
	private double [ ] scores;
	public M19_Student(String fn, String ln, double [ ] points)
	{
		if (fn.equals("")) {
			throw new IllegalArgumentException("First name cannot be empty");
		}
		else if (ln.equals("")) {
			throw new IllegalArgumentException("Last name cannot be empty");
		}
		firstName = fn;
		lastName = ln;
		scores = points;
		letterGrade = calcLetterGrade(scores);
	}
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public String calcLetterGrade(double [ ] scores)
	{
		if (scores.length == 0) {
			throw new IllegalArgumentException("Grade list cannot be empty");
		}
		double sum = 0;
		for (double score : scores) {
			sum += score;
		}
		double grade = sum / scores.length;
		if (grade >= 89.5) {
			return "A";
		}
		else if (grade >= 79.5) {
			return "B";
		}
		else if (grade >= 69.5) {
			return "C";
		}
		else if (grade >= 59.5) {
			return "D";
		}
		else {
			return "F";
		}
	}
	public String getLetterGrade()
	{
		return letterGrade;
	}
	public double getScore(int score)
	{
		return scores[score];
	}
	@Override
	public String toString()
	{
		String scoreList = "";
		for (double score : scores) {
			scoreList += String.format("%8.2f", score);
		}
		return String.format("%-15s %-15s %-3s %-40s", firstName, lastName, letterGrade, scoreList);
	}
}