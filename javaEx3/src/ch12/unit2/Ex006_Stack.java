package ch12.unit2;

import java.util.Stack;

/*
  - Stack
  	: Vector의 하위 클래스 -> 벡터가 제공하는 메소드를 사용하지 않음
  	: LIFO 구조 : 가장 나중에 입력한 데이터를 가장 처음 가져옴
 */

public class Ex006_Stack {
	public static void main(String[] args) {
		Stack<String> st = new Stack<>();
		st.push("A"); // 스택에 추가. add 사용 안 함
		st.push("B"); 
		st.push("C"); 
		st.push("D"); 

		// peek(): Stack top 위치의 요소를 반환하고 삭제하지 않음(데이터를 삭제하지 않아 꺼낸 데이터가 잔존해 무한루프 빠지게 됨)
		while(! st.empty()) { // Stack의 데이터가 존재하면
			String s = st.pop(); // Stack top 위치의 요소를 반환하고 삭제
			System.out.print(s + " ");
	
		
		}
	
	}
}
