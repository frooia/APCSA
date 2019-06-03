/**
 * This program has methods to manipulate M16_Student objects in an ArrayList.
 * 
 * @author Lydia Chung
 * @version 06/03/2019
 */
import java.util.*;
public class M16_StudentTester
{
	public static void main(String [ ] args)
	{
		//make students
		ArrayList<M16_Student> students = new ArrayList<M16_Student>();
		students.add(new M16_Student("Harry Potter", new int [ ] {77, 80, 71, 84, 80}));
		students.add(new M16_Student("Hermione Granger", new int [ ] {100, 91, 99, 95, 89}));
		students.add(new M16_Student("Cho Chang", new int [ ] {81, 90, 95, 94, 97}));
		students.add(new M16_Student("Ginny Weasley", new int [ ] {93, 83, 82, 70, 88}));
		students.add(new M16_Student("Ron Weasley", new int [ ] {71, 85, 84, 78, 82}));
		
		//methods
		System.out.println("Original students:");
		makeTable(students);
		System.out.println("\n<< Replace Ginny Weasley's name with Draco Malfoy >>\n");
		replaceName(students, "Ginny Weasley", "Draco Malfoy");
		makeTable(students);
		System.out.println("\n<< Replace Cho Chang's Q1 score with 93 >>\n");
		replaceScore(students, "Cho Chang", 1, 93);
		makeTable(students);
		System.out.println("\n<< Replace Ron Weasley with Percy Weasley >>\n");
		replaceStudent(students, "Ron Weasley", "Percy Weasley", new int [ ] {88, 98, 83, 95, 84});
		makeTable(students);
		System.out.println("\n<< Before Hermione Granger, insert Pansy Parkinson >>\n");
		insertBefore(students, "Hermione Granger", "Pansy Parkinson", new int [ ] {86, 97, 93, 95, 67});
		makeTable(students);
		System.out.println("\n<< Delete Harry Potter >>\n");
		deleteStudent(students, "Harry Potter");
		makeTable(students);
	}
	public static void makeTable(ArrayList<M16_Student> students)
	{
		System.out.println("      Student          Q1      Q2      Q3      Q4      Q5");
		System.out.println("---------------------------------------------------------");
		for (M16_Student student : students) {
			System.out.println(student);
		}
	}
	public static void replaceName(ArrayList<M16_Student> students, String replace, String name)
	{
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getName().equals(replace)) {
				students.get(i).setName(name);
			}
		}
	}
	public static void replaceScore(ArrayList<M16_Student> students, String name, int quiz, int score)
	{
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getName().equals(name)) {
				students.get(i).setScore(quiz, score);
			}
		}
	}
	public static void replaceStudent(ArrayList<M16_Student> students, String replace, String name, int [ ] scores) 
	{
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getName().equals(replace)) {
				students.get(i).setName(name);
				for (int j = 1; j <= scores.length; j++) {
					students.get(i).setScore(j, scores[j - 1]);
				}
				break;
			}
		}
	}
	public static void insertBefore(ArrayList<M16_Student> students, String before, String name, int [ ] scores) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getName().equals(before)) {
				students.add(i, new M16_Student(name, scores));
				break;
			}
		}
	}
	public static void deleteStudent(ArrayList<M16_Student> students, String name)
	{
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getName().equals(name)) {
				students.remove(i);
			}
		}
	}
}