package bank;

import java.util.ArrayList;
import java.util.List;

import bankEx.TransactionVO;

public class Account {
	private AccountVO accountVO; // 계좌정보
	private List<TransactionVO> transactionList; // 거래내역 리스트
	
	public Account() {
		accountVO = new AccountVO();
		transactionList = new ArrayList<>();
	}
	
	public AccountVO getAccountVO() {
		return accountVO;
	}
	
	public List<TransactionVO> getTransactionList() {
		// 전체 거래 리스트
		return transactionList;
	}
	
	public boolean addTransaction(TransactionVO vo) {
		// 거래 내역 등록
		
		return false;
	}
	
	public TransactionVO getLastTransaction() {
		// 마지막 거래 내역
		
		return null;
	}
}
