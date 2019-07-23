package type.casting;

/**
 * 숫자형 데이터 사이에 형변환을 테스트하는 테스트이다
 * 
 * @author Administrator
 *
 */
public class TypeCastingTest {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화
		double pi = 3.1415926535797;
		int number = 100;
		int result;
		
		//3. 형변환 : (타입이름) 피연산값;
		result = number + (int)pi;
		
		//4. 사용
		System.out.println("double pi=" + pi);
		System.out.println("int number=" + number);
		System.out.println("int result=" + result);
		System.out.println("============================");
		
		byte buffer = (byte)result;
		System.out.println("int result=" + result);
		System.out.println("byte buffer=" + buffer);
		
		/*
		 * double pi=3.1415926535797
			int number=100
			int result=103
			============================
			int result=103
			byte buffer=103

		 */
		
		

	}

}
