package Book;
/**
 * 책 한권의 정보를 담는 클래스
 * ----------------------
 * 일련번호 : sequence : int-
 * ISBN : isbn : String
 * 제목 : title : String
 * 저자 : author : String
 * 출판사 : company : String
 * 페이지 수 : totalPage : int
 * 가격 : price : int
 * 재고 : quantity : int (재고 수량은 0보다 작아질 수 없겠죠?)
 * -----------------------------
 * 생성자 중복정의
 * (기본 생성자 명시, 매개변수 생성자 중복정의)
 * ------------------------------------------
 * 메소드 :
 * -- 기능 메소드 (보이드로 작성
 * print() : 책의 정보를 출력하는 메소드
 * buy(int amount) : 책의 재고를 늘리는 메소드
 * sell(int amount) : 책의 재고를 줄이는 메소드
 * 
 * --각 필드를 설정하는 메소드 (각 필드는 멤버변수를 얘기해요)
 * --자바 빈즈 (Java Beans) 규격에 의한 접근자/수정자 메소드
 * --getter/setter (접근자/수정자)
 * getter 작성시 메소드 이름 규격
 * => get으로 시작하고 맴버변수필드의 첫글자를 대문자로 조함
 * 매개버ㅕㄴ수는 없음
 * 리턴타입이 해당 맴버변수 필드의 타입과 맞춤
 * 예 ) sequence 필드의 getter는 다음 규격을 갖는다
 * int getSequnece() {
 *      return this. requence;
 * 
 * ㄹ세터 작성시 메소드 이름
 * ==> set으로 시작하고 맴버변수 필드의 첫글자를 대문자로 조합
 * 매개변수는 해당 맴버변수 필드와 같은 타입과 변수로 받는다
 * 리턴값없이 작성
 * 
 * void setSequence(int sequence) {
 *      this.sequcene = sequcene;
 *      
 * 만약 맴버변수 필드가 boolean타입이라면 개터의 이름은 get이 아닌 is로 시작한다
 * 
 * 
 *      
 *  
 * 
 * 
 * @author Administrator
 *
 */
public class Book {
	  int sequence;
	  String isbn;
	  String title; 
	  String author;
	  String company; 
	  int totalPage;
	  int price;
	  int quantity; 
	  
	  Book() {
		  
	  }
	  
	  Book (int sequence) {
		  this();
		  setSequence(sequence);
	  }
	  
	  public int getSequence() {
		  return sequence;
	  }
	  
	  public void setSequence() {
		  this.sequence = sequence;
	  }
	  
	  public int getIsbn() {
		  return isbn;
	  }
	  
	  public void setIsbn() {
		  this.isbn = isbn;
	  }
	  
	  public int getTitle() {
		  return title;
	  }
	  
	  public void setTitle() {
		  this.title = title;
	  }
	  
	  public int getAuthor() {
		  return author;
	  }
	  
	  public void setAuthor() {
		  this.author = author;
	  }
	  
	  public int getCompany() {
		  return company;
	  }
	  
	  public void setCompany() {
		  this.company = company;
	  }
	  
	  public int getTotalPage() {
		  return totalPage;
	  }
	  
	  public void setTotalPage() {
		  this.totalPage = totalPage;
	  }
	  
	  public int getprice() {
		  return price;
	  }
	  
	  public void setPrice() {
		  this.price = price;
	  }
	  
	  public int getSequence() {
		  return sequence;
	  }
	 
	  public void setSequence() {
		  this.sequence = sequence;
	  }
}
