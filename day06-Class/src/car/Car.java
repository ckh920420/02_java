package car;

/** 
 * �ڵ��� (car) ��� Ÿ���� ����( ����)
 * 
 * car�� �ڹٰ� �⺻ �����ϴ� Ÿ���� �ƴϴ�
 * �⺻ ���� Ÿ����? : Scanner, String ��
 * 
 * Ŭ���� �������� �� ���� �߻�ȭ�۾�(Abstraction)�� �ʿ��
 * 
 * �Ӽ� : ������ �ӵ� ( ����)
 * ��� : ���Ӱ� ������ ���� ( �޼ҵ�)
 * 
 * 
 * @author Administrator
 *
 */
public class Car {
  //1. ��� ���� ����� : ���� ������ ���� ����
	int velocity;
	String Nickname;
  // 2. ������ ����� : �ʱ�ȭ �۾��� ���� ����
	// ���������ϸ� ���⼭�� �����Ѵ�
 // 3. �޼ҵ� ����� : ����� ���� ����
	// (1) ���� ��� : ���ӵ� ��� ���� �ӵ��� ������ ����
	public int accelerate(int value) {
		velocity += value;
	
		
		return velocity;
	}
	//(2) ���� ��� : �ӵ��� ������ 0���� ����
	public void stop() {
		velocity = 0;
		
		//(3) ���� ������ �����ϴ� ���
		//    �г��� �ʵ忡 ���� ����
		
		public void setNickname (String carNickname ) {
			nickname =carNickname;
		}
		
		//(3) ���� �ӵ��� �˱����� ���
		public void print() {
			System.out.printf(" �� �ӵ� : %d km/h %n%n, %s %n", velocity, nickname);
		}
	}
	
}
