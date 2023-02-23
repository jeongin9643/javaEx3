package bank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class AdminUI {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private Bank bank = new BankImpl();
	
	LoginUI lg = new LoginUI();

	public void login() {
		int adminPwd = 5365;
		int adminPwdch;
		int i = 0;

		try {
			do {
				if (i == 3) {
					System.out.println("암호 입력 오류");
					lg.menu();
				}

				System.out.print("은행원 암호 ? ");
				adminPwdch = Integer.parseInt(br.readLine());

				i++;

				if (adminPwd == adminPwdch)
					menu();

			} while (adminPwd != adminPwdch);

		} catch (NumberFormatException e) {
			System.out.println("암호는 숫자만 입력가능합니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void menu() {

		int ch;

		while (true) {
			try {
				do {
					System.out.print("1.계좌번호검색 2. 이름검색 3.전체리스트 4.로그아웃 => ");
					ch = Integer.parseInt(br.readLine());
				} while (ch < 1 || ch > 4);

				if (ch == 4) {
					lg.menu();
				}

				switch (ch) {
				case 1:
					findByaccount();
					break;
				case 2:
					findByname();
					break;
				case 3:
					printAll();
					break;
				}

			} catch (NumberFormatException e) {
				System.out.println("[1 - 4] 항목을 선택해 주세요.");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void findByaccount() {
		System.out.println("\n[계좌번호 검색]...");
		String accountNumber;
		
		try {
			System.out.print("검색할 계좌번호");
			accountNumber = br.readLine();
			
			Account a = bank.findByaccountNumber(accountNumber);
			if(a == null) {
				System.out.println("미등록 계좌입니다.");
				return;
			}
			System.out.print(a.getAccountVO().getName()+"\t");
			System.out.print(a.getAccountVO().getLaunchDate()+"\t");
			System.out.print(a.getAccountVO().getBirth()+"\t");
			System.out.print(a.getAccountVO().getTel()+"\t");
			
		} catch (Exception e) {
		}
	}

	public void findByname() {
		System.out.println("\n[이름 검색]...");
		String name;
		
		try {
			System.out.print("검색할 이름 ? ");
			name = br.readLine();
			
			List<Account> accountList = bank.getAccountList(name);
			if(accountList.size()==0) {
				System.out.println("등록된 이름이 없습니다.");
			}
			
			for(Account a : accountList) {
				System.out.print(a.getAccountVO().getName()+"\t");
				System.out.print(a.getAccountVO().getAccountNumber()+"\t");
				System.out.print(a.getAccountVO().getLaunchDate()+"\t");
				System.out.print(a.getAccountVO().getBirth()+"\t");
				System.out.print(a.getAccountVO().getTel()+"\t");
//				System.out.println()+"\t");
				
			}
			System.out.println();
		
		} catch (Exception e) {
		}
	}

	
	public void printAll() {
		System.out.println("\n[전체 리스트]...");
	}
}
