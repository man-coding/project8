package downcasting;

import java.util.ArrayList;

/*
 * 사람, 학생, 회사원 클래스를 정의하세요.
 * Person형 리스트를 생성하고 학생과 회사원을 저장하세요.
 * 리스트에 저장된 사람을 모두 꺼내서, 메소드를 호출하세요.
 * */
public class Quiz1 {
	public static void main(String[] args) {

		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Student("둘리"));
		list.add(new Employee("또치"));

		for (int i = 0; i < list.size(); i++) {
			Person person = list.get(i);
			person.Eat();

			if (person instanceof Student) { // person이 Student를 가리키고 있는지 확인
				Student student = (Student) person; // 다운캐스팅 -> 주소값을 카피
				student.studying();
			} else if (person instanceof Employee) { // person이 Employee를 가리키고 있는지 확인
				Employee employee = (Employee) person;
				employee.working();
			}
		}

	}
}

class Person {
	String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	public void Eat() {
		System.out.println(name + "가 밥을 먹는다");
	}

}

class Student extends Person {

	public Student(String name) {
		super(name);

	}

	public void studying() {
		System.out.println(name + "가 공부를 한다");
	}

}

class Employee extends Person {

	public Employee(String name) {
		super(name);

	}

	public void working() {
		System.out.println(name + "회사원이 일을 한다");
	}

}