package array.iniit;

/**
 * boolean, int, doulbem String Ÿ���� ���Ҹ� ������ 
 * �迭 �װ����� �����ϰ�
 * 
 * ũ�⸦ 5�� ������ ��
 * 
 * �� �迭�� ���Ұ� �ʱ�ȭ �� ���� Ȯ���Ѵ�.
 * @author Administrator
 *
 */

public class MultiTypeArrayInit {

	public static void main(String[] args) {
		// �� �迭�� ũ�⸦ �����ϴ� ���
		final int SIZE =5;

		// 1. ����
		boolean[] flags = new boolean[SIZE];
		int[] ages = new int[SIZE];
	    double[] heights = new double[SIZE];
		String[] names = new String[SIZE];
	
		// �� �迭�� ���� ���� ���
		//foreach
		System.out.println("(1) boolean �迭 ���");
		for(boolean flag : flags) { 
			System.out.printf("flag = %b%n", flag);
		}
		
	
		}
	}

