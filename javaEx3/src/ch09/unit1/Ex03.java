package ch09.unit1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;

		try {
			System.out.print("두 정수 ?");
			a = sc.nextInt();
			b = sc.nextInt();

			c = a / b;
			System.out.println(a + "/" + b + "=" + c);
			// InputMismatchException(Scanner에서 입력 문제 발생), ArithmeticException 
			// : 런타임시 발생하는 예외
			// : unchecked exception (반드시 필수가 아니고 문제를 잡지 않아도 실행되지만, 프로그램 진행 중 문제가 발생시 프로그램 죽음)
		} catch (InputMismatchException e) { // catch: 예측 가능한 특정 상황을 위한 코드 
			System.out.println("정수만 입력 가능합니다.");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (Exception e) { // Exception: 모든 예외상황을 잡을 수 있음. 없어도 문제는 없지만 또다른 예외를 위해 놔둠
			e.printStackTrace();
		}finally {
			System.out.println("예외 발생 유무와 상관 없이 실행...");
			sc.close();
		}
		System.out.println("end...");
	}

}
