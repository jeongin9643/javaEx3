package ch12.unit6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex002 {
	public static void main(String[] args) {
		List<User2> list = new ArrayList<>();
		
		list.add(new User2("다자바", "010-1", 20));
		list.add(new User2("너자바", "010-2", 21));
		list.add(new User2("홍자바", "010-3", 20));
		list.add(new User2("더자바", "010-4", 22));
		list.add(new User2("김자바", "010-5", 19));

		System.out.println("정렬 전 ....");
		print(list);
		
		Collections.sort(list); // 정렬의 기준점이 없어 컴오류

		System.out.println("정렬 후 ....");
		print(list);
	}
	
	public static void print(List<User2>list) {
		for(User2 vo : list) {
			System.out.print(vo.getName()+"\t");
			System.out.print(vo.getTel()+"\t");
			System.out.println(vo.getName());
		}
		System.out.println();
	}
}
class User2 implements Comparable<User2>{ // 정렬 기준을 위해 Comparable 구현
	private String name;
	private String tel;
	private int age;

	public User2() {
	}
	
	public User2(String name, String tel, int age) {
		this.name = name;
		this.tel = tel;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(User2 o) { // compareTo(): Comparable 인터페이스의 메소드
		//return name.compareTo(o.getName()); // 이름 오름차순, compareTo(): String 메소드. name: o1것, o.getName(): o2것
		// return -name.compareTo(o.getName()); // 이름 내림차순
		// return age - o.getAge(); // 나이 오름차
		return -(age - o.getAge()); // 나이 내림차
	
	}
}