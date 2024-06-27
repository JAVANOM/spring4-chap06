package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.Client2;

@Configuration
public class JavaConfig {
    
	// @Bean 어노테이션의 속성을 사용해서 초기화와 소멸에 사용할 메서드 이름을 설정
	@Bean(initMethod="connect", destroyMethod="close")
	public Client2 client2(){
		
		Client2 client2 = new Client2();
		client2.setHost("서버2");
		
		return client2;
	}
	
	
	//직접 초기화 메서드를 실행
	@Bean(destroyMethod="close")
	public Client2 client2_1(){
		
		Client2 client2 = new Client2();
		client2.setHost("서버2");
		client2.connect();
		
		return client2;
	}
	
	
}
