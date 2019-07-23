package snack;

/**
 * Oreo ��Ű�� �����ϴ� Ŭ����
 * -------------------------------
 * �Ӽ� : 
 * cream : String : �ٴҶ� ���� ��Ʈ
 * radius(������) double : ������ ��Ű �Ѱ��� ������ ����
 * thickness( �β� )  double : ������ ��Ű 1���� �β�
 * --------------------------------------------------
 * ������ : �⺻ ������, �ߺ��� this, this() �� �����ϴ� ������
 * �� 4���� ������ �ߺ�����
 * ---------------------
 * �޼ҵ�
 * print() : void : ������ ��Ű�� ���� ���
 * changeCream( String cream) : void 
 *                             : �Ű� ������ �Էµ� ũ�� ������ ������ ��Ű�� ũ���� ������
 * @author Administrator
 *
 */

public class Oreo {
	// 1. �ɹ� ���� ����
	
	String cream;
	double radius;
	double tickness;
	
	// 2. ������ ����(�ߺ�����)
	// (1) �⺻ ������
	Oreo() {
		
	}
	
	//(2) �ߺ�������
	Oreo(String cream){
		this();
		this.cream = cream;
		}
	
	Oreo(String cream, double radius) {
		this(cream);
		this.radius = radius;
		}
	
	Oreo(String cream, double radius, double tickness) {
		this(cream, radius);
		this.tickness = tickness;
		}
	
	// 3. �޼ҵ� �ۼ�
	//(1) ������ ũ�� �ٲ��ִ� �޼ҵ� changeCream()
	public void changeCream() {
		this.cream = cream;
		
	}
	
	//(2) ������ ��Ű�� ���¸� ����� �ִ� �޼ҵ� print()
	public void print() {
		System.out.printf("�� OREO��  %s���̰�, ������ %4.2f, �β� %4.2f �Դϴ�.",cream,radius,tickness);
	}

}
