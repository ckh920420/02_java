package control.ifstmt;

import java.util.Scanner;

/**
 * �ϳ��� ������ �Է� �޾Ƽ� 
 * ������� �������� �Ǵ��ϴ� Ŭ����
 * 
 * ��, �� ���⼭�� 0 �� ���� �Ǵ��� ���� �ʴ´�
 * 
 * �Է¹��� ����input �� ���� �Ͽ� Scanner�� �Է� �ް�
 * if~else �������� ��ȣ�� �Ǻ��� ��
 * �Ǻ� ����� �����ϴ� ���� String result�� �����Ͽ�
 * 
 * " �Է°� 100(��)�� ��� �Դϴ�. "
 * " �Է°� -1 ��(��) ���� �Դϴ�." ��� ������ ����Ͻÿ�.
 * @author Administrator
 *
 */
public class PositiveNegative {

	public static void main(String[] args) {
		// 1. ����
		int input;
		String result;
		
		// 2. �ʱ�ȭ
		
		Scanner scan; 
		
		scan = new Scanner(System.in);
		System.out.println("����");
		input = scan.nextInt();
		
		
		// 4. ���
		if (input > 0) {
			result = "���";
		} else {
			result = "����";
		}
		
		// 5. ���
		
		System.out.printf("%d �� %s�Դϴ�", input, result);

	}


}
