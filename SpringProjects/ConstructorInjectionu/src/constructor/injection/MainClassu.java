package constructor.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClassu {

	public static void main(String[] args) {

		ApplicationContext constructru = new ClassPathXmlApplicationContext("anyname.xml");
		BeanClassu getName = (BeanClassu) constructru.getBean("fetchname"); //bean id thaan arguments la irukkanum
		getName.kaatu();
	}

}
