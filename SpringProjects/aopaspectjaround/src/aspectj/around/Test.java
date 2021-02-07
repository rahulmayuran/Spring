package aspectj.around;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext conapp = new ClassPathXmlApplicationContext("AspectJAround.xml");
		Operation opera = (Operation) conapp.getBean("around");
		opera.first();
		opera.second();
		conapp.close();
	}

}
