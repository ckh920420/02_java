package control.loop;
/**
 * 2단, 3단, 4단
 * 5단, 6단, 7단
 * 3개씩 묶어서 출력
 * 
 * @author Administrator
 *
 */

public class NineNine2 {

	public static void main(String[] args) {
		// 
		final int STEP = 3;
        for (int stage =2; stage <= 9; stage += STEP) {
        	System.out.printf("%d%n", stage);
        	
        	for(int times =1; times <= 9; times++ )
        		System.out.printf("%d x %d = %d%n " ,stage ,times, (stage * times));
        }
        
        for (int stage =3; stage <= 9; stage += STEP) {
        	System.out.printf("%d%n", stage);
        	
        	for(int times =1; times <= 9; times++ )
        		System.out.printf("%d x %d = %d%n " ,stage ,times, (stage * times));
        }
        
        for (int stage =4; stage <= 9; stage += STEP) {
        	System.out.printf("%d%n", stage);
        	
        	for(int times =1; times <= 9; times++ )
        		System.out.printf("%d x %d = %d%n " ,stage ,times, (stage * times));
        }
        
      
	}

}
