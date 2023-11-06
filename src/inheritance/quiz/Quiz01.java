package inheritance.quiz;

public class Quiz01 {

	public static void main(String[] args) {

		BallPen ballPen = new BallPen();
		FountainPen fountainPen = new FountainPen();

		ballPen.showInfo();
		fountainPen.showInfo();

	}

}

class Pen {
	int fontWeight;
	int remain;

}

class BallPen extends Pen {
	String color;

	public BallPen() {
		super();
		this.fontWeight = 2;
		this.remain = 100;
		this.color = "파랑색";
	}

	public void showInfo() {
		System.out.println("펜의굵기:" + fontWeight + ", 남은양:" + remain + " 볼펜의색:" + color);
	}
}

class FountainPen extends Pen {
	String brand;

	public FountainPen() {
		super();
		this.fontWeight = 3;
		this.remain = 80;
		this.brand = "몽블랑";
	}

	public void showInfo() {
		System.out.println("펜의굵기:" + fontWeight + ", 남은양:" + remain + ", 브랜드:" + brand);
	}

}