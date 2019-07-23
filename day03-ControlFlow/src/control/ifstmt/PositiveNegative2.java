package control.ifstmt;

import java.util.Scanner;

/**
 * 하나의 정수를 입력 받아서 
 * 양수인지 음수인지 판단하는 클래서
 * 
 *
 * 
 * 입력받을 변수input 을 선언 하여 Scanner로 입력 받고
 * if~else 구문으로 부호를 판별한 후
 * 판별 결과를 저장하는 변수 String result에 저장하여
 * 
 * " 입력값 100(은)는 양수 입니다. "
 * " 입력값 -1 은(는) 음수 입니다." 라는 문장을 출력하시오.
 * " 입력값은 0입니다"
 * @author Administrator
 *
 */
public class PositiveNegative2 {

	public static void main(String[] args) {
		// 1. 선언
		int input;
		String result;
		
		
		// 2. 초기화
		
		Scanner scan; 
		
		scan = new Scanner(System.in);
		System.out.println("정수를 입력");
		input = scan.nextInt();
		
		
		

		
		// 4. 사용
		if (input > 0) {
			result = "양수";
		} else if (input < 0 ) {
			result = "음수";
		} else {
          result = "0";
		}
		// 5. 출력
		
		System.out.printf("%d 는 %s입니다", input, result);

	}


}
