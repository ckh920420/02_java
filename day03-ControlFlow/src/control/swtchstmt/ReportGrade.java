package control.swtchstmt;

import java.util.Scanner;

/**
 *  switch구문을 활용한 학점 계산 
 *  ---------------------------------------
 * 기준 
 * A 90이상
 * B 80~89
 * C 60~79
 * D 40~59
 * F 이하 나머지
 * -------------------------------------------
 * @author Administrator
 *
 */
public class ReportGrade {

	public static void main(String[] args) {
		// 1. 선언
		
		int score;
		char grade;
		
		// 2. 초기화
		Scanner scan = new Scanner(System.in) ;
		System.out.println("0~100 사이의 정수를 입력");
		score = scan.nextInt();
		
		// 3. 사용
		
		switch ( score /10) {
		case 9 : case 10 :
			grade = 'A';
		    break;
				 
		case 8 :  
			grade = 'B';
		    break;
		 
		case 7 : case 6 : //case 7에 걸리나 브레이크가 없어서 바로 case6으로 넘어가는 구조
			              // 7과 6이 동시에 실행되는 것이 아니다 
		    grade = 'C';
		    break;
		 
		case 5 : case 4 :
		    grade = 'D';
		    break;
		    
		    default : grade ='F';
			break;
		}
		System.out.printf("당신의 학점은 %s 입니다", grade);
		

	}

}
