package sample04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring{
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml"); //ClassPathXmlApplicationContext 은 src 안써줘도 위치는 잡더라. src/applicationContext.xml해도됨.
		
		//new CalcAdd(); 이렇게 하고 싶지만, 스프링 컨테이너에서 가져오는 방식으로 계속 써줘야됨. 
		// applicationContext.getBean("calcAdd");값만 얻어와라. 이렇게. 부모는 Calc calc1인터페이스인 Calc이다.
		Calc calc = (Calc) applicationContext.getBean("calcAdd");
		calc.calculate(25, 36);
		//calc = (Calc) applicationContext.getBean("calcMul");
		calc = applicationContext.getBean("calcMul",Calc.class); // 위에 오브젝트 만들어놔서 변수명 쓰고 바로써줘도 된다. ,뒤에는 캐스팅하는 타입 써주면 이렇게 캐스팅하는 방법도있다.
		calc.calculate(25, 36);
	}

}
