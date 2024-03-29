package point;

public class PointTest2 {

	public static void main(String[] args) {
		// 1. point 배열 선언
		Point[] points = {new Point(10, 1), 
				          new Point(3,4), 
				          new NamedPoint( "0", 0,0)};
		// NamePoint는 Point에 상속 받았기 때문에 같이 사용 가능 Is ~ A 
		
		
		
		// 2. 초기화
		
		//3. 사용
		
		for (Point point :  points) {
			System.out.println(point);
			//System.out.println(point.toString); 즉 toString을 호출한 결과와 같다
			
			// 그러나 단순 포인트를 출력해도 같은 결과를 받는 이유
			// 1. toString() 메소드는 print()계열 메소드에서 객체 참조변수를 출력할 떄,
			// 자동으로 작동하는 특징을 가지고 있다
			
			// 2. toString() 은  오브젝트에서 물려받은 메소드로 모든 서브클래스들이 가지고 있으며,
			// 재정의된 경우에는 해단 인스턴스 타입에 맞추어 부모클래스 타임 클래스에 호출을 해도 인스턴스 타입
			// 의 재정의된 메소드가 자동으로 응답
			//==> 가상 메소드 호출 (virtual method invocation)
		}
		// 다음 점과의 거리를 구해서 출력
		for (int idx = 0; idx < points.length -1 ; idx++) {
			System.out.printf("양 점[%d], [%d] 간의 거리 , %5.2f%n ", idx, idx +1, points[idx].distanceFrom(points [idx+1]));
		}

	}

}
