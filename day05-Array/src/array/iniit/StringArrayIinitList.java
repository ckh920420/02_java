package array.iniit;

/**
 * ������ Ÿ���� String Ÿ���� �迭 emps�� �ʱ�ȭ ����� ����Ͽ� �ʱ�ȭ�ϰ�
 * ������ ����غ��� �׽�Ʈ Ŭ����
 * @author Administrator
 *
 */

public class StringArrayIinitList {

	public static void main(String[] args) {
		//1. ����
		
		String[] students = {"������","������","������","������"};
		
		//3. ���(foreach)
		for (String name : students) {
			System.out.println("�л��� �̸�=" + name);
			
		}
		
		// 3. ���(for)
		for (int idx =0; idx < students.length ; idx += 1) {
			 System.out.printf("students[%d] =%s%n", idx, students[idx]);
		}
		
		for (int idx =0; idx < students.length ; idx += 1) {
			 System.out.printf("students[%d] =%s%n", idx, students[idx]);
		}

	}

}
