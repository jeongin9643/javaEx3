package ch12.unit6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex003 {
	public static void main(String[] args) {
		List<UserVO> list = new ArrayList<>();
		list.add(new UserVO("오라클", "010-3", 22));
		list.add(new UserVO("마자바", "010-2", 21));
		list.add(new UserVO("더자바", "010-4", 23));
		list.add(new UserVO("구자바", "010-1", 24));
		list.add(new UserVO("강자바", "010-5", 21));

		System.out.println("정렬 전...");
		print(list);
		System.out.println();

		// Comparator : 정렬의 기준을 설정하는 인터페이스
		// 문자열 비교는 compareTo 사용.
		Comparator<UserVO> comp = new Comparator<UserVO>() {
			@Override
			public int compare(UserVO o1, UserVO o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};
		Collections.sort(list, comp); // comp: 기준점
		System.out.println("이름 오름차순 ... ");
		print(list);

		Comparator<UserVO> comp2 = new Comparator<UserVO>() {
			@Override
			public int compare(UserVO o1, UserVO o2) {
				return o1.getAge() - o2.getAge();
			}
		};
		Collections.sort(list, comp2); // comp2: 기준점
		System.out.println("나이 오름차순 ... ");
		print(list);

		Comparator<UserVO> comp3 = new Comparator<UserVO>() {
			@Override
			public int compare(UserVO o1, UserVO o2) {
				if(o1.getAge() == o2.getAge()) {
					return -o1.getName().compareTo(o2.getName());
				}else {
					return -(o1.getAge() - o2.getAge());
				}
			}
		};
		Collections.sort(list, comp3); // comp2: 기준점
		System.out.println("나이 내림차순. 단 나이가 같으면 이름 내림차 ... ");
		print(list);
		
	}

	public static void print(List<UserVO> list) {
		for (UserVO vo : list) {
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getTel() + "\t");
			System.out.println(vo.getAge() + "\t");
		}
		System.out.println();
	}
}

class UserVO {
	private String name;
	private String tel;
	private int age;

	public UserVO() {
	}

	public UserVO(String name, String tel, int age) {
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

}