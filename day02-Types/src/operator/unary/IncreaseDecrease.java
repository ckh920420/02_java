package operator.unary;

/**
 * 단항 연산자를 테스트 해보는 클래스
 * -----------------------------------
 * +,- : 부호 연산자 (부호를 변경해 줌)
 *       변수의 왼쪽에 붙여서 해당 변수에 있는 숫자 값의 부호를 변경
 * ++,-- : 증감연산자
 *        변수의 왼쪽/오른쪽에 붙여서 
 *        해당 변수의 값에 1씩 증가하거나 1씩 감소시키는 연산을 수행
 *--------------------------------------------------------------------------------
 * @author Administrator
 *
 */

public class IncreaseDecrease {

	public static void main(String[] args) {
		// 1. 선언, 2, 초기화
		int ten = 10;
		int count = 0;
		
		//3. - 연산자로 부호 변경
		System.out.println("ten=" + ten);
		
		ten = -ten;//
		System.out.println("ten=" + ten);
		
		ten = -ten;
				
				
	   //4. ++,-- 연산자로 count의 값을 변경
		System.out.println(++count); // count = count + 1 (출력전에)
		System.out.println(count++); //count = count + 1 (출력후에)
		                             // 즉 ++가 뒤에 붙여지면 좌에서 우로 읽혀지기 때문에 count 단계에서 
		                             // 출력정보 저장하고 ++단계에서 연산이 작용하게 된다 그러므로 이 값은 1이다
		
		System.out.println(count);  // 최종 저장된 계산 결과를 반영하여 2
		System.out.println(--count);// count =count - 1 출력 전에
		System.out.println(count--);// count = count -1 출력 후에
		System.out.println(count);  // 최종 결과 적용 된 count 값 0
		
		System.out.println("=================================");
		
		System.out.println(count++);
		System.out.println(count++);
		System.out.println(count++);
		System.out.println(count++);
		System.out.println(count++);
		System.out.println(count++);
		System.out.println(count++);
		
		System.out.println("=================================");
		
		System.out.println(count--);
		System.out.println(count--);
		System.out.println(count--);
		System.out.println(count--);
		System.out.println(count--);
		System.out.println(count--);
		System.out.println(count--);
		System.out.println(count--);
		
		// 반복적으로 사용가능한 증감연산자
	}

}
