package ch12.score2;

public class ScoreException extends Exception { // 점수입력 예외 처리
	private static final long serialVersionUID = 1L;
	
	public ScoreException(String msg) {
		super(msg);
	}
}
