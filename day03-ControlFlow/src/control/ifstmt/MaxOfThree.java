package control.ifstmt;

import java.util.Scanner;

/** �Էµ� �� ���� �� ���� ū ���� �Ǻ��ϴ� Ŭ����
 * �Է°��� ����  int, num1, num2, num3; ������ ����
 * ���� ū ���� int max; ������ ����
 * 
 * ��ø if ~ else �� �Ǵ�
 * 
 *
 * @author Administrator
 *
 */
public class MaxOfThree {

	public static void main(String[] args) {
		// ����
		
		int num1;
		int num2;
		int num3;
		int max;
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" �� ������ �Է� ");
		
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		
		//���
		
		if (num1 > num2) {
			if(num1 > num3)
				max = num1;
		    else {
			    max = num3;
		}
			}else {
			if (num2 > num3) {
				max = num2;
			}else  {
				max =num3;
			}
			
		
			}
		System.out.printf("�� ���� �� �ִ��� %d �Դϴ�.",max);
		}
		

	}


