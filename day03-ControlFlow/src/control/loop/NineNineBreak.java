package control.loop;
/** 
 * 구구단을 중첩 for loop를 사용해서 출력
 * 곱셈의 결과가 50이 넘으면 중단하도록
 * break : 구문과   for를 조합하여 테스트
 * -------------------------
 * break : 가장 가까운 반복문을 빠져나가는 역학
 *         또는 switch구문을 빠져나가는 역할
 * @author Administrator
 *
 */

public class NineNineBreak {

	public static void main(String[] args) {
	
		// 1. 선언, 2. 초기화 
		
		for ( int stage = 2; stage <= 9; stage += 1 ) { 
			System.out.printf("%n%n%d 단%n", stage);
		      for (int time = 1; time <= 9; time += 1)
		    System.out.printf("%d X %d = %d%n ", stage, time,(stage * time)) ;	  
		}
		
		
		
		
		// 3. 사용
       

   }
}


