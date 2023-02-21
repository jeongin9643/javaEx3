package ch11.unit1;

public class Ex03_generic {
	public static void main(String[] args) {
		Test3<String> t1 = new Test3<>(); // 메모리 할당 시점
		t1.set("서울");
		// t1.set(100); // 컴오류. 문자열만 가능. 
		
		String s = t1.get(); // 캐스팅 안 함
		System.out.println(s);
		
		Test3<Integer> t2 = new Test3<>(); //  new Test3<>();에서 Integer 생략 가능
		t2.set(100);
		Integer i = t2.get();
		System.out.println(i);
		
		/*
		Test3 t3 = new Test3(); // 가능은하지만 경고 발생. 이 경우 Object로 처리.
		t3.set("서울");
		t3.set(100);
		*/
	}
}

// Generic(하나의 타입 파라미터)
// : <T>는 아무 문자나 넣어도 됨. 자료형이 결정되지 않은 상태. <T>의 자료형은 실행시, 객체를 생성할 때 자료형 정함
class Test3<T>{
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		System.out.println(t.getClass());
		return t;
	}
	
}