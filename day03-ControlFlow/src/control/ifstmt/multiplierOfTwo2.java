package control.ifstmt;

import java.util.Scanner;

/**
 * --(2)-----------------------------------------------
 * �������� int mod;�� �����Ͽ� ����Ͻÿ�
 * 
 * 2�� ����� �� : "�Է°� 4��(��) 2�� ����Դϴ�"
 * 2�� ����� �ƴ� �� : "�Է°� 5��(��) 2�� ����� �ƴմϴ�"
 *                  "�������� 1�Դϴ�"
 *                  
 *                  if(input % 2 == 0) --> �������� ���ϴ� ��
 *                  �����ڵ� ���̿��� �켱������ Ȱ���� ��
 *                  ������ ������ �� �켱 ���� �Ǿ����� Ȱ��
 *                  ��) input �� 3�� ��� 2�� �������� ��
 *                     0�� ���� �Ѱ�? 
 *                     --> �׷��� = > 2�� ���
 *                     --> �ƴϴ� = > 2�� ����� �ƴ� 
 *                     
 * �Է°��� 0�� ��� : "0�� ����Ǻ��� �� �� �����ϴ�" �� ����� �� �ֵ��� ���� ���� (�߰�)
 *                  (if ������)-- ��ø if������ �ذ�
 *                  
 *------------------------------------------------------
 * @author Administrator
 *
 */

public class multiplierOfTwo2 {

	public static void main(String[] args) {
		// 1. ����
		int input;
		int mod =0;
		String result;
		Scanner scan;
		
		// 2. �ʱ�ȭ
		
		scan = new Scanner(System.in);
		System.out.println("������ �Է��Ͻÿ�.");
		input = scan.nextInt();
		result ="aa";
		
		
		// 3. ���
		
		if (input % 2 == 0 ) {
		   result = "�Դϴ�";
		   } else {
		   result = "�ƴմϴ�";
		   mod = input % 2;
		   }
		
		// �Է°��� 0�� ��� " 0�� ��� �Ǻ� �Ұ�"
		//if{input == 0) {
		 System.out.println("0�� ��� �Ǻ� �Ұ�");
		 
		 if (input == 0)
			 
			
		
			
			
			
			System.out.printf("�Է°� %d ��(��) 2�� ��� %s %d �� ������ �� ", input, result, mod);
		}

	}


