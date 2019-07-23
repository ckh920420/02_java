package tyee.primitive;

/** 
 * Int : 정수형 타입중 가장 기본/대표 타입
 * -------------------------------
 * int타입을  테스트하는 클래스이다
 * @author Administrator
 *
 */
public class IntTest {

	private static int ;

	public static void main(String() args) {
		//1. 선언, 2. 초기화 동시에 진행
		//선언할때, 한줄에 변수를 콤마(,)로 나열하여 여러 개 선언가능
		//이 떄, 타입은 맨 않에 한번만 선언하면 된다.
		//그러나, 한줄에 한번 선언, 초기화를 진행하는 것이 작업이 수월하다. 코드의 가독성을 생각한다면 더더욱
		int num1 = 5; 
		int num2 =28;
		int num3, num4, num5 ;
	    
		//넘버 3,4,5, 에 대새서 넘버 1,2의 연산결과로 초기화
		num3 = num1 * num2;
		num4 = num2 / num1;
		num5 =25 /num1;
		
		//3. 사용   : 변수 값 출력
		System.out.println("5 * 28 = " + num3);
		System.out.println("28 / 5 = " + num4);
		System.out.println("25 / 5 = " + num5);
        
	}

}
