package ch12.unit5;

import java.util.Map;
import java.util.TreeMap;

public class Ex003 {

	public static void main(String[] args) {
		// 키 순서로 정렬
		// 키는 반드시 Comparable 인터페이스가 구현되어 있어야 함
		Map<String, Integer> map = new TreeMap<>();
		map.put("자바", 80);
		map.put("오라클", 90);
		map.put("빅데이터", 100);
		map.put("서블릿", 700);
		map.put("스프링", 80);
		System.out.println(map); // {빅데이터=100, 서블릿=700, 스프링=80, 오라클=90, 자바=80}

		
	}

}
