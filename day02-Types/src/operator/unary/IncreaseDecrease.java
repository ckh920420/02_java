package operator.unary;

/**
 * ���� �����ڸ� �׽�Ʈ �غ��� Ŭ����
 * -----------------------------------
 * +,- : ��ȣ ������ (��ȣ�� ������ ��)
 *       ������ ���ʿ� �ٿ��� �ش� ������ �ִ� ���� ���� ��ȣ�� ����
 * ++,-- : ����������
 *        ������ ����/�����ʿ� �ٿ��� 
 *        �ش� ������ ���� 1�� �����ϰų� 1�� ���ҽ�Ű�� ������ ����
 *--------------------------------------------------------------------------------
 * @author Administrator
 *
 */

public class IncreaseDecrease {

	public static void main(String[] args) {
		// 1. ����, 2, �ʱ�ȭ
		int ten = 10;
		int count = 0;
		
		//3. - �����ڷ� ��ȣ ����
		System.out.println("ten=" + ten);
		
		ten = -ten;//
		System.out.println("ten=" + ten);
		
		ten = -ten;
				
				
	   //4. ++,-- �����ڷ� count�� ���� ����
		System.out.println(++count); // count = count + 1 (�������)
		System.out.println(count++); //count = count + 1 (����Ŀ�)
		                             // �� ++�� �ڿ� �ٿ����� �¿��� ��� �������� ������ count �ܰ迡�� 
		                             // ������� �����ϰ� ++�ܰ迡�� ������ �ۿ��ϰ� �ȴ� �׷��Ƿ� �� ���� 1�̴�
		
		System.out.println(count);  // ���� ����� ��� ����� �ݿ��Ͽ� 2
		System.out.println(--count);// count =count - 1 ��� ����
		System.out.println(count--);// count = count -1 ��� �Ŀ�
		System.out.println(count);  // ���� ��� ���� �� count �� 0
		
		System.out.println("=================================");
		
		System.out.println(count++);
		System.out.println(count++);
		System.out.println(count++);
		System.out.println(count++);
		System.out.println(count++);
		System.out.println(count++);
		System.out.println(count++);
		
		System.out.println("=================================");
		
		System.out.println(count--);
		System.out.println(count--);
		System.out.println(count--);
		System.out.println(count--);
		System.out.println(count--);
		System.out.println(count--);
		System.out.println(count--);
		System.out.println(count--);
		
		// �ݺ������� ��밡���� ����������
	}

}
