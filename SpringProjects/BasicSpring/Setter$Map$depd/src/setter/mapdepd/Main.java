package setter.mapdepd;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext conapp = new ClassPathXmlApplicationContext("setmapdep.xml");
		Question quest = (Question) conapp.getBean("quest");
		quest.mapSetterDep();
		conapp.close();
	}

}
