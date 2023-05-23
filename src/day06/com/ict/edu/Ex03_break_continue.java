package day06.com.ict.edu;

public class Ex03_break_continue {
	public static void main(String[] args) {
		/*
		break와 continue
		break: 현재위치의 블록을 탈출하는 예약어(명령어)
		continue: continue문을 만나면 아래 수행문을 포기하고 다음회차를 하기 위해서 증감식으로 이동
		보통 if문과 함께 사용한다.
		break는 for문과  while 모두 사용, continue는 for문에 사용(while문과 사용가능)
		*/
		
		// 1-10출력
		for(int i =1; i < 11; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//1-10 출력 6 일때 break 사용
		for(int i =1; i < 11; i++) {
			if(i == 6) break;
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(int i =1; i < 11; i++) {
			System.out.print(i + " ");
			if(i == 6) break;
		}
		System.out.println();
		System.out.println("==============================");
		
		//1-10 출력 6 일때 continue 사용
		for(int i =1; i < 11; i++) {
			if(i == 6) continue;
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(int i =1; i < 11; i++) {
			System.out.print(i + " ");
			if(i == 6) continue;
		}
		System.out.println();
		System.out.println("==============================");
		
		//0-10까지 continue를 이용해서 홀수만 찍기
		for(int i =0; i < 11; i++) {
			if(i%2 == 0) continue;
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("==============================");
		
		
	}
}
