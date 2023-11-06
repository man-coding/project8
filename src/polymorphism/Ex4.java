package polymorphism;

import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
 * 리스트와 다형성을 활용하여 회원 관리 프로그램 구현하기
 * */
public class Ex4 {

	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList<Customer>();

		Customer customer1 = new Customer("둘리");
		Customer customer2 = new Customer("또치");
		Customer customer3 = new Customer("또치");
		Customer customer4 = new VIPCustomer("마이콜");
		Customer customer5 = new VIPCustomer("고길동");

		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);
		customerList.add(customer4);
		customerList.add(customer5);

		System.out.println("======= 회원등급에 따라 할인율과 보너스 포인트 계산 ======");
		for (Customer customer : customerList) { // 람다식은 조건이 없다. 리스트를 순회.
			customer.calcPrice(10000); // 리스트 안에는 실제로 주소값이 저장된다.
		}

		for (Customer customer : customerList) {
			customer.showInfo(); // 고객정보 출력
		}
	}
}
