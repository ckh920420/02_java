package car;
/**
 * car ��� Ÿ���� ���� ��ü�� �����Ͽ�
 * ���(�׽�Ʈ)�ϴ� Ŭ����
 * @author Administrator
 *
 */

public class CarTest {

	public static void main(String[] args) {
		
		// car��� Ÿ���� ��ü�� ����ϱ� ���� ���������� �ʿ���
		// 1. CarŸ���� ���� ����
		Car myCar;
		
		// 2. �ʱ�ȣ
		myCar = new Car(); // ������ ����� �� �̼���� ��ȣ�ȿ� �Ƚ�д�
		
		// 3. ��� : ���� ���̱�
		// (1) ���� ���̱�
		myCar.setNickname("�غ���");
		
		// 3. ��� : Car ��� Ÿ��(Ŭ����)�� ���ǵ� �޼ҵ� ȣ��
		// (2) ����
		System.out.println("1. myCat�� �ʱ�ȭ �� �ӵ�");
		myCar.print();
		
		System.out.println("2. 60��ŭ ���� �� �ӵ�");
		myCar.accelerate(60);
		myCar.print();
		
		System.out.println("3. 20��ŭ �߰� ���� �� �ӵ�");
		myCar.accelerate(20);
		myCar.print();
		
		System.out.println("4. ���� �� �ӵ�");
		myCar.stop();
		myCar.print();
		
		myCar.accelerate(60);
		int nowVelocity = myCar.accelerate(60);

	}

}
