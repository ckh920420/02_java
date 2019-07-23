package point;
/** 
 * ���п��� �̸��� ���� ���� ��Ÿ���� Ŭ����
 * @author Administrator
 *
 */

public class NamedPoint extends Point {
	
	public NamedPoint (int x, int y) {
		super(x,y);
	}

	public NamedPoint(String name, int x, int y) {
		this(x,y);
		this.name = name;
	}
	
	//3. ������ ������
	public String getName() {
		return name;
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	// toString() ������
	// �θ� Ŭ�������� �������� (1,2) �� ���� ��ǥ�� ��ȣ�� 
	//ǥ���ϴ� ���ڿ� ���ʿ� ���� �̸��� �����̵��� ����
	@Override
	public String toString() {
		return name + super.toString();
		
		
	}
}
