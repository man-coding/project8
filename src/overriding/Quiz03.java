package overriding;

public class Quiz03 {

	public static void main(String[] args) {
		Computer computer1 = new Computer(); // 변수는 부모타입 -> 형변환 -> 함수재정의
		computer1.on();
		computer1.off();

		Computer computer2 = new Notebook(); // 전부 같은 함수이지만 결과가 다르다.(재정의된 것)
		computer2.on();
		computer2.off();

		Computer computer3 = new Desktop();
		computer3.on();
		computer3.off();
	}

}

class Computer {

	public void on() {
		System.out.println("컴퓨터를 켠다");
	}

	public void off() {
		System.out.println("컴퓨터를 끈다");
	}
}

class Notebook extends Computer {

	@Override
	public void on() {
		System.out.println("노트북을 켠다");
	}

	@Override
	public void off() {
		System.out.println("노트북을 끈다");
	}

}

class Desktop extends Computer {

	@Override
	public void on() {
		System.out.println("데탑을 켠다");
	}

	@Override
	public void off() {
		System.out.println("데탑을 끈다");
	}

}
