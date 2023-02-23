package ch12.unit5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
  - Map
  	: 키, 값 구조
  	: 키는 중복을 허용하지 않음
  	: 키는 순서가 없음
  	: 반복자가 없음. 향상된 for문 사용 불가
  	
  - 구현클래스
  	HashMap	: 동기화 지원 안 됨
  	HashTable : 동기화 지원
  	LinkedHashMap : 키가 등록 순서유지
  	TreeMap	: 키 순서로 정렬. 키는 Comparable 인터페이스가 구현되어 있어야 함
 */
public class Ex001 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

		// map에 값 저장
		map.put("서울", 1000); // 키, 값
		map.put("부산", 350);
		map.put("대구", 250);
		map.put("인천", 330);
		map.put("광주", 150);
		map.put("대전", 150);
		map.put("서울", 950); // 키가 같으면 값을 덮어씀
		System.out.println(map);

		// map에서 데이터 가져오기
		int a = map.get("서울");
		System.out.println(a);

		// a = map.get("세종"); // 런타임 오류 null은 int에 담지 못함
		Integer n = map.get("세종"); // null을 Integer에 담을 수 있음
		System.out.println(n); // null. 없으면.

		// Map에는 반복자(Iterator)가 없음.(처음부터 끝까지 못 돌게 됨) 향상된 for문도 사용 불가.
		
		// Set<String> set = map.keySet(); 에서 키에 대한 Set 객체를 반환 받아
		// 처음부터 끝까지 순회 가능
		Set<String> set = map.keySet(); // 키에 대한 Set 객체
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String s = it.next(); // 키
			int v = map.get(s); // 값
			
			System.out.println(s + " : " + v);
		}
		System.out.println();
		
		for(String key : map.keySet()) {
			int value = map.get(key);  // 키를 가져서 데이터 돌림
			System.out.println(key + " : "+ value);
		}
		System.out.println();
		
		System.out.println("키에 서울이 있나요 ? " + map.containsKey("서울"));
		System.out.println("키에 경기가 있나요 ? " + map.containsKey("경기"));
		System.out.println("값에 330이 있나요 ?"+ map.containsValue(330));
		
		// 인천 삭제
		map.remove("인천"); // 키가 인천인 객체 삭제. 삭제 후 삭제된 객체 반환
		System.out.println(map);
		
		System.out.println("전체 개수 : " +map.size());
		
		map.clear(); // 모두 지우기
		System.out.println("전체 개수 : " +map.size());
	}

}
