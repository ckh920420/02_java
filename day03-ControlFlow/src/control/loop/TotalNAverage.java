package control.loop;

import java.util.Scanner;

public class TotalNAverage {

	public static void main(String[] args) {
		// 1. ���� 
		
		int total = 0;
		int score = 0;
		int count = 0;
		double average;
		
		//2. �ʱ�ȭ
		
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է� (�������� 0 �Է� : " );
		score = scan.nextInt();
		
		// 3. ���
		
		while (score != 0) {
			total += score;
			score = scan.nextInt();
			count++;
			}
		
		if ( count == o)
			System.out.println("�Է°��� ����");
		else {
			
		}

	}

}
