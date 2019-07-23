package account;
/**
 * ������¸� �����ϴ� Ŭ����
 * ----------------------------------
 * ������ �Ӽ��� ��Ÿ���� ���Ͽ� �� ���� �ɹ� ���� ����
 * ���¹�ȣ : accNumber
 * �ܾ�     : balance
 * --------------------------------------------
 * �⺻ ������ : �Ű� ������ ����ִ� ������
 * �Ű������� �ִ� ������ : �Ű����� ����� �ִ� ������
 * -------------------------------------
 * ������ �ܾ��� ������Ű�� �Ա� �޼ҵ� : deposit(int amount)
 * ������ ���� ���¸� ����ϴ� �޼ҵ� : print()
 * 
 * @author Administrator
 *
 */

public class Account {
	// Ŭ���� ���� ����(������ ���� ����)
	/**���� �Ϸù�ȣ �ο��� ���� �����ϴ� Ŭ���� ����*/
	static int count = 0;
	// 1. ������� (��ü ����) �����
	/** ���¹�ȣ */
	int accNumber;
	
	/** �����ܾ�*/
	int balance;
	
	/**���� ��ȣ �ο��� ���� ����� ����*/
	int cnt;
	
	// 2. ������ ����� 
	/** 
	 * �⺻ ������ : Ŭ���� �̸��� ��ҹ��ڱ��� ��� �����ϰ� 
	 *             �Ű����� ����� ����ִ� ������
	 */
	Account() {
		
	}
	/**
	 * ���� �ܾ׸� ���� �ް�
	 * ���¹�ȭ�� Ŭ���� ������ ī��Ʈ�� ���� �����Ǵ� Ư¡�� ����Ͽ�
	 * �����Ǵ� �Ϸù�ȣ�� ���� �����Ͽ�
	 * ���°�ü�� �����ϴ� ������
	 * 
	 * @param balance
	 */
	Account( int balance) {
		this.accNumber = ++count;
		this.balance = balance;
	}
	/**
	 * ���� ��ȣ, ���� �ܾ��� �Ű������� �޾Ƽ� �Ϻ��� ������ ���¸� ��üȭ(�ʱ�ȭ) �ϴ�  �ߺ� ���ǵ� ������
	 * @param newAccNumber
	 * @param newBalance
	 */
	Account(int newAccNumber, int newBalance) {
		accNumber = newAccNumber;
	    balance = newBalance;
		
	}
	/** 
	 * ���ڿ��� �� ���� ��ȣ�� �������� �ܾ��� �Է¹޾Ƽ�
	 * ���� ���¹�ȣ(accNumber) �� �ܾ�(balance) �ʵ带 �ʱ�ȭ �ϴ� 
	 * �ߺ����� �� ������
	 * 
	 * �ߺ�����(Overloading)
	 * ---------------------
	 * �޼ҵ��� �̸��� ����, �Ű����� ����� �ٸ� �޼ҵ带 
	 * �����ϴ� ���
	 * �ߺ����Ǵ� �����ڿ��� ����Ǵ� ���Ǳ��
	 * 
	 * �Ű����� ����� �ٸ��ٴ� �ǹ�
	 * (1) ������ �ٸ���
	 * (2) ������ ���� ���� �Ű������� Ÿ���� ������ �ٸ���
	 * 
	 * 
	 * @param strAccNumber
	 * @param newBalance
	 */
	
	//(�� �ڸ��� ����� ���� ���� ������ �߰��Ǿ���� �ڸ��Դϴ�
	// �� �ڸ��� �� ������ �����ڿ� �ٸ� Ÿ���� �ִ� ����� �����ϴ� �ڸ��Դϴ�
	
	
	// 3. �޼ҵ� �����
	/** �Էµ� amount ��ŭ �� ������ �ܾ��� ������Ų��
	 * @param amount : int �Ա��� �ݾ�
	 */
	public void deposit (int amount ){
		balance += amount;
	}
	/**������ ������� ���*/
	public void print() {
		System.out.printf("���¹�ȣ :%d | \t �����ܾ� : %d%n", accNumber, balance);
	}

	/** 
	 * ����ϴ� �޼ҵ�
	 * 
	 * ����Ϸ��� �ݾ�(amount) ��ŭ �ܾ׿��� �����ϴ� �޼ҵ�
	 * 
	 * ���� �ܾ���amount ���� ������  ����� �������� �ʴ´�
	 * 
	 * ��ݿ� �����ϸ� "�������� �������� ��붱�̳� ���ĸ���" ��� ���ڿ��� ����
	 * 
	 * ��ݿ� �����ϸ� " ���� �޾ƶ�. �ܾ��� ���Դϴ�" ��� ���ڸ� ����
	 * 
	 * @param amount : int ����Ϸ��� �ݾ�
	 * @return String ��� ���� ���� �˸�
	 */

public String withdraw(int amount ) {
	String result;
	
	if (balance >= amount ) {
		balance -= amount;
		result = amount + " �� ���� �޾ƶ�  ������ + balance+ �̴�");
		
		
		
	}
}
}
