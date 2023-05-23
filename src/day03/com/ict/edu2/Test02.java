package day03.com.ict.edu2;

public class Test02 {
	public static void main(String[] args) {
		/*
		 2시간 40분 30초는 몇 초 일까요?
		 선생님의 답
		 int h = 2 * 60 *60;
		 int m = 40 * 60;
		 int s = 30;
		 
		 int result = h + m + s;
		 System.out.println("2시간 40분 30초는 " + sec + "초입니다.");
		 */
		int hour, min, sec;
		
		hour = 2 * 60;
		min = (hour + 40) * 60;
		sec = min + 30;
			
		
		System.out.println("2시간 40분 30초는 " + sec + "초이다");
		
	}
}