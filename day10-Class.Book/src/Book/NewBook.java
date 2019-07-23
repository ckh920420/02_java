
package book;

/**
 * 책 한 권의 정보를 담는 클래스
 * ----------------------------
 * 일련번호  : sequence  : int
 * ISBN      : isbn      : String
 * 제목      : title     : String
 * 저자      : author    : String
 * 출판사    : company   : String
 * 페이지 수 : totalPage : int
 * 가격      : price     : int
 * 재고수량  : quantity  : int
 * ----------------------------
 * 생성자 중복정의
 * (기본생성자 명시, 매개변수 생성자 중복정의)
 * ----------------------------
 * 메소드 :
 * -- 기능 메소드 
 * void print() : 책의 정보를 출력하는 메소드
 * void buy(int amount)  : amount 만큼 책의 재고를 늘리는 메소드
 * void sell(int amount) : amount 만큼 책의 재고를 줄이는 메소드
 * 
 * -- 각 필드를 설정하는 메소드
 * -- 자바 빈즈(Java Beans) 규격에 의한 접근자/수정자 메소드
 * -- getter/setter
 * 
 * getter 작성시 메소드 이름 규격
 *  ==> get으로 시작하고 멤버변수필드의 첫글자를 대문자로 조합
 *      매개변수는 없음.
 *      리턴타입이 해당 멤버변수 필드의 타입과 맞춤
 * 
 * 예) sequence 필드의 getter 는 다음의 규격을 갖는다.
 * int getSequnece() {
 * 		return this.requence;
 * }
 * 
 * setter 작성시 메소드 이름 규격
 *  ==> set으로 시작하고 멤버변수 필드의 첫글자를 대문자로 조합
 *      매개변수는 해당 멤버변수 필드와 같은 타입과 변수로 받는다.
 *      리턴값이 없이 작성
 * void setSequence(int sequence) {
 *      this.sequcne = sequence;
 * }
 * 
 * 만약 멤버변수 필드가 boolean 타입이라면 getter의 이름은
 * get으로 시작하지 않고 is로 시작한다.
 * 
 * 
 * @author 304
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

	Book(int sequence) {
		this();
		setSequence(sequence);
	}

	Book(int sequence, String isbn) {
		this(sequence);
		setIsbn(isbn);
	}

	Book(int sequence, String isbn, String title) {
		this(sequence, isbn);
		this.title = title;
	}

	// sequence 멤버 변수의 getter
	public int getSequence() {
		return sequence;
	}

	// sequence 의 setter
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	// isbn멤버변수 필드에 대한 getter
	public String getIsbn() {
		return isbn;
	}

	// isbn의 setter
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


}










  139  day10-Class.Book/src/book/BookShelf.java 
@@ -0,0 +1,139 @@
package book;

/**
 * Book 여러개가 꼽혀있어
 * 책 객체 여러개를 한번에 저장하고 
 * 관리할 수 있는 클래스
 * 
 * @author 304
 *
 */
public class BookShelf {

	// 멤버변수
	Book[] books;

	BookShelf() {
		books = new Book[0];
	}

	BookShelf(Book[] books) {
		this.books = books;
	}

	// 책장에 책을 추가 : add : void : 매개변수로 Book 1개를 받는다.
	public void add(Book book) {
		// 현재 books 보다 길이가 1큰 배열을 새로 만든다.
		// newBooks
		Book[] newBooks = new Book[books.length + 1];

		// books 의 모든 책 내용을 새로 생성한 1칸 큰 배열에
		// 앞쪽부터 복사
		for (int idx = 0; idx < books.length; idx++) {
			newBooks[idx] = books[idx];
		}

		// 매개변수로 넘겨진 book 은 마지막 새로 생긴 칸에 저장
		newBooks[newBooks.length - 1] = book;

		// 이 클래스의 books 멤버변수에 새로만든 newBooks 저장
		this.books = newBooks;
	}

	// 책장에서 책을 제거 : void : remove(Book book)
	public void remove(Book book) {
		// book 객체의 sequence 가 같으면 같은 책으로 판단해서
		// 삭제
		// 폐기 안하고 남는 책을 유지할 새 배열
		Book[] newBooks;

		// 1. 폐기할 책이 위치하는 인덱스를 찾기

		// 2. 폐기할 책의 인덱스가 -1보다 크면
		//    폐기할 책이 있다는 의미로 판단하고 삭제로직 진입

		// 3. 폐기 안할 책을 유지할 
		//    새 배열을 지금 배열 크기 - 1 크기로 생성

		// 4. 폐기할 인덱스가 배열 중간일 때
		//  (1) 삭제할 책 앞쪽의 책정보는 같은 인덱스로 복사
		//  (2) 삭제할 책 뒤쪽의 남는 책정보는 현재 인덱스 - 1 위치로 복사

		// 5. 폐기할 인덱스가 배열 끝일 때
		//    폐기할 책 인덱스 앞쪽까지만 새 배열에 복사

		// 6. 남는 책이 복사된 새 배열을
		//    this.book 에 새로 저장
		this.books = newBooks;

	}

	// 책 정보 수정 : void : set(Book book)
	public void set(Book book) {
		// 수정할 book 이 books 배열 
		// 몇번째 인덱스에 있는지 찾는다.
		int index = findBookIndex(book);

		if (index > -1) {
			books[index] = book;
		}
	}

	// 책 한권 얻기 : Book : get(Book book)
	public Book get(Book book) {
		// 입력된 book의 sequence 값과
		// 내부 배열에 저장된 책들중 일치하는 sequence 를 가진
		// 책 1권의 정보를 리턴
		return findBook(book);
	}

	private Book findBook(Book book) {
		Book findBook = null;
		for (int idx = 0; idx < books.length; idx++) {
			if (books[idx].getSequence() == book.getSequence()) {
				// 같은 책 찾았다.
				findBook = books[idx];
				break;
			}
		}
		return findBook;
	}

	private int findBookIndex(Book book) {
		int index = -1;
		for (int idx = 0; idx < books.length; idx++) {
			if (books[idx].getSequence() == book.getSequence()) {
				// 같은 책 찾았다.
				index = idx;
				break;
			}
		}
		return index;
	}


	// 전체 책 목록을 얻기






	// 접근자
	public Book[] getBooks() {
		return books;
	}

	// 수정자
	public void setBooks(Book[] books) {
		this.books = books;
	}

}







  41  day10-Class/src/statical/method/CalcTest.java 
@@ -0,0 +1,41 @@
package statical.method;

import static statical.method.Calculator.subtract;
/**
 * Calculator 클래스에 있는
 * static 메소드를 테스트하는 클래스
 * ----------------------------------
 * static 메소드는 
 * 클래스이름.메소드이름(아규먼트);
 * 의 방식으로 호출
 * @author 304
 *
 */
public class CalcTest {

	public static void main(String[] args) {
		// static 이 아닌 메소드를 호출할때는 
		// 해당 메소드가 정의 된 클래스 객체참조 변수를 초기화 후
		// 해당 변수에 메소드를 호출
//		Calculator cal = new Calculator();
//		cal.add(10.0, 15.2);

		// static 메소드는 클래스이름.메소드이름(아규먼트);
		double result = Calculator.add(1.0, 2.5);
		System.out.println(result);

		int addResult = Calculator.add(10, 2);
		System.out.println(addResult);

		// 자바에서는 클래스의 
		// static필드들(변수, 메소드)에 대해서
		// static import 지원
		// static import 구문을 클래스 선언 위쪽에 작성한 경우
		// 메소드이름 만으로 호출할 수 있다.
		double subResult = subtract(20.5, 1.4);
		System.out.println(subResult);

	}

}

  58  day10-Class/src/statical/method/Calculator.java 
@@ -0,0 +1,58 @@
package statical.method;

/**
 * 산술 연산인
 * 
 * 덧셈, 뺄셈, 곱셈, 나눗셈을 처리하는 각각의 메소드
 * add, subtract, multiply, divide 를 정의한다.
 * 
 * 각 메소드마다 매개변수를 정수 2개, 실수 2개를 받는
 * 메소드 중복정의 기법을 사용하여 총 8개의 메소드를 정의하고
 * 연산 결과를 리턴하도록 작성한다.
 * 
 * 이 때 각 메소드는 모두 static 으로 작성
 * 
 * 
 * @author 304
 *
 */
public class Calculator {

	public static int add(int x, int y) {
		return x + y;
	}

	public static double add(double x, double y) {
		return x + y;
	}

	public static int subtract(int x, int y) {
		return x - y;
	}

	public static double subtract(double x, double y) {
		return x - y;
	}

	public static int multiply(int x, int y) {
		return x * y;
	}

	public static double multiply(double x, double y) {
		return x * y;
	}

	public static int divide(int x, int y) {
		return x / y;
	}

	public static double divide(double x, double y) {
		return x / y;
	}