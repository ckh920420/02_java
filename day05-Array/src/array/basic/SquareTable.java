package array.basic;
/**
 * 
 * 1.( 선언 )정수를 원소로 가지는 배열 numbers를 선언한 후
 * 
 * 2. (초기화) for (index사용하는 전통적인 for) 구문을 사용하여 1~ 10까지 정수를 저장한다
 * 
 * 2. (사용) foreach 구문을 사용하여 1에서 저장된 값의 제곱표를 출력한다
 * 
 * @author Administrator
 *
 */

public class SquareTable {

	public static void main(String[] args) {
		// 1. 선언
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		for (int num : numbers ) {
			System.out.printf("%d^2 = %d%n", num,(num*num));
		}
		

	}

}
