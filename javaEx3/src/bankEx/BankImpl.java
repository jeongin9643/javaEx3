package bankEx;

import java.util.ArrayList;
import java.util.List;

public class BankImpl implements Bank {
	private List<Account> accountList; // 계좌 정보
    
    public BankImpl() {
    	accountList = new ArrayList<>();
    }
    
    // 계좌 번호 만들기
	protected String generateAccountNo() {
	    String s = "020-08-0000000";
	    if(accountList.size() > 0) {
	    	s = accountList.get(accountList.size()-1).getAccountVO().getAccountNo();
	    }
	    
	    String s1 = s.substring(0, s.lastIndexOf("-"));
	    String s2 = s.substring(s.lastIndexOf("-")+1);
			
	    int n = Integer.parseInt(s2)+1;
			
	    s=s1 + "-" + String.format("%07d", n);
	    
	    return s;
	}
    
	@Override
    public Account addAccount(String owner) {
		// 계좌 등록
		
		return null;
    }

	@Override
    public TransactionVO deposit(String accountNo, long amount) {
    	// 입금
    	
    	return null;
    }

	@Override
    public TransactionVO withdraw(String accountNo, long amount) {
    	// 출금
    	
    	return null;
    }
    
	@Override
	public TransactionVO accountTransfer(String fromAccountNo, String toAccountNo, long amount) {
    	// 계좌이체
    	
    	return null;
    }

	@Override
    public long balance(String accountNo) {
    	// 잔액조회
    	
    	return 0L;
    }

	@Override
    public List<TransactionVO> transactionHistory(String accountNo) {
    	// 거래내역조회
    	
    	return null;
    }

	@Override
    public Account readAccount(String accountNo) {
    	// 계좌-번호검색
    	
    	return null;
    }

	@Override
    public List<Account> getAccountList(String owner) {
    	// 계좌-이름검색
    	
    	return null;
    }

	@Override
	public List<Account> getAccountList(){
		// 계좌-전체리스트
		
		return accountList;
	}
}
