package ch11.unit1;

public class Ex06 {
	public static void main(String[] args) {
		Test6<Integer> t = new Test6<>();
		t.set(10);
		int a = t.get();
		System.out.println(a);
		
		// Test6<String> ob = new Test6<>(); // 컴오류
	}
}

// 제한된 타입 파라미터. Number를 상속 받은 클래스만 가능.
// Integer, Long, Double ... 
class Test6<T extends Number>{
	private T t;
	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}
	
}