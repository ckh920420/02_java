package Marker;
/**
 * ���帶ī �׽�Ʈ
 * @author Administrator
 *
 */

public class MarkerTest {

	public static void main(String[] args) {
		// 1. ����
		Marker red;
		Marker blue;
		Marker green;
		Marker black;
		
		// 2. �ʱ�ȭ
		red = new Marker(true, true, "����");   
        blue = new Marker(false, false, "�Ķ�");  
		green = new Marker(true, false, "�ʷ�"); 
		black = new Marker(true, false, "����"); 
		       
		// 3. ���
		// (1) �ʱ�ȭ �� ���� ���
		red.print();   
		blue.print();  
		green.print(); 
		black.print(); 
		   
		// (2) �Ķ�, ���� ��Ŀ ���
		blue.use();
		black.use();
	}

}
