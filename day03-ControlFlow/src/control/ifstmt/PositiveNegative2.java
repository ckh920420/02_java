package control.ifstmt;

import java.util.Scanner;

/**
 * �ϳ��� ������ �Է� �޾Ƽ� 
 * ������� �������� �Ǵ��ϴ� Ŭ����
 * 
 *
 * 
 * �Է¹��� ����input �� ���� �Ͽ� Scanner�� �Է� �ް�
 * if~else �������� ��ȣ�� �Ǻ��� ��
 * �Ǻ� ����� �����ϴ� ���� String result�� �����Ͽ�
 * 
 * " �Է°� 100(��)�� ��� �Դϴ�. "
 * " �Է°� -1 ��(��) ���� �Դϴ�." ��� ������ ����Ͻÿ�.
 * " �Է°��� 0�Դϴ�"
 * @author Administrator
 *
 */
public class PositiveNegative2 {

	public static void main(String[] args) {
		// 1. ����
		int input;
		String result;
		
		
		// 2. �ʱ�ȭ
		
		Scanner scan; 
		
		scan = new Scanner(System.in);
		System.out.println("������ �Է�");
		input = scan.nextInt();
		
		
		

		
		// 4. ���
		if (input > 0) {
			result = "���";
		} else if (input < 0 ) {
			result = "����";
		} else {
          result = "0";
		}
		// 5. ���
		
		System.out.printf("%d �� %s�Դϴ�", input, result);

	}


}
