package point;

public class PointTest {

	public static void main(String[] args) {
		// 1. 변수선언
		Point p;
		Point q;
		Point o;
		
		
		// 2. 초기화
		p = new Point(0,0);
		q = new Point(3,4);		
		o = new NamedPoint("0", 0,0);	
		// 3. 사용 
        //(1) 점 P 출력
		System.out.println(p);
		
    	//(2) 점 q 출력
		System.out.println(q);
		
		// 점 o를 출력
		
		System.out.println(o);
		
		//(3) 두 점 사이의 거리를 계산
		System.out.printf("양 점 사이의 거리 : %5.2f%n", p.distanceFrom(q));
		
		//이름이 붙은 원점과 점 큐의 거리계산
		System.out.printf("원 점으로부터 큐점까지의 거리 : "%5.2f%n",o.distanceFrom(q));
	}

}
