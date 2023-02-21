package ch11.unit1;

public class Ex07 {
	public static void main(String[] args) {
		Test7 t = new Test7();
		t.disp(100);
		t.disp("서울");
	}
}

// 제너릭 메소드. 클래스를 제너릭으로 만든 게 아닌 메소드를 제너릭으로 만든 것.
class Test7 {
	public <U> void disp(U u) {
		System.out.println(u.getClass().getName() + ", " + u);
	}

	public <U extends Number> void sub(U u) {
		System.out.println(u.getClass().getName() + "," + u);
	}

}