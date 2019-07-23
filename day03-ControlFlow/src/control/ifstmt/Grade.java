package control.ifstmt;

import java.util.Scanner;

/** 다중 선택 if구문을 활용해서 학점계산기를 만드는 클래스
 * -----------------------------------------------
 * 기준 
 * A 90이상
 * B 80~89
 * C 60~79
 * D 40~59
 * F 이하 나머지
 * ------------------------------------------------
 * printf로 출력
 * @author Administrator
 *
 */

public class Grade {

	public static void main(String[] args) {
		// 1. 선언
		int score;
		char grade;
		 
       // 2. 스캐너를 이용한 초기화
		
		Scanner scan = new Scanner(System.in);
		System.out.println("0~100사이의 정수를 입력 :");
		score = scan.nextInt();
		
		// 3. 사용
		
		if ( score >= 90) {
			grade = 'A';
		}else if ( score >= 80) {
			grade = 'B';
		}else if (score >= 60) {
			grade = 'C';
		}else if (score >= 40) {
		    grade = 'D';
		}else {
			grade = 'F';
		}
		
		
		System.out.printf("%d에 대한 학점은 %c%n 입니다",score,grade);
	}
	
	

}
