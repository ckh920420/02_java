package array.multi;

import java.util.Scanner;

/** 
 * 야구 구단의 1~5선발 선수의 방어율을 입력하고 그 중 가장 방어율이 낮은 최고의 투수를 찾는 클래스
 * 구단은 총 3개의 구단이 있다
 * -----------------------------------------------------------------------------
 * 최종 형태
 * "최고의 투수는 몇번쨰팀 몇번투수 이고 방어율을 몇입니다"
 * @author Administrator
 *
 */

public class BestPitcher {

	public static void main(String[] args) {
		// 1. 선언
		
		Scanner scan = new Scanner(System.in);
		System.out.println("누가누가 잘하나");
		
		double[][]ERA = new double[3][5];
		double min = 10.0;
		
		System.out.println("1번, 2번, 3번, 4번, 5번 방어율");
		for (int idx = 0; idx < ERA.length; idx ++) {
			System.out.printf("%d", (idx++));
			
		}
		
		
			
			
			
		
		
		
		

	}

}
