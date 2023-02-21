package ch09.unit3;

public class Ex102_throw {
	public static void main(String[] args) {
		User12 obj = new User12();

		try {
			obj.setValue(-5);
			int n = obj.getValue();
			System.out.println(n);
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.toString());
		}
		System.out.println("end...");
	}

}

// throw : 예외 일으킴
// throws : 예외를 던져서 처리

class User12{
	private int value;
	
	public void setValue(int value) throws Exception { // 메소드를 호출하는 곳(setValue)에서 예외를 catch하도록 'throws Exception' 설정
		if(value <0) {
			// 강제로 checked excpetion을 발생시킴. throw: 0미만일 경우 강제로 예외(문제)를 일으킴.
			throw new Exception("0이상만 가능합니다.");  
		}
		this.value = value;
	}
	public int getValue() {
		return value;
	}
}