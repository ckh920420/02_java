package control.loop;
/**
 * 2��, 3��, 4��
 * 5��, 6��, 7��
 * 3���� ��� ���
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
