package control.loop;
/** 
 * 1. 50 ~ 0 ���� ¦���� �������� ���
 *    (1) ��Ƽ�� ����
 *    (2) ��Ƽ�� ����ؼ�
 * --------------------------------
 * 2. 1~10���� ����ǥ ���
 *    1 X 1 = 1
 *    2 X 2 = 4
 *    ���·� ���
 * @author Administrator
 *
 */
public class ForTest {

	public static void main(String[] args) {
		// 1. 1. 50 ~ 0 ���� ¦���� �������� ���
        //		(1) ��Ƽ�� ����
        //	    (2) ��Ƽ�� ����ؼ�
     
        
		for (int even = 0, sum;  even <= 50; even--) {
			if ( even % 2 == 0) {
				even = sum;
			}
			System.out.printf("%d",even);
		
		}
		
	}
}


