package accunttwo;

public class AccountPlusMinus {
	int accNum;
	int balance;
	
	
	AccountPlusMinus() {
	
	}
	
	AccountPlusMinus(int newAccNum, int newBalance) {
		accNum = newAccNum;
		balance = newBalance;
	}
	
	public void deposit (int amount) {
		balance += amount;
	}
	
	public void print() {
		System.out.printf("���¹�ȣ : %d | \t �����ܾ� %d%n",accNum,balance );	
	}
	
	
	
	

	
	

}
