package control.swtchstmt;

import java.util.Scanner;

/** 입력된 정수가 3의 배수인지 판별하는 클래스
 * 배수 판단에 switch 구문을 사용
 * @author Administrator
 *
 */
public class Deciedmuilttpul {

	public static void main(String[] args) {
		// 1. 선언
		int input;
		Scanner scan;
		
		// 2.초기화
		
		scan = new Scanner(System.in);
		
		//입력 안내  prompt
		System.out.println("자연수 입력");
		input = scan.nextInt();
		
		//
		
		switch (input % 3) {
		case 0 : 
			System.out.printf("입력값 %d는 3의 배수", input);
		break;
     	case 1 : case 2 :
			System.out.printf("입력값 %d는 3의 배수가 아님", input);
		break;
			
			//case 2 : System.out.printf("입력값 %d는 3의 배수가 아님", input); 
			//break; 
			//원래 쓰는 방식은 케이스 별로 나열하는 것이지만 구하고자 하는 값이 케이스 2,3 이 동일한 역항르 하기 떄문에 붙여서 작성함
			default :
				System.out.println(" 잘못된 입력");
		}
				

	}

}
