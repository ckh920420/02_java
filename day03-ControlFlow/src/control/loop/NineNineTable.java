package control.loop;
/** 
 * ��ø for loop�� ����ؼ� �������� ���
 * 2 ~ 9 �� ��� 
 * 
 * �� ���� ������ �� ���� ���� ���
 * @author Administrator
 *
 */
public class NineNineTable {

	public static void main(String[] args) {
		// 1. ����  2. �ʱ�ȭ  3.���
		//�ܺ� �� ������ ���� ����
		for(int stage =2; stage <=9; stage++) {
			System.out.printf("%n%d �� %n", stage);
		
			for (int times =1 ; times < 9; times++) {
				System.out.printf("%d x %d = %2d%n", stage,times,(stage * times));
			}
		}
         
	}

}
