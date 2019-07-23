package operator.binary;

/**
 * <,>,<=,=<,==,!=
 * 
 * 두 변수의 값을 비교하는 비교연사자를 테스트하는 클래스
 * 관계연산의 결과는boolean타입으로 얻어짐
 * 
 * 
 * @author Administrator
 *
 */
public class RelationalTest {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화
		int a = 1;
		int b =-5;
		
		// 3. 비교연산자 사용
		System.out.println("등가 비교 연산자");
		
		System.out.printf("(%d == %d) : %b%n",a,b,(a == b));
		System.out.printf("(%d != %d) : %b%n",a,b,(a != b));
		
		System.out.println("대소비교 연산자");
		
		
		System.out.printf("(%d < %d) : %b%n" ,a,b,(a < b));
		System.out.printf("(%d > %d) : %b%n" ,a,b,(a > b));
		System.out.printf("(%d >= %d) : %b%n" ,a,b,(a >= b));
		System.out.printf("(%d <= %d) : %b%n" ,a,b,(a <= b));
	}
		// 이클립스IDE단축기
	    // 컨트롤 디 : 커서가 있는 행의 전체삭제
        //알트 시프트 a : 세로 편집기능으로 토글 같은 키 한번더 누르면 나가짐
	    // 알트 업/다운 : 행 전체 상하 이동
        // 컨트롤 시프트 L : 단축키 모음 안내창 오픈
		// 컨트롤 F6 : 열려있는 파일 사이에 이동
}                                         
