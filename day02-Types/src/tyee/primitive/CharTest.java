package tyee.primitive;

/** -- �ڵ� �ȿ� ���� ���� �ʴ� �ּ� (�ֺ�) 
 * char : ���� �Ѱ��� �����ϴ� Ÿ��
 * @author Administrator
 *
 */
public class CharTest {

	public CharTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// 1.���� : Ÿ���̸� �����̸�;
		char input;
		
		//2. �ʱ�ȭ : �����̸� +��;
		/*
		 * input = 'A+'; : �ΰ��� �̻��� �����Ϸ��� ����
		 * input = A; : ''����ǥ �ȿ� ���ڸ� ���� �ʾ����Ƿ� ����
		 */
		input = 'a';
		
		//3. ���
		System.out.println("input=" + input);
		
		//4. char�� ���������� ���ڷ� ����Ǵ� �� Ȯ�� 
		//������ �����ϴ� ���� code�� �����ϸ鼭
		//���ڸ� �����ϴ� ���� input�� ���� ����
		int code =input;
				System.out.println("code=" + code);
		
		//ode�� ������ �����ϴ� �����̹Ƿ� 
		//+1 �ϴ� ��������� �Ͽ� ���� ������Ű��
	      code = code+1;
	      System.out.println("code=" + code);
	      
	      //+1 ������ �������� ������ ����(char)�� �ٲپ� ���
	      System.out.println();

	}

}
