package ch12.score;

import java.util.ArrayList;
import java.util.List;

public class ScoreImpl implements Score { // Score 상위, ScoreImpl 하위. 업캐스팅 ScoreImpl이 Score를 구현함.
	// 학생의 정보를 저장할 List 인터페이스 구현 클래스의 객체. List 안에 데이터가 쌓이게 됨
	private List<ScoreVO> list = new ArrayList<>(); // ScoreVO타입의 객체만 담을 수 있는 ArrayList 생성

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
		for (ScoreVO vo : list) { // list를 돌려 ScoreVO 타입의 vo 주소에 저장
			if (vo.getHak().equals(hak)) {
				return vo; // 해당 vo주소 값의 학번과 검색한 학번과 같다면 주소값 리턴.
			}
		}
		return null;
	}

	@Override
	public boolean deleteScore(String hak) { // 데이터 지우기
		ScoreVO vo = readScore(hak); // vo의 주소에 readScore의 학번 주소값 넣기

		if (vo == null) { // 주소가 null일 경우 false. 데이터 지울 수 없음
			return false;
		}

		// 맞다면 요소 삭제
		list.remove(vo);

		return true;
	}

	@Override
	public List<ScoreVO> listScore(String name) { // 이름 검색
		List<ScoreVO> finds = new ArrayList<>(); // ScoreVO타입의 객체만 담을 수 있는 finds라는 ArrayList 생성

		for (ScoreVO vo : list) { // list를 돌려 ScoreVO 타입의 vo 주소에 저장
			if (vo.getName().indexOf(name) >= 0) { // vo에서 가져온 이름이 해당 인덱스에 존재하면
				finds.add(vo); // finds에 vo값 추가
			}
		}
		return finds; // finds 값 리턴

	}

}
