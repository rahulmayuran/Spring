package constructor.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClassu {

	public static void main(String[] args) {

		ApplicationContext constructru = new ClassPathXmlApplicationContext("mokka.xml");
		BeanClassu azhukku = (BeanClassu) constructru.getBean("azhukkumoota"); //bean id thaan arguments la irukkanum
		azhukku.kaatu();
	}

}
