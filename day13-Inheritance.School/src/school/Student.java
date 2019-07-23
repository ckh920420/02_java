package school;

public class Student extends Person {

	/** 
	 * �б� �ý��ۿ��� 
	 * �л��� ������ �����ϴ� Ŭ����
	 * 
	 * ����� ���������� ��� Ŭ������ Person�� ����Ѵ�
	 * 
	 */
// 1. �ɹ����� �����
	/** �л��� ������ �����ϴ� �ɹ�����*/
	
	private String major;
	
	//2. ������ �����
	// (1) �⺻ ������
	
	public Student() {
	}
	
	// (2) �Ű������� �޴� ������
	/**
	 * Student ���� �ʵ��� major�� �ʱ�ȭ�ϴ� ������
	 * @param major
	 */
	public Student(String major) {
		this.major = major;
	}
	
	/**
	 * person Ŭ�������� �������� �ʵ�(id,name,age)�� 
	 * Student ���� �ʵ��� major�� ��� �ʱ�ȭ�ϴ� ������
	 * @param id
	 * @param name
	 * @param age
	 * @param major
	 */
	
	public Student(String id, String name, int age, String major) {
		super(id,name,age);
		//this (major); �� �Ұ���
		//super(), this() �� ������ ���� ù�ٿ� �ѹ��� ���� ����
		//super()�� ����ϰ� this()�� ����� ���� ����
		this.major = major;
	}		
		//3. �޼ҵ� �����
	    // (1) toString()������ : �л��� �µ���
		@Override
		public String toString() {
			String stdStr = String.format (" , ���� : %s," , major);
			return String.format("�л�����[%s%s)" super.toString(),stdStr);
		}
	
	
	}


