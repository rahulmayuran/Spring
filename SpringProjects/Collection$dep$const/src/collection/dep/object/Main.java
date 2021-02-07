package collection.dep.object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("depend.xml");
		Question obj = (Question) con.getBean("quest");
		obj.showAns();
		

	}

}
