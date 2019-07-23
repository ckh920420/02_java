package control.ifstmt;

import java.util.Scanner;

/** 
 * if구문을 사용하여 bmi표 작성
 * weight
 * height  
 * double로 선언
 * @author Administrator
 *
 */

public class CalcBMI {

	public static void main(String[] args) {
		// 1. 선언
		double weight;
		double height;
		double bmi;
		
		// 2. 스캐너를 사용한 스캔
		
		Scanner scan = new Scanner(System.in);
		System.out.println("체중과 신장을 기입하시오");
        weight = scan.nextDouble();
        height = scan.nextDouble();
        bmi = weight / (height * height);
        //3. 사용
        
        if ( bmi  < 15.0) {
        	System.out.printf("병적인 저체중",bmi);
        	
        } else if (bmi <18.5) {
            System.out.printf("저체중");
            
        } else if (bmi< 23.0) {
        	System.out.println("정상");
        	
        	
        } else if (bmi <27.5) {
        	
        			System.out.println("과체중");
        } else if (bmi < 40.0) {
            System.out.println("비만");
        } else  System.out.println("병적인 비만");
	}

}
