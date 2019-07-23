package car;

/** 
 * 자동차 (car) 라는 타입을 정의( 선언)
 * 
 * car는 자바가 기본 제공하는 타입이 아니다
 * 기본 제공 타입은? : Scanner, String 등
 * 
 * 클래스 디자인을 할 때는 추상화작업(Abstraction)이 필요ㅛ
 * 
 * 속성 : 현재의 속도 ( 변수)
 * 기능 : 가속과 정지의 여부 ( 메소드)
 * 
 * 
 * @author Administrator
 *
 */
public class Car {
  //1. 멤버 변수 선언부 : 상태 저장을 위한 선언
	int velocity;
	String Nickname;
  // 2. 생성자 선언부 : 초기화 작업을 위한 선언
	// 생략가능하며 여기서는 생략한다
 // 3. 메소드 선언부 : 사용을 위한 선언
	// (1) 가속 기능 : 가속된 결과 현재 속도가 얼마인지 리턴
	public int accelerate(int value) {
		velocity += value;
	
		
		return velocity;
	}
	//(2) 정지 기능 : 속도를 완전히 0으로 설정
	public void stop() {
		velocity = 0;
		
		//(3) 차의 별명을 설정하는 기능
		//    닉네임 필드에 값을 저장
		
		public void setNickname (String carNickname ) {
			nickname =carNickname;
		}
		
		//(3) 차의 속도를 알기위한 출력
		public void print() {
			System.out.printf(" 현 속도 : %d km/h %n%n, %s %n", velocity, nickname);
		}
	}
	
}
