package aop.interceptor;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext conapp = new ClassPathXmlApplicationContext("aroundadvice.xml");
		AdvisingClass obj = conapp.getBean("proxy",AdvisingClass.class);
			System.out.println("Proxy class name is "+ obj.getClass().getName());
		obj.AroundAdvice();;
		conapp.close();
	}

}
