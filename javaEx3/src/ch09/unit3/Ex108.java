package ch09.unit3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex108 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		User18 user = new User18();

		try {
			System.out.print("이름 ?");
			user.setName(br.readLine());

			System.out.print("나이 ?");
			user.setAge(Integer.parseInt(br.readLine()));

			System.out.println(user.getName() + "," + user.getAge());
			
		} catch (NumberFormatException e) { // unchecked exception
			System.out.println("나이는 숫자만 가능합니다.");
		} catch (NameValidException e) {
			System.out.println("이름은 2~5자 이내의 한글만 가능합니다.");
		} catch (AgeValidException e) {
			System.out.println("나이는 0 이상만 가능합니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("end...");
	}
}

// 사용자 정의 예외 클래스 작성 : checked exception. Exception만 상속 받으면 됨.
// 메시지를 주고 싶을 때 생성자를 만들어서 변경하면 됨
class NameValidException extends Exception {
	// 객체를 주고 받을 때 해당 객체가 맞는지 확인하기 위한 특정한 목적으로 사용. serialVersionUID가 없으면 경고가 뜨는 클래사가
	// 있음.
	private static final long serialVersionUID = 1L;

	public NameValidException(String msg) { // 생성자
		super(msg);
	}
}

class AgeValidException extends Exception {
	// 객체를 주고 받을 때 해당 객체가 맞는지 확인하기 위한 특정한 목적으로 사용. serialVersionUID가 없으면 경고가 뜨는 클래사가
	// 있음.
	private static final long serialVersionUID = 1L;

	public AgeValidException(String msg) { // 생성자
		super(msg);
	}
}

class User18 {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) throws NameValidException {
		if (!name.matches("^[가-힣]{2,5}$")) {
			throw new NameValidException("이름은 2~5 사이의 한글만 가능합니다.");
		}
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws AgeValidException {
		if (age < 0) {
			throw new AgeValidException("나이는 0 이상만 가능합니다.");
		}
		this.age = age;
	}

}