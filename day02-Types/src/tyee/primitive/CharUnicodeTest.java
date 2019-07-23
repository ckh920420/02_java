package tyee.primitive;

/** 
 * char : 문자 1개를 저장하는 타입
 * ------------------------
 * 문자는 유니코드 표기법으로 저장하고 출력하여 테스트하는 클래스
 * @author Administrator
 *
 */
public class CharUnicodeTest {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화 동시에 진행 (/ -백슬래시- 이후에 등장하는 값은 유니코드표에 의거한 문자표기임)
		char han = '\ud55c';
		char gul = '\uae00';

		// 2. 사용
		System.out.println("han=" + han);
		System.out.println("gul=" + gul);
		System.out.println("han + gul" + han +gul);
		
		System.out.println("======================================");
				
		System.out.println(han);
		System.out.println(gul);
		System.out.println(han + "" +gul);
	}

}

