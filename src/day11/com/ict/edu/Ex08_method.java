package day11.com.ict.edu;

// 배열은 같은 자료형을 여러개 저장할 수 있지만
// 클래스를 이용하면 자료형이 다르더라도 여러개 저장할 수 있다.
public class Ex08_method {
	
	// 단점은 멤버필드에 바로 접근할 수 있다.
	// 해결책: 접근제한자를 private으로 지정(직접 접근을 못한다.)
	//		변경하는 메서드(setter())와 return하는 메서드(getter())를 만들어 사용
	String name = "";
	int kor = 0;
	int eng = 0;
	int math = 0;
	int sum = 0;
	double avg = 0.0;
	String hak = "";
	int rank = 0;
	
	public void getSum() {
		sum = kor + eng + math;
	}
	
	public void getAvg() {
		avg = (int)(sum/3.0*10)/10.0;
	}
	
	public void getHak() {
		if(avg >= 90) {
			hak = "A학점";
		}else if(avg >= 80) {
			hak = "B학점";
		}else if(avg >= 70) {
			hak = "C학점";
		}else {
			hak = "F학점";
		}
	}
}
