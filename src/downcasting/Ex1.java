package downcasting;

/*
 * 형변환된 변수를 다운캐스팅하기
 **/
public class Ex1 {

	public static void main(String[] args) {

		Animal animal = new Human();

		if (animal instanceof Human) {// 타입체크

			Human human = (Human) animal; // animal의 주소값을 카피한다.
			human.readBook();
		}

		if (animal instanceof Tiger) { // 타입체크
			Tiger tiger = (Tiger) animal;
			tiger.hunting();
		}
//Tiger tiger = (Tiger) animal;  //컴파일 오류x 런타임 오류 o -> 실행해 봐야 오류를 앎.

	}

}

//동물 클래스
class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

//사람 클래스
class Human extends Animal { // 동물클래스 상속받기
	public void move() { // 메소드 재정의
		System.out.println("사람이 두 발로 걷습니다. ");
	}

	public void readBook() {
		System.out.println("사람이 책을 읽습니다. ");
	}
}

//호랑이 클래스
class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다. ");
	}

	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다. ");
	}
}

//독수리 클래스
class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 납니다 ");
	}

	public void flying() {
		System.out.print("독수리가 날개를 쭉 펴고 멀리 날아갑니다");
	}
}
