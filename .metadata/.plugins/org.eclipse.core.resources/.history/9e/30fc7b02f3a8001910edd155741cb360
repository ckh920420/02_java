package accunttwo;
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

public class AccountTest2 {

	public static void main(String[] args) {
		// 1. 선언 : 계좌의 객체 참조 변수
		Account myAccount;
		Account yourAccount;
		Account hisAccount;
		// 2. 초기화
		//(1) 기분 생성자로 초기화
		myAccount = new Account();
		
		//(2) 매개변수를 받는 중복정의된 생성자로 초기화
		yourAccount =new Account(17171771,600);
		
		hisAccount = new Account(27272772, 3000);
		
		// 3. 사용
		// (1) 계좌 생성되자마자 초기상태 출력
		myAccount.print();
		yourAccount.print();
		
		System.out.println("=========================");
		
		// (2) 입금 : 1000원 : 두 계좌에 모두 
		myAccount.deposit(1000);
		yourAccount : deposit(1000);
		
		myAccount.print();
		yourAccount.print();
		
		System.out.println("=========================");
		// (3) 출력 : 두 계좌 모두 출력
		myAccount.print();
		yourAccount.print();
		
		// (4) 입금 : 5000원 
		myAccount.deposit(5000);
		yourAccount : deposit(5000);
		
		System.out.println("=========================");
		
		// (5) 출력 : 두 계좌 모두
		myAccount.print();
		yourAccount.print();
		
		System.out.println("=========================");
		
		// (6) 출금 : 4000원 
		myAccount.deposit(-4000);
		yourAccount : deposit(-4000);
		
		System.out.println("=========================");

		
		// (7) 출력 : 양계좌 모두 
		myAccount.print();
		yourAccount.print();
		
		
	}

}
