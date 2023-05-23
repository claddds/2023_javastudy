package day03.com.ict.edu2;

public class Test03 {
	public static void main(String[] args) {
		/*
		 3989초는 몇 시간, 몇 분, 몇 초 인가?
		 선생님의 답
		 int time = 3989;
		 int h = 0;	// 시
		 int m = 0;	// 분
		 int s = 0;	// 초
		 int res = 0; // 나머지
		 
		 h = time / (60 * 60);	// 1
		 res = time % (60 * 60);	// 389
		 
		 m = res / 60;	// 분
		 s = res % 60;	// 초
		 
		 */
		int hour, min, sec;
		
		sec = 3989 % 60;
		min = 3989 / 60;
		hour = min / 60;
		
		if(min > 60) {
			min = min % 60;
		}
		
		System.out.println("3989초는" + hour + "시간" + min + "분" + sec + "초");
	}
}
