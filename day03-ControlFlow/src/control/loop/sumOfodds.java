package control.loop;

import java.util.Scanner;

/**
 * 1~100 ������ Ȧ���� ���� ���ϴ� Ŭ����
 * while������ �ۼ�
 * @author Administrator
 *
 */

public class sumOfodds {

	public static void main(String[] args) {
		// 1. ����, �ʱ�ȭ
		int num = 1, sum =0;
		
	
		
		//3. ���
       while (num <= 100) {
    	   if (num % 2 ==1) {
    		   sum += num;
    	   }
    	   num++;
    	  }
          
       }
       System.out.printf("1���� 100���� Ȧ���� ���� %d%n", sum)
	}
      

