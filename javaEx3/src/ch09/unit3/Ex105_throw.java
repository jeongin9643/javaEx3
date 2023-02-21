package ch09.unit3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex105_throw {
	public static void main(String[] args) {
		User15 obj = new User15();
		
		obj.input();
		obj.input();
		
	}

}

class User15{
	private Scanner sc = new Scanner(System.in);
	
	public void input() {
		String name, tel; 
		int kor, eng;
		
		try {  // 예외가 발생할 수 있는 코드
			System.out.print("이름 ? ");
			name = sc.next();
			
			System.out.print("국어 ? ");
			kor = inputScore();
			
			System.out.print("영어 ? ");
			eng = inputScore();
			
			System.out.print("전화번호 ? ");
			tel = sc.next();
			
			System.out.println(name +":"+ tel +":"+ kor+":"+ eng);
			
		} catch (Exception e) { // 예외 처리 코드
			// System.out.println(e.toString());
			System.out.println(e.getMessage());
			
		}
		System.out.println("--------------------------------");
	}
	
	// 점수 입력
	private int inputScore() throws Exception{
		int s = 0;
		try {
			s = sc.nextInt();
			if(s<0 || s>100) {
				throw new Exception("점수는 0~100 사이만 가능합니다."); // 더 이상 일을 못하도록 문제 일으킴.
			}
		} catch (InputMismatchException e) {
			sc.nextLine(); // 숫자를 입력해야 하는데 잘못 입력한 문자열을 읽어서 버린다.
				// 이 코드가 없으면 이상한 현상이 일어남.
			throw new Exception("점수는 숫자만 가능합니다.");
			
		}
		return s;
	}
}