package control.loop;
/**
 * ȭ���µ��� �����µ��� ��ȯ�ϴ� Ŭ����
 * for ������ Ȱ��
 * @author Administrator
 *
 */
public class F2CTable {

	public static void main(String[] args) {
		// 1. ����
	
		final int STEP;
		final int FROM = 0;
		final int TO = 100;
		
		// �µ� ���� ����
		
		double F;
		double C;
		
		for (F = FROM; F <= TO; F += 10) {
			 C = 5.0/9.0 * (F - 32);
			
			System.out.printf("%5.1f =%5.1f%n",F,C);
		}
		
			
	
		
 
	}
}

