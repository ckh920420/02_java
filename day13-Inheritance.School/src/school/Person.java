package school;
/** 
 * 시스템에 저장될 학생, 선생, 직원의 정보 중  공통적인 내용을 추출한 상위 클래스
 * 일반적인 사람의 정보를 저장한다
 * ----------------------------------------------------------------
 * id : String
 * name : String
 * age : int
 * ----------------------
 * @author Administrator
 *
 */

public abstract class Person {
	
	// 1. 맴버변수
	

	private String id;
	private String name;
	private int age;
	
	// 2. 생성자
	// (1) 기본 생성자 : 생성자 선언부를 완전히 생략시, 자동으로 기본 생성자가 선언됨,
	//               그러나 기본생성자가 아닌 생성자를 하나라도 선언하면 자동 생성되지 않음
	public Person () {
	}
	
	// (2) 맴버변수가 포함된 생성자
	public Person (String id) {
		this.id = id;
	}
	
	public Person (String id, String name) {
		this(id); 
	    this.name = name;
	}
		
	public Person (String id, String name, int age) {
		this(id, name); 
		this.age = age;
		
	}
	
	// 3. 메소드

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age =age;
	}
	
	// toString() 재정의
	/**  
	 * 
	 * 1. print 게열의 메소드에서 객체참조변수를 출력할때 자동으로 작동하는 메소드
	 * 2. Object 클래스에서 상속받은 메소드
	 * 3. 객체를 대표하는 문자열을 만들어서 리턴
	 * -> 각 필드를 모두 출력하는 문자열 
	 */
	@Override
	public String toString() {
		return String.format("[아이디 :%s], [이름 : %s], [나이 :%d]",id, name, age);
	}
	
	/**
	 * 현재의 객체를 출력하는 메소드
	 */
	public void print() {
		System.out.println(this);
		
	}
	
}
