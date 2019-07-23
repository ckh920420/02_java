package operator.binary;

import java.util.Scanner;

/**
 * ������ ����� �����ϴ� printf() �޼ҵ带 �׽�Ʈ�ϴ� Ŭ����
 *  -------------------------------- 
 *  %d : decimal : ������ ���
 *  %b : boolean : �� ������ boolean �� ���
 *  %f : float   : �Ǽ� ���
 *  %s : String  : ���ڿ� ��� 
 *  %c : char    : ���� 1�� ���
 *  %x : hexadecimal : 16���� ���
 *  %n : new line : ���� �� �������
 *  %% : % ���� ��ü ���
 * @author Administrator
 *
 */
public class PrintfTest {

	public static void main(String[] args) {
		// 1. ����  : ���� �Է°��� ������ ���� ����
		int input1;
		int input2;
		
		// Ű���� �Է��� ���ϰ� ���ִ� ��ĳ�� ����
		// ��ĳ�� ����� ���ؼ� import ���
		// �ڵ� ����Ʈ : ��Ʈ�� + ����Ʈ + ���� O Ű
		Scanner scan;
		
		// 2. �ʱ�ȭ
		input1 = 222;
		input2 = 100;
		
		//scan �ʱ�ȭ
		scan = new Scanner(System.in);
		//new ������ : �� �ʸӿ� ���ο� ���𰡸� ������
		
		//�Է� �ȳ����� ���
	    System.out.println("���� �� ���� �Է� : ");
		
		//scan ���
		input1 = scan.nextInt();
		input2 = scan.nextInt();
		
		// 3. printf�� ���
		System.out.printf("%d + %d = %d%n", input1, input2, (input1 + input2));
		System.out.printf("%d - %d = %d%n", input1, input2, (input1 - input2));
		System.out.printf("%d * %d = %d%n", input1, input2, (input1 * input2));
		System.out.printf("%d / %d = %d%n", input1, input2, (input1 / input2));
		System.out.printf("%d %% %d = %d%n", input1, input2, (input1 % input2));
		
		
		
		

	}

}
