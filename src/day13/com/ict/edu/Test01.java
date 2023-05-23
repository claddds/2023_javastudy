package day13.com.ict.edu;

import java.util.Arrays;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		// while문을 활용하여 7단을 출력하는 코딩
		/*
		int su =7;
		int i = 0;
		System.out.println("while문을 활용하여 7단 출력하기");
		while (i<9) {
			i++;
			System.out.println("7 * "+i+" = "+(7*i) );
		}
		*/
		
		//다중 for문을 활용하여 결과보이기
		/*
		1 0 0 0
		0 1 0 0
		0 0 1 0
		0 0 0 1
 		*/
		/*
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				if (i == j) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
		*/
		/*
		//3번 전체횟수, 짝수 횟수, 짝수 퍼센트
		Scanner scan  = new Scanner(System.in);
		int count = 0;
		int even = 0;
		esc:
			while (true) {
				count++;
				System.out.print("숫자입력: ");
				int su = scan.nextInt();
				
				String str ="";
				if(su%2 ==0) {
					str = "짝수";
					even++;
				}else {
					str = "홀수";
				}
				System.out.println(su+"는"+str+"입니다.");
				while (true) {
					System.out.print("계속할까요?(Y/y)/N(n) >> ");
					String s1 = scan.next();
				}
			}
			*/
		int[][] su = new int[3][];
		int[] k1 = {10, 20, 30};
		int[] k2 = {100, 200, 300};
		int[] k3 = {1000, 2000, 3000};
		
		su[0] =k1;
		su[1] =k2;
		su[2] =k3;
		
		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < k3.length; j++) {
				System.out.print(su[i][j]+" ");
			}
			System.out.println();
		}
	
		
	}
}
