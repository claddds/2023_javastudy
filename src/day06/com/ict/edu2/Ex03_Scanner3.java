package day06.com.ict.edu2;

import java.util.Scanner;

public class Ex03_Scanner3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*
		근무시간이 8시간까지는 시간당 9620이고 8시간을 초과한 시간 만큼은 1.5배를
		지급한다. 현재 근무한 시간은 10이고 얼마를 받아야하는가? 
		*/
		
		System.out.print("근무시간: ");
		int time = scan.nextInt();
		int money;
		if (time > 8) {
			money = (8*9620) + (int)((time-8)*9620*1.5);
		} else {
			money = time*9620;
		}
		System.out.println("수당: "+money);
		System.out.println("==============================");
		
		
		/*
		menu가 1이면 카페모카 3500, 2이면 카페라떼 4000, 3이면 아메리카노 3000,
		 4이면 과일 쥬스 3500이다. 친구와 함께 2잔을 10000 내고 먹었다. 선택한 메뉴와 
		 잔돈을 출력하자 (단, 부가세 10%는 포함),(친구와 같은 음료을 먹어야 한다.)
		*/
		
		System.out.print("메뉴선택 \n1.카페모카(3500)\n2.카페라떼(4000)"
				+ "\n3.아메리카노(3000)\n4.과일쥬스(3500)\n>>>>>>>>>  ");
		int menu = scan.nextInt();
		int price = 0;
		int change;
		
		switch(menu) {
			case 1: price = 3500; break;
			case 2: price = 4000; break;
			case 3: price = 3000; break;
			case 4: price = 3500; break;
		}
		
		change = 10000 - (int)(price*2*1.1);
		
		System.out.println("잔돈은 "+change+"원 입니다");

		/*
		나라를 입력하면 수도가 출력되게 하자
		한국=>서울, 중국=>베이징, 일본=>도쿄, 미국=>워싱턴, 이외에는 데이터 없음
		(switch~case문 사용) 
		*/
		
		System.out.print("나라입력: ");
		String country = scan.next();
		String capital;
		
		switch (country) {
			case "한국": capital = "서울"; break;
			case "중국": capital = "베이징"; break;
			case "일본": capital = "도쿄"; break;
			case "미국": capital = "워싱턴"; break;
	
			default: capital = "데이터 없음";break;
		}
		System.out.println(country+"의 수도는? " + capital+"입니다.");
		System.out.println("==============================");
		
		
	}
}
