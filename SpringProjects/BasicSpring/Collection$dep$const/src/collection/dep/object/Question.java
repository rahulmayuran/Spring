package collection.dep.object;

import java.util.Iterator;
import java.util.List;

public class Question {

	private String name;
	private int id;
	private List<Answer> answers;
	
	
	public Question(String name, int id, List<Answer> answers) {
		super();
		this.name = name;
		this.id = id;
		this.answers = answers;
	}


	public void showAns()
	{
		System.out.println(id+" "+name);
		System.out.println("Answers are");
		Iterator<Answer> it = answers.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
