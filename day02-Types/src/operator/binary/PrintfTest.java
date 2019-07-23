package operator.binary;

import java.util.Scanner;

/**
 * 포메팅 출력을 지원하는 printf() 메소드를 테스트하는 클래스
 *  -------------------------------- 
 *  %d : decimal : 십진수 출력
 *  %b : boolean : 참 거짓의 boolean 값 출력
 *  %f : float   : 실수 출력
 *  %s : String  : 문자열 출력 
 *  %c : char    : 문자 1열 출력
 *  %x : hexadecimal : 16진수 출력
 *  %n : new line : 다음 줄 개행출력
 *  %% : % 글자 자체 출력
 * @author Administrator
 *
 */
public class PrintfTest {

	public static void main(String[] args) {
		// 1. 선언  : 정수 입력값을 저장할 변수 선언
		int input1;
		int input2;
		
		// 키보드 입력을 편리하게 해주는 스캐너 선언
		// 스캐너 사용을 위해서 import 기능
		// 자동 임포트 : 컨트롤 + 시프트 + 영어 O 키
		Scanner scan;
		
		// 2. 초기화
		input1 = 222;
		input2 = 100;
		
		//scan 초기화
		scan = new Scanner(System.in);
		//new 연산자 : 벽 너머에 새로운 무언가를 만들어라
		
		//입력 안내문구 출력
	    System.out.println("정수 두 개를 입력 : ");
		
		//scan 사용
		input1 = scan.nextInt();
		input2 = scan.nextInt();
		
		// 3. printf로 출력
		System.out.printf("%d + %d = %d%n", input1, input2, (input1 + input2));
		System.out.printf("%d - %d = %d%n", input1, input2, (input1 - input2));
		System.out.printf("%d * %d = %d%n", input1, input2, (input1 * input2));
		System.out.printf("%d / %d = %d%n", input1, input2, (input1 / input2));
		System.out.printf("%d %% %d = %d%n", input1, input2, (input1 % input2));
		
		
		
		

	}

}
