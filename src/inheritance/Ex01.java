package inheritance;

public class Ex01 {

	public static void main(String[] args) {
		Child child = new Child();
		child.nationality = "한국";
		child.lastName = "고";
		child.firstName = "길동";

		System.out.println(child.nationality + " " + child.lastName + child.firstName);
	}

}

class Parents {
	String nationality;
	String lastName;
}

class Child extends Parents {
	String firstName;

}