package factory.reference;

public class ReturnInstance {

	public static BeanInterface getBeanInterface()
	{
		return new Reference1();
		
	}
	public static BeanInterface getBeanInterface2()
	{
		return new Reference2();
		
	}

}
