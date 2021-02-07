package setter.mapdepd;

import java.util.Date;

public class Answer {

	private String answer;
	private int id;
	private Date postedDate;
	
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getPostedDate() {
		return postedDate;
	}
	public void setPostedDate(Date postedDate) {
		this.postedDate = postedDate;
	}
	@Override
	public String toString() {
		return "[answer=" + answer + ", id=" + id + ", postedDate=" + postedDate + "]";
	}
	
	
	
}
