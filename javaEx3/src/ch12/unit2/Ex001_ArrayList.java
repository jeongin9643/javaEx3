package ch12.unit2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
  	- List 인터페이스
  	: 순서가 있다.
  	: 배열과 유사한 구조
  	: 가변 길이(용량이 부족하면 자동으로 공간이 늘어남)
  	: 중복적인 데이터도 추가 가능
  	: 처음, 중간에 추가 삭제도 가능
  	: 주요 구현 클래스 - ArrayList, Vector, LinkedList, Stack 등
  	: 동기화 지원 - Vector : 다중 스레드 환경에서 안전
  	: 동기화 지원하지 않음 - ArrayList, LinkedList : 다중 스레드 환경에서 안전하지 않음. 빠름
 */


public class Ex001_ArrayList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		String s;
		
		list.add("서울"); // 마지막에 요소를 추가
		list.add("부산");
		list.add("인천");
		list.add("서울"); // 중복 데이터 추가 가능
		list.add("광주");
		list.add("대전");
		
		System.out.println(list);
		
		// 2인덱스에 데이터를 추가 
		list.add(2, "대구");
		System.out.println(list);
		
		// 데이터 개수 
		System.out.println(list.size());
		
		// 처음 데이터 반환
		s = list.get(0);
		System.out.println(s);
		
		// 두번째 데이터 반환
		s = list.get(1);
		System.out.println(s);
		
		// 마지막 데이터 반환
		s = list.get(list.size()-1);
		System.out.println(s);
		
		// 처음에 한국을 추가
		list.add(0, "한국");
		System.out.println(list);
		
		// 처음의 데이터를 대한민국으로 수정
		list.set(0, "대한민국"	);
		System.out.println(list);
		
		int idx; 
		// 인천의 인덱스 ? 
		idx = list.indexOf("인천");
		System.out.println("인천 위치 : " + idx);
		
		// 세종의 인덱스 ?  없으면 -1 
		idx = list.indexOf("세종");
		System.out.println("세종 위치 : " + idx);
		
		idx = list.indexOf("서울");
		System.out.println("서울 위치 : " + idx);
		
		idx = list.lastIndexOf("서울");
		System.out.println("서울 위치 : " + idx);
		
		// 부산이 있나요?
		System.out.println("부산 있나요? "+ list.contains("부산"));
		
		// 대한민국 삭제
		//list.remove(0);
		list.remove("대한민국");
		System.out.println(list);
		System.out.println();
		
		System.out.println("전체 출력 -1");
		for(String str : list) {
			System.out.print(str + " ");
		}
		System.out.println();

		System.out.println("전체 출력 -2");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		
		System.out.println("전체 출력 -3");
		// 반복자: 해당 객체를 순회하며 처음부터 끝까지 돌리는 것.
		Iterator<String> it = list.iterator();  // 순방향만 검색 가능
		while(it.hasNext()) { // hasNext : 데이터가 있으면 아래로 넘겨주고 없으면 나감
			String a = it.next();
			System.out.println(a + " ");
		}
		System.out.println();

		System.out.println("역순 출력 - 1");
		for(int i = list.size()-1; i >=0; i--) {
			System.out.println(list.get(i)+ " ");
		}
		System.out.println();
		
		System.out.println("역순 출력 - 2");
		// ListIterator : 순방향과 역방향 모두 이동 가능
		// 반복자의 위치를 가장 뒤로 이동
		ListIterator<String> it2 = list.listIterator(list.size());
		while(it2.hasPrevious()) {
			String a = it2.previous();
			System.out.println(a + " ");
		}
		System.out.println();
		
		// 모두 지우기
		list.clear();
		System.out.println(list.size());
		
	}
	
}
