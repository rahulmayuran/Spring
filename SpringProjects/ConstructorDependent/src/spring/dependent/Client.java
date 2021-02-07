package spring.dependent;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		
		Resource res = new ClassPathResource("config.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		Employee object = (Employee) factory.getBean("fr");
		object.show();

	}

}
