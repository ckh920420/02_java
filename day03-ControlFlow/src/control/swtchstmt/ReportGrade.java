package control.swtchstmt;

import java.util.Scanner;

/**
 *  switch������ Ȱ���� ���� ��� 
 *  ---------------------------------------
 * ���� 
 * A 90�̻�
 * B 80~89
 * C 60~79
 * D 40~59
 * F ���� ������
 * -------------------------------------------
 * @author Administrator
 *
 */
public class ReportGrade {

	public static void main(String[] args) {
		// 1. ����
		
		int score;
		char grade;
		
		// 2. �ʱ�ȭ
		Scanner scan = new Scanner(System.in) ;
		System.out.println("0~100 ������ ������ �Է�");
		score = scan.nextInt();
		
		// 3. ���
		
		switch ( score /10) {
		case 9 : case 10 :
			grade = 'A';
		    break;
				 
		case 8 :  
			grade = 'B';
		    break;
		 
		case 7 : case 6 : //case 7�� �ɸ��� �극��ũ�� ��� �ٷ� case6���� �Ѿ�� ����
			              // 7�� 6�� ���ÿ� ����Ǵ� ���� �ƴϴ� 
		    grade = 'C';
		    break;
		 
		case 5 : case 4 :
		    grade = 'D';
		    break;
		    
		    default : grade ='F';
			break;
		}
		System.out.printf("����� ������ %s �Դϴ�", grade);
		

	}

}
