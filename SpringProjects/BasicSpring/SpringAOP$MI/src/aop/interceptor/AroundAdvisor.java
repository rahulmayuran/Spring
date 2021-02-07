package aop.interceptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvisor implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		
		Object around;
		System.out.println("Additional Concern before business logic");
		around = mi.proceed();
		System.out.println("Additional Concern after business logic");
		return around;
	}


}
