package aopaspectjafterreturning;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext conapp = new ClassPathXmlApplicationContext("applicationContext.xml");
		Operation o = (Operation) conapp.getBean("opBean");
		System.out.println("Calling mars..");
		o.mars();
		System.out.println("Calling mercury..");
		o.mercury();
		conapp.close();
	}

}
