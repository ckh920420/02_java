package control.ifstmt;

import java.util.Scanner;

/**
 * �� ���� �� ���� ���� �������� Ŭ����
 * �� ������ Scanner�� �Է� �޴´�
 * 
 * @author Administrator
 *
 */

public class FindMin {

	public static void main(String[] args) {
		// 1. ���� : �Է� ���� ����, �������� ������ ����
		int x;
		int y;
        int min = 0 ;
        Scanner scan;
        
        //2. �ʱ�ȭ
        scan = new Scanner(System.in);
        
        //3. �Է��� �˸��� �ȳ� �޼���
        System.out.println("�� ������ �Է�( �����̽� �ٷ� �и�)");
        //���ɳ� ����� ���� �Է�
        x = scan.nextInt();
        y= scan.nextInt();
        
        // 3. ��� : �Էµ� �� ���� ��
        if(x < y) {
          min =x;
        }
        if(y < x) {
          min = y;
        }
        System.out.printf("�Էµ� �� �� x = %d, y=%d �� ���� ���� %d%n"
        		  , x, y, min );
	}

}
