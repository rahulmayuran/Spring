package bean.inherit;

public class Employee {

	private int id;
	private String name;
	private Address address;
	
	public Employee() //default constructor
	{
		
	}

	public Employee(int id,String name) //constructor with Employee arguments parameterized.. 
	{
		super();
		this.id = id;
		this.name = name;
	}
	public Employee(int id, String name, Address address) { //Constructor with All arguments parameterized..
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	void beanShow()
	{
		System.out.println("Id: "+id+" with name "+name);
		System.out.println(address);
	}
}
