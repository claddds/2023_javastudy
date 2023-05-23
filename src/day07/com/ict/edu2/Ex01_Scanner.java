package day07.com.ict.edu2;

import java.util.Scanner;

public class Ex01_Scanner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		//전체횟수, 짝수횟수, 짝수가 나온 퍼센트 구하기(소숫점 첫째자리까지 구하기)
		//내 답
		double odd=0.0;
		double even=0.0;
		
		while (true) {
			
			System.out.print("숫자 입력: ");
			int su = scan.nextInt();
			
			String str = "";

			if (su % 2 == 0) {
				str = "짝수";
				even = even + 1;
			} else {
				str = "홀수";
				odd = odd + 1;
			}
			
			System.out.println(su + "는" + str + "입니다.");
			
			System.out.println("계속할까요?(1.yes, 2.no) >> ");
			int s1 = scan.nextInt();
			
			if(s1==2) {
				double sum = odd+even;
				System.out.println("전체횟수: " + (int)sum);
				System.out.println("짝수횟수: " + (int)even);
				double per = even/sum;
				per = ((int)(per*10))/10.0;
				System.out.println("짝수가 나온 퍼센트: " + per);
				
				break;
			}
	
		}
		*/
		/*
		// 선생님 답
		int count= 0;
		int even=0;
		
		while (true) {
			count++;
			System.out.print("숫자 입력: ");
			int su = scan.nextInt();
			
			String str = "";

			if (su % 2 == 0) {
				str = "짝수";
				even++;
			} else {
				str = "홀수";
			}
			
			System.out.println(su + "는" + str + "입니다.");
			
			System.out.println("계속할까요?(1.yes, 2.no) >> ");
			int s1 = scan.nextInt();
			
			if(s1==2) break;
		}
		double per = (even/(count*1.0))*100;
		System.out.println("전체 개수: " + count);
		System.out.println("짝수 개수: "+ even);
		System.out.println("퍼센트: " + (int)(per*10)/10.0 + "%");
		
		*/
		/* **과제
		 위에 코딩의 단점은 계속할까요?할때 2아닌 다른 숫자를 눌러도 계속 진행이된다. 
		 과제로 1,2가 아닌 다른 숫자가 입력이 되면 '다시입력하세요or계속할까요? 띄우기
		*/
		
		
		int count= 0;
		int even=0;
		esc:
		while (true) {
			count++;
			System.out.print("숫자 입력: ");
			int su = scan.nextInt();
			
			String str = "";
			
			if (su % 2 == 0) {
				str = "짝수";
				even++;
			} else {
				str = "홀수";
			}
			esc2:
			while(true) {
				
				System.out.println("계속할까요?(1.yes, 2.no) >> ");
				int s1 = scan.nextInt();
				
				if(s1==1) {
					break esc2;
				} else if(s1 ==2) {
					break esc;
				} else {
					System.out.print("잘못 입력하셨습니다.");
					continue;
				}
				
			}
			
		}
		
		double per = (even/(count*1.0))*100;
		System.out.println("전체 개수: " + count);
		System.out.println("짝수 개수: "+ even);
		System.out.println("퍼센트: " + (int)(per*10)/10.0 + "%");
		
		
	}
}
