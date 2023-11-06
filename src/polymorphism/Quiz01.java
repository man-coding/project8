package polymorphism;

public class Quiz01 {

	public static void main(String[] args) {

		runCar(new Car()); // 부모 타입의 변수에 자식 타입의 값을 대입
		runCar(new Bus());
		runCar(new SportsCar());
	}

	public static void runCar(Car car) {  //다형성을 사용하지 않는다면 각 클래스를 매개변수로 사용하는 메소드를 각각 만들어야 함.
		car.run();
	}

}

class Car {

	public void run() {
		System.out.println("주행한다");
	}
}

class Bus extends Car {

	public void run() {
		System.out.println("버스가 달린다");
	}
}

class SportsCar extends Car {

	public void run() {
		System.out.println("스포츠카가 달린다");
	}
}