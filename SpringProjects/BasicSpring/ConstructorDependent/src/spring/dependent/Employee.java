package spring.dependent;

public class Employee {

	private String name;
	private int salary;
	private Designation designation;
	
	
	
	public Employee() { //constructor from superclass
		super();
		System.out.println("Default Constructor");
	}

	public Employee(String name, int salary, Designation designation) { //constructor from fields
		super();
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}
	
	public void show() 
	{
		System.out.println(name+" "+salary);
		System.out.println(designation.toString());
	}
}
