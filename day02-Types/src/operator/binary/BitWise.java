package operator.binary;

/**
 * ��Ʈ ������ �����ϴ� �����ڸ� �׽�Ʈ
 * &,|,^ :��Ʈ ������, �������� �ƴԿ� ������ ��
 *        ���� ������
 * ~ : ��Ʈ������ : �� ��Ʈ�� 0->1,1->0���� ����
 *     ���׿�����
 * @author Administrator
 *
 */
public class BitWise {

	public static void main(String[] args) {
		// 1. ���� ����, 2. �ʱ�ȭ
		int a = 0x1f05;
		int b = 0x31a1;
		
		// printf�� 16������ �ٷ� ���
		System.out.printf("%x & %x = %x%n", a, b, (a & b));
		System.out.printf("%x | %x = %x%n", a, b, (a | b));
		System.out.printf("%x ^ %x = %x%n", a, b, (a ^ b));
		System.out.printf("~%x = %x%n", a, ~a);
	}

}
