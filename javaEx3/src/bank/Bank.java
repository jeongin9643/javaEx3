package bank;

import java.util.List;

public interface Bank {
	// 계좌 등록
	public Account addAccount(String name);
	
	// 입금
	public TransactionVO deposit(String accountNumber, long amount);
	
	// 출금
	public TransactionVO withdraw(String accountNumber, String pwd, long amount);
	
	// 계좌이체
	public TransactionVO accountTransfer(String fromAccountNumber, String pwd, String toAccountNumber, long amount);
	
	// 잔액조회
	public long balance(String accountNumber, String pwd);
	
	// 거래내역 조회
	public List<TransactionVO> transactionHistory(String accounNumber, String pwd);
	
	// 계좌번호 검색
	public Account findByaccountNumber(String accounNumber);
	
	// 이름 검색
	public List<Account> getAccountList(String name);
	
	// 전체 유저 리스트 출력
	public List<Account> getAccountList();

}
