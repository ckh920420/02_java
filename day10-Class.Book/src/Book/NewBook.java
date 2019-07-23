
package book;

/**
 * å �� ���� ������ ��� Ŭ����
 * ----------------------------
 * �Ϸù�ȣ  : sequence  : int
 * ISBN      : isbn      : String
 * ����      : title     : String
 * ����      : author    : String
 * ���ǻ�    : company   : String
 * ������ �� : totalPage : int
 * ����      : price     : int
 * ������  : quantity  : int
 * ----------------------------
 * ������ �ߺ�����
 * (�⺻������ ���, �Ű����� ������ �ߺ�����)
 * ----------------------------
 * �޼ҵ� :
 * -- ��� �޼ҵ� 
 * void print() : å�� ������ ����ϴ� �޼ҵ�
 * void buy(int amount)  : amount ��ŭ å�� ��� �ø��� �޼ҵ�
 * void sell(int amount) : amount ��ŭ å�� ��� ���̴� �޼ҵ�
 * 
 * -- �� �ʵ带 �����ϴ� �޼ҵ�
 * -- �ڹ� ����(Java Beans) �԰ݿ� ���� ������/������ �޼ҵ�
 * -- getter/setter
 * 
 * getter �ۼ��� �޼ҵ� �̸� �԰�
 *  ==> get���� �����ϰ� ��������ʵ��� ù���ڸ� �빮�ڷ� ����
 *      �Ű������� ����.
 *      ����Ÿ���� �ش� ������� �ʵ��� Ÿ�԰� ����
 * 
 * ��) sequence �ʵ��� getter �� ������ �԰��� ���´�.
 * int getSequnece() {
 * 		return this.requence;
 * }
 * 
 * setter �ۼ��� �޼ҵ� �̸� �԰�
 *  ==> set���� �����ϰ� ������� �ʵ��� ù���ڸ� �빮�ڷ� ����
 *      �Ű������� �ش� ������� �ʵ�� ���� Ÿ�԰� ������ �޴´�.
 *      ���ϰ��� ���� �ۼ�
 * void setSequence(int sequence) {
 *      this.sequcne = sequence;
 * }
 * 
 * ���� ������� �ʵ尡 boolean Ÿ���̶�� getter�� �̸���
 * get���� �������� �ʰ� is�� �����Ѵ�.
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

	// sequence ��� ������ getter
	public int getSequence() {
		return sequence;
	}

	// sequence �� setter
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	// isbn������� �ʵ忡 ���� getter
	public String getIsbn() {
		return isbn;
	}

	// isbn�� setter
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
 * Book �������� �����־�
 * å ��ü �������� �ѹ��� �����ϰ� 
 * ������ �� �ִ� Ŭ����
 * 
 * @author 304
 *
 */
public class BookShelf {

	// �������
	Book[] books;

	BookShelf() {
		books = new Book[0];
	}

	BookShelf(Book[] books) {
		this.books = books;
	}

	// å�忡 å�� �߰� : add : void : �Ű������� Book 1���� �޴´�.
	public void add(Book book) {
		// ���� books ���� ���̰� 1ū �迭�� ���� �����.
		// newBooks
		Book[] newBooks = new Book[books.length + 1];

		// books �� ��� å ������ ���� ������ 1ĭ ū �迭��
		// ���ʺ��� ����
		for (int idx = 0; idx < books.length; idx++) {
			newBooks[idx] = books[idx];
		}

		// �Ű������� �Ѱ��� book �� ������ ���� ���� ĭ�� ����
		newBooks[newBooks.length - 1] = book;

		// �� Ŭ������ books ��������� ���θ��� newBooks ����
		this.books = newBooks;
	}

	// å�忡�� å�� ���� : void : remove(Book book)
	public void remove(Book book) {
		// book ��ü�� sequence �� ������ ���� å���� �Ǵ��ؼ�
		// ����
		// ��� ���ϰ� ���� å�� ������ �� �迭
		Book[] newBooks;

		// 1. ����� å�� ��ġ�ϴ� �ε����� ã��

		// 2. ����� å�� �ε����� -1���� ũ��
		//    ����� å�� �ִٴ� �ǹ̷� �Ǵ��ϰ� �������� ����

		// 3. ��� ���� å�� ������ 
		//    �� �迭�� ���� �迭 ũ�� - 1 ũ��� ����

		// 4. ����� �ε����� �迭 �߰��� ��
		//  (1) ������ å ������ å������ ���� �ε����� ����
		//  (2) ������ å ������ ���� å������ ���� �ε��� - 1 ��ġ�� ����

		// 5. ����� �ε����� �迭 ���� ��
		//    ����� å �ε��� ���ʱ����� �� �迭�� ����

		// 6. ���� å�� ����� �� �迭��
		//    this.book �� ���� ����
		this.books = newBooks;

	}

	// å ���� ���� : void : set(Book book)
	public void set(Book book) {
		// ������ book �� books �迭 
		// ���° �ε����� �ִ��� ã�´�.
		int index = findBookIndex(book);

		if (index > -1) {
			books[index] = book;
		}
	}

	// å �ѱ� ��� : Book : get(Book book)
	public Book get(Book book) {
		// �Էµ� book�� sequence ����
		// ���� �迭�� ����� å���� ��ġ�ϴ� sequence �� ����
		// å 1���� ������ ����
		return findBook(book);
	}

	private Book findBook(Book book) {
		Book findBook = null;
		for (int idx = 0; idx < books.length; idx++) {
			if (books[idx].getSequence() == book.getSequence()) {
				// ���� å ã�Ҵ�.
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
				// ���� å ã�Ҵ�.
				index = idx;
				break;
			}
		}
		return index;
	}


	// ��ü å ����� ���






	// ������
	public Book[] getBooks() {
		return books;
	}

	// ������
	public void setBooks(Book[] books) {
		this.books = books;
	}

}







  41  day10-Class/src/statical/method/CalcTest.java 
@@ -0,0 +1,41 @@
package statical.method;

import static statical.method.Calculator.subtract;
/**
 * Calculator Ŭ������ �ִ�
 * static �޼ҵ带 �׽�Ʈ�ϴ� Ŭ����
 * ----------------------------------
 * static �޼ҵ�� 
 * Ŭ�����̸�.�޼ҵ��̸�(�ƱԸ�Ʈ);
 * �� ������� ȣ��
 * @author 304
 *
 */
public class CalcTest {

	public static void main(String[] args) {
		// static �� �ƴ� �޼ҵ带 ȣ���Ҷ��� 
		// �ش� �޼ҵ尡 ���� �� Ŭ���� ��ü���� ������ �ʱ�ȭ ��
		// �ش� ������ �޼ҵ带 ȣ��
//		Calculator cal = new Calculator();
//		cal.add(10.0, 15.2);

		// static �޼ҵ�� Ŭ�����̸�.�޼ҵ��̸�(�ƱԸ�Ʈ);
		double result = Calculator.add(1.0, 2.5);
		System.out.println(result);

		int addResult = Calculator.add(10, 2);
		System.out.println(addResult);

		// �ڹٿ����� Ŭ������ 
		// static�ʵ��(����, �޼ҵ�)�� ���ؼ�
		// static import ����
		// static import ������ Ŭ���� ���� ���ʿ� �ۼ��� ���
		// �޼ҵ��̸� ������ ȣ���� �� �ִ�.
		double subResult = subtract(20.5, 1.4);
		System.out.println(subResult);

	}

}

  58  day10-Class/src/statical/method/Calculator.java 
@@ -0,0 +1,58 @@
package statical.method;

/**
 * ��� ������
 * 
 * ����, ����, ����, �������� ó���ϴ� ������ �޼ҵ�
 * add, subtract, multiply, divide �� �����Ѵ�.
 * 
 * �� �޼ҵ帶�� �Ű������� ���� 2��, �Ǽ� 2���� �޴�
 * �޼ҵ� �ߺ����� ����� ����Ͽ� �� 8���� �޼ҵ带 �����ϰ�
 * ���� ����� �����ϵ��� �ۼ��Ѵ�.
 * 
 * �� �� �� �޼ҵ�� ��� static ���� �ۼ�
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