package control.loop;
/** 
 * �������� ��ø for loop�� ����ؼ� ���
 * ������ ����� 50�� ������ �ߴ��ϵ���
 * break : ������   for�� �����Ͽ� �׽�Ʈ
 * -------------------------
 * break : ���� ����� �ݺ����� ���������� ����
 *         �Ǵ� switch������ ���������� ����
 * @author Administrator
 *
 */

public class NineNineBreak {

	public static void main(String[] args) {
	
		// 1. ����, 2. �ʱ�ȭ 
		
		for ( int stage = 2; stage <= 9; stage += 1 ) { 
			System.out.printf("%n%n%d ��%n", stage);
		      for (int time = 1; time <= 9; time += 1)
		    System.out.printf("%d X %d = %d%n ", stage, time,(stage * time)) ;	  
		}
		
		
		
		
		// 3. ���
       

   }
}


