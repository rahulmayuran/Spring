package com.spring.thandam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientClassu {

	public static void main(String[] args) {
		
		ApplicationContext porul = new ClassPathXmlApplicationContext("peansu.xml");
		EntityClassu kuppa = (EntityClassu) porul.getBean("venna"); //config bean id um ithuvum oththu poganum
		kuppa.ShowOff();
	}

}
