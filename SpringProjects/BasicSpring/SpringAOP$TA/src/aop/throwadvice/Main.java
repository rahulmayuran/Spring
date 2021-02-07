package aop.throwadvice;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws Exception {
		
		ConfigurableApplicationContext conapp = new ClassPathXmlApplicationContext("throwadvice.xml");
		Validator vali = conapp.getBean("proxy",Validator.class);
		try {
			vali.Validate(02);
		} catch (ArithmeticException e) {
			
			e.printStackTrace();
		}
		conapp.close();
	}
}
