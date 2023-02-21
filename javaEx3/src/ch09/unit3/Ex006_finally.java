package ch09.unit3;

public class Ex006_finally {

	public static void main(String[] args) {
		// divide(10,5);
		// divide(10,0);
		 divide(10,-2); // finally 블록은 return을 만나도 나옴.
	}
	
	public static void divide(final int a, final int b) {
		try {
			if(b<0) {
				System.out.println("음수는 안되유...");
				//System.exit(0); // 프로그램 강제 종료
				return;
			}
			int c = a / b; 
			System.out.println(a+"/"+ b + "=" + c);
			
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}finally {
			// System.exit(0);를 만났을 때만 실행하지 않음.
			System.out.println("finally 블록은 return을 만나도 실행된다.");
		}
	}
	
}
