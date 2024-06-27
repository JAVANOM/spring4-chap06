package spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//빈 객체의 초기화와 소멸 : 커스텀 메서드
public class Client2 {

	private String host;
	
	public void setHost(String host) {
		this.host = host;
		System.out.println("Client2.setHost() 실행");
	}
	
	public void connect(){
		System.out.println("Client2.connect() 실행");
	}
	
	
	public void send() {
		System.out.println("Client2.send() to" + host);
	}

	public void close() throws Exception {
		System.out.println("Client2.close() 실행");
		
	}

}
