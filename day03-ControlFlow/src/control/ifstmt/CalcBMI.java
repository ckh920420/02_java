package control.ifstmt;

import java.util.Scanner;

/** 
 * if������ ����Ͽ� bmiǥ �ۼ�
 * weight
 * height  
 * double�� ����
 * @author Administrator
 *
 */

public class CalcBMI {

	public static void main(String[] args) {
		// 1. ����
		double weight;
		double height;
		double bmi;
		
		// 2. ��ĳ�ʸ� ����� ��ĵ
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ü�߰� ������ �����Ͻÿ�");
        weight = scan.nextDouble();
        height = scan.nextDouble();
        bmi = weight / (height * height);
        //3. ���
        
        if ( bmi  < 15.0) {
        	System.out.printf("������ ��ü��",bmi);
        	
        } else if (bmi <18.5) {
            System.out.printf("��ü��");
            
        } else if (bmi< 23.0) {
        	System.out.println("����");
        	
        	
        } else if (bmi <27.5) {
        	
        			System.out.println("��ü��");
        } else if (bmi < 40.0) {
            System.out.println("��");
        } else  System.out.println("������ ��");
	}

}
