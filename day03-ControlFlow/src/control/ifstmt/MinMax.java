package control.ifstmt;

import java.util.Scanner;

/** 
 * �� ������ �Է¹޾� �� �� ū ��, ���� �� �� �������� Ŭ����
 * @author Administrator
 *
 */

public class MinMax {

	public static void main(String[] args) {
		// 1. ����
		//�Է� ���� ���� ����
		int x,y;
		
		//ū ��, ���� ���� ������ ���� ����
		int min, max;
		
		//�Է��� ���� ��ĳ�� ����
		Scanner scan; 
		
		// �ʱ�ȭ
		
		scan = new Scanner(System.in);
		System.out.println("�� ������ �Է�");
		
		// ��ĳ�ʸ� ����Ͽ� x, y �� ������ ���� �Է�
		x = scan.nextInt();
		y = scan.nextInt();
		
		//���
		
		if (x < y) {
			min = x;
			max = y;
		}else {
			min =y;
			max =x;
		}
		
		//���
		System.out.printf( "�Էµ� �� ���� : %d, %d%n", x, y);
		System.out.printf("���� �� : %d%n",min);
		System.out.printf("ū �� : %d%n",max);
		}

	}


