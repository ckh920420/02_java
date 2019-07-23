package control.loop;

import java.util.Scanner;

public class TotalNAverage {

	public static void main(String[] args) {
		// 1. 선언 
		
		int total = 0;
		int score = 0;
		int count = 0;
		double average;
		
		//2. 초기화
		
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력 (끝내려면 0 입력 : " );
		score = scan.nextInt();
		
		// 3. 사용
		
		while (score != 0) {
			total += score;
			score = scan.nextInt();
			count++;
			}
		
		if ( count == o)
			System.out.println("입력값이 없음");
		else {
			
		}

	}

}
