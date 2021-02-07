package factory.reference;

public class ReturnInstance {

	public static BeanInterface getBeanInterface()
	{
		return new Reference1();
	}

}
