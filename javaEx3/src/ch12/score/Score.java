package ch12.score;

import java.util.List;

public interface Score { // Score 인터페이스 리모컨 버튼
	public void insertScore(ScoreVO vo); // 등록
	public List<ScoreVO> listScore(); // 전체리스트
	public ScoreVO readScore(String hak);  // 학번검색
	public boolean deleteScore(String hak); // 삭제
	public List<ScoreVO> listScore(String name); // 이름검색
	
 }
