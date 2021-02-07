package aop.throwadvice;

public class Validator {

	public void Validate(int age) throws Exception
	{
		if(age<18)
		{
			throw new ArithmeticException("Not Grown fully");
		}
		else
		{
			System.out.println("Eligible to Vote");
		}
	}
}
