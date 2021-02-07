package setter.mapdepd;

public class User {

	private String name;
	private int id;
	private long phoneno;
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
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", id=" + id + ", phoneno=" + phoneno + "]";
	}
	
	
}
