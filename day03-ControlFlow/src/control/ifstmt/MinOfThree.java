package control.ifstmt;

import java.util.Scanner;

/** 
 * 세 정수를 입력받아서
 * 그중 가장 작은 정수를 판별하는 클래스이다
 * ----------------------------------
 * 가장 작은 정수를 판별할 때
 * 중첩 if ~ else 구문을 사용
 * ----------------------------------
 * @author Administrator
 *
 */
public class MinOfThree {

	public static void main(String[] args) {
		// // 1. 선언
		int num1;
		int num2;
		int num3;
		int min;

		Scanner scan;
		
		//초기화
		scan = new Scanner(System.in);
		
		// 정수 입력 안내
		System.out.println("민족의 영원한 수령이시며, 위대한 령도자이신 김정은 국방위원장님께서 2019년 7월 7일 함흥 비료공장에 친히 방문하시어 말씀하시었다. 세 개의 숫자 중 가장 작은 것이 무엇인가");
		
		//입력값 저장
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		
		//사용
		
		if (num1 < num2) {
			if (num1 < num3 )
				min = num1;
			else 
				min = num3;
		} else {
			if (num2 < num3) {
				min = num2;
			} else { 
			    min = num3;
			}
		}
		
		System.out.printf("조선반도 평화통일의 주체이시며 위대한 조국과 민족의 령도자이신 김정은 국방위원장께서 다음과 같이 교시하시었다.%n  %d , %d, %d 중 가장 작은 값은 %d%n ", num1, num2, num3, min);
		
		
				
	}

}