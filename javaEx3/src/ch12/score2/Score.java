package ch12.score2;

import java.util.List;
// 예외는 오버라이드 할 때 뺄 수는 있어도 추가는 불가능
public interface Score {
	public void insertScore(ScoreVO vo) throws MyDuplicationException; // 등록
	public List<ScoreVO> listScore();	// 전체리스트
	public ScoreVO readScore(String hak); // 학번검색
	public boolean deleteScore(String hak);	// 삭제
	public List<ScoreVO> listScore(String name);  // 이름검색
}
