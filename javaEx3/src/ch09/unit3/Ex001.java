package ch09.unit3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex001 {

	public static void main(String[] args) {
		// System.in = byte string. 
		//InputStreamReader: byte로 입력 받은 한 문자를 한 단어로 만들어줌
		// BufferedReader : 입출력하는 동안 데이터의 임시 공간을 쌓아 놓음. Buffer를 활용해 입력 속도를 향상 시킴. 중간의 공백 없이 문자를 입력 받음
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		int a, b, c;
		
		try {
			System.out.print("첫 번째 수");
			s = br.readLine();
				// readLine()은 checked exception(IOException)이 발생하므로 반드시 예외처리를 해야 함
				// readLine은 예외를 내포하고 있음. 해당 메소드 안에는 네트워크 기능이 있는데 데이터를 못받아올 경우 발생. 그런 경우를 대비해 항상 예외처리를 해야 하는 경우임.
			a = Integer.parseInt(s); // 문자열 숫자로.
				// 문자열을 정수로 변경하지 못하면 NumberFormatException이라는 
				// unchecked exception(반드시 예외 처리 필요) 발생

			System.out.print("두 번째 수");
			b = Integer.parseInt(br.readLine()); // 문자열을 숫자로. 19, 22번 두 줄이 25번 한 줄과 같음.

			c = a/b;
			// 0으로 나눌 경우 ArithmeticException 이라는 unchecked exception(반드시 예외 처리 필요) 발생
			
			System.out.println(a +"/"+ b + "="+ c);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("end...");
	}

}
