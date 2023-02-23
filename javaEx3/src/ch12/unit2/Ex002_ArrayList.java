package ch12.unit2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex002_ArrayList {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>(); // List인터페이스(상위), ArrayList클래스(하위). -> 업캐스팅. 인터페이스는 생성 X, ArrayList가 자료형
		list1.add("서울");
		list1.add("부산");
		list1.add("대구");
		
		List<String> list2 = new ArrayList<>();
		list2.add("강원");
		list2.add("경기");
		list2.add("경상");
		
		// list2에 list1의 모든 데이터 추가
		// list2.add(); // 하나씩 추가
		list2.addAll(list1); // 전체 추가
		System.out.println(list2);
		
		// List<String> -> String[] : List를 String배열로 변경
		String[]ss = list2.toArray(new String[list2.size()]); // 생성자한테 배열의 크기인 size 넘겨줘야 하고 배열의 주소까지 넘겨줘야 함. ss에 배열의 주소가 들어감
		System.out.println("\n리스트를 배열로...");
		for(String s :ss) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		// String[] -> List<String> // String배열을 List로 변경
		List<String> list3 = Arrays.asList(ss);
		System.out.println("\n배열을 리스트로 : "+ list3);
		
		// 타입 확인
		System.out.println(list1.getClass().getName()); // ArrayList
		System.out.println(list3.getClass().getName()); // Arrays$ArrayList(중첩 클래스) -> Arrays 안의 ArrayList.
	
		// subList(a,b) = > a 인덱스에서 b-1인덱스까지의 부분 list
		List<String> list4 = list3.subList(1, 4);
		System.out.println(list4);
		
		list1.clear();
		System.out.println("전체 삭제 후 : "+list1.size());
	
		System.out.println("삭제 전 : "+ list2);
		list2.subList(1, 4).clear(); // 특정영역 삭제
			// list3( Arrays$ArrayList)은 런타임 오류 발생. -> 지원하지 않음
		System.out.println("삭제 후 : "+ list2);
		
		
	}
}
