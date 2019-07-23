package account.one;

import accunttwo.Account;

/** 
 * 계좌(Account 타입) 클래스의
 * 인스턴스(객체, 실체)를 생성하고
 * 
 * 이때, 중복 정의된 생성자를 사용해서 실체화를 진행하고
 * 그렇게 생성된 객체에 테스트하는 클래스
 * 
 * @author Administrator
 *
 */

public class AccountTest {

	public static void main(String[] args) {
		// 1. 선언
		Account account;
		Account myAccount;
		Account yourAccount;
		
		// 2. 초기화
		account = new Account();
		myAccount = new Account();
		yourAccount = new Account();
		
		// 3. 사용
		// (1) 계좌 출력 직후 상태
		System.out.println("ac 의 상태");
		account.print();
		
		System.out.println("myac 의 상태");
		myAccount.print();
		
		System.out.println("=========================");
		
        // (2) 계좌에 만원 입금
		System.out.println("ac에 만원 추가");
		account.deposit(10000);
		
		System.out.println("myac에 9만원 추가");
		myAccount.deposit(90000);
		
		System.out.println("=========================");
		
		// (3) 임금 후 상태 출력
		System.out.println("ac 의 상태");
		account.print();
		
		System.out.println("myac 의 상태");
		myAccount.print();
		
		System.out.println("=========================");
		
		// (4) 계좌에 3만원 입금
		account.deposit(30000);
		myAccount.print();
		
		System.out.println("=========================");
		
		// (5) 임금후 상태 출력
		account.print();
		myAccount.print();
		
		// 왜 계좌번호와 계좌잔액이 0으로 표기가 되는가
		// new 연산자가 하는 일이 기본값으로 만드는 일을 하기 때문에, int타입의 기본값은 0이다
	}

}
