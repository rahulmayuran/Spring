package aop.throwadvice;

import org.springframework.aop.ThrowsAdvice;

public class ThrowsAdvisor implements ThrowsAdvice{

	public void afterThrowing(Exception e) {
		
		System.out.println("Additional concern if exception occurs");
	}
}
