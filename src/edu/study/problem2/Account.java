package edu.study.problem2;

public abstract class Account {
    protected String 계좌번호;
    protected String 예금주;
    protected int 잔액;

    public Account() {
    }
    public Account(String 계좌번호, String 예금주, int 잔액) {
        this.계좌번호 = 계좌번호;
        this.예금주 = 예금주;
        this.잔액 = 잔액;
    }

    public String get계좌번호() {
        return 계좌번호;
    }
    public void set계좌번호(String 계좌번호) {
        this.계좌번호 = 계좌번호;
    }
    public String get예금주() {
        return 예금주;
    }
    public void set예금주(String 예금주) {
        this.예금주 = 예금주;
    }
    public int get잔액() {
        return 잔액;
    }
    public void set잔액(int 잔액) {
        this.잔액 = 잔액;
    }

    public abstract void withdraw(int 출금);

    @Override
    public String toString() {
        return get예금주() + "님의 입출금 계좌(" + get계좌번호() + ")가 개설되었습니다.";
    }

    public void deposit(int 입금){
        int totalMoney = get잔액() + 입금;
        System.out.println(get예금주() + "님의 계좌에 " + 입금 + "원 입금. 현재 잔액 : " + totalMoney + "원");
        set잔액(totalMoney);
    }

    /*
     * public abstract void withdraw(long amount) throws InsufficientFundsException;
     * public class InsufficientFundsException extends Exception { ... }
     * 어디에 쓰는 건지 모르겠다....
     * */
}
