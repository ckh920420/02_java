package lecture;
/**
 * 배열은 모든 타입의 데이터에 대해서 같은 타입에 데이터를 여러번 사용이 아닌 통으로 사용하고자 지원하는 것
 * 객체에 대한 배열 
 * 배열 makers = size 4 (적 청 녹 흑)
 *     eraseres =  size 2 (좌 우)
 * makers[0] ~ Marker [3]에 적녹청흑 순으로 저장
 * erasers[0],[1]에는 순서대로 leftEraser, rightEraser순으로 저장
 * 
 * 3. foreach를 사용하요
 * (1) 모든 마커를 한번씩 사용 use()
 * (2) 모든 지우개를 한번씩 사용 erase()
 * (3) 모든 지우개를 한번씩 한겹씩 벗겨내기 peel()
 * (4) 모든 지우개의 상태 출력
 * (5) 모든 마커의 상태 출력
 * 
 * 5개의 루프 작성
 * 
 * 
 * @author Administrator
 *
 */

public class LectureTestByArray {

	public static void main(String[] args) {
		// 1. 선언
		Marker[] markers;
		Eraser[] eraseres;
		
		// 2. 초기화
	    markers = new Marker[4];
	    eraseres = new Eraser[2];
        
	    
	    markers[0] = new Marker(true, true, "적");
	    markers[1] = new Marker(true, false ,)
	    markers[2] = new Marker
 	    markers[3] = new Marker
	    // 3. 사용
	    
	    for (Marker markers : markers ) {
	    	marker.use();
	    }
	    
	    
	    		
	    
			
		}
		
		

	

}
