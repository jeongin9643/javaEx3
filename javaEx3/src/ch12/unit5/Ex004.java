package ch12.unit5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex004 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("자바", 80);
		map.put("오라클", 90);
		map.put("빅데이터", 100);
		map.put("서블릿", 700);
		map.put("스프링", 80);

		// Map : key + value 
		// Map.Entry : 앱의 엔트리(키와 값의 한쌍)
		Set<Map.Entry<String, Integer>> set1 = map.entrySet();
		Iterator<Map.Entry<String, Integer>> it1 = set1.iterator();
		while(it1.hasNext()) {
			Map.Entry<String, Integer> e = it1.next();
			System.out.println("과목: "+ e.getKey()+", 점수: "+ e.getValue());
		}
	}
}
