package array.multi;

/**
 * ������ ����� ��Ÿ�� �� �ִ� 
 * 2���� �迭�� �����ϰ� �ʱ�ȭ �� ����غ��� Ŭ����
 * @author Administrator
 *
 */

public class Matrix {

	public static void main(String[] args) {
		// 1. ���� 2. �迭 �ʱ�ȭ ������� �ʱ�ȭ
		int[][] matrix = {{0,1,0},{1,1,1},{0,0,0}};
		
		//���
		for (int idx = 0; idx < matrix.length; idx++) {
		     for (int ind = 0; ind < matrix[idx].length ; ind++) {
		    	 //matrix[0].length ==> matrix[idx].length
		    	 
		    	 
		     }System.out.printf("%d\t", matrix[idx],[ind]);
		     

	} 
       // ��� (foreach)
		for (int[] numbers : matrix) {
			for (int num : numbers) {
				System.out.printf("%d\t", num);
			}
			System.out.println();
				
				
			}
		}
}
}
