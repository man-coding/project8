package overriding;

//오버라이딩
public class Quiz01 {

	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();

		cat.eat();
		cat.sound();
		dog.eat();
		dog.sound();
	}

}

class Animal {

	public void eat() {
		System.out.println("먹이를 먹는다");
	}

	public void sound() {
		System.out.println("짖는다");
	}

}

class Cat extends Animal {

	@Override
	public void eat() {

		System.out.println("쥐를 먹는다"); // supuer()는 지우고 새로 다시 쓴다.
	}

	@Override
	public void sound() {

		System.out.println("야옹하고 짖는다");

	}

}

class Dog extends Animal {

	@Override
	public void eat() { // 부모하고 선언부가 동일해야함. void->int 로 바꾸면 에러남. override를 없애면 새로운 함수가 됨.

		System.out.println("고기를 먹는다");
	}

	@Override
	public void sound() {

		System.out.println("멍멍하고 짖는다");

	}

}
