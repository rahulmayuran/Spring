package setter.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {

	private int id;
	private String name;
	private Map<String,String> answers;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, String> getAnswers() {
		return answers;
	}
	public void setAnswers(Map<String, String> answers) {
		this.answers = answers;
	}
	
	public void showSetMap()
	{
		System.out.println("Question is "+name+" with id no: "+id);
		
		Set<Entry<String,String>> set = answers.entrySet(); //Set<key,Value> pairs are used as interface for Map interface
		
		Iterator<Entry<String,String>> itr = set.iterator();
		while(itr.hasNext())
		{
			Entry<String,String> entry = itr.next();
			System.out.println("Answer is: "+entry.getKey()+" Posted By: "+entry.getValue());
			
		}
	}
}
