package day15.com.ict.edu2;

/*
	추상클래스를 상속했을때 처리 방법
	1. 부모클래스의 추상 메서드를 오버라이딩하면서 내용을 구체화 시킨다. => 자식클래스는 일반 클래스
	2. 자식클래스도 추상클래스로 만들면 오버라이딩하면서 구체화 하지 않아도 된다.
		즉, 자식클래스에 abstract를 붙인다.
*/
public abstract class Ex02_extends extends Ex01_abstract{
	/*
	@Override
	public void hobby() {
		System.out.println("게임하기");
	}
	*/
}