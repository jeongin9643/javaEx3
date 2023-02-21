package ch09.unit3;

public class Ex104_throw {
	public static void main(String[] args) {
		User14 obj = new User14();

		obj.setValue(-5); 
		int n = obj.getValue();
		System.out.println(n);

//		System.out.println("end...");
	}

}

// 잘못 작성한 코드
//if에서 예외를 잡아버리고 처리를 하지 않고 내려가서 value가 넘어가고 value의 초기값이 0이기 때문에 0이 나옴.

class User14 {
	private int value; 
	public void setValue(int value) {
		try {
			if (value < 0) {

				throw new Exception("0이상만 가능합니다.");
			}
			this.value = value;

		} catch (Exception e) {
			// 위에서 throw 한 예외를 이 곳에서 catch함
			System.out.println(e.toString());
		}
	}

	public int getValue() {
		return value;
	}
}