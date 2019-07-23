package array.basic;

/** 
 * 직원들의 급여정보 (기본형 int 타입)을 저장하는 배열을 테스트하는 클래스
 * @author Administrator
 *
 */

public class ArraySalaries {

	public static void main(String[] args) {
		// 1. 선언 : 배열 참조 변수 : 변수이름에 복수형으로 줄 것.
		int[] salaries;
		
		// 2.초기화 ; 배열 참조 변수는 기본혀잉 아니므로 초기화를 위해 new를 사용해야한다
		salaries = new int[10];
		
		// 3. 사용
		// (1) 배열에 값으 ㄹ넣기 전에 출력
		// 반면에, 일반 기본형 변수는 명시적 초기화 후에 사용가능
          int age;
          
          System.out.println("(1) 배열 생성 직후 원소 출력====");
          System.out.printf("salaries[0]=%d%n", salaries[0]);
          System.out.printf("salaries[1]=%d%n", salaries[1]);
          System.out.printf("salaries[2]=%d%n", salaries[2]);
          System.out.printf("salaries[3]=%d%n", salaries[3]);
          System.out.printf("salaries[4]=%d%n", salaries[4]);
          System.out.printf("salaries[5]=%d%n", salaries[5]);
          System.out.printf("salaries[6]=%d%n", salaries[6]);
          System.out.printf("salaries[7]=%d%n", salaries[7]);
          System.out.printf("salaries[8]=%d%n", salaries[8]);
          System.out.printf("salaries[9]=%d%n", salaries[9]);
          
          // 결과의 원인 new 연산자의 기능
          //         칸을 마련하고 원소타입의 기본값으로 초기화
          
          // 배열의 각 칸에 값을 할당
          
                   salaries[0] = 8;
                   salaries[1] = 10;
                   salaries[2] = 55;
                   salaries[3] = 86;
                   salaries[4] = 23;
                   salaries[5] = 98;
                   salaries[6] = 34;
                   salaries[7] = 50;
                   salaries[8] = 76;
                   salaries[9] = 11;
                   
                   System.out.printf("salaries[0]=%d%n", salaries[0]);
                   System.out.printf("salaries[1]=%d%n", salaries[1]);
                   System.out.printf("salaries[2]=%d%n", salaries[2]);
                   System.out.printf("salaries[3]=%d%n", salaries[3]);
                   System.out.printf("salaries[4]=%d%n", salaries[4]);
                   System.out.printf("salaries[5]=%d%n", salaries[5]);
                   System.out.printf("salaries[6]=%d%n", salaries[6]);
                   System.out.printf("salaries[7]=%d%n", salaries[7]);
                   System.out.printf("salaries[8]=%d%n", salaries[8]);
                   System.out.printf("salaries[9]=%d%n", salaries[9]);
                   
                   // 배열이 생성되면 길이를 나타는length 변수가 
                   // JVM( 자바 가상 머신) 에 의해 생성됨
                   
                   System.out.printf("salaries 배열의 길이",salaries.length);
                   
                   //만약 index를 벗어나는 접근을 하면
                   System.out.printf("salaries[10] = %d%n",salaries[10]);
                   
                   
                   //===================================================
                   // for loop와 배열의 조합
                   
                   System.out.println("========================");
                   for (int idx= 0; idx < salaries.length ; idx++) { 
                	   System.out.printf("salaries[%d} = %d%n", idx, salaries[idx]);
                   }
                   
                   System.out.println("== for loop로 입력==");
                   Scanner scan = new Scanner(System.in);
                   for (int idx= 0; idx < salaries.length ; idx++) { 
                	   System.out.printf("salaries[%d} = %d%n", idx, salaries[idx]);
                   }
                   
                   
		

	}

}
