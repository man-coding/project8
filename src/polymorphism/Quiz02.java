package polymorphism;

import java.util.ArrayList;

public class Quiz02 {

	public static void main(String[] args) {

		ArrayList<Customer1> customerList = new ArrayList<Customer1>();

		Customer1 customer1 = new Customer1("둘리");
		Customer1 customer2 = new VIPCustomer1("마이콜");
		Customer1 customer3 = new GOLDCustomer1("도우너");

		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);

		System.out.println("======= 회원등급에 따라 할인율과 보너스 포인트 계산 ======");
		for (Customer1 customer : customerList) { // 람다식 포문
			customer.calcPrice1(10000);
		}

//		for (int i = 0; i < customerList.size(); i++) {
//			Customer1 customer = customerList.get(i); // 일반 포문에서는 겟메소드와 함께 저장할 변수를 선언해야 함
//			customer.calcPrice1(10000);

//}

		for (Customer1 customer : customerList) {
			customer.showInfo();
		}
	}

}

class Customer1 {
	String customerName;
	String customerGrade;
	double bonusPoint;
	double bonusRatio;

	public Customer1(String customerName) {
		super();
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}

	public void calcPrice1(int price) {
		bonusPoint = bonusPoint + (price * bonusRatio);
		System.out.println(customerName + "님이 " + price + "원을 결제했습니다.");
	}

	public void showInfo() {
		System.out.println(customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.");
	}

}

class VIPCustomer1 extends Customer1 {

	double saleRatio;

	public VIPCustomer1(String customerName) {
		super(customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}

	@Override
	public void calcPrice1(int price) {
		bonusPoint = bonusPoint + (price * bonusRatio);
		int salePrice = price - (int) (price * saleRatio);
		System.out.println(customerName + "님이 " + salePrice + "원을 결제했습니다.");
	}
}

class GOLDCustomer1 extends Customer1 {

	double saleRatio;

	public GOLDCustomer1(String customerName) {
		super(customerName); // 부모 클래스에 디폴트 생성자 없기 때문에 부모클래스에 따라 이름 매개변수를 선언 후 그 값을 부모한테 전달해 줘야 한다.
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}

	public void calcPrice1(int price) {
		bonusPoint = bonusPoint + (price * bonusRatio);
		int salePrice = price - (int) (price * saleRatio);
		System.out.println(customerName + "님이 " + salePrice + "원을 결제했습니다.");
	}
}