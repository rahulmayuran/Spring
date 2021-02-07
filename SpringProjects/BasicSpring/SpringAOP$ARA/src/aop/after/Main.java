package aop.after;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext conapp = new ClassPathXmlApplicationContext("afterreturning.xml");
		AdvisingClass obj = conapp.getBean("proxy",AdvisingClass.class);
			System.out.println("Proxy class name is "+ obj.getClass().getName());
		obj.afterAdvice();;
		conapp.close();
	}

}
