package point;

public class PointTest {

	public static void main(String[] args) {
		// 1. ��������
		Point p;
		Point q;
		Point o;
		
		
		// 2. �ʱ�ȭ
		p = new Point(0,0);
		q = new Point(3,4);		
		o = new NamedPoint("0", 0,0);	
		// 3. ��� 
        //(1) �� P ���
		System.out.println(p);
		
    	//(2) �� q ���
		System.out.println(q);
		
		// �� o�� ���
		
		System.out.println(o);
		
		//(3) �� �� ������ �Ÿ��� ���
		System.out.printf("�� �� ������ �Ÿ� : %5.2f%n", p.distanceFrom(q));
		
		//�̸��� ���� ������ �� ť�� �Ÿ����
		System.out.printf("�� �����κ��� ť�������� �Ÿ� : "%5.2f%n",o.distanceFrom(q));
	}

}
