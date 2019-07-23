package control.loop;
/**
 * 화씨온도를 섭씨온도로 변환하는 클래스
 * for 구문을 활용
 * @author Administrator
 *
 */
public class F2CTable {

	public static void main(String[] args) {
		// 1. 선언
	
		final int STEP;
		final int FROM = 0;
		final int TO = 100;
		
		// 온도 변수 선언
		
		double F;
		double C;
		
		for (F = FROM; F <= TO; F += 10) {
			 C = 5.0/9.0 * (F - 32);
			
			System.out.printf("%5.1f =%5.1f%n",F,C);
		}
		
			
	
		
 
	}
}

