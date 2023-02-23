package ch12.address;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public class AddressUI {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private Address addr = new AddressImpl();
	private DateUtil util = new DateUtil();

	public void menu() {
		int ch;

		while (true) {
			try {
				do {
					System.out.print("1.등록 2.수정 3.삭제 4.전화번호검색 5.이름검색 6.전체리스트 7.종료 => ");
					ch = Integer.parseInt(br.readLine());
				} while (ch < 1 || ch > 7);

				if (ch == 7) {
					System.exit(0);
				}

				switch (ch) {
				case 1:
					insert();
					break;
				case 2:
					update();
					break;
				case 3:
					delete();
					break;
				case 4:
					findetByTel();
					break;
				case 5:
					findByName();
					break;
				case 6:
					printAll();
					break;
				}

			} catch (Exception e) {
			}
		}
	}

	public void insert() {
		System.out.println("\n[등록]...");
		AddressVO vo = new AddressVO();

		try {
			System.out.print("전화번호 ? ");
			String tel = br.readLine();

			System.out.print("이름 ? ");
			vo.setName(br.readLine());

			System.out.print("생년월일 ? ");
			vo.setBirth(br.readLine());// 엔터를 치면 엔터를 뺸 나머지만 저장됨.
			if (vo.getBirth().length() != 0 && !util.isValidDate(vo.getBirth())) {
				System.out.println("날짜 형식 입력 오류입니다. \n");
				return;
			}

			System.out.print("주소? ");
			vo.setAddr(br.readLine());

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			vo.setRegisterDate(sdf.format(new Date()));

			addr.insertAddress(tel, vo);
			System.out.println("등록이 완료 되었습니다.");

		} catch (DuplicationException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void update() {
		System.out.println("\n[수정]...");

		try {
			String key;
			System.out.print("수정할 전화번호 ? ");
			key = br.readLine();

			AddressVO vo = addr.readAddress(key);
			if (vo == null) {
				System.out.println("등록된 자료가 아닙니다.");
				return;
			}

			String tel, name, a, birth;
			System.out.print("새로운 전화번호 ? ");
			tel = br.readLine();

			// 기존 전화번호인 key와 전화번호가 같지 않을때
			if (!key.equals(tel)) {
				if (addr.readAddress(tel) != null) { // 등록된 자료일 경우
					System.out.println("등록된 자료입니다.");
					return;
				}
				// 키를 수정하는 방법은 기존 데이터를 삭제 후 다시 등록
				addr.deleteAddress(key);
				addr.insertAddress(tel, vo);

			}
			System.out.println("이름 ? ");
			name = br.readLine();

			System.out.println("생일");
			birth = br.readLine();
			if (birth.length() != 0 && !util.isValidDate(birth)) {
				System.out.println("생년월일을 정확히 입력하세요\n");
				return;
			}

			System.out.println("주소");
			a = br.readLine();

			vo.setName(name);
			vo.setAddr(a);
			vo.setBirth(birth);

			System.out.println("수정 완료했습니다.");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
	}

	public void delete() {
		System.out.println("\n[삭제]...");
		try {
			String tel;
			System.out.print("삭제할 전화 번호 ? ");
			tel = br.readLine();
			/*
			 * boolean b = addr.deleteAddress(tel); if(b) { System.out.println(tel +
			 * " 번호 자료가 삭제되었습니다.\n"); }else {
			 * System.out.println(tel+" 번호는 등록된 자료가 아닙니다.\n"); }
			 */

			if (addr.deleteAddress(tel)) {
				System.out.println("삭제했습니다.");
			} else {
				System.out.println("등록된 자료가 아닙니다.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
	}

	public void findetByTel() {
		System.out.println("\n[전화번호 검색]...");
		try {
			String tel;
			System.out.print("검색할 전화번호 ? ");
			tel = br.readLine();
			AddressVO vo = addr.readAddress(tel);
			if (vo == null) {
				System.out.println("등록된 자료가 아닙니다.");
				return;
			}
			System.out.print(vo.getName() + "\t");
			System.out.print(tel + "\t");
			System.out.print(vo.getBirth() + "\t");
			System.out.print(vo.getAddr() + "\t");
			System.out.print(vo.getRegisterDate() + "\t");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
	}

	public void findByName() {
		System.out.println("\n[이름 검색]...");

		try {
			System.out.print("검색할 이름? ");
			String name = br.readLine();

			Map<String, AddressVO> map = addr.listAddress(name);
			for (String key : map.keySet()) { // key == 전화번호
				AddressVO vo = map.get(key);
				System.out.print(vo.getName() + "\t");
				System.out.print(key + "\t");
				System.out.print(vo.getBirth() + "\t");
				System.out.print(vo.getAddr() + "\t");
				System.out.print(vo.getRegisterDate() + "\t");
			}
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void printAll() {
		System.out.println("\n[전체 리스트 출력]");

		Map<String, AddressVO> map = addr.listAddress();
		System.out.println("이름\t전화번호\t생년월일\t주소\t등록일");
		System.out.println("------------------------------------------------------");
		int n = 1;
		for (String key : map.keySet()) { // key == 전화번호
			AddressVO vo = map.get(key);
			System.out.print((n++) + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(key + "\t");
			System.out.print(vo.getBirth() + "\t");
			System.out.print(vo.getAddr() + "\t");
			System.out.print(vo.getRegisterDate() + "\t");
		}
		System.out.println();
	}

}
