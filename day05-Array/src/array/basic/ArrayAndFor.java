package array.basic;

/**
 * 10ĭ ¥�� int �迭 number�� ����, ���� ��
 * �� ������ ���� 0�� index ���� 9�� index���� 
 * 10, 20, 30..100���� ����
 * �迭�� ����� ������ ���� int summary; ������ �����Ͽ� ����϶�
 * @author Administrator
 *
 */

public class ArrayAndFor {

	public static void main(String[] args) {
		// 1. ���� , 2. chrlghk
		
		int[] numbers;
		int summery;
		;
		numbers = new int[10];
		
		// 3. �� ����
		
		for (int idx = 0; idx < numbers.length; idx++	) {
			numbers[idx] = (idx +1) * 10;
		
					
		
		}
		// 4. �ջ� ���
		System.out.printf("������ �� : %d%n",summery);
		
		// 5. �� �� ����
		for (int idx = 0; idx < numbers.length; idx++	) {
			numbers[idx] = (idx + 1) * 100;
		
		}
		
		//for each �������� ���
		
		for (int num : numbers ) {
			System.out.println("num+" + num);
			
		}

	}

}
