package ch12.score;

import java.util.ArrayList;
import java.util.List;

public class ScoreImpl implements Score { // Score  상위, ScoreImpl 하위. 업캐스팅  ScoreImpl이 Score을 구현함. 
	// 학생의 정보를 저장할 List 인터페이스 구현 클래스의 객체. List 안에 데이터가 쌓이게 됨
	private List<ScoreVO> list = new ArrayList<>(); // ScoreVO클래스인 객체만 List에 담길 수 있음. 
	
	@Override
	public void insertScore(ScoreVO vo) {
		// List 객체의 마지막에 요소를 추가
		list.add(vo);
	}

	@Override
	public List<ScoreVO> listScore() {
		return list; // list의 주소를 돌려줌
	}

	@Override
	public ScoreVO readScore(String hak) { // 학번 검색
		for(ScoreVO vo : list) {
			if(vo.getHak().equals(hak)) {
				return vo; // 해당 list가 vo 주소 학번의 주소가 같다면 주소값 리턴.
			}
		}
		return null;
	}

	@Override
	public boolean deleteScore(String hak) { // 데이터 지우기
		ScoreVO vo = readScore(hak); // vo의 주소가 readScore(hak)에 대입
		
		if(vo == null) { // 주소가 null이면 false
			return false;
		}
		
		// 요소 삭제
		list.remove(vo);  
		
		return true;
	}

	@Override
	public List<ScoreVO> listScore(String name) { // 이름 검색
		List<ScoreVO> finds = new ArrayList<>(); // 새로운 arrayList 객체를 만들어 리턴
		
		for(ScoreVO vo : list) { // ScoreVO의 주소와 list를 돌렸을 때 
			if(vo.getName().indexOf(name)>=0){ // 만약 주소의 
				finds.add(vo);
			}
		}
		return finds;
		
	}

}
