package array.basic;
/**
 * 
 * 1.( ���� )������ ���ҷ� ������ �迭 numbers�� ������ ��
 * 
 * 2. (�ʱ�ȭ) for (index����ϴ� �������� for) ������ ����Ͽ� 1~ 10���� ������ �����Ѵ�
 * 
 * 2. (���) foreach ������ ����Ͽ� 1���� ����� ���� ����ǥ�� ����Ѵ�
 * 
 * @author Administrator
 *
 */

public class SquareTable {

	public static void main(String[] args) {
		// 1. ����
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		for (int num : numbers ) {
			System.out.printf("%d^2 = %d%n", num,(num*num));
		}
		

	}

}
