package eraser.two;
/** 
 * ĥ�����찳�� �����ϴ� Ŭ����
 * -----------------------
 * ĥ�����찳�� �Ӽ� ����
 * ���� : width : double
 * ���� : height : double
 * ���� :depth  double
 * �� layer  : int
 * ���� color : String
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
	
	// 2. ������ �����
	//(1) �⺻������
	Eraser(){
		//�� ������ ����θ� ������ �⺻������ �ʱ�ȭ���ش�
	}
	//(2) �Ű������� �ִ� ������
	Eraser(double width, double height, double depth,int layer,	String color){
		this.width = width;
		this.height = height;
		this.depth = depth;
		this.layer = layer;
		this.color = color;
	}
	
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
