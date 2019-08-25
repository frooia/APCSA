/**
 * This program tests the M19_Student class and its exceptions.
 * 
 * @author Lydia Chung
 * @version 06/12/2019
 */
public class M19_StudentTester
{
	public static void main(String [ ] args)
	{
		M19_Student [ ] students = {
				new M19_Student("Harry", "Potter", new double [ ] {67.44, 77.88, 97.35}),
				new M19_Student("Hermione", "Granger", new double [ ] {100.00, 95.35, 98.12, 94.53, 99.25, 92.39}),
				new M19_Student("Ron", "Weasley", new double [ ] {54.23, 69.01, 87.19, 77.86})
				//, new M19_Student("", "Finnigan", new double [ ] {58.02})
				//, new M19_Student("Connor", "", new double [ ] {83.77, 92.10})
				//, new M19_Student("Draco", "Malfoy", new double [ ] {})
		};
		System.out.printf("%-15s %-13s %-8s %-40s", "First Name", "Last Name", "Grade", "Scores");
		System.out.println("\n-------------------------------------------------------------------------------------");
		for (M19_Student student : students) {
			System.out.println(student);
		}
	}
}