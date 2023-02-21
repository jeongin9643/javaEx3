package ch11.unit2;

public class Ex01 {
	public static void main(String[] args) {
		// Number > Integer
		Test1<Number> ob1 = new Test1<>();
		Integer i = 100;
		ob1.set(i); // 타입 매개 변수에 상속 관계는 성립
		
		Integer i2 = (Integer)ob1.get(); // down-casting
		System.out.println(i2);
		System.out.println();
		
		Test1<Integer> ob2 = new Test1<>(); 
		ob2.set(50);
		System.out.println(ob2.get());
		
		//Test1<Number> ob3 = ob2; // 컴파일 오류. 제너릭은 상속관계가 아님. 업캐스팅/다운캐스팅 불가. 자료형이 일치해야 함
		
		
	}
}

class Test1<T>{
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}
}