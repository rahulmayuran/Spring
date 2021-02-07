package setter.depend;

public class River {

	private String name;
	private int length;
	private int depth;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", length=" + length + ", depth=" + depth + "]";
	}
	
	
}
