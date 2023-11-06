package polymorporism;

public class Ex01 {

	public static void main(String[] args) {
		Human human = new Human();
		Tiger tiger = new Tiger();
		Eagle eagle = new Eagle();

		human.move();
		tiger.move();
		eagle.move();
	}

}

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
}