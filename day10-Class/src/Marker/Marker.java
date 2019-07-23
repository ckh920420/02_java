package Marker;

/**
 * ȭ��Ʈ ���� ��Ŀ�� �����ϴ� Ŭ����
 * -----------------------------------
 * �Ӽ� :
 * isNew    : boolean : �� ��Ŀ����/ �� �� ������ �Ǵ�
 * isOpened : boolean : ��Ŀ�� �Ѳ��� ���ȴ��� �����ִ��� �Ǵ�
 * color    : String  : ��Ŀ�� ��ũ ����
 * -----------------------------------
 * ������ : this, this() ����Ͽ� ������ �ߺ�����
 * �⺻������
 * isNew�� �ʱ�ȭ�ϴ� ������
 * isNew, isOpened �� �ʱ�ȭ�ϴ� ������
 * ��� ������� �ʵ带 �ʱ�ȭ�ϴ� ������
 * ------------------------------------- 
 * �޼ҵ� :
 * use() : void : "~���� ��Ŀ�� ����ϰ� �ֽ��ϴ�." ���
 * print() : void 
 *     : isNew �� true �̸� "�� ��Ŀ�Դϴ�." 
 *               false �̸� "�� �� ��Ŀ�Դϴ�." 
 *       isOpened �� true �̸� "�Ѳ��� ���� �ֽ��ϴ�."
 *                  false �̸� "�Ѳ��� ���� �ֽ��ϴ�." 
 *       ��Ŀ�� ���� ���
 * --------------------------------------          
 * @author 304
 *
 */
public class Marker {
	static int count;

	// 1. ������� �����
	/** 
	 * �� ��Ŀ���� ����
	 * true : ����Ŀ
	 * false : �� �� ��Ŀ 
	 * */
	boolean isNew;
	
	/** 
	 * ��Ŀ�� �Ѳ��� �����ִ��� ����
	 * true : �Ѳ��� �����ִ� ����
	 * false : �Ѳ��� �����ִ� ���� 
	 * */
	boolean isOpened;
	
	int serial;
	
	/** ��Ŀ ��ũ�� ���� */
	String color;

	// 2. ������ ����� : �ߺ����� & this, this() ���
	public Marker() {
		this.serial = ++count;
	}

	public Marker(boolean isNew) {
		this();
		this.isNew = isNew;
	}
	
	public Marker(boolean isNew, boolean isOpened) {
		this(isNew); 
		this.isOpened = isOpened;
	}
	
	public Marker(boolean isNew, boolean isOpened, String color) {
		this(isNew, isOpened);
		this.color = color;
	}
	
	// 3. �޼ҵ� �����
	/**
	 * ~ ���� ��Ŀ�� ����ϰ� �ֽ��ϴ�.
	 * ��� ������ ����ϴ� �޼ҵ�
	 */
	public void use() {
		System.out.printf("%s���� ��Ŀ�� "
				       + "����ϰ� �ֽ��ϴ�.%n", color);
	}
	
	
	public void print() {
		String message = "���� : %d, ��Ŀ ���� : %s, %s, %s%n";
		String openStatus;
		String newStatus;

		if (isOpened) {
			openStatus = "�Ѳ��� ���� �ֽ��ϴ�."; 
		} else {
			openStatus = "�Ѳ��� ���� �ֽ��ϴ�.";
		}
		
		if (isNew) {
			newStatus = "�� ��Ŀ�Դϴ�.";
		} else {
			newStatus = "�� �� ��Ŀ�Դϴ�.";
		}
		
		System.out.printf( message, color, openStatus, newStatus);
	}
	
	
}