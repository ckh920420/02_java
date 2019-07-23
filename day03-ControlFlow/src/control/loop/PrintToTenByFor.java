package control.loop;
/**
 * 
 *1~10 까지 출력하는 클래스
 *for 구문을 사용하여 출력
 *---------------------------------------------------
 * @author Administrator
 *
 */
public class PrintToTenByFor {

	public static void main(String[] args) {
		// for (선언식; 조건식; 증감식 ) {
		//      문장들;
		// }
		
		//1. 선언식 : 선언의 형태 -> 타입 변수이름;
		//2. 조건식 : 조건의 형태 => 비교연산자 (관계, 동일)을 사용한 식, 연산의 결과가 참과 거짓을 얻어짐
		//3. 증감식 : 증감연산자 (++ -- )를 활용하여 선언식에서 선언된 루프 제어 변수 값을 변경
		//-----------------참 고 사 항----------------------------------------------------------
		// 모든 선언식은 자신이 선언된 블록 내에서만 사용 가능함 for의 경우 for 괄호 안에 선언되었으므로 for loop 내에서만 사용가능
		// 한  메소드 안에는 ( 한 블록 안에서는) 중복된 선언 불가능
		for(int idx = 1; idx <= 10; idx++) {
            System.out.printf("idx=%2d%n",idx);
            }
		
            
		
		System.out.println("=====================================");
		
		for(int idx = 10; idx >= 0; idx--) {
            System.out.printf("idx=%2d%n",idx);
		
		// 두개의 for구문에서 같은 int idx를 선언하였지만 오류가 발생하지 않았다. 이는 서로 다른 블록에서 선언되었기 때문이다 
	}
		
		// final변수 == 상수를 활용한 forloop
		final int FROM = 1;
		final int TO = 10;
		
		for(int idx = FROM; idx <= TO; idx++) {
            System.out.printf("idx=%2d%n",idx);
}
		System.out.println("== FROM, TO를 활용해서 0 ~ 9까지 출력==");
		
		for(int idx = FROM; idx <= TO; idx++) {
            System.out.printf("idx=%2d%n",idx-1);
		
}
}
}
