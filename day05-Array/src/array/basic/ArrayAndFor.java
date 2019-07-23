package array.basic;

/**
 * 10칸 짜리 int 배열 number를 선언, 생성 후
 * 각 원소의 값을 0번 index 부터 9번 index까지 
 * 10, 20, 30..100으로 저장
 * 배열에 저장된 원소의 합을 int summary; 변수에 누적하여 출력하라
 * @author Administrator
 *
 */

public class ArrayAndFor {

	public static void main(String[] args) {
		// 1. 선언 , 2. chrlghk
		
		int[] numbers;
		int summery;
		;
		numbers = new int[10];
		
		// 3. 값 저장
		
		for (int idx = 0; idx < numbers.length; idx++	) {
			numbers[idx] = (idx +1) * 10;
		
					
		
		}
		// 4. 합산 출력
		System.out.printf("원소의 합 : %d%n",summery);
		
		// 5. 새 값 저장
		for (int idx = 0; idx < numbers.length; idx++	) {
			numbers[idx] = (idx + 1) * 100;
		
		}
		
		//for each 구문으로 출력
		
		for (int num : numbers ) {
			System.out.println("num+" + num);
			
		}

	}

}
