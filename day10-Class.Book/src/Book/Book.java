package Book;
/**
 * å �ѱ��� ������ ��� Ŭ����
 * ----------------------
 * �Ϸù�ȣ : sequence : int-
 * ISBN : isbn : String
 * ���� : title : String
 * ���� : author : String
 * ���ǻ� : company : String
 * ������ �� : totalPage : int
 * ���� : price : int
 * ��� : quantity : int (��� ������ 0���� �۾��� �� ������?)
 * -----------------------------
 * ������ �ߺ�����
 * (�⺻ ������ ���, �Ű����� ������ �ߺ�����)
 * ------------------------------------------
 * �޼ҵ� :
 * -- ��� �޼ҵ� (���̵�� �ۼ�
 * print() : å�� ������ ����ϴ� �޼ҵ�
 * buy(int amount) : å�� ��� �ø��� �޼ҵ�
 * sell(int amount) : å�� ��� ���̴� �޼ҵ�
 * 
 * --�� �ʵ带 �����ϴ� �޼ҵ� (�� �ʵ�� ��������� ����ؿ�)
 * --�ڹ� ���� (Java Beans) �԰ݿ� ���� ������/������ �޼ҵ�
 * --getter/setter (������/������)
 * getter �ۼ��� �޼ҵ� �̸� �԰�
 * => get���� �����ϰ� �ɹ������ʵ��� ù���ڸ� �빮�ڷ� ����
 * �Ű����Ť����� ����
 * ����Ÿ���� �ش� �ɹ����� �ʵ��� Ÿ�԰� ����
 * �� ) sequence �ʵ��� getter�� ���� �԰��� ���´�
 * int getSequnece() {
 *      return this. requence;
 * 
 * ������ �ۼ��� �޼ҵ� �̸�
 * ==> set���� �����ϰ� �ɹ����� �ʵ��� ù���ڸ� �빮�ڷ� ����
 * �Ű������� �ش� �ɹ����� �ʵ�� ���� Ÿ�԰� ������ �޴´�
 * ���ϰ����� �ۼ�
 * 
 * void setSequence(int sequence) {
 *      this.sequcene = sequcene;
 *      
 * ���� �ɹ����� �ʵ尡 booleanŸ���̶�� ������ �̸��� get�� �ƴ� is�� �����Ѵ�
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
