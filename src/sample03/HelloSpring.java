package sample03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloSpring {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/applicationContext.xml"); //web.xml빼곤 기본xml아니라서 읽어오기 위치 를 써줘야되.
		
		MessageBean messageBean = (MessageBean)applicationContext.getBean("messageBean");
		messageBean.sayHello("Spring");
		System.out.println();

		MessageBean messageBean2 = (MessageBean)applicationContext.getBean("messageBean");
		messageBean2.sayHello("Spring");
		System.out.println();
		
		MessageBean messageBean3 = (MessageBean)applicationContext.getBean("messageBean");
		messageBean3.sayHello("Spring");
		System.out.println();
		
	}
}
