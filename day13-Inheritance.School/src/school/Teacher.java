package school;
/**
 * �б� �ý��ۿ��� ������ ����ġ�� ������ ������ �����ϴ� Ŭ����
 * @author Administrator
 *
 */

public class Teacher extends Person {
	//1.�ɹ�����
	private String subject;
	
	
	//2.������
	public Teacher() {
		
	}
	
    public Teacher(String subject) {
    	this.subject = subject;
   
		
	}
    /**
     * ��� �ʵ带 �ʱ�ȭ�ϴ� ������
     * ------------------------
     * Person���� �������� �ʵ�(id, name, age)�� 
     * �θ� Ŭ������ �����ڸ� ������ �ʱ�ȭȭ��
     * Teacher�� �ʵ��� subject�� �����ʱ�ȭ
     * @param id
     * @param name
     * @param age
     * @param subject
     */
    public Teacher(String id, String name, int age, String subject) {
    	super(id,name,age);
    	this.subject = subject;
    	
    }
    
	//3.�޼ҵ�
    
    //(1)toString()������
    @Override
    public String toString() {
    	String tcStr = String.format(", ���� : s% ", subject);
    	return String.format
    }



	

}
