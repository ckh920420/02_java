package marker;
/**
 * ���帶ī�� �����ϴ� Ŭ����
 * --------------------------
 * ���帶ī�� �Ӽ�����
 * ���� : color : String
 * ��ũ�ܷ� : isNew : boolean
 * ������ ���󿩺� : isOpened : boolean
 * ----------------------------
 * ������ ���� : 
 * �Ű������� �޴� ������ : ��� �ʵ忡 ����
 * ---------------------------------
 * ������� : �޼ҵ�� ����
 * ��ũ�� �������� �� : use() : void "����" or "���"
 * ���� ���� ���� : print() : void " ����" or " ����"
 *                               
 * 
 * @author Administrator
 *
 */

public class Marker {
	
	//1. �ɹ� ���� ����
	String color;
	boolean isNew;
	boolean isOpened;
	
	//2. ������ ����
	Marker ( String color, boolean isNew, boolean isOpened ) {
		this.color = color;
		this.isNew = isNew;
		this.isOpened = isOpened;
	}
	//3. �޼ҵ� ����
	public void use() {
		System.out.printf("%s���� ��Ŀ�� ����ϰ� �ֽ��ϴ�.%n,color");
		
	}

	public void print() {
		String message = "��Ŀ ���� : %s, %s, %s ";
		String openStatus;
		String newStatus;
		
		if (isOpened) {
			openStatus = "�Ѳ��� ���� �ֽ��ϴ�.";
			} else {
				open
			}
		
		
	}
	
	//(3) ��� �޼ҵ� print()
	public void print() {
		System.out.printf(" ������ ��-�帶ī�� ���� %s �̸�, %");
	}
}
