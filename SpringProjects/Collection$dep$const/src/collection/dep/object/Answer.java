package collection.dep.object;

public class Answer {

	private int id;
	private String name;
	private String by;
	
	public Answer()
	{
		
	}
	
	public Answer(int id, String name, String by) {
		super();
		this.id = id;
		this.name = name;
		this.by = by;
	}

	public String toString() {
		if(name.equals("Java Development Kit")) //directs reads value name from xml file
		{
			return "Answer [id=" + id + ", name=" + name + ", by=" + by + "] is true";
		}
		else
		{
			return "Answer [id=" + id + ", name=" + name + ", by=" + by + "] is false";
		}
	}
	
	
	
}
