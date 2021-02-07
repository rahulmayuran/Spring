package constructor.deptmap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {

	private String name;
	private int id;
	private Map<Answer,User> answers; //Map<Class1, Class2> instance
	
	public Question() //default constructor
	{
		
	}

	public Question(String name, int id, Map<Answer, User> answers) {
		super();
		this.name = name;
		this.id = id;
		this.answers = answers;
	}
	
	public void showAnswerOfUser()
	{
		System.out.println("Question is "+name+" with id no "+id);
		System.out.println("The Answers were :");
		
		Set<Entry<Answer,User>> set = answers.entrySet(); //Map uses Set interface with key,value pairs retrieving Map instance
		Iterator<Entry<Answer,User>> it = set.iterator(); //Iterator uses Key,Value pairs of set interface into its entries
		
		while(it.hasNext())
		{
			Entry<Answer, User> entry = it.next(); //To print the next entry of the series
			Answer answer=entry.getKey(); //entry's getKey value is stored in answer variable
			User user=entry.getValue(); //entry's getValue value is stored in user variable
			System.out.println("Answer Information: "+answer+" Posted By: "+user); //Can also be like entry.getKey() & entry.getValue()
		}
	}
	
}
