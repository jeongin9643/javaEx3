package ch12.unit2;

import java.util.List;

public class Ex004_immutable {
	public static void main(String[] args) {
		// JDK 9부터 가능. 불변
		List<String> list = List.of("A", "B", "C");
		System.out.println(list);
		
		// list.add("D"); // 런타임 오류
		list.set(0, "a"); // 런타임 오류
		
	}
}
