package Book;
/**
 * Book �������� �����־�
 * å ��ü �������� �ѹ��� �����ϰ� ������ �� �ִ� Ŭ����
 * 
 * 
 * @author Administrator
 *
 */

public class BookShelf {
	//�ɹ�����
	Book[] books;
	
	BookShelf() {
		books = new Book[0];
	}
	
	BookShelf(Book[] books) {
		this.books = books;
	}
	
	// å�忡 å�� �߰� : add : void : �Ű�������  Book 1���� �޴´�
	public void add(Book book) {
		// ���� books ���� ���̰� 1 ū �迭�� ���� �����
		//newBooks
		
		//books �� ��� å�� ������ ���� ������ 1ĭ ū �迭�� ���� ���� ����
		
		// �Ű������� �Ѱ��� book�� ������ ���� ���� ĭ�� ����
		
		// �� Ŭ������ Books �ɹ������� ���� ���� newBooks����
        
		Book[] newBooks = new Book[books.length +1];
		
		for (int idx = 0; idx <books.length; idx++) {
			newBooks[idx] = books[idx];
			}
		newBooks[newBooks.length -1]
		
		
		
	}
	// å�忡�� å�� ���� : void :remove(Book book)
	public void remove(Book book) {
		// ��{book) ��ü�� ������(sequence)�� ������ ����å���� �Ǵ��ؼ� ����
	}
//       �����ϰ� ���� å�� ������ �����
        Book
	// 1. ����� å�� ��ġ�ϴ� �ε����� ã��
	
	// 2. ����� å�� �ε����� -1���� ũ��
	//    ����� å�� �ִٴ� �ǹ̷� �Ǵ��ϰ� ���� ���� ����
	
	// 2.  ��� ���� å�� ������
	//     �� �迭�� ���� �迭 ũ�� -1 ũ��� ����
	
	// 4. ����� �ε����� �迭 �߰��� ��
	// (1) ������ å ������ å������ ���� �ε����� ����
	// (2) ������ å ������ ���� å������ ���� �ε��� -1 ��ġ�� ����
	
	// 5. ����� �ε����� �迭 ���϶�
	//    ����� å �ε��� ���ʱ����� ���迭�� ����
	
	// 6.  ���� å�� ����� �� �迭�� 
	//     this.book�� ����
        this.books = new books
      
	
	// å ������ �����ϱ� : void : set
	public void set(Book book) {
		// ������ ���� �Ͻ� �迭 ����� �ε����� �ִ��� ã��
		int index = findBookIndex(book);
		
		if (index >-1) {
			books[index] = books;
		}
	}
	
	// å �ѱ� ������ : Book : get(Book book)
	public Book get(Book book) {
		// �Էµ�  book �� sequence ����
		// ���� �迭�� ����� å���� ��ġ�ϴ� �������� ���� å 1���� ������ ����
		
		
	}
	
	Book findBook( Book book ) {
		for (int idx = 0; idx < books.length; idx++) {
			if (books[idx].getSequence() == book.getSequence())  {
				// ����å ã��
				findBook = books[idx];
				break;
			}
		}
		return findBook;
	}
	
	private int( Book book ) {
		for (int idx = 0; idx < books.length; idx++) {
			if (books[idx].getSequence() == book.getSequence())  {
				// ����å ã��
				findBook = books[idx];
				break;
			}
		}
		return findBook;
	
	// ��ü å ����� ���
	

	
	
	
	//������
	public Book[] getBooks() {
		return books;
		}
	
	//������
	public void setBooks(Book[] books) {
		this.books = books;
	}

}
