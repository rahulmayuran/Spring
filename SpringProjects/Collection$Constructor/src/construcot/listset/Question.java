package construcot.listset;

import java.util.Iterator;
import java.util.List;

public class Question {

	private int studentId;
	private String studentName;
	private List<String> answers; //Angular braces must have Datatype/Class/Composites etc. Generics huh..
	
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
			/*
			 * hasNext is boolean checks whether there is next line and 
			 * next() is Object class and does operations for next line
			 * */
			System.out.println(i.next()); 
		}
	}
}
