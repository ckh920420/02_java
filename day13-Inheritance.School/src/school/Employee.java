package school;
/**
 * 학교 시스템에서 교직원의 정보를 저장하는 클래스
 * 
 * 사라므이 공통정보를 담는 클래스인 Person을 상속한다
 * --------------------------------------
 * dept : String : 소속부서 이름
 * -----------------------------------------------------------
 * @author Administrator
 *
 */

public class Employee extends Person {
      //1. 맴버변수 선언부
	/** 직원의 소속 부서이름*/
	private String dept;
	
	//2. 생성자
	
	public Employee() {
	}
	
	public Employee(String dept) {
		this.dept = dept;
		
		
	}
	
	public Employee(String id, String name, int age, String dep) {
    	super(id,name,age);
    	this.dept = dept;
	}
	
	//메소드 선언부
	
	@Override
	public String toString() {
		String empStr = String.format(", 부서 : %s", dept);
	}
	
}

