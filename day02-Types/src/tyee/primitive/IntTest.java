package tyee.primitive;

/** 
 * Int : ������ Ÿ���� ���� �⺻/��ǥ Ÿ��
 * -------------------------------
 * intŸ����  �׽�Ʈ�ϴ� Ŭ�����̴�
 * @author Administrator
 *
 */
public class IntTest {

	private static int ;

	public static void main(String() args) {
		//1. ����, 2. �ʱ�ȭ ���ÿ� ����
		//�����Ҷ�, ���ٿ� ������ �޸�(,)�� �����Ͽ� ���� �� ���𰡴�
		//�� ��, Ÿ���� �� �ʿ� �ѹ��� �����ϸ� �ȴ�.
		//�׷���, ���ٿ� �ѹ� ����, �ʱ�ȭ�� �����ϴ� ���� �۾��� �����ϴ�. �ڵ��� �������� �����Ѵٸ� ������
		int num1 = 5; 
		int num2 =28;
		int num3, num4, num5 ;
	    
		//�ѹ� 3,4,5, �� ����� �ѹ� 1,2�� �������� �ʱ�ȭ
		num3 = num1 * num2;
		num4 = num2 / num1;
		num5 =25 /num1;
		
		//3. ���   : ���� �� ���
		System.out.println("5 * 28 = " + num3);
		System.out.println("28 / 5 = " + num4);
		System.out.println("25 / 5 = " + num5);
        
	}

}
