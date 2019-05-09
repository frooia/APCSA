/**
 * This class tests all of the M15_Homework classes
 * and compares the relative amounts of homework.
 * 
 * @author Lydia Chung
 * @version 05/08/2019
 */
import java.util.*;
public class M15_HomeworkTester
{
	public static void compare(M15_Homework a, M15_Homework b)
	{
		if (a.compareTo(b) == 0) {
			System.out.println("The homework for " + a.getType() + " and " + b.getType() + " are the SAME number of pages.");
		}
		else if (a.compareTo(b) > 0) {
			System.out.println("The homework for " + a.getType() + " has MORE pages to read than " + b.getType());
		}
		else {
			System.out.println("The homework for " + a.getType() + " has LESS pages to read than " + b.getType());
		}
	}
	public static void main(String [ ] args) 
	{
		//creating instances
		M15_HomeworkEnglish english = new M15_HomeworkEnglish();
		M15_HomeworkHistory history = new M15_HomeworkHistory();
		M15_HomeworkCSA csa = new M15_HomeworkCSA();
		M15_HomeworkCalc calc = new M15_HomeworkCalc();
		
		
		//making assignments
		english.createAssignment(4);
		history.createAssignment(29);
		csa.createAssignment(10);
		calc.createAssignment(10);
		
		//create ArrayList
		List<M15_Homework> courses = new ArrayList<M15_Homework>();
		courses.add(english);
		courses.add(history);
		courses.add(csa);
		courses.add(calc);
		
		//display assignments
		System.out.println("Homework assignments:");
		for (M15_Homework assignment : courses) {
			System.out.println(assignment);
		}
		
		//compare assignments
		System.out.println();
		System.out.println("Comparing assignments:");
		compare(english, history);
		compare(english, csa);
		compare(english, calc);
		compare(history, csa);
		compare(history, calc);
		compare(csa, calc);
	}
}