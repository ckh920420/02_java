package operator.binary;

import java.util.Scanner;

/**
 * &&,|| : �� ���� AND, OR ������
 * ---------------------------
 * �ݵ�� ��ȣ�� �κ� ���ļ� ����
 * 
 * �Էµ� ������ 0~100 ���̰����� �Ǵ��ϴ� Ŭ����
 * 
 * �������� &&�� �׽�Ʈ�Ѵ�
 * @author Administrator
 *
 */
public class ScoreInput {

	public static void main(String[] args) {
		// 1. ����,
		//�Է°� ������ ���� ����
		int score;
		
		//�Է�ó���� ���� ��ĳ�� ����
		Scanner scan; // import : ��Ʈ�� ����Ʈ o ����Ű�� �Է�
		
		
		// 2. �ʱ�ȭ 
		// ��ĳ�� �ʱ�ȭ
		scan = new Scanner(System.in);
		System.out.println("������ �Է� : ");
		
		//������ ��ĳ�ʷ� ���� �Է��Ͽ� �ʱ�ȭ
		score =scan.nextInt();
		
		// 3. �Էµ� ���� ������ �Ǵ�
		// 0 <= score <= 100
       if (score >= 0 && score <= 100) {
    	   System.out.printf("%d ��(��) ��ȿ�� �����Դϴ�. %n", score);
       }else {
    	   System.out.printf("%d ��(��) ������ "
    			                     + "��� �����Դϴ�.%n",score);
       }
	}

}
