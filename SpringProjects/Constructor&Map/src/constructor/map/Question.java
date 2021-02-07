package constructor.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {

	private String name;
	private int id;
	private Map<String,String> answers; //Map<Key,Value>
	
	public Question() //default constructor
	{
		
	}

	public Question(String name, int id, Map<String, String> answers) {
		super();
		this.name = name;
		this.id = id;
		this.answers = answers;
	}
	
	public void showAns()

	{
		System.out.println(name+" "+id);
		System.out.println("Answers are:-");
		Set<Entry<String,String>> set = answers.entrySet(); //Map uses Set interface of key,value pairs with entries
		Iterator<Entry<String,String>> it = set.iterator(); //iterator will iterate the entries
		while(it.hasNext())
		{
			Entry<String,String> entry = it.next(); 
			System.out.println("Answer: "+entry.getKey()+"  Posted by: "+entry.getValue()); 
		}
	}
	
}
