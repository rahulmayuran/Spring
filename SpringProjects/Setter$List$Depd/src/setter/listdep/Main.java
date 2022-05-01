package setter.listdep;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("listsetdep.xml");
		Employee emp = (Employee) app.getBean("listsdep");
		emp.showListDep();
		app.close();
	}

}
