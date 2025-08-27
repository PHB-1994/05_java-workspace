package edu.practice.day3;

public class Practice3 {

    private String accountHolder;       // 예금주
    private String accountNumber;       // 계좌번호
    private long balance;               // 잔액
    private String password;            // 비밀번호
    private int transactionCount = 0;   // 거래횟수, 기본값 0

    /****** 실행 메서드 ******/
    public void method3(){
    }

    /****** 메서드 = 기능 ******/
    // 기본 생성자
    public Practice3() {
    }


    // 필수 생성자

    // Setter
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTransactionCount(int transactionCount) {
        this.transactionCount = transactionCount;
    }

    // Getter
    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public String getPassword() {
        return password;
    }

    public int getTransactionCount() {
        return transactionCount;
    }
}
