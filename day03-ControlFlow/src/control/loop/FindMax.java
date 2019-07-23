package control.loop;

import java.util.Scanner;

/** 
 * 입력된 자연수 중에서 최댓값을 찾는 클래스
 * do -while
 * @author Administrator
 *
 */
public class FindMax {

	public static void main(String[] args) {
		// 1. 선언
		int input;
		int max;
		Scanner scan = new Scanner(System.in);
		input =scan.nextInt();
		
		
		// 2. 초기화
		max = 0;
		
		//
		
		do {
			System.out.println("양수를 입력 (종료희망시 0입력)");
			
			if (input > max) {
				max = input;
			}
		}while (input >0);
        System.out.printf("최댓갓은 %d 입니다.%n");		
				
		

	}

}
