package operator.ternary;

import java.util.Scanner;

/**
 * 
 *���� ������ (���ǽ�? ��1 : ��2)�� �׽�Ʈ�ϴ� Ŭ����
 *---------------------------------------------------
 *���ǽ� : �������� �׻� ��/���� �� booleanŸ���� 
 * @author Administrator
 *
 */
public class ternarytast {

	public static void main(String[] args) {
		// 1. ����, 2. �ʱ�ȭ
		int x = 10;
		int y = -10;
		
		int absX = (x>=0)? x : -x;
		int absY = (y>=0)? y : -y;
		
		// 3. ��� : ���
		
		System.out.printf("x=%d �� ��, x�� ������ %d%n", x, absX);
		System.out.printf("y=%d �� ��, y�� ������ %d%n", y, absY);

		//��ĳ�ʸ� ����Ͽ� �Է¹��� ������ ���� ������ ���ϱ�
		//������ ���غ���
		//1. ��ĳ�� �� ���� ���� ����
		Scanner scan;
		
	    int z;
	    int absZ;
	    
	    //2. ��ĳ�� �� ���� �ʱ�ȭ
		scan = new Scanner(System.in);
		
		//������ �Է����� �˷��ִ� �޼��� ���
		System.out.println("������ �Է��ϼ���");
	    z = scan.nextInt();
	    
	    absZ = ( z>=0 )? z : -z;
	    System.out.printf("z=%d �� ��, z�� ���밪�� %d%n",z,absZ);
		
		
		
		
	}

}
