package ch12.unit3;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Ex001 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("자바");
		list.add("오라클");
		list.add("스프링");
		list.add("javascript");
		list.add("css3");
		list.add("html5");

		System.out.println("전체-1");
		for(String s : list) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		System.out.println("\n전체-2");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s + " ");
		}
		System.out.println();
		
		System.out.println("\n전체-3");
		ListIterator<String> it2 = list.listIterator(); // 역순도 가능
		while(it2.hasNext()) { //it2가 존재하면 
			String s = it2.next();
			System.out.print(s + " ");
		}
		System.out.println();
		
		System.out.println("\n역순");
		while(it2.hasPrevious()) { // 위에서 it2는 가장 뒤에 가 있음
			String s= it2.previous();
			System.out.println(s+ " ");
		}
		System.out.println();
		
		Vector<String> vv = new Vector<>();
		vv.add("서울");
		vv.add("인천");
		vv.add("경기");
		
		System.out.println("\n전체-3");
		Enumeration<String> e = vv.elements();
		while(e.hasMoreElements()) {
			String s = e.nextElement();
			System.out.println(s+ " ");
		}
		System.out.println();
		
		System.out.println("\n전체-4");
		for(String s :vv) {
			System.out.println(s + " ");
		}
		System.out.println();
		
	}
}
