package aspectj.around;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectOperation {

	@Pointcut("execution(* Operation.*(..))") //Applies to all methods in Operation class
	public void anonymous()//Have a unique method name
	{	}
	
	@Around("anonymous()")//use that method name along with @Around.
	public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable
	{
		System.out.println("Additional Concern before logic");
		Object obj = pjp.proceed(); 
		System.out.println("Additional Concern after logic");
		return obj;
	}
}
