package ch09.unit3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex003 {

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
	 
		}catch (Exception e) {
			// 모든 예외를 catch
			e.printStackTrace();
		}
		
		System.out.println("end...");
	}

}
