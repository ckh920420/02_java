package snack;
/**
 * ������ ��Ű�� 3�� ����ִ� oreoBox��� ������ 
 * Oreo �迭Ÿ������ �����ϰ�
 * 
 * oreoBox[0]~[2]
 * ũ���� ������ �ٴҶ� ���� ���� ���� �� �ϳ��� �Է��Ұ�
 * 
 * foreach�� ����Ͽ�
 *oreoBox���� �ϳ��� ��Ű�� ���¸� ���
 *
 *for�� ����Ͽ� ��� ��Ű�� ũ���� �ٴҶ�� �����ϰ�
 *
 *foreach�� ����ؼ� ��� ��Ű�� ũ�� ���� ���� Ȯ���� ���� ���
 *
 *--> �� 3���� ������ ������ ����
 * @author Administrator
 *
 */
public class OreoTest {

	public static void main(String[] args) {
		//1. ����  2. �ʱ�ȭ
		Oreo[] oreos = new Oreo[0];
		
		OreoBox box = new OreoBox(Oreos);
		
		Oreo choco       = new Oreo(1,"����");
		Oreo strawberry  = new Oreo(2,"����");
		Oreo greentea    = new Oreo(3,"����");
		
		
		
		
		
		//3. ���
		// add ��� �׽�Ʈ
		box.add(choco);
		box.add(strawberry);
		box.add(greentea);
		
		// ���� ���� ���� ���
		for (Oreo oreo : box.getAllOreos()) {
			oreo.print();
		}
		
		// ���� ��Ű (1�� ��Ű)�� �ٴҶ�� ���� : set
		
		// ����� ������ (1�� ��Ű) : get
		
		// ��ü ũ�� ����
		for (Oreo oreo : box.getAllOreos()) {
			oreo.changeCream("�ٴҶ�");
		}
		
		// 3�� ��Ű ���� : remove
		
		// ��ü��� ���
		}
		
		
		
		//(2)
		for (Oreo oreo : box.getAllOreos()) {
			oreo.changeCream();
			
		 
		}

	}

}
