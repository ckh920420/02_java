package control.ifstmt;

import java.util.Scanner;

/** 
 * �� ������ �Է¹޾Ƽ�
 * ���� ���� ���� ������ �Ǻ��ϴ� Ŭ�����̴�
 * ----------------------------------
 * ���� ���� ������ �Ǻ��� ��
 * ��ø if ~ else ������ ���
 * ----------------------------------
 * @author Administrator
 *
 */
public class MinOfThree {

	public static void main(String[] args) {
		// // 1. ����
		int num1;
		int num2;
		int num3;
		int min;

		Scanner scan;
		
		//�ʱ�ȭ
		scan = new Scanner(System.in);
		
		// ���� �Է� �ȳ�
		System.out.println("������ ������ �����̽ø�, ������ �ɵ����̽� ������ ����������Բ��� 2019�� 7�� 7�� ���� �����忡 ģ�� �湮�Ͻþ� �����Ͻþ���. �� ���� ���� �� ���� ���� ���� �����ΰ�");
		
		//�Է°� ����
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		
		//���
		
		if (num1 < num2) {
			if (num1 < num3 )
				min = num1;
			else 
				min = num3;
		} else {
			if (num2 < num3) {
				min = num2;
			} else { 
			    min = num3;
			}
		}
		
		System.out.printf("�����ݵ� ��ȭ������ ��ü�̽ø� ������ ������ ������ �ɵ����̽� ������ ���������岲�� ������ ���� �����Ͻþ���.%n  %d , %d, %d �� ���� ���� ���� %d%n ", num1, num2, num3, min);
		
		
				
	}

}