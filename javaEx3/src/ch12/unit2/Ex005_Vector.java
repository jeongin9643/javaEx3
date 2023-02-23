package ch12.unit2;

import java.util.Vector;
// Vector: 멀티스레드 환경에서 동시성 문제가 있을 때 사용

public class Ex005_Vector {
	public static void main(String[] args) {
		
		// 동기화 지원
		// List<String> list = new Vector<>();
		Vector<String> list = new Vector<>();
		
		System.out.println("초기 용량: "+ list.capacity()); // 10. 10개의 데이터를 추가할 수 있고 부족하면 늘어남
		
		list.add("a1");
		list.add("a2");
		list.add("a3");
		list.add("a4");
		list.add("a5");
		list.add("a6");
		list.add("a7");
		list.add("a8");
		list.add("a9");
		list.add("a10");
		list.add("a11");
		list.add("a12");
		list.add("a13");
		
		System.out.println("개수: "+ list.size()); // 13
		System.out.println("용량: "+ list.capacity()); // 20
		
		list.add(0,"자바");
		System.out.println(list);
		
		System.out.println("처음 : "+ list.get(0));
		System.out.println("처음 : "+ list.firstElement()); // Vector에만 존재
		
		System.out.println("마지막 : "+ list.get(list.size()-1));
		System.out.println("마지막 : "+ list.lastElement()); // Vector에만 존재

		for(String s: list) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		list.remove(3);
		list.remove("a7");
		System.out.println(list.size());
		System.out.println(list.capacity()); // 20
		
		list.trimToSize(); // Vector에만 존재. 벡터의 용량을 벡터의 데이터 개수로 조정(공백을 없앰)
		System.out.println(list.capacity()); // 12
	
	}
	
}
