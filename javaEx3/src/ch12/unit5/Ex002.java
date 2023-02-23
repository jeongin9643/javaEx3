package ch12.unit5;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ex002 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("자바", 80);
		map.put("오라클", 90);
		map.put("빅데이터", 100);
		map.put("서블릿", 700);
		map.put("스프링", 80);

		System.out.println("map...");
		System.out.println(map);

		// 키를 Set으로
		Set<String> set = map.keySet();
		System.out.println("\n키를 Set으로...");
		System.out.println(set);

		// map의 값을 List로...
		List<Integer> list = new LinkedList<>(map.values());
		System.out.println("\n값을 List로...");
		System.out.println(list);

		// 값을 Collection으로
		Collection<Integer> col = map.values();
		for (Integer i : col) {
			System.out.println(i + "  ");
		}
		System.out.println();

		System.out.println("최대값 : " + Collections.max(col));
		System.out.println("최소값 : " + Collections.min(col));

	}

}
