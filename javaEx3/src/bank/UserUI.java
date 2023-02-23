package bank;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserUI {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public void menu() {
		LoginUI lg = new LoginUI();
		
		int ch;
		
		while(true) {
			try {
				do {
					System.out.print("1.계좌개설 2.입금 3.출금 4.계좌이체 5.잔액조회 6.거래내역 7.로그아웃 => ");
					ch = Integer.parseInt(br.readLine());
				} while(ch <1||ch>7);
				
				if (ch == 7) {
					lg.menu();
				}
				
				switch(ch) {
				case 1 : create(); break;
				case 2 : deposit(); break;
				case 3 : withdraw(); break;
				case 4 : accountTransfer(); break;
				case 5 : printBalance(); break;
				case 6 : printinfo(); break;
				}
				
				
			} catch (NumberFormatException e) {
				System.out.println("[1 - 7] 항목을 선택해 주세요.");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void create() {
		System.out.println("\n[계좌 개설]...");
	}
	
	public void deposit() {
		System.out.println("\n[입금]...");
	}
	
	public void withdraw() {
		System.out.println("\n[출금]...");
	}
	
	public void accountTransfer() {
		System.out.println("\n[계좌이체]...");
	}
	
	public void printBalance() {
		System.out.println("\n[잔액조회]...");
	}
	
	public void printinfo() {
		System.out.println("\n[거래내역 조회]...");
	}
}
