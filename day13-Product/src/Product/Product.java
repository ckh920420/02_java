package Product;
/**
 * 전자제품을 판매하는 매장에서
 * 관리하는 대상인 "제품"을 정의하는 클래스
 * ---------------------------------
 * 멤버변수(private등 사용하지 않지)
 * 제품번호 : pcode : String ----"P001"...
 * 제품 명  : pname : String -----" 삼성 지펠...."
 * 가격   :  price : int -------- 진짜 가격제품
 * 재고수량 : quantity : int 
 * --------------------------------------
 * 생성자 (public으로 선언)
 * 기본 생성자, 매개변수받는 생성자 필드 1씩 늘려가며
 * this, this() 사용
 * ------------------------------------------
 * 메소드(public으로 선언)
 * print() : void
 * --> 제품의 상태를 출력
 * 
 * toString() : String
 * -- 이 제품을 대표하는 문자열을 리턴
 * --> String.format()으로 문자열 생성후 리턴
 * 
 * discount(double percentage) : int
 * --> 입력된 퍼센트만큼 할인된 가격을 리턴
 * 
 * sell(int amount) : void
 * --> 매장에서 판매(출고)되어
 *    재고 수량(quantity)이 amount만큼 줄어들도록 반영
 *    단, 재고수량이 0보다 작아질 수 없는 제한
 *    
 *buy(int amount) : void
 * --           > 매장에 입고되어 재고수량이 어마운트만큼 늘도록 반영
 * ---------------------------------------------------------
 * 작성시 주의사항
 * 테스트 클래스는 샘플을 이용할것
 * 각 필드를 선언할 떄, 각 필드에 대한 설명을 문서주석으로 달것
 * 각 생성자 선언시 문서주석 첨부
 * 각 메소드 선언시 문서주석 첨부
 * ---------------------------------------------------------
 * 
 * 
 * @author Administrator
 *
 */
public class Product {
	// 1. 맴버변수 선언
	String pcode;
	String pname;
	int price;
	int quantity;
	
	// 2. 생성자 선언
	/**
	 * 기본 생성자 선언
	 * 기본생성자는 타입의 기본값으로 초기화를 하는 역할을 하게 된다.
	 */
	public Product () {
		
	}
	/**
	 * 매개변수를 받는 생성자 선언
	 * 공개적인 범위를 가지는 Product라는이름의 생성자를 선언하겠다.
	 * 
	 * @param pcode
	 */
	
	public Product (String pcode) {
      this();
      this.pcode =pcode;
	}
	
	public Product (String pcode, String pname) {
		this(pcode);
		this.pname = pname;
	}
	
	public Product (String pcode, String pname, int price) {
		this(pcode, pname);
		this.price = price;
	}
	
	public Product (String pcode, String pname, int price, int quantitiy) {
		this(pcode, pname, price);
		this.quantity = quantity;
	}
	
	// 3. 메소드 선언
	
	//(1) print() : 제품의 상태를 출력(void)
	
	public void print() {
		System.out.printf("");
	}
	
	//(2) toStirng() : 이 제품을 대표하는 문자열로 리턴
	//String.format()으로 문자열 생성후 리턴
	
	public String toString() {
		return String.format("",pcode, pname, price, quantity);
	}
	
	//(3) discount(double percentage) : int
	// --> 입력된 퍼센트만큼 할인된 가격을 리턴
	
	public return discount() {
		
	}
}


