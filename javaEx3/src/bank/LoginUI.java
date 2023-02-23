package bank;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LoginUI {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public void menu() {
		UserUI us = new UserUI();
		AdminUI ad = new AdminUI();
		
		int ch;
		
		while(true) {
			try {
				do {
					System.out.println("-------------------");
					System.out.println("1.은행원 2.사용자 3.종료");
					System.out.println("-------------------");
					ch = Integer.parseInt(br.readLine());
				} while (ch <1 || ch > 3);
				
				if(ch == 3) {
					System.exit(0);
				}
				
				switch (ch) {
				case 1 : ad.login();break;
				case 2 : us.menu();break;
				}
			} catch (NumberFormatException e) {
				System.out.println("[1 - 3] 항목을 선택해 주세요.");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
