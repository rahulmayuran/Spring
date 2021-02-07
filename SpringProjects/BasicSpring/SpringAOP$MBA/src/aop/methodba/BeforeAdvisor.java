package aop.methodba;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvisor implements MethodBeforeAdvice{

	@Override
	public void before(Method method,Object[] args,Object target) throws Throwable
	{
		System.out.println("Additional concern before actual logic");
		System.out.println("Method info: "+method.getName()+" Method modifiers: "+method.getModifiers());
		System.out.println("Argument information: ");
		
		for(Object arg:args)
		System.out.println(arg);
		System.out.println("Target object is "+target);
		System.out.println("Target object's class name: "+target.getClass().getName());
	}
}
