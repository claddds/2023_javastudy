package day06.com.ict.edu2;

import java.util.Scanner;

public class Report2_0503 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 원하는 회수를 입력 받고 숫자를 입력 받아서 입력 받은 숫자가 홀수 인지, 짝수인지 판별하는 코딩
		*/
		/*
		System.out.print("원하는 횟수 입력: ");
		int repeat = scan.nextInt();
		
		for(int i = 0; i < repeat; i++) {
			System.out.print("입력받은 숫자: ");
			int num = scan.nextInt();
			
			if(num%2 == 0) {
				System.out.println("짝수입니다.");
			}else {
				System.out.println("홀수입니다.");
			}
		}
		*/
		/*
		// 선생님의 답변
		System.out.print("원하는 횟수: ");
		int su = scan.nextInt();
		String res = "";
		
		for(int i=0; i<su;i++) {
			System.out.print("숫자 입력: ");
			int num = scan.nextInt();
			if(num%2 == 0) {
				res = "짝수";
			}else {
				res = "홀수";
			}
			System.out.println("당신이 입력한 "+num+"은"+res+"입니다.");
		}
		*/
		/*
		 이름, 국어, 영어, 수학를 입력 받아서 총점, 평균, 학점을 구하고 이름, 총점, 평균,
		 학점을 출력하는 코딩 (평균은 소숫점 첫째자리까지 구하자)
		*/
		/*
		System.out.print("이름: ");
		String name = scan.next();
		
		System.out.print("국어 점수: ");
		int kor = scan.nextInt();
		System.out.print("수학 점수: ");
		int math = scan.nextInt();
		System.out.print("영어 점수: ");
		int eng = scan.nextInt();
		
		int sum=0;
		double average=0;
		String grade;
		
		sum = kor + math + eng;
		
		average = sum/3.0;
		average = ((int)(average*10))/10.0;
		
		if(average >= 90) {
			grade = "A학점";
		}else if(average >= 80) {
			grade = "B학점";
		}else if(average >= 70) {
			grade = "C학점";
		}else {
			grade = "F학점";
		}
		
		System.out.println("이름: "+name);
		System.out.println("총점: "+sum);
		System.out.println("평균: "+average);
		System.out.println("등급: "+grade);
		*/
		/*
		// 선생님의 답변
		System.out.print("이름: ");
		String name=scan.next();

		System.out.print("국어점수: ");
		int kor = scan.nextInt();
		
		System.out.print("영어점수: ");
		int eng = scan.nextInt();
		
		System.out.print("수학점수: ");
		int math = scan.nextInt();
		
		// 총점, 평균, 학점를 구하기
		int sum = kor + eng + math;
		double avg = (int)(sum/3.0*10)/10.0;
		
		String hak = "";
		if(avg>=90) {
			hak = "A학점";
		}else if(avg >= 80) {
			hak = "B학점";
		}else if(avg >= 70) {
			hak = "C학점";
		}else {
			hak = "F학점";
		}
		
		System.out.println("이름: "+name);
		System.out.println("총점: "+sum);
		System.out.println("평균: "+avg);
		System.out.println("등급: "+hak);
		*/
		
		/*
		 첫번째 숫자 받기, 두번째 숫자 받기, 연산자 받기
		 ("1 => + \n 2 => - \n 3 => * \n 4 =>  / \n>>>>   ") => 계산기
		*/
		/*
		System.out.print("첫번째 숫자 입력: ");
		int first = scan.nextInt();
		
		System.out.print("두번째 숫자 입력: ");
		int second = scan.nextInt();
		
		System.out.print("1 => + \n 2 => - \n 3 => * \n 4 =>  / \n>>>>   ");
		int sign = scan.nextInt();
		
		int res=0;
		
		switch (sign) {
		case 1: res = first+second; break;
		case 2: res = first-second; break;
		case 3: res = first*second; break;
		case 4: res = first/second; break;
		}
		
		System.out.println("입력받은 두 숫자와 연산자의 값: " + res);
		*/
		// 선생님의 답변
		System.out.print("첫 번째 수: ");
		int s1 = scan.nextInt();
		
		System.out.print("첫 번째 수: ");
		int s2 = scan.nextInt();
		
		System.out.print("연산자: \n1 => + \n2 => - \n3 => * \n4 =>  / \n>>>>   ");
		int op = scan.nextInt();
		
		double res = 0.0;
		String oper="";
		
		if(op ==1) {
			res = s1+s2;
			oper = "+";
		}else if(op==2) {
			res = s1-s2;
			oper = "-";
		}else if(op==3) {
			res = s1*s2;
			oper = "*";
		}else if(op==4) {
			res = (int)(s1*10/s2)/10.0;	
			oper = "/";
		}
		System.out.println(s1+oper+s2+"="+res);
		
	}
}