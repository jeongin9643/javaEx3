package ch11.unit1;

public class Ex02 {
	public static void main(String[] args) {
		// Object를 이용할 때 문자열, 숫자 가능하지만 다운캐스팅 해줘여 함
		Test2 t1 = new Test2();
		t1.setOb("서울");
		// 길이 구하기
		String s = (String)t1.getOb();// 다운캐스팅
		System.out.println(s + ":"+ s.length());

		Test2 t2 = new Test2();
		t2.setOb(100);
		Integer i = (Integer)t2.getOb();
		System.out.println(i);
	}

}

class Test2{
	private Object ob;

	public Object getOb() {
		return ob;
	}

	public void setOb(Object ob) {
		this.ob = ob;
	}
}