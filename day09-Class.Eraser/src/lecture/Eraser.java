package lecture;
/** 
 * ĥ�����찳�� �����ϴ� Ŭ����
 * -----------------------
 * ĥ�����찳�� �Ӽ� ����
 * ���� : width : double
 * ���� : height : double
 * ���� :depth  double
 * �� layer  : int
 * ���� color : String
 * ��ġ : loc : Strng
 * ---------------------------------------
 * ������ ���� : �ߺ�����
 * �⺹������ ���
 * �Ű������� �޴� ������ : ��� �ʵ带 �� �޵��� ����
 * ------------------------------
 * ��� ���� : �޼ҵ�� ����
 * ĥ������� : erase() : void " ĥ���� �������ϴ�" ���ڿ� ���
 * �� �㾿 ����  : peel() : 
 *            : ���� layer������ 1 ���� 
 *            : ���̾ 0�� �� �� ����
 * ���찳 ���� ��� : print() : void 
 *               : ���� ���찳�� ���� ���� ���� �� ������� ���¸� ���
 * 
 * @author Administrator
 *
 */

public class Eraser {
	//1. ��� ���� ����
	double width; // ����
	double height;//����
	double depth;//����
	int layer;   // ���
	String color; //����
	String loc;
	
	// 2. ������ �����
	//(1) �⺻������
	Eraser(){
		//�� ������ ����θ� ������ �⺻������ �ʱ�ȭ���ش�
	}
	//(2) �Ű������� �ִ� ������
	/**
	 * ���찳�� ���� �ʵ常 ������
	 * @param width => 
	 */
	Eraser(double width) {
		this();
		this.width = width;
	}
	
	/** 
	 * ���찳�� ���� ���� �ʵ常 �ʱ�ȭ�ϴ� ������
	 * @param width => ���α���
	 *                width�ʵ带 �ʱ�ȭ�ϴ� �������� ����� ���
	 * @param height => ���α���
	 *                  ���� �ʱ�ȭ
	 */
	Eraser(double width, double height) {
		this(width);
		this.height = height;
	}
	
	/** 
	 * �� Ⱦ ���� �ʵ带 �ʱ�ȭ�ϴ� ��������
	 * @param width �Ű����� 2���޴� ������
	 * @param height����
	 * @param depth �����ʱ�ȭ
	 */
	Eraser(double width, double height, double depth) {
		this(width, height);
		this.depth = depth;
	}
	
	/** 
	 * 
	 * @param width �Ű����� 3��
	 * @param height��
	 * @param depth��
	 * @param layer����
	 */
	
	Eraser(double width, double height, double depth, int layer) {
		this(width, height, depth);
		this.layer = layer;
	}
	
	Eraser (double width, double height, double depth, int layer, String color) {
		this(width, height, depth, layer);
		this.color = color;
	}
	
	Eraser(double width, double height, double depth, int layer, String color) {
		this(width, height, depth, layer, color);
		this.loc = loc;
	// 3. �޼ҵ� �����
	
    //(1)
	public void erase() {
		
	}
	//(2)peel()
	/** �����ִ� ���찳 ���� ���ܳ��� �޼ҵ�
	 * layer ���� 0���� ���� �� ����
	 */
	public void peel() {
		if ((this.layer -1)>= 0) {
			this.layer--;
			
		}
		
	}
	//(3)
	public void print() {
		System.out.printf(" ���� %4.2f, ���� %4.2f, ���� %4.2f, �ܷ� %d, ���� %s",width,
		height,
		depth,
		layer, color );
	}

}
