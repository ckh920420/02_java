package control.loop;
/** 
 * 1. 50 ~ 0 까지 짝수만 역순으로 출력
 *    (1) 컨티뉴 없이
 *    (2) 컨티뉴 사용해서
 * --------------------------------
 * 2. 1~10까지 제곱표 출력
 *    1 X 1 = 1
 *    2 X 2 = 4
 *    형태로 출력
 * @author Administrator
 *
 */
public class ForTest {

	public static void main(String[] args) {
		// 1. 1. 50 ~ 0 까지 짝수만 역순으로 출력
        //		(1) 컨티뉴 없이
        //	    (2) 컨티뉴 사용해서
     
        
		for (int even = 0, sum;  even <= 50; even--) {
			if ( even % 2 == 0) {
				even = sum;
			}
			System.out.printf("%d",even);
		
		}
		
	}
}


