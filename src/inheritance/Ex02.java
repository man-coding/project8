package inheritance;

public class Ex02 {

	public static void main(String[] args) {

		Student student = new Student();
		student.sound(); // 물려받은 것도 자신의 것처럼 쓸 수 있음
		student.eat();
		student.study();

		System.out.println();

		Professor professor = new Professor();
		professor.sound();
		professor.eat();
		professor.work();
	}

}

//사람 클래스
class Person {
	public void eat() {
		System.out.println("식사를 한다");

	}

	public void sound() {
		System.out.println("대화를 한다");
	}

}

//학생 클래스
class Student extends Person {
	public void study() {
		System.out.println("공부를 한다");
	}
}

//교수 클래스
class Professor extends Person {
	public void work() {
		System.out.println("일을 한다");
	}

}