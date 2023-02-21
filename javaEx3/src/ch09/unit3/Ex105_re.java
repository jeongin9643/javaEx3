package ch09.unit3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex105_re {

	public static void main(String[] args) {
		User105 obj = new User105();
		obj.input();
		obj.input();

	}

}

class User105{
	private Scanner sc = new Scanner(System.in);
	
	public void input() {
		String name, tel;
		int kor, eng;
		
		try {
			System.out.print("이름 ? ");
			name = sc.next();
			
			System.out.print("국어 ? ");
			kor = inputScore();
			
			System.out.print("영어 ? ");
			eng = inputScore();
			
			System.out.println("전화번호 ? ");
			tel = sc.next();
			
			System.out.println(name +":"+ tel +":"+ kor+":"+ eng);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("-------------------");
		
	}
	
	private int inputScore() throws Exception {
		int s = 0;
		try {
			s = sc.nextInt();
			if(s <0 || s>100) {
				throw new Exception("점수는 0~100 사이만 가능.");
			}
		} catch (InputMismatchException e) {
			sc.nextLine();
			throw new Exception("점수는 숫자만 가능.");
		}
		return s;
	}
}