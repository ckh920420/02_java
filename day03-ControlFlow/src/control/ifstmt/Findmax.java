package control.ifstmt;

import java.util.Scanner;

/** 
 * 큰 값의 정수를 확인하는 클래스
 * @author Administrator
 *
 */

public class Findmax {

	public static void main(String[] args) {
		//1. 선언
		int x;
		int y;
		int max = 0;
		
	    Scanner scan;
	    
		//2. 초기화
	    
	    scan = new Scanner(System.in);
	    
	    //3. 입력을 알리는 메세지
	    System.out.println("두 정수를 입력(space bar 로 분리");
	    
	    // 스캐너로 사용한 정수 입력 (초기화)
	    x = scan.nextInt();
	    y = scan.nextInt();
	    
	    // 4. 사용
	    
	    if (x > y) {
	    	max = x;
	    	System.out.printf("입력된 두 값 x=%d, y=%d 중 큰값은 %d%n" , x ,y, max); 
	    }
	    
	    
	    if (y > x) {
	    	max = y;
            System.out.printf("입력된 두 값 x =%d, y =%d 중 큰 값은 %d%n." , x, y, max);
	    }
		
	    if( x == y) {
	    	System.out.printf("입력된 두 값 x = %d, y = %d 이 동일합니다. %n",x, y);
	    }
	    
		//

	}

}
