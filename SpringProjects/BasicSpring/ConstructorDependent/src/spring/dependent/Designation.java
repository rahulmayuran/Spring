package spring.dependent;

public class Designation {

	private String position;
	private int level;
	private String category;
	
	
	public Designation(String position, int level, String category) { //constructor using fields
		super();
		this.position = position;
		this.level = level;
		this.category = category;
	}


	
	public String toString() {
		return "Designation [position=" + position + ", level=" + level + ", category=" + category + "]";
	}
	
	
	
}
