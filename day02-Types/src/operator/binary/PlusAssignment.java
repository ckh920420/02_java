package operator.binary;
/**
 * ���� ���� ������
 * 
 * += : ����� ���� ���� �� ������ ������ ���Ҵ�
 * 
 * @author Administrator
 *
 */

public class PlusAssignment {

	public static void main(String[] args) {
		// 1. ����, 2. �ʱ�ȭ
		int num =0;
		
		// 3. ���
		System.out.printf("�ʱ� num �� : %d%n" , num);
		
		num += 1;
		System.out.printf("num += 1 ���� ��,  num = %d%n", num);
		
		num = num +1;
		System.out.printf("num += 1 ���� ��,  num = %d%n", num);
				
		num += num + 1;
		System.out.printf("num += num + 1 ���� ��,  num = %d%n", num);
		
		num *= num *num;
		System.out.printf("num *= num * num ���� ��,  num = %d%n", num);
		
		
	}

}
