package downcasting;

import java.lang.reflect.Array;
import java.util.ArrayList;

/*
 * 리스트에 다운캐스팅 활용하기
 **/
public class Ex2 {

	public static void main(String[] args) {

		ArrayList<Animal> aniList = new ArrayList<Animal>();

		aniList.add(new Human()); // 리스트에 객체를 담았다.
		aniList.add(new Tiger());
		aniList.add(new Eagle());

		for (int i = 0; i < aniList.size(); i++) {

			Animal ani = aniList.get(i);

			if (ani instanceof Human) {
				Human h = (Human) ani; // ani, 배열의 0번째, h 모두 사람 인스턴스를 공유하고 있다.
				h.readBook();
			} else if (ani instanceof Tiger) {
				Tiger t = (Tiger) ani;
				t.hunting();
			} else if (ani instanceof Eagle) {
				Eagle e = (Eagle) ani;
				e.flying();
			}
		}

	}
}
