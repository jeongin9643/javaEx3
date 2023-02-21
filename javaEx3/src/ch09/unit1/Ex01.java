package ch09.unit1;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// 잘못 작성한 프로그램의 예
		// 0으로 나눌 수 있다는 것, 정수를 입력할 때 문자와의 결합. 
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		
		System.out.print("두 정수 ?");
		a = sc.nextInt();
		b = sc.nextInt();
		
		c = a/b ;
		
		// b가 0이면 프로그램은 비정상으로 종료되어 아래 코드는 실행되지 않음
		System.out.println(a +"/"+ b +"="+ c);
		System.out.println("end...");
		
		sc.close();
		
	}

}
