package control.ifstmt;

import java.util.Scanner;

/** ���� ���� if������ Ȱ���ؼ� �������⸦ ����� Ŭ����
 * -----------------------------------------------
 * ���� 
 * A 90�̻�
 * B 80~89
 * C 60~79
 * D 40~59
 * F ���� ������
 * ------------------------------------------------
 * printf�� ���
 * @author Administrator
 *
 */

public class Grade {

	public static void main(String[] args) {
		// 1. ����
		int score;
		char grade;
		 
       // 2. ��ĳ�ʸ� �̿��� �ʱ�ȭ
		
		Scanner scan = new Scanner(System.in);
		System.out.println("0~100������ ������ �Է� :");
		score = scan.nextInt();
		
		// 3. ���
		
		if ( score >= 90) {
			grade = 'A';
		}else if ( score >= 80) {
			grade = 'B';
		}else if (score >= 60) {
			grade = 'C';
		}else if (score >= 40) {
		    grade = 'D';
		}else {
			grade = 'F';
		}
		
		
		System.out.printf("%d�� ���� ������ %c%n �Դϴ�",score,grade);
	}
	
	

}
