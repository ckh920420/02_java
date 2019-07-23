package earser;
/**
 * ĥ�� ���찳�� �����ϴ� Ŭ����
 * -------------------------------------------
 * ���찳 �Ϸ� ��ȣ �ο��� ���� Ŭ��������
 * count �� �����ϰ� 0���� �ʱ�ȭ
 * -------------------------------------------
 * ĥ�� ���찳 �Ӽ� ���� => ��������� ����
 * 
 * ���찳 �Ϸù�ȣ : serial : int
 * 
 * ���� : width  : double
 * ���� : height : double
 * ���� : depth  : double 
 * ��   : layer  : int
 * ���� : color  : String
 * -------------------------------------------
 * ������ ���� : �ߺ�����
 * �⺻������ ���
 *   : �⺻�����ڿ��� 
 *     serial ������ ������ count ������ ���� ����;
 * 
 * �Ű������� �޴� ������ :  
 *  
 * �����ڸ����丵 (1)
 *          : this Ű���带 ����Ͽ� �Ű����� ������ ����
 * �����ڸ����丵 (2)
 *          : this() �ٸ� ������ ȣ�� �����Ͽ�
 *            �����ڸ� ������ �ߺ�����            
 * -------------------------------------------
 * ��� ���� : �޼ҵ�� ����
 * ĥ�� �����  : erase() : void 
 *              : "ĥ���� �������ϴ�." ���ڿ� ���
 * �� �㾿 ���� : peel()  : void
 *              : ���� layer ������ 1 ����
 *                layer �� 0�� �� ������
 * ���찳 ���� ��� : print() : void
 *              : ���� ���찳�� ����, ����, ����, ���� ��, ���� 
 *                ���� ���¸� ���               
 * 
 * @author 304
 *
 */
public class Eraser {
	
	// TODO ����ƽ ���� int Ÿ���� count �����ϰ� 0 �ʱ�ȭ
	static int count = 0;
	
	// 1. ������� �����
	// TODO int Ÿ���� �Ϸù�ȣ ������ ������� serial ����
	int serial;
	
	/** ���찳 ���� ���� */
	double width;
	/** ���찳 ���� ���� */
	double height;
	/** ���찳 ���� ���� */
	double depth;
	/** ���찳 ���� ��*/
	int layer;
	/** ������ ���� */
	String color;
	
	// 2. ������ �����
	// (1) �⺻������
	/**
	 * ���찳 Ŭ������ �⺻ ������
	 * �� ������� �ʵ带 Ÿ���� �⺻������ �ʱ�ȭ ����
	 */
	Eraser() {
		// TODO ��������� serial �� 
		//      count Ŭ���������� ������Ų
		//      ������ ����
		this.serial = ++count;
	}
	
	// (2) �Ű������� �ִ� ������ : 
	/**
	 * ���찳�� ���� �ʵ常 �ʱ�ȭ ������
	 * @param width : ���� ���� => �����ʱ�ȭ
	 */
	Eraser(double width) {
		// 57 ���� �⺻ ������ ȣ�� 
		//    : �Ű������� ����ִ� this() �̹Ƿ�
		this();
		// width �ʵ�� �Ű������� �Ѱ��� ������ �ʱ�ȭ
		this.width = width;
	}
	
	/**
	 * ���찳�� ����, ���� �ʵ常 �ʱ�ȭ�ϴ� ������	 
	 * @param width : ���α��� 
	 *       => width �ʵ带 �ʱ�ȭ�ϴ� �������� ����� ���
	 * @param height: ���α��� => �����ʱ�ȭ
	 */
	Eraser(double width, double height) {
		this(width);
		this.height = height;
	}

	/**
	 * ���찳�� ����, ����, ���� �ʵ带 �ʱ�ȭ�ϴ� ������
	 * @param width  : ���α��� ==> �Ű����� 2�� �޴� �����ڷ� �ʱ�ȭ
	 * @param height : ���α��� ==> �Ű����� 2�� �޴� �����ڷ� �ʱ�ȭ
	 * @param depth  : ���� ==> ���� �ʱ�ȭ
	 */
	Eraser(double width, double height, double depth) {
		this(width, height);
		this.depth = depth;
	}
	
	/**
	 * ����, ����, ����, ���� �ʱ�ȭ�ϴ� ������
	 * @param width : ���α���==> �Ű����� 3���޴� �����ڷ� �ʱ�ȭ
	 * @param height: ���α���==> �Ű����� 3���޴� �����ڷ� �ʱ�ȭ
	 * @param depth : ���� ==> �Ű����� 3���޴� �����ڷ� �ʱ�ȭ
	 * @param layer : �����ʱ�ȭ
	 */
	Eraser(double width, double height, double depth, int layer) {
		this(width, height, depth);
		this.layer = layer;
	}
	
	/**
	 * ��� �ʵ带 �ʱ�ȭ�ϴ� ������
	 * @param width : �Ű����� 4�� �޴� �����ڷ� �ʱ�ȭ
	 * @param height: �Ű����� 4�� �޴� �����ڷ� �ʱ�ȭ
	 * @param depth : �Ű����� 4�� �޴� �����ڷ� �ʱ�ȭ
	 * @param layer : �Ű����� 4�� �޴� �����ڷ� �ʱ�ȭ
	 * @param color : �����ʱ�ȭ
	 */
	Eraser(double width, double height, double depth
		  , int layer, String color) {
		// alt + shift + a : ���� ���� ��� ���
		this(width, height, depth, layer);
		this.color = color;
	}
	
	// 3. �޼ҵ� �����
	// (1) erase()
	public void erase() {
		System.out.println("ĥ���� �������ϴ�.");
	}
	
	
	// (2) peel()
	/**
	 * �����ִ� ���찳 ���� ���ܳ��� �޼ҵ�
	 * layer ���� 0���� ���� ���� ����.
	 */
	public void peel() {
		// if �� ����Ͽ� layer ���� 
		// 0���� �۾��� �� ������
		// ���� üũ
		if ((layer - 1) >= 0) {
			layer--;
//			layer -= 1;
		}
	}
	
	
	// (3) print() 
	public void print() {
		System.out.printf("��ȣ: %d, ����:%4.2f, ����:%4.2f, ����:%4.2f, ���� ��:%d, ����:%s%n"
				         , serial, width, height, depth, layer, color);
	}
	

}