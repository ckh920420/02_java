package car;
/**
 * car 라는 타입의 실제 객체를 생성하여
 * 사용(테스트)하는 클래스
 * @author Administrator
 *
 */

public class CarTest {

	public static void main(String[] args) {
		
		// car라는 타입의 객체를 사용하기 위한 참조변수가 필요함
		// 1. Car타입의 변수 선언
		Car myCar;
		
		// 2. 초기호
		myCar = new Car(); // 생성자 선언부 때 미선언시 괄호안에 안써둔다
		
		// 3. 사용 : 별명 붙이기
		// (1) 별명 붙이기
		myCar.setNickname("붕붕이");
		
		// 3. 사용 : Car 라는 타입(클래스)에 정의된 메소드 호출
		// (2) 가속
		System.out.println("1. myCat의 초기화 후 속도");
		myCar.print();
		
		System.out.println("2. 60만큼 가속 후 속도");
		myCar.accelerate(60);
		myCar.print();
		
		System.out.println("3. 20만큼 추가 가속 후 속도");
		myCar.accelerate(20);
		myCar.print();
		
		System.out.println("4. 정지 후 속도");
		myCar.stop();
		myCar.print();
		
		myCar.accelerate(60);
		int nowVelocity = myCar.accelerate(60);

	}

}
