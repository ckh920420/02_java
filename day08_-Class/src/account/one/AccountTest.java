package account.one;

import accunttwo.Account;

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

public class AccountTest {

	public static void main(String[] args) {
		// 1. ����
		Account account;
		Account myAccount;
		Account yourAccount;
		
		// 2. �ʱ�ȭ
		account = new Account();
		myAccount = new Account();
		yourAccount = new Account();
		
		// 3. ���
		// (1) ���� ��� ���� ����
		System.out.println("ac �� ����");
		account.print();
		
		System.out.println("myac �� ����");
		myAccount.print();
		
		System.out.println("=========================");
		
        // (2) ���¿� ���� �Ա�
		System.out.println("ac�� ���� �߰�");
		account.deposit(10000);
		
		System.out.println("myac�� 9���� �߰�");
		myAccount.deposit(90000);
		
		System.out.println("=========================");
		
		// (3) �ӱ� �� ���� ���
		System.out.println("ac �� ����");
		account.print();
		
		System.out.println("myac �� ����");
		myAccount.print();
		
		System.out.println("=========================");
		
		// (4) ���¿� 3���� �Ա�
		account.deposit(30000);
		myAccount.print();
		
		System.out.println("=========================");
		
		// (5) �ӱ��� ���� ���
		account.print();
		myAccount.print();
		
		// �� ���¹�ȣ�� �����ܾ��� 0���� ǥ�Ⱑ �Ǵ°�
		// new �����ڰ� �ϴ� ���� �⺻������ ����� ���� �ϱ� ������, intŸ���� �⺻���� 0�̴�
	}

}
