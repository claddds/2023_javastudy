package day04.com.ict.edu;

public class Ex01_oper {
	public static void main(String[] args) {
		/*
		삼항 연산자: 조건식 => 조건이 참 일때와 거짓 일때를 구분해서 실행한다.
		형식) 자료형 변수이름 => (조건식) ? 조건식이 참일때 실행한 문장 : 조건식이 거짓일때 실행할 문장;
		**주의 사항) 변수, 참일때 실행 결과, 거짓일때 실행 결과 모두 같은 자료형이어야 한다. 
		조건식에는 boolean(true, false), 비교연산자, 논리연산사
		*/
		/*
		String str = (false) ? "강아지" : "고양이";
		System.out.println("결과: " + str);
		
		// 비교 연산자
		// int avg = 55;
		double avg = 85.3;
		str = (avg >= 60) ? "합격":"불합격";
		System.out.println("결과: " + str);
		
		char c1 = 'K';
		str = (c1>='a' && c1 <= 'z') ? "소문자" : "소문자 아님";
		System.out.println("결과: " + str);
		
		// 1 또는 3이면 남자, 2 또는 4이면 여자
		int gender = 1;
		str = (gender == 1 || gender == 3)? "남자" : "여자";
		System.out.println("결과: " + str);
		
		// 홀수이면 남자, 짝수이면 여자
		gender = 4;
		str = (gender%2 == 1) ? "남자" :"여자";
		System.out.println("결과: " + str);
		
		//3의 배수인지 아닌지알아보자
		int su1 = 157;
		str = (su1 % 3 ==0) ? "3의배수이다" : "3의 배수가 아니다";
		System.out.println("결과: " + str);
		*/
		
		/*
		 근무시간이 8시간까지는 시간당 9620이고 8시간을 초과한 시간만큼은
		 1.5배 지급한다. 현재 근무한 시간이 10시간이다.
		 얼마를 받아야 하는가?
		 */
		
		// 선생님의 답
		int time = 10;
		int dan = 9620;
		
		int pay = (time > 8) ? (8 * dan) + (int)((time -8) * dan * 1.5): time * dan;
		
		System.out.println("결과: " + pay);
		
		
		/*
		int time = 12;
		int money;
		money = (time > 8) ? (int)((time - 8)* 1.5 * 9620) + 8*9620 : time * 9620;
		System.out.println("결과: " + money);
		*/
		
		int num1 = 47;
		int num2 = 132;
		
		int res = (num1 > num2) ? num1 : num2;
		System.out.println("큰값: " + res);
		
		int res2 = Math.max(num1, num2);
		System.out.println("큰값: " + res2);
		
		int res3 = -38;
		int res4 = (res3 > 0) ? res3 : res3*(-1);
		System.out.println("결과는 " + res4);
		
		int res5 = Math.abs(res3);
		System.out.println("결과는 " + res5);
	}
}
