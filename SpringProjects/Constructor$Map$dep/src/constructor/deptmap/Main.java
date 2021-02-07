package constructor.deptmap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Question object = (Question) context.getBean("quest");
		object.showAnswerOfUser();
	}

}
