package school;
/**
 * �б� �ý��ۿ��� �������� ������ �����ϴ� Ŭ����
 * 
 * ������ ���������� ��� Ŭ������ Person�� ����Ѵ�
 * --------------------------------------
 * dept : String : �ҼӺμ� �̸�
 * -----------------------------------------------------------
 * @author Administrator
 *
 */

public class Employee extends Person {
      //1. �ɹ����� �����
	/** ������ �Ҽ� �μ��̸�*/
	private String dept;
	
	//2. ������
	
	public Employee() {
	}
	
	public Employee(String dept) {
		this.dept = dept;
		
		
	}
	
	public Employee(String id, String name, int age, String dep) {
    	super(id,name,age);
    	this.dept = dept;
	}
	
	//�޼ҵ� �����
	
	@Override
	public String toString() {
		String empStr = String.format(", �μ� : %s", dept);
	}
	
}

