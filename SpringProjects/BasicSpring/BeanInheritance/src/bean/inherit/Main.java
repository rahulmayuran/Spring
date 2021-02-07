package bean.inherit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("beanlink.xml");
		Employee emp = (Employee) con.getBean("child"); //specify the child class which references both parent and address beans
		emp.beanShow();
	}

}
