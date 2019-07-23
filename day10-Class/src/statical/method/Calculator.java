package statical.method;
/**
 * 산술 연산 덧셈, 뺄셈, 곱셈, 나눗셈을 처리하는 각각 메소드
 * add, subtract,multiply,divide를 정의
 * 
 * 각 메소드마다 매개변수를 정수 2개, 실수 2개를 받는 
 * 메소드 중복정의 기법을 사용하여 총 8개의 메소드를 정의하고
 * 연산결과를 리턴하도록 작성
 * 
 * 이 때, 각 메소드는 모드 static으로
 * @author Administrator
 *
 */
public class Calculator {
	
	public static int add (int num1, int num2 ) {
		          return num1 + num2;
	}
	public static double add (double num1, double num2 ) {
		          return num1 + num2;
	}
		
	public static int subtract (int num1, int num2) {
		          return num1 - num2;
	}
	public static  double subtract ( double num1, double num2) {
		          return num1 - num2;
	
	}
	
	

}
