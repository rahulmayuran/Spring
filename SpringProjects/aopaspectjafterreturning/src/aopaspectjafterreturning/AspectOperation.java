package aopaspectjafterreturning;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AspectOperation {

	@AfterReturning(pointcut="execution(* Operation.*(..))", returning="result")
	public void aftereturnadive(JoinPoint jp,Object result)
	{
		System.out.println("additional concern");  
        System.out.println("Method Signature: "  + jp.getSignature());  
        System.out.println("Result in advice: "+result);  
        System.out.println("end of after returning advice..."); 
	}
}
