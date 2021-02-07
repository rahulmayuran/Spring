package construcot.listset;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("config.xml");
		Question list = (Question) con.getBean("Quest");
		//Question list2 = (Question) con.getBean("Quest2");
		list.showAnswers();
		System.out.println("\n\n");
		//list2.showAnswers();
	}

}
