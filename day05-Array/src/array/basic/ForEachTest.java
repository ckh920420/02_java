package array.basic;
/**
 * 자바 1.5버전 부터 지원되는
 * 향상된 for반복문의 기능
 * ----------------------
 * 데이터 구조와 함께 사용한다.
 * 
 * 데이터 구조 : 1. 배열 (Array)
 *            2. 리스트 (List)
 *            3. 맵 (Map)
 *            4. 셋 (Set)
 *-----------------------------
 * @author Administrator
 *
 */
public class ForEachTest {

	public static void main(String[] args) {
		// 1. 배열의 선언(과 동시에 값을 넣으면서 초기화)
		int [] number = {1,2,3,4,5};  
		int sum =0;
		//foreach구문으로 배열 값 출력
		//for( 원소의 타입 변수이름 : 자료구조(== 배열) { 문장들; }
		for (int num : number) {
			System.out.println("num=" + num);
		}
		
		System.out.println("num="+ sum);

	}

}
