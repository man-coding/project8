package polymorporism;

public class Ex03 {

	public static void main(String[] args) {

		moveAnimal(new Human()); // Animal animal = new Tiger(); 와 동일.
		moveAnimal(new Tiger());
		moveAnimal(new Eagle());
	}

	// 자식클래스인 사람,호랑이,독수리를 모두 받을 수 있음.
	public static void moveAnimal(Animal animal) { // 메인에서 사용하려면 static 똑같이 붙여줘야 함.
		animal.move();

	}

}
