package school;
/**
 * �б� �ý����� �׽�Ʈ�ϴ� Ŭ����
 * --------------------------
 * person�� ��Ӱ�����
 * Student, 
 * @author Administrator
 *
 */
public class SchoolTest {

	public static void main(String[] args) {
		// 1. ����
	   // Person �迭Ÿ���� ���� persons�� ����
		Person[] persons;
		
		
		//2. �ʱ�ȭ
		//(1)persons�� 3������� ����
		persons = new Person[3];
		
		
		
		//(2)persons �迭�� ���� 0~2�ε����� 
		//[0] : Student : id S01, name ȫ�浿 age 18 major ����
		//[1] : Teacher : id T01 ,name ����� age 22 subject ����
		//[2] : Employee : id E01, name ���� age 48 dept ���п���������
		
	   persons[0] = new Student("S01","ȫ�浿", 18, "����");
	   persons[1] = new Teacher("T01","�����", 25, "����");
	   persons[2] = new Employee("E01","���", 48, "���п���������");
		
	   
				
		}
		
		//3. ���
		//foreach�� ����Ͽ� persons�迭�� �� ������Ʈ�� ���Ͽ�
		//print() �޼ҵ� ȣ��
	for (Person person : persons) {
		//���� �޼ҵ� ȣ��
		// �θ� Ŭ������ ���ǵ� �޼ҵ带 ȣ���ص�
		//���� �ν��Ͻ� Ÿ���� ����Ŭ������ �����ǵ� �޼ҵ尡 �����ϴ°�
		//����޼ҵ� ȣ���� �Ǳ� ���ؼ��� �ݵ�� ����� ����Ǿ�� ��
		person.print();
 
	}

}
