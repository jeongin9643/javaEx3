package ch11.unit1;

public class Ex01 {
	public static void main(String[] args) {
		// Object는 모든 클래스의 객체를 참조할 수 있다. (장점이자 치명적인 단점)
		Object[] obj = new Object[5]; // 최상위 클래스여서 문자, 숫자 다 가능하지만 오류가 발생할 때도 있음
		
		obj[0] = new String("자바");
		obj[1] = new String("오라클");
		obj[2] = 90;
		obj[3] = 100;
		obj[4] = "스프링";
		
		// Arrays.sort(obj); // 런타임 오류. ClassCastException 문자 숫자 cast 불가
		for(Object o : obj) {
			// String s = (String)o; // 다운 캐스팅. 런타임 오류
			// System.out.println(s.length());
			if(o instanceof String) {
				String s = (String)o;
				System.out.println(s + ","+ s.length());
			}else if(o instanceof Integer) {
				Integer i = (Integer)o;
				System.out.println("정수 : "+ i);
			}
		}
		
	}

}
