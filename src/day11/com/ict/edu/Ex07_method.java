package day11.com.ict.edu;

public class Ex07_method {
	double sum = 0.0;
	double avg = 0.0;
	char hak;
	
	// 총점을 구하는 메서드
	public void getSum(double kor, double eng, double math) {
		sum = kor + eng + math;
	}
	// 평균을 구하는 메서드
	public void getAvg() {
		avg = (int)(sum/3.0*10)/10.0;
	}
	
	public void getAvg(int k1) {
		avg = (int)(k1/3.0*10)/10.0;
	}
	// 학점을 구하는 메서드
	public void getHak() {
		if(avg >= 90) {
			hak = 'A';
		}else if(avg >= 80) {
			hak = 'B';
		}else if(avg >= 70) {
			hak = 'C';
		}else {
			hak = 'F';
		}
	}
	/*
	public void getHak(double k1) {
		if(k1 >= 90) {
			hak = "A학점";
		}else if(k1 >= 80) {
			hak = "B학점";
		}else if(k1 >= 70) {
			hak = "C학점";
		}else {
			hak = "F학점";
		}
	}*/
}