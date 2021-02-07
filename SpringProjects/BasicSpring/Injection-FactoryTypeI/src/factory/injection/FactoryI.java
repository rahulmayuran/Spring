package factory.injection;

public class FactoryI {

	private static final FactoryI object = new FactoryI(); //instance of the class with static,final keywords
	
	private FactoryI()
	{
		System.out.println("Private Constructor");
	}
	
	public static FactoryI getFactoryI()
	{
		System.out.println("Factory method");
		return object; //returns the instance of the class
	}
	
	public void printFactory()
	{
		System.out.println("Confused why we need to declare instance as static and final");
	}
}
