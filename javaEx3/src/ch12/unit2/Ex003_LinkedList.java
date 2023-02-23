package ch12.unit2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
  - ArrayList
  	: List 인터페이스 구현 클래스, 동기화 되지 않음
 	: 검색시 속도가 빠름
 	
  - LinkedList
  	: 대량의 데이터로 가지고 빈번하게 앞뒤 작업하는 경우만 사용
  	: List 인터페이스 구현 클래스, 동기화 되지 않음
 	: 검색시 속도가 느림(주소를 통해 데이터 찾아가기 때문)
 	: 앞에서 추가하고 뒤에서 삭제하는 작업이 빈번한 경우 빠름
 	: 앞, 뒤 아무데서는 추가 삭제가 빈번한 경우 빠름 
 	: 중간에서 삽입, 삭제가 현저하면 속도가 현저히 떨어짐 -> 데이터 주소까지 가지고 있어서 비교하기 때문에 속도가 떨어짐
 */

public class Ex003_LinkedList {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("자바");
		list1.add("오라클");
		list1.add("스프링");
		System.out.println("ArrayList...");
		print(list1);

		List<String> list2 = new LinkedList<>();
		list2.add("CSS");
		list2.add("HTML5");
		list2.add("javascript");
		System.out.println("LinkedList...");
		print(list2);
	}
	
	public static void print(List<String>list) {
		for(String s : list) {
			System.out.print(s+ " ");
		}
		System.out.println();
	}
	
}
