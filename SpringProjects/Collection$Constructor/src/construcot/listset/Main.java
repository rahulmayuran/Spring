package construcot.listset;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		@SuppressWarnings("resource")
		ApplicationContext con = new ClassPathXmlApplicationContext("config.xml");
		Question list = (Question) con.getBean("Quest");
		Question list2 = (Question) con.getBean("Quest2");
		list.showAnswers();
		System.out.println("\n");
		list2.showAnswers();
		System.out.println("\n");
		
		String s = BeanFactory.FACTORY_BEAN_PREFIX;
		System.out.println("Factory bean prefix is " + s);
	}

}
