package operator.binary;

/**
 * <,>,<=,=<,==,!=
 * 
 * �� ������ ���� ���ϴ� �񱳿����ڸ� �׽�Ʈ�ϴ� Ŭ����
 * ���迬���� �����booleanŸ������ �����
 * 
 * 
 * @author Administrator
 *
 */
public class RelationalTest {

	public static void main(String[] args) {
		// 1. ����, 2. �ʱ�ȭ
		int a = 1;
		int b =-5;
		
		// 3. �񱳿����� ���
		System.out.println("� �� ������");
		
		System.out.printf("(%d == %d) : %b%n",a,b,(a == b));
		System.out.printf("(%d != %d) : %b%n",a,b,(a != b));
		
		System.out.println("��Һ� ������");
		
		
		System.out.printf("(%d < %d) : %b%n" ,a,b,(a < b));
		System.out.printf("(%d > %d) : %b%n" ,a,b,(a > b));
		System.out.printf("(%d >= %d) : %b%n" ,a,b,(a >= b));
		System.out.printf("(%d <= %d) : %b%n" ,a,b,(a <= b));
	}
		// ��Ŭ����IDE�����
	    // ��Ʈ�� �� : Ŀ���� �ִ� ���� ��ü����
        //��Ʈ ����Ʈ a : ���� ����������� ��� ���� Ű �ѹ��� ������ ������
	    // ��Ʈ ��/�ٿ� : �� ��ü ���� �̵�
        // ��Ʈ�� ����Ʈ L : ����Ű ���� �ȳ�â ����
		// ��Ʈ�� F6 : �����ִ� ���� ���̿� �̵�
}                                         
