package statical.method;

import static statical.method.Calculator.subtract;
/**
 * static메소드는
 * 클래스이름, 메소드이름(아규먼트);
 * 의 방식으로 호출
 * @author Administrator
 *
 */

public class CarlcTest {

	public static void main(String[] args) {
		
		//Calculator cal = new Calulator();
		//cal.add(10, 2.5);
		// 스태틱이 아닌 메소드를 호출하는 방법
		
		double  result = Calculator.add(1.0, 2.5);
       // 스태틱 메소드는 클래스이름, 메소드이름(아규먼트); 의 형식
		
		//자바에서는 클래스의 스태틱 필드들(변수, 메소드)에 대해서 지원
		// static import지원
		//스태틱 임포트 구문을 클래스 선언 위쪽에 작성한 경우 메소드 이름만으로 호출가능
		
	}  

}
