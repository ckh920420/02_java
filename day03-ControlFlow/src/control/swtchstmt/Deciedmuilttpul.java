package control.swtchstmt;

import java.util.Scanner;

/** �Էµ� ������ 3�� ������� �Ǻ��ϴ� Ŭ����
 * ��� �Ǵܿ� switch ������ ���
 * @author Administrator
 *
 */
public class Deciedmuilttpul {

	public static void main(String[] args) {
		// 1. ����
		int input;
		Scanner scan;
		
		// 2.�ʱ�ȭ
		
		scan = new Scanner(System.in);
		
		//�Է� �ȳ�  prompt
		System.out.println("�ڿ��� �Է�");
		input = scan.nextInt();
		
		//
		
		switch (input % 3) {
		case 0 : 
			System.out.printf("�Է°� %d�� 3�� ���", input);
		break;
     	case 1 : case 2 :
			System.out.printf("�Է°� %d�� 3�� ����� �ƴ�", input);
		break;
			
			//case 2 : System.out.printf("�Է°� %d�� 3�� ����� �ƴ�", input); 
			//break; 
			//���� ���� ����� ���̽� ���� �����ϴ� �������� ���ϰ��� �ϴ� ���� ���̽� 2,3 �� ������ ���׸� �ϱ� ������ �ٿ��� �ۼ���
			default :
				System.out.println(" �߸��� �Է�");
		}
				

	}

}
