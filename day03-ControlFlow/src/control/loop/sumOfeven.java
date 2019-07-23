package control.loop;
/** 
 * 1~100까지의 짝수의 합을 구하는 클래스
 * @author Administrator
 *
 */

public class sumOfeven {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화
		int num = 2;
		int sum = 0;
		
		//3. 사용
		while (num <= 100) {
			sum += num;
			num += 2;
		}
		System.out.printf("1부터 100까지 짝수의 합은 %d입니다.%n", sum);

	}

}
