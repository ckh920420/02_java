package accunttwo;
/** 
 * ����(Account Ÿ��) Ŭ������
 * �ν��Ͻ�(��ü, ��ü)�� �����ϰ�
 * 
 * �̶�, �ߺ� ���ǵ� �����ڸ� ����ؼ� ��üȭ�� �����ϰ�
 * �׷��� ������ ��ü�� �׽�Ʈ�ϴ� Ŭ����
 * 
 * @author Administrator
 *
 */

public class AccountTest2 {

	public static void main(String[] args) {
		// 1. ���� : ������ ��ü ���� ����
		Account myAccount;
		Account yourAccount;
		Account hisAccount;
		// 2. �ʱ�ȭ
		//(1) ��� �����ڷ� �ʱ�ȭ
		myAccount = new Account();
		
		//(2) �Ű������� �޴� �ߺ����ǵ� �����ڷ� �ʱ�ȭ
		yourAccount =new Account(17171771,600);
		
		hisAccount = new Account(27272772, 3000);
		
		// 3. ���
		// (1) ���� �������ڸ��� �ʱ���� ���
		myAccount.print();
		yourAccount.print();
		
		System.out.println("=========================");
		
		// (2) �Ա� : 1000�� : �� ���¿� ��� 
		myAccount.deposit(1000);
		yourAccount : deposit(1000);
		
		myAccount.print();
		yourAccount.print();
		
		System.out.println("=========================");
		// (3) ��� : �� ���� ��� ���
		myAccount.print();
		yourAccount.print();
		
		// (4) �Ա� : 5000�� 
		myAccount.deposit(5000);
		yourAccount : deposit(5000);
		
		System.out.println("=========================");
		
		// (5) ��� : �� ���� ���
		myAccount.print();
		yourAccount.print();
		
		System.out.println("=========================");
		
		// (6) ��� : 4000�� 
		myAccount.deposit(-4000);
		yourAccount : deposit(-4000);
		
		System.out.println("=========================");

		
		// (7) ��� : ����� ��� 
		myAccount.print();
		yourAccount.print();
		
		
	}

}
