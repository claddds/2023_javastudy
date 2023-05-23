package day06.com.ict.edu;

public class Report_0503 {
	public static void main(String[] args) {
		
		// 1 + (-2) + 3 + (-4) + 5 + (-6) + 7 + (-8) + 9 + (-10) = for문을 이용한 누적합
		/*
		int total = 0;
		int sum_p = 0;
		int sum_m = 0;

		for (int i = 0; i < 11; i++) {
			if (i % 2 == 0) {
				sum_m += i;
			} else {
				sum_p += i;
			}
		}
		total = sum_p - sum_m;
		System.out.println("짝수만 음수인 1 ~ 10의 합: " + total);
		*/
		// 선생님 답변
		int sum = 0;
		for(int i = 1; i < 10; i++) {
			if(i%2 == 0) {
				sum = sum + (i*(-1));
			}else {
				sum = sum+i;
			}
		}
		System.out.println("결과: "+sum);
		System.out.println("==============================");
		/*
		1. if-else문
		농구공 5개씩 한 박스에 들어간다. 40개면 8상자,  26개면 6개이다.
		int k1 = 127개이다. 몇 상자가 필요한가요? 
		*/
		/*
		int k1 = 127;
		int box, less;
		
		less = k1%5;
		
		if (less == 0) {
			box = k1/5;
		} else {
			box = (k1/5) + 1;
		}
		
		System.out.println("농구공 127개를 넣는데 필요한 상자의 개수: " + box);
		System.out.println("==============================");
		*/
		// 선생님의 답변
		int k1 = 127;
		int res = k1/5;
		if(k1%5!=0) {
			res = res +1;
		}
		System.out.println("결과: "+res);
		System.out.println("==============================");
		/*
		2. for문으로 풀기
			0 0 0 0 
			0 0 0 0
			0 0 0 0
			0 0 0 0
		*/
		/*
		for (int i = 1; i < 17; i++) {
			System.out.print("0 ");
			if (i%4 == 0) {
				System.out.println();
			}
		}
		System.out.println("==============================");
		*/
		// 선생님의 답변
		// 0 0 0 0를 하나로 보는 경우
		for (int i = 0; i < 4; i++) {
			System.out.println("0 0 0 0");
		}
		System.out.println("==============================");
		// 0 를 하나로 보는 경우(0이 16개)
		for (int i = 1; i < 17; i++) {
			System.out.print("0 ");
			if(i%4==0) {
				System.out.println();
			}
		}
		System.out.println("==============================");
		/*
		3.  이중 for 문으로 풀기 
			1  0  0  0
			0  1  0  0
			0  0  1  0
			0  0  0  1
		*/
		/*
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				if (i == j) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
		System.out.println("==============================");
		*/
		// 선생님의 답변
		for(int i=0; i<4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i == j) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
		System.out.println("==============================");
		
		/*
		4. 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때,
		 몇까지 더해야 총합이 100이상이 되는지 구하시오.
		*/
		/*
		int k=1 , sum = 0;
		while(true) {
			sum += k;
			if(k%2 == 0) {
				sum = sum - (2*k);
			}
			if(sum>=100) {
				System.out.println("1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 총합이 100이상이 되었을때의 i의 값: "+k);
				break;
			}
			k++;
		}
		*/
		/*
		// 선생님의 답변
		int sum2 = 0;
		int cnt = 0;
		int i = 1;
		while(true) {
			if (i%2==0) {
				sum2 = sum2 + (i*-1);
			} else {
				sum2 = sum2 + (i*1);
			}
			cnt = i;
			if(sum2 >= 100) {
				break;
			}
			i++;
		}
		System.out.println(cnt);
		System.out.println("==============================");
		*/
		/*
		 5. 별찍기
		 *
		 * *
		 * * *
		 * * * *
		*/
		/*
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				if (i >= j) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println("==============================");
		*/
		// 선생님의 답변
		for (int i = 1; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("==============================");
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("* ");
				if(i == j) break;
			}
			System.out.println();
		}
		System.out.println("==============================");
		
		/*
		 6. 별찍기
		      *
		    * *
		  * * *
		* * * *
		*/
		/*
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				if (i <= 4 - j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		*/
		//선생님의 답변
		for (int i = 1; i < 5; i++) {
			for (int j = 4; j > 0; j--) {
				if(i<j) {
					System.out.print("  ");
				}else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}