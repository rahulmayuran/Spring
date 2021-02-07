package constructor.deptmap;

import java.util.Date;

public class Answer {

	private String answer;
	private int id;
	private Date postedDate;
	
	public Answer()
	
	{
		
	}

	public Answer(String answer, int id, Date postedDate) {
		super();
		this.answer = answer;
		this.id = id;
		this.postedDate = postedDate;
	}

	@Override
	public String toString() {
		return " answer= " + answer + " postedDate= " + postedDate;
	}
	
	
}
