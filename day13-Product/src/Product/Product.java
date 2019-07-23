package Product;
/**
 * ������ǰ�� �Ǹ��ϴ� ���忡��
 * �����ϴ� ����� "��ǰ"�� �����ϴ� Ŭ����
 * ---------------------------------
 * �������(private�� ������� ����)
 * ��ǰ��ȣ : pcode : String ----"P001"...
 * ��ǰ ��  : pname : String -----" �Ｚ ����...."
 * ����   :  price : int -------- ��¥ ������ǰ
 * ������� : quantity : int 
 * --------------------------------------
 * ������ (public���� ����)
 * �⺻ ������, �Ű������޴� ������ �ʵ� 1�� �÷�����
 * this, this() ���
 * ------------------------------------------
 * �޼ҵ�(public���� ����)
 * print() : void
 * --> ��ǰ�� ���¸� ���
 * 
 * toString() : String
 * -- �� ��ǰ�� ��ǥ�ϴ� ���ڿ��� ����
 * --> String.format()���� ���ڿ� ������ ����
 * 
 * discount(double percentage) : int
 * --> �Էµ� �ۼ�Ʈ��ŭ ���ε� ������ ����
 * 
 * sell(int amount) : void
 * --> ���忡�� �Ǹ�(���)�Ǿ�
 *    ��� ����(quantity)�� amount��ŭ �پ�鵵�� �ݿ�
 *    ��, ��������� 0���� �۾��� �� ���� ����
 *    
 *buy(int amount) : void
 * --           > ���忡 �԰��Ǿ� ��������� ���Ʈ��ŭ �õ��� �ݿ�
 * ---------------------------------------------------------
 * �ۼ��� ���ǻ���
 * �׽�Ʈ Ŭ������ ������ �̿��Ұ�
 * �� �ʵ带 ������ ��, �� �ʵ忡 ���� ������ �����ּ����� �ް�
 * �� ������ ����� �����ּ� ÷��
 * �� �޼ҵ� ����� �����ּ� ÷��
 * ---------------------------------------------------------
 * 
 * 
 * @author Administrator
 *
 */
public class Product {
	// 1. �ɹ����� ����
	String pcode;
	String pname;
	int price;
	int quantity;
	
	// 2. ������ ����
	/**
	 * �⺻ ������ ����
	 * �⺻�����ڴ� Ÿ���� �⺻������ �ʱ�ȭ�� �ϴ� ������ �ϰ� �ȴ�.
	 */
	public Product () {
		
	}
	/**
	 * �Ű������� �޴� ������ ����
	 * �������� ������ ������ Product����̸��� �����ڸ� �����ϰڴ�.
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
	
	// 3. �޼ҵ� ����
	
	//(1) print() : ��ǰ�� ���¸� ���(void)
	
	public void print() {
		System.out.printf("");
	}
	
	//(2) toStirng() : �� ��ǰ�� ��ǥ�ϴ� ���ڿ��� ����
	//String.format()���� ���ڿ� ������ ����
	
	public String toString() {
		return String.format("",pcode, pname, price, quantity);
	}
	
	//(3) discount(double percentage) : int
	// --> �Էµ� �ۼ�Ʈ��ŭ ���ε� ������ ����
	
	public return discount() {
		
	}
}

