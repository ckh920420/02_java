package control.loop;
/**
 * 
 *1~10 ���� ����ϴ� Ŭ����
 *for ������ ����Ͽ� ���
 *---------------------------------------------------
 * @author Administrator
 *
 */
public class PrintToTenByFor {

	public static void main(String[] args) {
		// for (�����; ���ǽ�; ������ ) {
		//      �����;
		// }
		
		//1. ����� : ������ ���� -> Ÿ�� �����̸�;
		//2. ���ǽ� : ������ ���� => �񱳿����� (����, ����)�� ����� ��, ������ ����� ���� ������ �����
		//3. ������ : ���������� (++ -- )�� Ȱ���Ͽ� ����Ŀ��� ����� ���� ���� ���� ���� ����
		//-----------------�� �� �� ��----------------------------------------------------------
		// ��� ������� �ڽ��� ����� ��� �������� ��� ������ for�� ��� for ��ȣ �ȿ� ����Ǿ����Ƿ� for loop �������� ��밡��
		// ��  �޼ҵ� �ȿ��� ( �� ��� �ȿ�����) �ߺ��� ���� �Ұ���
		for(int idx = 1; idx <= 10; idx++) {
            System.out.printf("idx=%2d%n",idx);
            }
		
            
		
		System.out.println("=====================================");
		
		for(int idx = 10; idx >= 0; idx--) {
            System.out.printf("idx=%2d%n",idx);
		
		// �ΰ��� for�������� ���� int idx�� �����Ͽ����� ������ �߻����� �ʾҴ�. �̴� ���� �ٸ� ��Ͽ��� ����Ǿ��� �����̴� 
	}
		
		// final���� == ����� Ȱ���� forloop
		final int FROM = 1;
		final int TO = 10;
		
		for(int idx = FROM; idx <= TO; idx++) {
            System.out.printf("idx=%2d%n",idx);
}
		System.out.println("== FROM, TO�� Ȱ���ؼ� 0 ~ 9���� ���==");
		
		for(int idx = FROM; idx <= TO; idx++) {
            System.out.printf("idx=%2d%n",idx-1);
		
}
}
}
