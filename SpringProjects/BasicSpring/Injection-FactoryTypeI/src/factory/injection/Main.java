package factory.injection;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext conapp = new ClassPathXmlApplicationContext("factoryinstance.xml");
		FactoryI factory = (FactoryI) conapp.getBean("fact");
		factory.printFactory();
		conapp.close();
	}
}
