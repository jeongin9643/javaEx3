package bank;

public class TransactionVO {
	// 거래 내역 리스트 필요 변수
    private String tranDate; // 거래날짜
    private String kind; // 입금 or 출금
    private long amount; // 거래 금액
    private long balance; // 잔액
    private String info; // 거래 내역

    public String getTranDate() {
        return tranDate;
    }
    public void setTranDate(String tranDate) {
        this.tranDate = tranDate;
    }
    public String getKind() {
        return kind;
    }
    public void setKind(String kind) {
        this.kind = kind;
    }
    public long getAmount() {
        return amount;
    }
    public void setAmount(long amount) {
        this.amount = amount;
    }
    public long getBalance() {
        return balance;
    }
    public void setBalance(long balance) {
        this.balance = balance;
    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }


}
