package sample03;

public interface MessageBean { //다형성. 모든 자식클래스들을 인터페이스 부모를 참조하게만든다.
	public void sayHello(String name); //추상 메소드 // 생성하면 자식 인 클래스들이 추상을 상속하라고 오류메시지 뜬다.
}
