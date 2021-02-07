package factory.reference;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext conapp = new ClassPathXmlApplicationContext("ReferenceFactory.xml");
		BeanInterface facret = (BeanInterface) conapp.getBean("reffact");
		facret.printInterface();
		conapp.close();
	}

}
