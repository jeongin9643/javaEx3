package ch12.address;

import java.util.LinkedHashMap;
import java.util.Map;

public class AddressImpl implements Address {
	// 등록 순서  유지
	private Map<String, AddressVO> map = new LinkedHashMap<>();
	
	
	@Override
	public void insertAddress(String tel, AddressVO vo)throws DuplicationException {
		if(map.containsKey(tel)) { // 기존 데이터를 덮어버리기 때문에 동일한 키(전화번호)가 있으면 처리하지 못하도록 throw  
			throw new DuplicationException("등록된 전화번호입니다.");
		}
		map.put(tel, vo); // map에 저장
	}

	@Override
	public AddressVO readAddress(String tel) { // 해당 전화번호 가져오기
		return map.get(tel);
	}

	@Override
	public Map<String, AddressVO> listAddress() {
		return map;
	}

	@Override
	public Map<String, AddressVO> listAddress(String name) { // 검색된 이름 데이터 다시 맵에 담음
		Map<String, AddressVO> finds = new LinkedHashMap<>();
		
		for(String tel : map.keySet()) {
			AddressVO vo = map.get(tel);
			if(vo.getName().indexOf(name) >=0	) {
				finds.put(tel, vo);
			}
		}
		return finds;
	}

	@Override
	public boolean deleteAddress(String tel) {
		// map.remove(tel) : 삭제된 객체를 반환
		return map.remove(tel) != null; 
		// map.remove로 키값이 있어야 지우는데 키값이 없으면 못 지움. 
		//못지우면 널값을 리턴하고 지웠으면 지워진 객체를 반환. 지운 객체가 널이 아니라는 말은 지워졌다는 것. 
		// 지웠는지, 안지워졌는지만 확인하면 돼서 true/false 반환
		// 실제 지우는 것이 아니라 null처리해서 gc가 지우도록 
	}

}
