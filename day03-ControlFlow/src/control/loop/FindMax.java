package control.loop;

import java.util.Scanner;

/** 
 * �Էµ� �ڿ��� �߿��� �ִ��� ã�� Ŭ����
 * do -while
 * @author Administrator
 *
 */
public class FindMax {

	public static void main(String[] args) {
		// 1. ����
		int input;
		int max;
		Scanner scan = new Scanner(System.in);
		input =scan.nextInt();
		
		
		// 2. �ʱ�ȭ
		max = 0;
		
		//
		
		do {
			System.out.println("����� �Է� (��������� 0�Է�)");
			
			if (input > max) {
				max = input;
			}
		}while (input >0);
        System.out.printf("�ִ��� %d �Դϴ�.%n");		
				
		

	}

}
