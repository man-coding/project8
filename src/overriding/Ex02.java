package overriding;

//부모클래스로 형변환하고 재정의된 메소드 호출하기
public class Ex02 {

	public static void main(String[] args) {

		Customer vc = new VIPCustomer("둘리");

		vc.calcPrice(10000);
	}

}
