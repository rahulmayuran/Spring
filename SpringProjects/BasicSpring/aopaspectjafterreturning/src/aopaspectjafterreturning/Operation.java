package aopaspectjafterreturning;

public class Operation {

	public int mars()
	{
		System.out.println("mars() method invoked");
		return 1000;
	}
	
	public int mercury()
	{
		System.out.println("mercury() method invoked");
		return 100;
	}
}
