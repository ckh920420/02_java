package point;

public class PointTest2 {

	public static void main(String[] args) {
		// 1. point �迭 ����
		Point[] points = {new Point(10, 1), 
				          new Point(3,4), 
				          new NamedPoint( "0", 0,0)};
		// NamePoint�� Point�� ��� �޾ұ� ������ ���� ��� ���� Is ~ A 
		
		
		
		// 2. �ʱ�ȭ
		
		//3. ���
		
		for (Point point :  points) {
			System.out.println(point);
			//System.out.println(point.toString); �� toString�� ȣ���� ����� ����
			
			// �׷��� �ܼ� ����Ʈ�� ����ص� ���� ����� �޴� ����
			// 1. toString() �޼ҵ�� print()�迭 �޼ҵ忡�� ��ü ���������� ����� ��,
			// �ڵ����� �۵��ϴ� Ư¡�� ������ �ִ�
			
			// 2. toString() ��  ������Ʈ���� �������� �޼ҵ�� ��� ����Ŭ�������� ������ ������,
			// �����ǵ� ��쿡�� �ش� �ν��Ͻ� Ÿ�Կ� ���߾� �θ�Ŭ���� Ÿ�� Ŭ������ ȣ���� �ص� �ν��Ͻ� Ÿ��
			// �� �����ǵ� �޼ҵ尡 �ڵ����� ����
			//==> ���� �޼ҵ� ȣ�� (virtual method invocation)
		}
		// ���� ������ �Ÿ��� ���ؼ� ���
		for (int idx = 0; idx < points.length -1 ; idx++) {
			System.out.printf("�� ��[%d], [%d] ���� �Ÿ� , %5.2f%n ", idx, idx +1, points[idx].distanceFrom(points [idx+1]));
		}

	}

}