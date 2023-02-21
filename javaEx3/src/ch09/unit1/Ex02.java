package ch09.unit1;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		
		try {
			// 1) 예외가 발생할 가능성이 있는 코드
			System.out.print("두 정수 ?");
			a = sc.nextInt();
			b = sc.nextInt();
			
			c = a/b ;
			System.out.println(a +"/"+ b +"="+ c);
		} catch (Exception e) {
			// Exception
			// : 모든 예외를 catch 할 수 있음.
			// : 예외 상황 별로 예외를 분리할 수 없음
			
			// 2) 예외가 발생할 때 실행할 코드
			// System.out.println("예외가 발생했습니다."); 
			
			// 2-1) 개발자용 코드 (클라이언트에게 보내는 것이 아님)
			// System.out.println(e.getMessage()); // (10, a)==null. /(10,0) == by zero. 에러 메시지를 간단히
			// System.out.println(e.toString()); // 예외발생클래스 및 간단한 메시지
			e.printStackTrace(); // 자세히 예외상황 메시지 출력
		}
		System.out.println("end...");
		sc.close();
	}

}
