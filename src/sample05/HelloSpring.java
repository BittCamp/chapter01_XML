package sample05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HelloSpring {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		SungJuk sungJuk = (SungJuk) applicationContext.getBean("sungJukImpl"); // 이부분에서 기본생성자가 호출이된다.
		sungJuk.calc();
		sungJuk.display();
		//기본생성자 죄다 공유함. 이거머임.. 다른거  주석 거는 수 밖에 없다. 
		
		
		
	}
}
