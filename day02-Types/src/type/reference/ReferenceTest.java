package type.reference;

/**
 * 기본형 8가지 외의 모든 타입인
 * 참조형 타입을 테스트하는 클래스
 * ----------------------------------
 * 참조형 : 클래스, 인터페이스, 배열
 * 참조형의 대표격인 String클래스 타입으로 테스트를 시행
 * 
 * @author Administrator
 *
 */

public class ReferenceTest {

	public static void main(String[] args) {
		// 1. 선언 : 타입이름 변수이름;
		// 선언할 때, 타입이름자리에 기본형 8가지가 아닌 이름이 오면 그 변수는 "무조건 참조형"
		//==> 변수칸에 화살표가 저장되고 진짜 값은 다른 곳에 존재하는 타입
		//==> 자바는 참조형에 대해서 화살표를 자동으로 따라가서 진짜 값을 꺼내 쓸 수 있도록 편의를 제공한다.
		//    (자동이기 때문에 마치 화살표가 없는 것 처럼 보이기 하지만 존재한다)
		String name;
		// 2. 초기화
		name = "Dr.Cho";
		
		// 3. 사용
		System.out.println("name=" + name);
		/*
		 * name=Dr.Cho
		 * 
		 */
		
		

	}

}
