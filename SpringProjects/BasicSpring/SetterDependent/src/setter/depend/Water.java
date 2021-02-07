package setter.depend;

public class Water {

	private int quantity;
	private String name;
	private River river;
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public River getRiver() {
		return river;
	}
	public void setRiver(River river) {
		this.river = river;
	}
	
	public void showWater()
	{
		System.out.println("Q(in dmc): "+quantity+" "+name);
		System.out.println("The rivers are "+ river);
	}
}
