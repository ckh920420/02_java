package array.basic;
/**
 * �ڹ� 1.5���� ���� �����Ǵ�
 * ���� for�ݺ����� ���
 * ----------------------
 * ������ ������ �Բ� ����Ѵ�.
 * 
 * ������ ���� : 1. �迭 (Array)
 *            2. ����Ʈ (List)
 *            3. �� (Map)
 *            4. �� (Set)
 *-----------------------------
 * @author Administrator
 *
 */
public class ForEachTest {

	public static void main(String[] args) {
		// 1. �迭�� ����(�� ���ÿ� ���� �����鼭 �ʱ�ȭ)
		int [] number = {1,2,3,4,5};  
		int sum =0;
		//foreach�������� �迭 �� ���
		//for( ������ Ÿ�� �����̸� : �ڷᱸ��(== �迭) { �����; }
		for (int num : number) {
			System.out.println("num=" + num);
		}
		
		System.out.println("num="+ sum);

	}

}
