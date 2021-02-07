package setter.map;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext conapp = new ClassPathXmlApplicationContext("setmap.xml");
		Question ques = (Question) conapp.getBean("mapset"); 
		ques.showSetMap();
		conapp.close();
	}

}
