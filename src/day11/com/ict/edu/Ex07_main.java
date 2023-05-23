package day11.com.ict.edu;

import java.util.Scanner;

public class Ex07_main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[][] arr = new double[5][8];
		
		// 5명의 학생번호, 국어, 영어, 수학을 입력 받아서
		// 이름, 총점, 평균, 학점구하고
		// 출력하자
		
		/*
		 				0   1  2  3   4   5   6   7
                       번호 국어 영어 수학 총점 평균 학점 순위 
		double p1(배열)
		double p2(배열)
		double p3(배열)
		...
		 */
		Ex07_method test = new Ex07_method();

		for (int i = 0; i < 5; i++) {
			double[] p = new double[8];
			
			System.out.print("학생번호: ");
			p[0] = scan.nextInt();

			System.out.print("국어: ");
			p[1] = scan.nextInt();

			System.out.print("영어: ");
			p[2] = scan.nextInt();

			System.out.print("수학: ");
			p[3] = scan.nextInt();

			// 총점 구하기
			test.getSum(p[1],p[2], p[3]);
			p[4]= test.sum;
			
			// 평균
			test.getAvg();
			p[5]= test.avg;

			// 학점
			test.getHak();
			p[6] = test.hak;
			
			p[7] = 1;
			
			arr[i] = p;

		}
		
		//순위
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				// if(i==j) continue;(생략가능)
				if(arr[i][4] < arr[j][4]) {
					arr[i][7]++;
				}
			}
		}
		// 순위로 오름차순 정렬
		// 자리를 변경하기 위해서 임시
		double[] tmp = new double[8];
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i][7] > arr[j][7]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		// 출력하기
		System.out.println("번호\t총점\t평균\t학점\t순위");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				// 국어, 영어, 수학은 출력에서 제외
				if(j == 1 || j == 2 || j == 3) continue;
				if(j==5) {
					System.out.print(arr[i][j] + "\t");
				}else if(j==6){
					System.out.print((char)(arr[i][j])+"\t");
				}else {
					System.out.print((int)(arr[i][j])+"\t");
				}
			}
			System.out.println();
		}
		
	}
}