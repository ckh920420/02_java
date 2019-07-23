package control.ifstmt;

import java.util.Scanner;

/**
 * --(2)-----------------------------------------------
 * 나머지는 int mod;에 저장하여 사용하시오
 * 
 * 2의 배수일 때 : "입력값 4은(는) 2의 배수입니다"
 * 2의 배수가 아닐 때 : "입력값 5은(는) 2의 배수가 아닙니다"
 *                  "나머지가 1입니다"
 *                  
 *                  if(input % 2 == 0) --> 나머지를 구하는 식
 *                  연산자들 사이에서 우선순위를 활용한 것
 *                  나머지 연산이 더 우선 시행 되어짐을 활욜
 *                  예) input 이 3일 경우 2로 나누었을 때
 *                     0과 동일 한가? 
 *                     --> 그렇다 = > 2의 배수
 *                     --> 아니다 = > 2의 배수가 아님 
 *                     
 * 입력값이 0인 경우 : "0은 배수판별을 할 수 없습니다" 을 출력할 수 있도록 구문 수정 (추가)
 *                  (if 문제임)-- 중첩 if문으로 해결
 *                  
 *------------------------------------------------------
 * @author Administrator
 *
 */

public class multiplierOfTwo2 {

	public static void main(String[] args) {
		// 1. 선언
		int input;
		int mod =0;
		String result;
		Scanner scan;
		
		// 2. 초기화
		
		scan = new Scanner(System.in);
		System.out.println("정수를 입력하시오.");
		input = scan.nextInt();
		result ="aa";
		
		
		// 3. 사용
		
		if (input % 2 == 0 ) {
		   result = "입니다";
		   } else {
		   result = "아닙니다";
		   mod = input % 2;
		   }
		
		// 입력값이 0인 경우 " 0은 배수 판별 불가"
		//if{input == 0) {
		 System.out.println("0은 배수 판별 불가");
		 
		 if (input == 0)
			 
			
		
			
			
			
			System.out.printf("입력값 %d 은(는) 2의 배수 %s %d 가 나머지 임 ", input, result, mod);
		}

	}


