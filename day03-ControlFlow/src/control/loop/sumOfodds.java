package control.loop;

import java.util.Scanner;

/**
 * 1~100 까지의 홀수의 합을 구하는 클래스
 * while구문을 작성
 * @author Administrator
 *
 */

public class sumOfodds {

	public static void main(String[] args) {
		// 1. 선언, 초기화
		int num = 1, sum =0;
		
	
		
		//3. 사용
       while (num <= 100) {
    	   if (num % 2 ==1) {
    		   sum += num;
    	   }
    	   num++;
    	  }
          
       }
       System.out.printf("1부터 100까지 홀수의 합은 %d%n", sum)
	}
      

