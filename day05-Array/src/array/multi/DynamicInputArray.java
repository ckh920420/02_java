package array.multi;

import java.util.Scanner;

/**
 * ������ �����ϴ� ���� 2�� �迭 numbers �� ����
 * 
 * numbers�� ������� 4
 * numbers[0] 5
 * numbers[1] 3
 * numbers[2] 2
 * numbers[3] 7
 * 
 * ������ ����� ��ĳ�ʷ� �Է¹޾� ����
 * 
 * ������ �迭�ȿ��� 10~170 ������ ���ڸ� ���� (10���� ����)
 * @author Administrator
 *
 */

public class DynamicInputArray {

	public static void main(String[] args) {
		// 1. ����
		
		Scanner scan = new Scanner(System.in);
		int[][] numbers2d;
		int input;
		
		//2�� �迭 ��� �� ����
		System.out.println("2�� �迭�� ũ�⸦ �Է�(4) : ");
		input = scan.nextInt();
		
		numbers2d = new int[input][];
		
		for (int idx = 0; idx < numbers2d.length;idx++) {
			System.out.printf("�ε���[%d]1�� �迭 ũ�� �Է� :%n",idx);
			input =scan.nextInt();
			
		   numbers2d[idx] = new int[scan.nextInt()];
		    		
		    		for(int ind = 0; ind < numbers2d[idx].length; ind++) {
		    			numbers2d[idx][ind]= (value += 10);
		    		}
		}
		
		

	}

}
