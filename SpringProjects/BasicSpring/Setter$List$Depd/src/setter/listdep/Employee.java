package setter.listdep;

import java.util.Iterator;
import java.util.List;

public class Employee {

	private int id;
	private String name;
	private List<Salary> sal_deduction; //In list duplicates are allowed, insertion order is preserved
	public Employee(){
		
	}

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

	public List<Salary> getSal_deduction() {
		return sal_deduction;
	}

	public void setSal_deduction(List<Salary> sal_deduction) {
		this.sal_deduction = sal_deduction;
	}

	public void showListDep()
	{
		System.out.println("Employee name: "+name+" & Employee id: "+id);
		System.out.println(sal_deduction);
		Iterator<Salary> i = sal_deduction.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}
}
