package sample02;

public class HelloSpring {
	public static void main(String[] args) {
		MessageBeanKo messageBeanKo = new MessageBeanKo(); // 1:1 관계, 결합도 100%
		
		//결합도 낮추기, 다형성 , 부모 = 자식
		MessageBean messageBean = new MessageBeanEn(); // 메세지 빈 인터페이스 는 뉴를 못한다. 메세지빈을 생성한게 아니라 자식메소드인 MessageBeanEn를 생성한것이다.
		messageBean.sayHello("Spring");
	}
}
