package ch09.unit3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex002 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b, c;
		
		try {
			System.out.print("첫 번째 수");
			a = Integer.parseInt(br.readLine()); 
				 
			System.out.print("두 번째 수");
			b = Integer.parseInt(br.readLine()); 

			c = a/b;
			
			System.out.println(a +"/"+ b + "="+ c);
			
			// 예외를 상황 별로 catch
		} catch (NumberFormatException e) {
			// 문자열을 숫자로 변환할 때 변환하지 못하면 발생하는 unchecked exception
			System.out.println("정수만 입력 가능합니다.");
		} catch (ArithmeticException e) {
			// 0으로 나누는 등 산술연산시 발생하는 unchecked exception
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (IOException e) {
			// readLine()에서 발생하는 checked exception
			e.printStackTrace();
		}catch (Exception e) {
			// 모든 예외를 catch
			e.printStackTrace();
		}
		
		
		System.out.println("end...");
	}

}
