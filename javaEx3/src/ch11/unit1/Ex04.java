package ch11.unit1;

public class Ex04 {
	public static void main(String[] args) {
		Test4<String, Integer> tt = new Test4<>();
		tt.set("서울", 1000);
		tt.disp();
	}

}

// 두개의 타입 파라미터
class Test4<T, U> {
	private T t;
	private U u;

	public void set(T t, U u) {
		this.t = t;
		this.u = u;
	}

	public void disp() {
		System.out.println("T:" + t.getClass().getName() + ", " + t); // T:java.lang.String, 서울
		System.out.println("U:" + u.getClass().getName() + ", " + u); // U:java.lang.Integer, 1000
	}
}