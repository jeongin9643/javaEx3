package ch09.unit3;

public class Ex103_throw {
	public static void main(String[] args) throws Exception {
		User13 obj = new User13();
	
		// 위처럼 main()메소드에서 예외를 throws하면 JVM에서 예외를 잡으므로
		// 프로그램은 비정상적으로 종료되어 end...는 출력되지 않는다. 메인이 종료되어서 프로그램이 죽어버림
		// 따라서 main에서는 throws 하지 않는다.
		
		obj.setValue(-5);  // 해당 예외 처리를 main의 JVM에게 넘김
		int n = obj.getValue();
		System.out.println(n);
		
		System.out.println("end...");
	}

}

class User13{
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