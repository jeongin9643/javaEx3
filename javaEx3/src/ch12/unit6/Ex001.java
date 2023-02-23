package ch12.unit6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex001 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("서울");
		list.add("부산");
		list.add("대구");
		list.add("광주");
		list.add("대전");
		list.add("울산");
		list.add("세종");
		System.out.println(list); // [서울, 부산, 대구, 광주, 대전, 울산, 세종]

		int idx;
		String s;
		// 순차검색
		idx = list.indexOf("울산");// 없으면 -1
		System.out.println(idx); //5
		
		// Collections : 컬렉션과 관련된 유용한 매소드를 제공
		// 정렬 : Comparable 인터페이스가 구현된 클래스만 가능
		Collections.sort(list);
		System.out.println(list); // [광주, 대구, 대전, 부산, 서울, 세종, 울산]

		// 이분검색 : 검색 속도가 빠르고 정렬되어 있어야 가능
		s = "서울";
		idx =Collections.binarySearch(list, s); // 없으면 -1
		System.out.println(s + "위치 : "+ idx); // 서울위치 : 4
		
		// 역순 정렬
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list); // [울산, 세종, 서울, 부산, 대전, 대구, 광주]

		
		
	}
}
