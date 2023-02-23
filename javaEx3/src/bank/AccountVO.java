package bank;

public class AccountVO { // 계좌정보
    private String name; // 이름
    private String birth; // 생년월일
    private String tel; // 전화번호    
    private String launchDate; // 계좌개설 일자
    private String accountNumber; // 계좌번호
    private String pwd; // 패스워드

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBirth() {
        return birth;
    }
    public void setBirth(String birth) {
        this.birth = birth;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public String getLaunchDate() {
        return launchDate;
    }
    public void setLaunchDate(String launchDate) {
        this.launchDate = launchDate;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getPwd() {
        return pwd;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

}
