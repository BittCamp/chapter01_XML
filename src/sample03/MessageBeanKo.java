package sample03;

public class MessageBeanKo implements MessageBean {
	private int num; // 필드다.초기화가 이미되어있다.0가지고있다.
	
	public MessageBeanKo() {
		System.out.println("기본생성자");
	}
	
	@Override
	public void sayHello(String name) {
		num++;
		
		System.out.println("num = " + num);
		System.out.println("안녕하세요 "+name);
	}

}
