//package typecasting;
//
//public class Ex01 {
//
//	public static void main(String[] args) {
//		VIPCustomer vip = new VIPCustomer();
//
//	}
//
//}
//
//class Customer {
//	String customerName; // 회원 이름
//	String customerGrade; // 회원 등급
//	double bonusPoint; // 보너스 포인트
//	double bonusRatio; // 적립률
//
//	public Customer() {
//		customerGrade = "SILVER"; // 고정값이니까 초기화
//		bonusRatio = 0.01;
//
//		System.out.println("Customer() 생성자 호출");
//	}
//
//	// 보인스 포인트 적립하고, 지불 가격을 계산하는 메소드
//	public void calcPrice(int price) {
//		bonusPoint = bonusPoint + (price * bonusRatio); // 보너스 포인트 계산
//		System.out.println(customerName + "님이 " + price + "원을 결제했습니다.");
//	}
//
//	public void showInfo() {
//		System.out.println(customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.");
//	}
//
//}
//
////VIP 회원 클래스
//class VIPCustomer extends Customer { // 상속받기
//
//	double saleRatio; // 할인률
//
//	public VIPCustomer() {
//		super(); // -> 생략하면 컴파일러가 자동생성 해준다.
//		customerGrade = "VIP";
//		bonusRatio = 0.05;
//		saleRatio = 0.1;
//
//		System.out.println("VIPCustomer() 생성자 호출");
//
//	}
//}