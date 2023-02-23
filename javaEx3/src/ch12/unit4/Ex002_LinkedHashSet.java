package ch12.unit4;

import java.util.LinkedHashSet;
import java.util.Set;

/*
  - Set
  	: 순서를 유지하지 않는 데이터의 집합
  	: 중복을 허용하지 않음
  	: 하나의 null만 저장 가능

  - 구현클래스
    HashSet
    : 요소의 저장 순서가 유지 되지 않음
    : 멀티 스레드 환경에서 안전하지 않음
    
  	LinkedHashSet
  	: 요소의 저장 순서가 유지
  	: HashSet 하위 클래스
  	
  	TreeSet
  	: SortedSet 인터페이스를 구현한 클래스
  	: 정렬된 순서에 의해 반복
  	: Comparable 인터페이스를 구현한 클래스만 추가 가능
    : 멀티 스레드 환경에서 안전하지 않음
 */
public class Ex002_LinkedHashSet {
	public static void main(String[] args) {
		// 등록 순서 유지
		Set<String> set = new LinkedHashSet<>(); 
		set.add("서울");
		set.add("부산");
		set.add("대구");
		set.add("인천");
		set.add("광주");
		set.add("대전");
		set.add("울산");
		set.add("세종"); 
		set.add("서울"); // 무시
		
		for(String s : set) {
			System.out.print(s + " "); 
		}
		System.out.println();
		
	}
}
