package ch09.unit3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex109 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		String oper, result;
		
		try {
			System.out.print("첫 번째 수? ");
			a = sc.nextInt();
			
			System.out.print("두 번째 수? ");
			b = sc.nextInt();
			
			System.out.print("연산자 ? ");
			oper = sc.next();
			
			result = "";
			switch(oper) {
			case "+" : result = String.format("%d + %d = %d", a, b, a+b); break;
			case "-" : result = String.format("%d - %d = %d", a, b, a-b); break;
			case "*" : result = String.format("%d * %d = %d", a, b, a*b); break;
			case "/" : result = String.format("%d / %d = %d", a, b, a/b); break;
			default : result = "연산자 입력 오륭입니다."; break;
			}
			System.out.println(result);

		} catch (InputMismatchException e) {
			System.out.println("숫자만 가능합니다.");
		}catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			sc.close();
		}
		
		
	}

}
