package setter.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("setdep.xml");
		Employee emp = (Employee) con.getBean("listset");
		emp.showList();
	}

}
