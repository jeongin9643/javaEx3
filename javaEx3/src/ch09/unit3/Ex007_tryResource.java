package ch09.unit3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex007_tryResource {

	public static void main(String[] args) {
		int n;
		String s;
		
		// JDK7부터 가능
		// try ~ with ~ resource : 자동으로 resource가 close()됨 
		try(Scanner sc = new Scanner(System.in)) {
			System.out.print("나이?");
			n = sc.nextInt();
			
			s = n >=19 ? "성인" : "미성년자";
			System.out.println(s + "입니다.");
			
		} catch (InputMismatchException e) {
			System.out.println("숫자만 입력 가능합니다.");
		}
		System.out.println("end...");
	}

}
