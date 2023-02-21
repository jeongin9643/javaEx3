package ch09.unit3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex110 {

	public static void main(String[] args) {

	}

}

class OperatorException extends Exception{ // 연산자 입력 오류를 위한 사용자 정의 예외 클래스
	private static final long serialVersionUID = 1L;
	
	public OperatorException(String msg) {
		super(msg);
	}
 
}

class Calculate{
	// 필드는 값이 변경돼선 안되고 외부에서 접근하지 않도록 private. fianl 필드는 public.
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public void calc() {
		int a, b;
		String op;
		
		try {
			System.out.print("첫 번쨰 수 ? ");
			a = Integer.parseInt(br.readLine());
			
			System.out.print("두 번쨰 수 ? ");
			b = Integer.parseInt(br.readLine());

			System.out.print("연산자 ? ");
			op = inputOperator();
			
			String s = null;
			switch(op) {
			case "+" : s = String.format("%d + %d = %d", a, b, a+b); break;
			case "-" : s = String.format("%d - %d = %d", a, b, a-b); break;
			case "*" : s = String.format("%d * %d = %d", a, b, a*b); break;
			case "/" : s = String.format("%d / %d = %d", a, b, a/b); break;
			}
			
			System.out.println(s);
			
		} catch (NumberFormatException e) {
			System.out.println("숫자만 입력 가능합니다.");
		}catch (OperatorException e) {
			System.out.println(e.getMessage());
		}catch (ArithmeticException e) {
			System.out.println("연산이 불가능합니다.");
		}catch (IOException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private String inputOperator() throws OperatorException{
		String op = null;
		
		try {
			op = br.readLine();
			if(! op.matches("^(\\+|\\-|\\*|\\/)$")){
				throw new OperatorException("연산자 입력 오류 입니다.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return op;
	}
}