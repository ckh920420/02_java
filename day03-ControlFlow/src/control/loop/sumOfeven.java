package control.loop;
/** 
 * 1~100������ ¦���� ���� ���ϴ� Ŭ����
 * @author Administrator
 *
 */

public class sumOfeven {

	public static void main(String[] args) {
		// 1. ����, 2. �ʱ�ȭ
		int num = 2;
		int sum = 0;
		
		//3. ���
		while (num <= 100) {
			sum += num;
			num += 2;
		}
		System.out.printf("1���� 100���� ¦���� ���� %d�Դϴ�.%n", sum);

	}

}
