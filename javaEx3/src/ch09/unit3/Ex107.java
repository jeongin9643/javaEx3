package ch09.unit3;

public class Ex107 {
	public static void main(String[] args) {
		User17 ob = new User17();
		
		try {
			// ob.setName("김");
			// ob.setName("김김");
			// ob.setAge(15);
			
			ob.set("김자바", -15);
			
			System.out.println(ob.getName()+","+ ob.getAge());
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}

class User17{
	private String name;
	private int age;
	
	public void set(String name, int age) throws Exception {
		try {
			setName(name);
			setAge(age);
		} catch (Exception e) {
			// System.out.println(e.toString());
			// 나이에 음수를 입력했을 때 예외를 발생시키는 2가지 방법
			throw e; // 1) 기존 예외를 다시 던짐(다시 일으킴)
			// throw new Exception("메시지"); // 2)새로운 예외를 던짐
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) throws Exception {
		if(! name.matches("^[가-힣]{2,5}$")) {
			throw new Exception("이름은 2~5 사이의 한글만 가능합니다.");
		}
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws Exception {
		if(age<0) {
			throw new Exception("나이는 0 이상만 가능합니다.");
		}
		this.age = age;
	}
	
	
}