package day09.com.ict.edu;

import java.util.Scanner;

public class Ex12_Array {
	public static void main(String[] args) {
		// 선생님의 답
		Scanner scan = new Scanner(System.in);
		
		// 학생 수 받기
		System.out.print("학생 수: ");
		int su = scan.nextInt();
		double [][] arr = new double[su][8];
		for (int i = 0; i < arr.length; i++) {
			// ** for문 실행 될 때마다 한사람의 정보를 담을 수는 배열을 만들자.
			// 아래 new배열은 for문안에 실행시켜 여러개를 만들어야한다.
			// 밖에 만들면 마지막것만 기억함(주소를 기억하기 때문에)
			double[] p = new double[8];
			
			// 키보드로 번호, 국어, 영어, 수학
			System.out.print("번호: ");
			p[0] = scan.nextInt();

			System.out.print("국어: ");
			p[1] = scan.nextInt();
			
			System.out.print("영어: ");
			p[2] = scan.nextInt();
			
			System.out.print("수학: ");
			p[3] = scan.nextInt();
			
			// 총점, 평균, 학점, 순위(초기값 지정)
			p[4] = p[1] + p[2] + p[3];
			
			p[5] = (int)(p[4]/3.0*10) /10.0;
			
			if(p[5] >= 90) {
				p[6] = 'A';
			}else if(p[5] >= 80) {
				p[6] = 'B';
			}else if(p[5] >= 70) {
				p[6] = 'C';
			}else {
				p[6] = 'F';
			}
			
			p[7] = 1;
			
			// **다차원배열에 넣자
			arr[i] = p;
		}
		
		// 순위
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
		// 출력
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
		/*
		// 학생 수 받기
		Scanner scan = new Scanner(System.in);
		System.out.print("학급 인원수는? ");
		int student = scan.nextInt();
		*/
		/*
		                번호 국어 영어 수학 총점 평균 학점 순위 
		 double p1(배열)
		 double p2(배열)
		 double p3(배열)
		 ...
		*/
		/*
		double[][] arr = new double[student][8];
		
		// 키보드로 번호, 국어, 영어, 수학
		for (int i = 0; i < student; i++) {
			System.out.print("학생 번호: ");	
			arr[i][0] = scan.nextDouble();	// 학생의 번호
			
			System.out.print((int)(arr[i][0]) + "의 국어 점수는? ");
			arr[i][1] = scan.nextDouble();	// 국어 점수
			
			System.out.print((int)(arr[i][0]) + "의 영어 점수는? ");
			arr[i][2] = scan.nextDouble();	// 영어 점수
			
			System.out.print((int)(arr[i][0]) + "의 수학 점수는? ");
			arr[i][3] = scan.nextDouble();	// 수학 점수
			
			// 총점, 평균, 학점, 순위(초기값 지정)
			arr[i][4] = arr[i][1] + arr[i][2] + arr[i][3];	// 총합
			
			arr[i][5] = arr[i][4]/3.0;	// 평균
			
			if (arr[i][5] >= 90) {	
				arr[i][6] = 'A';	// 학점
			} else if (arr[i][5] >= 80) {
				arr[i][6] = 'B';
			} else if (arr[i][5] >= 70) {
				arr[i][6] = 'C';
			} else {
				arr[i][6] = 'F';
			}
			
			arr[i][7] = 1;	// 순위
			
		}
		
		// 순위
		for (int i = 0; i < student; i++) {
			for (int j = 0; j < student; j++) {
				if(i == j) continue;
				if(arr[i][4] < arr[j][4]) {
					arr[i][7]++;
				}
			}
		}
		
		
		// 순위로 오름차순 정렬
		double[] tmp = new double[8];
		
		for (int i = 0; i < student; i++) {
			for (int j = i+1; j < student; j++) {
				if(arr[i][7] > arr[j][7]) {
					for (int k = 0; k < 8; k++) {
						tmp[k]=arr[i][k];
						arr[i][k] = arr[j][k];
						arr[j][k] = tmp[k];
					}
				}
			}
		}
		*/
		/*
		 				0    1   2  3  4   5   6   7
           				번호 국어 영어 수학 총점 평균 학점 순위 
		double p1(배열)
		double p2(배열)
		double p3(배열)
		...
		*/
		/*
		// 출력
		for (int i = 0; i < student; i++) {
			for (int j = 0; j < 8; j++) {
				if(j == 0) {
					System.out.print((int)(arr[i][0]) + " ");
				}else if(j == 1) {
					System.out.print((int)(arr[i][1]) + " ");
				}else if(j == 2) {
					System.out.print((int)(arr[i][2]) + " ");
				}else if(j == 3) {
					System.out.print((int)(arr[i][3]) + " ");
				}else if(j == 4) {
					System.out.print((int)(arr[i][4]) + " ");
				}else if(j == 5) {
					System.out.print((int)(arr[i][5]*10)/10.0 + " ");
				}else if(j == 6) {
					System.out.print((char)(arr[i][6]) + " ");
				}else {
					System.out.print((int)(arr[i][7]) + " ");
				}
			}
			System.out.println();
		}
		*/
	}
}
