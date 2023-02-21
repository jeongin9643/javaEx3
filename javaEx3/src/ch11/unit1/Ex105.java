package ch11.unit1;

public class Ex105 {
	public static void main(String[] args) {
		TestImpl5<Integer> obj = new TestImpl5<>();
		obj.print(10);
		
		DemoImpl5 obj2 = new DemoImpl5();
		obj2.print("서울");
	}
}

// 제너릭 인터페이스
interface Test5<T>{
	public void print(T t);
	
}

// 구현 - 1
class TestImpl5<T> implements Test5<T>{ // 자료형 미결정
	@Override
	public void print(T t) {
		System.out.println(t);
	}
	
}

// 구현 - 2
class DemoImpl5 implements Test5<String>{ // 자료형 String 결정 
	@Override
	public void print(String t) {
		System.out.println(t);
	}
	
}