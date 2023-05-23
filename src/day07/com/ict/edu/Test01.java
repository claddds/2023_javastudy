package day07.com.ict.edu;

public class Test01 {
	public static void main(String[] args) {
		/*
		String name = "홍길동";
		int kor = 95;
		int eng = 85;
		int math = 85;
		
		int sum = kor + eng + math;
		double average= (int)((sum/3.0)*10)/10.0;
		
		System.out.println("이름: " + name);
		System.out.println("총점: " + sum);
		System.out.println("평균: " + average);
		*/
		/*
		int time = 3989;
		
		int hour = 0;
		int min = time/60;
		int sec = time%60;
		
		if(min>=60) {
			hour = min/60;
			min= min%60;
		}
		System.out.println("3989초는 "+hour+"시간 "+min+"분 "+sec+"초이다");
		*/
		/*
		int drink=8500;
		int cus = 2;
		int in = 20000;
		
		int vat = (int)(drink*cus*0.1);
		int pay = (drink*2)+vat;
		int out = in - pay;
		
		System.out.println("잔돈은 "+out+"입니다.");
		*/
		/*
		int k1=9;
		String res="";
		
		res = k1 % 2 == 0 ? "짝수" : "홀수";
		
		System.out.println(k1+"(k1)의 값은 "+res+"이다.");
		*/
		
		/*
		char k2='t';
		if(k2 >= 'A' && k2 <= 'Z') {
			System.out.println(k2 + "는 대문자이다.");
		}else {
			System.out.println(k2 + "는 대문자가 아니다.");
		}
		*/
		
		int time = 10;
		int pay = 9620;
		
		int money=0;
		
		if(time>8) {
			money = (pay*8) + (int)((time-8)*pay*1.5);
		}else {
			money = time * pay;
		}
		
		System.out.println("급여: " + money);
		
	}
}
