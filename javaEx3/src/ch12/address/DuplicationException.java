package ch12.address;

public class DuplicationException extends Exception {
	private static final long serialVersionUID = 1L;
		// 중복된 전화번호가 없도록 예외 처리
	public DuplicationException(String msg) {
		super(msg);
	}
}
