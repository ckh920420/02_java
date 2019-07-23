package point;

/**
 * x, y ��ǥ�� ������ ������ 
 * ������ �� ���� ��Ÿ���� Ŭ����
 * @author 304
 *
 */
public class Point {
	
	// 1. �������
	private int x;
	private int y;
	
	// 2. ������
	// �⺻������ ��� ���� ���� ==> �⺻������ ����.
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 3. �޼ҵ�
	// ������ / ������
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	/**
	 * �ڹ��� �ֻ��� Ŭ������ Object �κ��� �������� �޼ҵ�
	 * �� ��ü�� ��ǥ�ϴ� ���ڿ� 
	 *   : ������� �ʵ带 �����ϴ� ���ڿ��� ����
	 *     print �迭�� �޼ҵ忡�� �ڵ����� �۵� 
	 */
	@Override // <-- anotation �� �޼ҵ尡 �����ǵǰ� ������ Ȯ��
	public String toString() {
//		return "(" + x + ", " + y + ")";
		return String.format("(%d, %d)", x, y);	
	}

	/**
	 * �� q ���� �Ÿ��� ����Ͽ� double �� �����ϴ� �޼ҵ�
	 * @param q 
	 * @return �� q���� �Ÿ� : double
	 */
	public double distanceFrom(Point q) {
		return Math.sqrt(Math.pow(q.getX() - x, 2) 
				       + Math.pow(q.getY() - y, 2));  
	}
}
