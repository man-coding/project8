package typecasting;

public class Ex03 {

	public static void main(String[] args) {
		// 부모타입 변수 = 자식 인스턴스 생성
		Customer2 vc = new VIPCustomer2("둘리"); // vip클래스에서 추가한 할인율은 사용할 수 없다.

		System.out.println(vc.customerName);
//		System.out.println(vc.saleRatio); 못함.
	}

}
