package control.ifstmt;

import java.util.Scanner;

/** 
 * ū ���� ������ Ȯ���ϴ� Ŭ����
 * @author Administrator
 *
 */

public class Findmax {

	public static void main(String[] args) {
		//1. ����
		int x;
		int y;
		int max = 0;
		
	    Scanner scan;
	    
		//2. �ʱ�ȭ
	    
	    scan = new Scanner(System.in);
	    
	    //3. �Է��� �˸��� �޼���
	    System.out.println("�� ������ �Է�(space bar �� �и�");
	    
	    // ��ĳ�ʷ� ����� ���� �Է� (�ʱ�ȭ)
	    x = scan.nextInt();
	    y = scan.nextInt();
	    
	    // 4. ���
	    
	    if (x > y) {
	    	max = x;
	    	System.out.printf("�Էµ� �� �� x=%d, y=%d �� ū���� %d%n" , x ,y, max); 
	    }
	    
	    
	    if (y > x) {
	    	max = y;
            System.out.printf("�Էµ� �� �� x =%d, y =%d �� ū ���� %d%n." , x, y, max);
	    }
		
	    if( x == y) {
	    	System.out.printf("�Էµ� �� �� x = %d, y = %d �� �����մϴ�. %n",x, y);
	    }
	    
		//

	}

}
