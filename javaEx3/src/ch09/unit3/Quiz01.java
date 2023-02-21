package ch09.unit3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// - 첫 번째 수 ? 10
// - 두 번째 수 ? 5
// - 연산자 [+-*/ ]? +
// 10 + 5 = 15

public class Quiz01 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b, result =0;
		String s ;
	
		try {
			System.out.print("첫 번째 수? ");
			a = Integer.parseInt(br.readLine());
				
			System.out.print("두 번째 수? ");
			b = Integer.parseInt(br.readLine());
			
			System.out.print("연산자 [+-*/ ]? ");
			s = br.readLine();
			
			switch(s) {
			case "+" : result= a+b; break;
			case "-" : result= a-b; break;
			case "*" : result= a*b; break;
			case "/" : result= a/b; break;
			} 
			
			System.out.println( a + s + b + " = " +result);
			
		}catch (NumberFormatException e) {
			System.out.println("숫자만 입력 가능합니다.");
		}catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}catch (IOException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
	}
		
	}

}
