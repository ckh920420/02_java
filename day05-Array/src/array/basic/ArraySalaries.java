package array.basic;

/** 
 * �������� �޿����� (�⺻�� int Ÿ��)�� �����ϴ� �迭�� �׽�Ʈ�ϴ� Ŭ����
 * @author Administrator
 *
 */

public class ArraySalaries {

	public static void main(String[] args) {
		// 1. ���� : �迭 ���� ���� : �����̸��� ���������� �� ��.
		int[] salaries;
		
		// 2.�ʱ�ȭ ; �迭 ���� ������ �⺻���� �ƴϹǷ� �ʱ�ȭ�� ���� new�� ����ؾ��Ѵ�
		salaries = new int[10];
		
		// 3. ���
		// (1) �迭�� ���� ���ֱ� ���� ���
		// �ݸ鿡, �Ϲ� �⺻�� ������ ����� �ʱ�ȭ �Ŀ� ��밡��
          int age;
          
          System.out.println("(1) �迭 ���� ���� ���� ���====");
          System.out.printf("salaries[0]=%d%n", salaries[0]);
          System.out.printf("salaries[1]=%d%n", salaries[1]);
          System.out.printf("salaries[2]=%d%n", salaries[2]);
          System.out.printf("salaries[3]=%d%n", salaries[3]);
          System.out.printf("salaries[4]=%d%n", salaries[4]);
          System.out.printf("salaries[5]=%d%n", salaries[5]);
          System.out.printf("salaries[6]=%d%n", salaries[6]);
          System.out.printf("salaries[7]=%d%n", salaries[7]);
          System.out.printf("salaries[8]=%d%n", salaries[8]);
          System.out.printf("salaries[9]=%d%n", salaries[9]);
          
          // ����� ���� new �������� ���
          //         ĭ�� �����ϰ� ����Ÿ���� �⺻������ �ʱ�ȭ
          
          // �迭�� �� ĭ�� ���� �Ҵ�
          
                   salaries[0] = 8;
                   salaries[1] = 10;
                   salaries[2] = 55;
                   salaries[3] = 86;
                   salaries[4] = 23;
                   salaries[5] = 98;
                   salaries[6] = 34;
                   salaries[7] = 50;
                   salaries[8] = 76;
                   salaries[9] = 11;
                   
                   System.out.printf("salaries[0]=%d%n", salaries[0]);
                   System.out.printf("salaries[1]=%d%n", salaries[1]);
                   System.out.printf("salaries[2]=%d%n", salaries[2]);
                   System.out.printf("salaries[3]=%d%n", salaries[3]);
                   System.out.printf("salaries[4]=%d%n", salaries[4]);
                   System.out.printf("salaries[5]=%d%n", salaries[5]);
                   System.out.printf("salaries[6]=%d%n", salaries[6]);
                   System.out.printf("salaries[7]=%d%n", salaries[7]);
                   System.out.printf("salaries[8]=%d%n", salaries[8]);
                   System.out.printf("salaries[9]=%d%n", salaries[9]);
                   
                   // �迭�� �����Ǹ� ���̸� ��Ÿ��length ������ 
                   // JVM( �ڹ� ���� �ӽ�) �� ���� ������
                   
                   System.out.printf("salaries �迭�� ����",salaries.length);
                   
                   //���� index�� ����� ������ �ϸ�
                   System.out.printf("salaries[10] = %d%n",salaries[10]);
                   
                   
                   //===================================================
                   // for loop�� �迭�� ����
                   
                   System.out.println("========================");
                   for (int idx= 0; idx < salaries.length ; idx++) { 
                	   System.out.printf("salaries[%d} = %d%n", idx, salaries[idx]);
                   }
                   
                   System.out.println("== for loop�� �Է�==");
                   Scanner scan = new Scanner(System.in);
                   for (int idx= 0; idx < salaries.length ; idx++) { 
                	   System.out.printf("salaries[%d} = %d%n", idx, salaries[idx]);
                   }
                   
                   
		

	}

}
