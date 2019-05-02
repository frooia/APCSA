import java.util.ArrayList;
public class M15_HomeworkTester
{
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
		csa.createAssignment(2);
		calc.createAssignment(10);
		
		//create ArrayList
		ArrayList<M15_Homework> courses = new ArrayList<M15_Homework>();
		courses.add(english);
		courses.add(history);
		courses.add(csa);
		courses.add(calc);
		
		//display assignments
		for (M15_Homework assignment : courses) {
			System.out.println(assignment);
		}
	}
}