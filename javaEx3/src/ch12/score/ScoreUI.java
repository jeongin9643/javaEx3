package ch12.score;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class ScoreUI {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private Score score = new ScoreImpl();  // 업캐스팅. (score로 ScoreImpl 참조 가능-score에 정의된 추상 메소드만 가능 )
	
	public void menu() {
		int ch;
		
		while(true) {
			try {
				do {
					System.out.print("1.등록 2.수정 3.삭제 4.리스트 5.학번검색 6.이름검색 7.종료 => ");
					ch = Integer.parseInt(br.readLine());
				}while(ch<1 || ch>7);
				
				if(ch ==7) {
					return;
				}
				
				switch(ch) {
				case 1 : insert(); break;
				case 2 : update(); break;
				case 3 : delete(); break;
				case 4 : printAll(); break;
				case 5 : findByHak(); break;
				case 6 : findByName(); break;
				}
				
			} catch (Exception e) {
				// e.printStackTrace();
			}
		}
	}
	
	protected void insert() {
		System.out.println("\n 데이터 등록...");
		try {
			ScoreVO vo = new ScoreVO(); // ScoreVO 객체 생성 후 데이터 입력. 한 사람당 새로운 객체 생성
			
			System.out.print("학번 ? ");
			vo.setHak(br.readLine());
			
			System.out.print("이름 ? ");
			vo.setName(br.readLine());
			
			System.out.print( "국어 ? ");
			vo.setKor(Integer.parseInt(br.readLine()));
			
			
			System.out.print( "영어 ? ");
			vo.setEng(Integer.parseInt(br.readLine()));
			
			
			System.out.print( "수학 ? ");
			vo.setMat(Integer.parseInt(br.readLine()));
			
			score.insertScore(vo); // 데이터 등록
			
			System.out.println("데이터 등록이 완료 되었습니다. \n");
			
		} catch (NumberFormatException e) {
			System.out.println("점수는 숫자만 가능합니다.");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	protected void update() {
		System.out.println("\n 데이터 수정...");
		String hak; // 이름은 중복될 수 있으니 고유번호인 학번으로 처리
		
		try {
			System.out.println("수정할 학번 ? ");
			hak = br.readLine();
			
			ScoreVO vo = score.readScore(hak); // 해당 학번이 있는 곳의 주소를 찾음
			if(vo == null) { // 학번이 있는 주소가 null일 경우
				System.out.println(hak + "학번은 등록된 학번이 아닙니다.\n");
				return;
			}
			// 주소에 학번이 있는 경우 내용 수정
			System.out.print("이름 ? ");
			vo.setName(br.readLine());
			
			System.out.print( "국어 ? ");
			vo.setKor(Integer.parseInt(br.readLine()));
			
			
			System.out.print( "영어 ? ");
			vo.setEng(Integer.parseInt(br.readLine()));
			
			
			System.out.print( "수학 ? ");
			vo.setMat(Integer.parseInt(br.readLine()));
			
			System.out.println("데이터가 수정되었습니다. \n");
			
		}catch (NumberFormatException e) {
			System.out.println("점수는 숫자만 가능합니다.");
		}
		catch (Exception e) {
		}
	}
	
	protected void delete() {
		System.out.println("\n 데이터 삭제...");
		String hak; 
		
		try {
			System.out.print("삭제할 학번?");
			hak = br.readLine();
			
			boolean b = score.deleteScore(hak);
			if(b) {
				System.out.println(hak + " 학번 자료가 삭제 되었습니다.\n ");
			}else {
				System.out.println(hak + " 학번은 등록된 학번이 아닙니다.\n ");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	protected void printAll() {
		System.out.println("\n 전체 리스트...");
		
		List<ScoreVO> list = score.listScore();
		int tot;
		
		for(ScoreVO vo : list) { //  list 배열을 ScoreVO 타입의 vo변수에 담아 돌려 저장
			tot = vo.getKor() + vo.getEng() + vo.getMat();
			
			System.out.print(vo.getHak()+"\t");
			System.out.print(vo.getName()+"\t");
			System.out.print(vo.getKor()+"\t");
			System.out.print(vo.getEng()+"\t");
			System.out.print(vo.getMat()+"\t");
			System.out.print(tot+ "\t");
			System.out.println((tot/3));
		}
		System.out.println();
		
	}
	
	protected void findByHak() {
		System.out.println("\n 학번 검색...");
		String hak;
		
		try {
			System.out.print("검색할 학번 ? ");
			hak = br.readLine();
			
			ScoreVO vo = score.readScore(hak);// 해당 학번이 있는 곳의 주소를 찾음
			if(vo == null) { // 해당 학번이 없는 경우
				System.out.println(hak + "학번은 등록된 학번이 아닙니다.\n");
				return;
			}// 학번이 있는 경우 정보 출력
			System.out.print(vo.getHak()+"\t");
			System.out.print(vo.getName()+"\t");
			System.out.print(vo.getKor()+"\t");
			System.out.print(vo.getEng()+"\t");
			System.out.print(vo.getMat());
			System.out.println();
		} 
		catch (Exception e) {
		}
	}
	
	
	protected void findByName() {
		System.out.println("\n 이름 검색...");
		String name;
	
		try {
			System.out.println("검색할 이름 ?");
			name = br.readLine();
			
			List<ScoreVO> list = score.listScore(name); // list에 해당 이름이 있는 곳의 주소 찾기
			if(list.size() == 0) { // 해당 이름이 없으면
				System.out.println("등록된 이름이 없습니다.\n");
				return;
			}
			// 해당 이름이 있으면
			for(ScoreVO vo : list) {// list를 돌려 ScoreVO 타입의 vo 주소에 저장
				System.out.print(vo.getHak()+"\t");
				System.out.print(vo.getName()+"\t");
				System.out.print(vo.getKor()+"\t");
				System.out.print(vo.getEng()+"\t");
				System.out.print(vo.getMat());
			}
			System.out.println();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
