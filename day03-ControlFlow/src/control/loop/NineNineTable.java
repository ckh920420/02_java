package control.loop;
/** 
 * 중첩 for loop를 사용해서 구구단을 출력
 * 2 ~ 9 단 출력 
 * 
 * 각 단을 시작할 때 단의 제목 출력
 * @author Administrator
 *
 */
public class NineNineTable {

	public static void main(String[] args) {
		// 1. 선언  2. 초기화  3.사용
		//외부 폴 루프가 단을 결정
		for(int stage =2; stage <=9; stage++) {
			System.out.printf("%n%d 단 %n", stage);
		
			for (int times =1 ; times < 9; times++) {
				System.out.printf("%d x %d = %2d%n", stage,times,(stage * times));
			}
		}
         
	}

}
