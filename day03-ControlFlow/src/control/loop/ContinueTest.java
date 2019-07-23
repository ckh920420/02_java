package control.loop;
/**
 * continue : 현재 이하 문장 무시 ( 실행하지 않는다 )
 * 
 * 1 ~100 사이의 홀수의 합을 구하는 클래스
 * 
 * @author Administrator
 *
 */

public class ContinueTest {

	public static void main(String[] args) {
		// 1. 선언    2. 초기화
		int sum = 0;
		
		// 3. 사용
		for (int idx = 1; idx <= 100; idx++) {
			if (idx % 2 == 0) {
				continue;
			}
			sum += idx;
		}
		System.out.printf("합산 %d%n", sum);
		
		// 문제  : 1 ~ 100 사이의 3의 배수의 합을 구하시오 (continue 사용)
		
		int sum3 = 0;
		
		for(int idx3 = 1; idx3 <= 100; idx3++) {
			if ( idx3 % 3!=0) {
				continue;
				
				
			}
		}
		

	}

}
