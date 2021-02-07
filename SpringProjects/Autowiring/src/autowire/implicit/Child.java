package autowire.implicit;

public class Child {

	Parent parent; //property name
	
	public Child()
	{
		System.out.println("Child constructor is created");
	}
	
	public Child(Parent parent) {
		super();
		this.parent = parent;
	}

	public void printChild()
	{
		System.out.println("Method for Child class");
	}
	
	void printBothMethods()
	{
		printChild();
		parent.printParent();
	}

	public Parent getParent() { //generating getters/setters for Parent instance
		return parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}
	

}
