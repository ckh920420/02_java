package eraser.one;

public class EraserTest {

	public static void main(String[] args) {
		//1. 선언 : 칠판지우개 객체 참조 변수
		Eraser LE;
		Eraser RE;
		
		//2. 초기화
		//(1) 왼쪽 지우개는 기본생성자로 초기화
		LE =new Eraser();
		
		//(2) 오른쪽 지우개는 매개변수 생성자로 초기화
		RE = new Eraser (3.5, 12.0 ,5.5, 3, "흰색");
		//3. 사용
		//(1) 두 지우개 초기 상태 출력
		LE.print();
		System.out.println("");
		RE.print();
		System.out.println("");
		System.out.println("==================");
		
		//(2) 오른쪽 지우개에 한겹제거
		RE.peel();
		RE.print();
		System.out.println("");
		
		//(3) 두 지우개 상태 출력
		LE.print();
		System.out.printf("\n");
		RE.print();
		System.out.println("");
		System.out.println("=======================");
		
		//(4) 오른쪽 지우개 한겹제거
		RE.peel();
		System.out.println("");
		
		//(5) 왼쪽 지우개 한겹제거
		LE.peel();
		System.out.println("");
		
		//(6) 두 지우개 상태 출력
		LE.print();
		System.out.println("");
		RE.print();
		System.out.println("======================");

	}

}
