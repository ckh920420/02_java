package control.ifstmt;

import java.util.Scanner;

/** 
 * 두 정수를 입력받아 둘 중 큰 값, 작은 값 을 가려내는 클래스
 * @author Administrator
 *
 */

public class MinMax {

	public static void main(String[] args) {
		// 1. 선언
		//입력 받을 변수 선언
		int x,y;
		
		//큰 값, 작은 값을 저장할 변수 선언
		int min, max;
		
		//입력을 받을 스캐너 선언
		Scanner scan; 
		
		// 초기화
		
		scan = new Scanner(System.in);
		System.out.println("두 정수를 입력");
		
		// 스캐너를 사용하여 x, y 두 변수에 정수 입력
		x = scan.nextInt();
		y = scan.nextInt();
		
		//사용
		
		if (x < y) {
			min = x;
			max = y;
		}else {
			min =y;
			max =x;
		}
		
		//출력
		System.out.printf( "입력된 두 정수 : %d, %d%n", x, y);
		System.out.printf("작은 값 : %d%n",min);
		System.out.printf("큰 값 : %d%n",max);
		}

	}


