package setter.list;

import java.util.Iterator;
import java.util.List;

public class Employee {

	private int id;
	private String name;
	private List<String> contact;
	
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
	public List<String> getContact() {
		return contact;
	}
	public void setContact(List<String> contact) {
		this.contact = contact;
	}
	
	public void showList()
	{
		System.out.println(name +" "+ id);
		System.out.println("contacts are:");
		Iterator<String> i = contact.iterator(); //Don't forget to use iterator interface in beanClass
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
