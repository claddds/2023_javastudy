package day09.com.ict.edu;

import java.util.Scanner;

public class Ex06_Array {
	public static void main(String[] args) {
		/*
		// 학급 인원수 받기
		Scanner scan = new Scanner(System.in);

		System.out.print("학급 인원수는? ");
		int student = scan.nextInt();

		int[] student_A = new int[student];
		String[] name_A = new String[student];
		int[] kor_A = new int[student];
		int[] eng_A = new int[student];
		int[] math_A = new int[student];

		int[] sum = new int[student];
		double[] avg = new double[student];
		String[] hak = new String[student];
		int[] rank = new int[student];

		for (int i = 0; i < student; i++) {
			rank[i] = 1;
		}

		for (int i = 0; i < student_A.length; i++) {
			// 학생의 이름과 국어,영어,수학의 점수를 받기
			System.out.print("학생의 이름은? ");
			String name = scan.next();
			name_A[i] = name;

			System.out.print(name_A[i] + "의 국어 점수는? ");
			int kor = scan.nextInt();
			kor_A[i] = kor;

			System.out.print(name_A[i] + "의 영어 점수는? ");
			int eng = scan.nextInt();
			eng_A[i] = eng;

			System.out.print(name_A[i] + "의 수학 점수는? ");
			int math = scan.nextInt();
			math_A[i] = math;

			sum[i] = kor_A[i] + eng_A[i] + math_A[i];

			avg[i] = (int) (sum[i] / 3.0 * 10) / 10.0;
			
			if (avg[i] >= 90) {
				hak[i] = "A학점";
			} else if (avg[i] >= 80) {
				hak[i] = "B학점";
			} else if (avg[i] >= 70) {
				hak[i] = "C학점";
			} else {
				hak[i] = "F학점";
			}
		}

		// 순위를 구하자(sum으로 비교하자)
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum.length; j++) {
				if (sum[i] == sum[j])
					continue;
				if (sum[i] < sum[j]) {
					rank[i]++;
				}
			}
		}

		// 출력
		System.out.println("이 름\t총 점\t평 균\t학 점\t순 위");
		for (int i = 0; i < student; i++) {
			System.out.print(name_A[i] + "\t");
			System.out.print(sum[i] + "\t");
			System.out.print(avg[i] + "\t");
			System.out.print(hak[i] + "\t");
			System.out.println(rank[i]);
		}
		*/
		// 선생님의 답
		Scanner scan = new Scanner(System.in);
		
		// 정보를 배열에 넣기 위해 배열을 미리 만들기 위해 인원수를 물어본다.
		System.out.print("학생 수: ");
		int su = scan.nextInt();
		
		// 미리 배열을 만든다.
		String[] name = new String[su];
		int[] kor = new int[su];
		int[] eng = new int[su];
		int[] math = new int[su];
		int[] sum = new int[su];
		double[] avg = new double[su];
		String[] hak = new String[su];
		int[] rank = new int[su];
		
		for (int i = 0; i < su; i++) {
			System.out.print("이름: ");
			name[i] = scan.next();
			
			System.out.print("국어: ");
			name[i] = scan.next();
			
			System.out.print("영어: ");
			name[i] = scan.next();
			
			System.out.print("수학: ");
			name[i] = scan.next();
			
			sum[i] = kor[i] + eng[i] + math[i];
			avg[i] = (int)(sum[i]/3.0*10)/10.0;
			
			if(avg[i]>=90) {
				hak[i] = "A학점";
			}else if(avg[i] >= 80) {
				hak[i] = "B학점";
			}else if(avg[i] >= 70) {
				hak[i] = "C학점";
			}else {
				hak[i] = "F학점";
			}
			
			rank[i] = 1;
		}
		// 순위
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum.length; j++) {
				if(i == j) continue;
				if(sum[i] < sum[j]) {
					rank[i]++;
				}
			}
		}
		//출력
		for(int i = 0; i < su; i++) {
			System.out.print(name[i]+"\t");
			System.out.print(sum[i]+"\t");
			System.out.print(avg[i]+"\t");
			System.out.print(hak[i]+"\t");
			System.out.println(rank[i]);
		}
	}
}
