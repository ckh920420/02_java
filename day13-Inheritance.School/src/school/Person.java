package school;
/** 
 * �ý��ۿ� ����� �л�, ����, ������ ���� ��  �������� ������ ������ ���� Ŭ����
 * �Ϲ����� ����� ������ �����Ѵ�
 * ----------------------------------------------------------------
 * id : String
 * name : String
 * age : int
 * ----------------------
 * @author Administrator
 *
 */

public abstract class Person {
	
	// 1. �ɹ�����
	

	private String id;
	private String name;
	private int age;
	
	// 2. ������
	// (1) �⺻ ������ : ������ ����θ� ������ ������, �ڵ����� �⺻ �����ڰ� �����,
	//               �׷��� �⺻�����ڰ� �ƴ� �����ڸ� �ϳ��� �����ϸ� �ڵ� �������� ����
	public Person () {
	}
	
	// (2) �ɹ������� ���Ե� ������
	public Person (String id) {
		this.id = id;
	}
	
	public Person (String id, String name) {
		this(id); 
	    this.name = name;
	}
		
	public Person (String id, String name, int age) {
		this(id, name); 
		this.age = age;
		
	}
	
	// 3. �޼ҵ�

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age =age;
	}
	
	// toString() ������
	/**  
	 * 
	 * 1. print �Կ��� �޼ҵ忡�� ��ü���������� ����Ҷ� �ڵ����� �۵��ϴ� �޼ҵ�
	 * 2. Object Ŭ�������� ��ӹ��� �޼ҵ�
	 * 3. ��ü�� ��ǥ�ϴ� ���ڿ��� ���� ����
	 * -> �� �ʵ带 ��� ����ϴ� ���ڿ� 
	 */
	@Override
	public String toString() {
		return String.format("[���̵� :%s], [�̸� : %s], [���� :%d]",id, name, age);
	}
	
	/**
	 * ������ ��ü�� ����ϴ� �޼ҵ�
	 */
	public void print() {
		System.out.println(this);
		
	}
	
}
