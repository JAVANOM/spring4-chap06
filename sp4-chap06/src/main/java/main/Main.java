package main;

import org.springframework.context.support.GenericXmlApplicationContext;

import spring.Client;
import spring.Client2;

public class Main {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:springconf.xml");
		
		// getBean한 순간에 init-method 메소드 실행
		Client2 client = ctx.getBean("client2", Client2.class);
		client.send();
		ctx.close(); //ctx.close() 전에 destory-method가 실행

	}

}
