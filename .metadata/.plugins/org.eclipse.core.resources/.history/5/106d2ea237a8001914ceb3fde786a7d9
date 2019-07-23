package eraser.two;
/** 
 * 칠판지우개를 정의하는 클래스
 * -----------------------
 * 칠판지우개의 속성 정의
 * 가로 : width : double
 * 세로 : height : double
 * 높이 :depth  double
 * 겹 layer  : int
 * 색상 color : String
 * ---------------------------------------
 * 생성자 정의 : 중복정의
 * 기복생성자 명시
 * 매개변수를 받는 생성자 : 모든 필드를 다 받도록 정의
 * ------------------------------
 * 기능 정의 : 메소드로 생성
 * 칠판지우기 : erase() : void " 칠판을 지웠습니다" 문자열 출력
 * 한 겹씩 제거  : peel() : 
 *            : 현재 layer값에서 1 감소 
 *            : 레이어가 0이 될 떄 까지
 * 지우개 상태 출력 : print() : void 
 *               : 현재 지우개의 가로 세로 높이 겹 색상등의 상태를 출력
 * 
 * @author Administrator
 *
 */

public class Eraser {
	//1. 멤버 변수 선언
	double width; // 가로
	double height;//세로
	double depth;//높이
	int layer;   // 겹수
	String color; //색상
	
	// 2. 생성자 선언부
	//(1) 기본생성자
	Eraser(){
		//이 공간을 비워두면 변수의 기본값으로 초기화해준다
	}
	//(2) 매개변수가 있는 생성자
	Eraser(double width, double height, double depth,int layer,	String color){
		this.width = width;
		this.height = height;
		this.depth = depth;
		this.layer = layer;
		this.color = color;
	}
	
	// 3. 메소드 선어부
	
    //(1)
	public void erase() {
		
	}
	//(2)peel()
	/** 남아있는 지우개 겹을 벗겨내는 메소드
	 * layer 값이 0보다 작을 수 없다
	 */
	public void peel() {
		if ((this.layer -1)>= 0) {
			this.layer--;
			
		}
		
	}
	//(3)
	public void print() {
		System.out.printf(" 가로 %4.2f, 세로 %4.2f, 높이 %4.2f, 잔량 %d, 색상 %s",width,
		height,
		depth,
		layer, color );
	}

}
