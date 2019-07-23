package tyee.primitive;
/**
 * float, double : 실수형 (소수점 표현가능 ) 데이터를 표현, 저장할 수 있는 타입
 * ---------------------------------------------------------------------
 * float타입의 변수에 값을 할당할 떄는
 * 값의 두에 대문자 F, 소문자 f를 접미사로 붙인다
 * 
 * @author Administrator
 *
 */
public class FloatTest {

	public static void main(String[] args) {
		//1. 선언
		float pi1;
		double pi2;
		
		//2. 초기화
		pi1 = 3.141592653589793238462643383279502884197169F;
		pi2 = 3.141592653589793238462643383279502884197169;
		
		//3. 사용 : 변수 값 출력
		System.out.println("float pi=" + pi1);
		System.out.println("double pi=" + pi2);
		
		//4. float와 double의 차이점을 알아보자
		/*
		 * float pi=3.1415927
           double pi=3.141592653589793-- 소수점 사용이 용이
		 */
		

	}

}
