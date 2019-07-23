package operator.binary;

/**
 * +,_,*,/,% : 이항 산술연산자
 * -------------------------
 * 연산자의 양쪽에 숫자 타입 변수를 취해서
 * 산술연산을 수행
 * 
 * 산술연산을 할 때는 양쪽의 항 중에서 
 * 타입이 큰 쪽의 타입으로 맞추어 연산된다
 * 
 * @author Administrator
 *
 */

public class Arithmetic {

	public static void main(String[] args) {
		// 1. 선언
		int input1;
		int input2;
		
		// 2. 초기화
		input1 = 100;
		input2 = 10;
		
		// 3. 사용
		System.out.println("input1 + input2=" + (input1 + input2));
		System.out.println("input1 - input2=" + (input1 - input2));
		System.out.println("input1 * input2=" + (input1 * input2));
		System.out.println("input1 / input2=" + (input1 / input2));
		System.out.println("input1 % input2=" + (input1 % input2));
		
		System.out.println("=============================" );
		
		System.out.println("input1 + input2=" + input1 + input2);
		//input1과 input2 를 괄호를 사용하여 우선순위를 높이지 않으면 앞선 문자열과 접합연산이 먼저 일어남
		// 즉 산술연산이 작용되지 않고 문자간의 결합이 발생하게 됨 결과값 = 222100으로 나옴
	}

}
