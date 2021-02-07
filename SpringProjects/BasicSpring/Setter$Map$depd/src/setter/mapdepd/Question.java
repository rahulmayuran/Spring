package setter.mapdepd;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {

	private String name;
	private int id;
	private Map<User,Answer> answers;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Map<User, Answer> getAnswers() {
		return answers;
	}
	public void setAnswers(Map<User, Answer> answers) {
		this.answers = answers;
	}
	
	public void mapSetterDep()
	{
		System.out.println("Question is "+name+" having id as "+id);
		Set<Entry<User,Answer>> set = answers.entrySet(); 
		Iterator<Entry<User,Answer>> itr = set.iterator();
		while(itr.hasNext())
		{
			Entry<User,Answer> entry = itr.next();
			User user = entry.getKey();
			Answer answer = entry.getValue();
			System.out.println("The User is "+user+" The Answer is "+answer);
		}
	}
}
