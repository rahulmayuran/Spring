package autowire.implicit;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext conapp = new ClassPathXmlApplicationContext("autowired.xml");
		Child child = conapp.getBean("child",Child.class);
		child.printBothMethods();
		conapp.close();
	}

}
