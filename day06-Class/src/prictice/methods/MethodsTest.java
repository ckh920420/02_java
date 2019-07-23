package prictice.methods;

public class MethodsTest {

	public static void main(String[] args) {
		// 1. 메소드 정의 클래스 verietyMethods의 변수선언
		
		VerietyMethods methods;
		
		// 2.초기화
        methods = new VerietyMethods() ;
        
        // 3. 사용
        methods.sayHello();
        methods.maxim ("홍길동", "호부호형 곤란스");
        methods.maxim ("스탈린", "너 숙청");
        methods.maxim ("피타사간", "모든 사람은 두 종류의 고통 중 택일해야 한다. 훈련하는 고통이거나 후회하는 고통이거나");
        methods.maxim ("조선중앙일보", "민족의 영원한 지도자이자, 평화통일의 령도자이신 김정은 동지"); 
        methods.maxim ("당직사관", "복무신조!");
	}
	/** 
	 * 입력된 화씨온도를 섭씨온도로 변환하여 
	 * 변환된 섭씨온도를 리턴하는 메소드 
	 * fahToCel
	 * 
	 * 변환 공식 : 5 /9 *(F-32)
	 * @param fah : double 변환할 화씨 온도 값
	 * @return : 변환된 섭씨 온도 값
	 */
	
	//=========================================
	/** 
	 * 어떤 사람의 이름, 생년월을 매개변수로 받아
	 * 00는 00년 00월 생입니다
	 * 라는 문자응로 출력하는 메소드 벌스이얼먼스를 정의하시오
	 * 
	 * 골뱅이 파람 네임 : 스트링
	 * 골뱅이 이얼  : 인트
	 * 골뱅이 먼쓰 : 인트
	 */
	
	/**
	 * 출력할 단의 숫자를 입력 받아 
	 * 해당 단의 구구단을 출력하는 메소등
	 * 
	 * printNineNineTable으 ㄹ정의하시오
	 * 
	 * 출력 첫줄에 몇단인지 X단이라는 제목을 출력
	 * 골뱅이 프람 스테이지 : 인트
	 */
	
	/** 
	 * 출력할 단의 숫자를 가지고 있는 int 배열을 매개변수로 입력받아
	 * 입력된 배열의 원소인 각 숫자에 대해
	 * 구구단을 출력하는 메소드
	 * printNineNineTableFromArray를 정의하시오
	 * 
	 * 골뱅이 파람 스테이지스 : 인트[]
	 */
	
	/**
	 * 키 (센티미터), 몸무게(키로그람)을 매개변수로 입력받아 
	 * BMI 지수를 계산하여 비만도 판정 결과를 리턴하는 메소드
	 * calcBmi를 정의하시오
	 * 
	 * 공식 : 몸무게 /키^2
	 * 
	 * 15.0 미만                병정인저체중
	 * 15.0 이상 18.5미만
	 * 18.5 23.0      저체중
	 * 23.0 27.5              정상
	 * 27.5 40.0 과체중
	 * 40.0 초과 비만
	 * 초고도비만
	 * 
	 * 골뱅이 height : doulble
	 * @param weight : 따블
	 * 골뱅이  스트링  비만도 판정 문자열
	 * 
	 */
/** 
 * 입력된 두 정수 중에서 큰수를 찾아 리턴하느 메소드 max를 정의하시오
 * 
 * 골뱅이 파람 input1 : int
 * 골뱅이 파람 input2 : int
 * @return int 입력된 두 값 중 큰 정수
 * 
 */
	
	/**
	 * 정수가 저장 된 int 배열을 매개 변수로 입력 받아 
	 * 그 배열의 각 원소의 합을 구하여 리턴하느 메소드
	 * sumOfArray를 정의하시오
	 * 
	 * @ param numbers : int[] (int 배열)
	 * @ return int
	 * 
	 */
	
	/** 
	 * 정수가 저장된 인트 배열을 매개변수로 입력받아 그 배열의 각원소의 평균을 구하여 리턴하는 
	 * 메소드 avgOfArray를 정의
	 * 
	 * @param numbers : int[] 
	 * 
 */
	
}
