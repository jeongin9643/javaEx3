package bank;

import java.util.ArrayList;
import java.util.List;

public class BankImpl implements Bank {
	private List<Account> accountList; // 계좌정보

	public BankImpl() {
		accountList = new ArrayList<>();
	}

	// 계좌 번호 만들기
	protected String generateAccountNo() {
		String s = "020-08-0000000";
		if (accountList.size() > 0) {
			s = accountList.get(accountList.size() - 1).getAccountVO().getAccountNumber();
		}

		String s1 = s.substring(0, s.lastIndexOf("-"));
		String s2 = s.substring(s.lastIndexOf("-") + 1);

		int n = Integer.parseInt(s2) + 1;

		s = s1 + "-" + String.format("%07d", n);

		return s;
	}

	@Override
	public Account addAccount(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TransactionVO deposit(String accountNumber, long amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TransactionVO withdraw(String accountNumber, String pwd, long amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TransactionVO accountTransfer(String fromAccountNumber, String pwd, String toAccountNumber, long amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long balance(String accountNumber, String pwd) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<TransactionVO> transactionHistory(String accounNumber, String pwd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account findByaccountNumber(String accounNumber) {
		// 계좌번호 검색
		for (Account a : accountList) {
			if (a.getAccountVO().getAccountNumber().equals(accounNumber)) {
				return a;
			}
		}
		return null;
	}

	@Override
	public List<Account> getAccountList(String name) {
		// 이름검색
		List<Account> finds = new ArrayList<>();

		for (Account a : accountList) {
			if (a.getAccountVO().getName().indexOf(name) >= 0) {
				finds.add(a);
			}

		}
		return finds;
	}

	@Override
	public List<Account> getAccountList() {
		// TODO Auto-generated method stub
		return null;
	}
 

}