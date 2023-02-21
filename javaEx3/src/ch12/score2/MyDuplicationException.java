package ch12.score2;

public class MyDuplicationException extends Exception { // 학번 중복 예외 처리
	private static final long serialVersionUID = 1L;
	
	public MyDuplicationException(String msg) {
		super(msg);
	}
}
