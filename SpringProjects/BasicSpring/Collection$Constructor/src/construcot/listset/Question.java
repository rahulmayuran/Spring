package construcot.listset;

import java.util.Iterator;
import java.util.List;

public class Question {

	private int studentId;
	private String studentName;
	private List<String> answers; //Angular braces must have Datatype.
	
	public Question(int studentId, String studentName, List<String> answers) { //Constructor using superclass
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.answers = answers;
	}
	
	public void showAnswers()
	{
		System.out.println(studentId+" "+studentName);
		System.out.println("Answers are");
		Iterator<String> i = answers.iterator(); // Iterator<DataType> instance = Collection(List).iterator is the syntax for iter
		while(i.hasNext())
		{
			System.out.println(i.next()); // Confused with hasnext and next...
		}
	}
}
