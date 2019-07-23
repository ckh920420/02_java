package snack;

/**
 * Oreo 쿠키를 정의하는 클래스
 * -------------------------------
 * 속성 : 
 * cream : String : 바닐라 초코 민트
 * radius(반지름) double : 오레오 쿠키 한개의 반지름 길이
 * thickness( 두께 )  double : 오레오 쿠키 1개의 두께
 * --------------------------------------------------
 * 생성자 : 기본 생성자, 중복된 this, this() 로 정의하는 생성자
 * 총 4개의 생성자 중복정의
 * ---------------------
 * 메소드
 * print() : void : 오레오 쿠키의 상태 출력
 * changeCream( String cream) : void 
 *                             : 매개 변수로 입력된 크림 값으로 오레오 쿠키의 크림을 변경함
 * @author Administrator
 *
 */

public class Oreo {
	// 1. 맴버 변수 선언
	
	String cream;
	double radius;
	double tickness;
	
	// 2. 생성자 선언(중복정의)
	// (1) 기본 생성자
	Oreo() {
		
	}
	
	//(2) 중복생성자
	Oreo(String cream){
		this();
		this.cream = cream;
		}
	
	Oreo(String cream, double radius) {
		this(cream);
		this.radius = radius;
		}
	
	Oreo(String cream, double radius, double tickness) {
		this(cream, radius);
		this.tickness = tickness;
		}
	
	// 3. 메소드 작성
	//(1) 오레오 크림 바꿔주는 메소드 changeCream()
	public void changeCream() {
		this.cream = cream;
		
	}
	
	//(2) 오레오 쿠키의 상태를 출력해 주는 메소드 print()
	public void print() {
		System.out.printf("이 OREO는  %s맛이고, 반지름 %4.2f, 두께 %4.2f 입니다.",cream,radius,tickness);
	}

}
