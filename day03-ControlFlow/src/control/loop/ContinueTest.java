package control.loop;
/**
 * continue : ���� ���� ���� ���� ( �������� �ʴ´� )
 * 
 * 1 ~100 ������ Ȧ���� ���� ���ϴ� Ŭ����
 * 
 * @author Administrator
 *
 */

public class ContinueTest {

	public static void main(String[] args) {
		// 1. ����    2. �ʱ�ȭ
		int sum = 0;
		
		// 3. ���
		for (int idx = 1; idx <= 100; idx++) {
			if (idx % 2 == 0) {
				continue;
			}
			sum += idx;
		}
		System.out.printf("�ջ� %d%n", sum);
		
		// ����  : 1 ~ 100 ������ 3�� ����� ���� ���Ͻÿ� (continue ���)
		
		int sum3 = 0;
		
		for(int idx3 = 1; idx3 <= 100; idx3++) {
			if ( idx3 % 3!=0) {
				continue;
				
				
			}
		}
		

	}

}
