package day19.com.ict.edu;

public class Ex03_Dog implements Runnable{

	@Override
	public void run() {
		System.out.println("멍멍~"+Thread.currentThread().getName());
	}

}
