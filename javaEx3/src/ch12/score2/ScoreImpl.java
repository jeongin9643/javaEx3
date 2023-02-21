package ch12.score2;

import java.util.ArrayList;
import java.util.List;

public class ScoreImpl implements Score {
	// 학생의 정보를 저장할 List 인터페이스 구현 클래스의 객체
	private List<ScoreVO> list = new ArrayList<>();
	
	@Override // 고친 부분.  예외처리. null이 아니면 데이터가 있으므로 등록된 학번. 중복 학번 방지.
	public void insertScore(ScoreVO vo) throws MyDuplicationException {
		if(readScore(vo.getHak()) != null) {
			throw new MyDuplicationException("등록된 학번입니다.");
		}
		// List 객체의 마지막에 요소를 추가
		list.add(vo);
	}

	@Override
	public List<ScoreVO> listScore() {
		return list;
	}

	@Override
	public ScoreVO readScore(String hak) {
		for(ScoreVO vo : list) {
			if(vo.getHak().equals(hak)) {
				return vo;
			}
		}
		
		return null;
	}

	@Override
	public boolean deleteScore(String hak) {
		ScoreVO vo = readScore(hak);
		
		if(vo == null) {
			return false;
		}
		
		// 요소 삭제
		list.remove(vo);
		
		return true;
	}

	@Override
	public List<ScoreVO> listScore(String name) {
		List<ScoreVO> finds = new ArrayList<>();
		
		for(ScoreVO vo : list) {
			if(vo.getName().indexOf(name) >= 0) {
				finds.add(vo);
			}
		}
		
		return finds;
	}

}
