package ch09.unit3;

import java.util.Scanner;

public class Ex004_finally {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] ss = new String[3];
		int idx;
		String s;

		try {
			idx = 0;
			System.out.println("문자열 입력[종료: 입력하지 않고 엔터]...");
			while ((s = sc.nextLine()).length() != 0) {
				ss[idx++] = s;
				System.out.print("");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// ArrayIndexOutOfBoundsException : 배열 첨자를 벗어나면 발생하는 unchecked exception
			System.out.println("입력을 초과했습니다.");
		} finally {
			System.out.println("예외 발생 유무와 상관 없이 반드시 실행..");
			sc.close();
		}
		System.out.println();
		for (String a : ss) {
			System.out.println(a);
		}

	}

}
