package edu.study.problem2;

public class CheckingAccount extends Account {
    private int overdraftLimit; // 마이너스 한도

    public CheckingAccount() {
    }
    public CheckingAccount(String 계좌번호, String 예금주, int 잔액, int overdraftLimit) {
        super(계좌번호, 예금주, 잔액);
        this.overdraftLimit = overdraftLimit;
    }

    public int getOverdraftLimit() {
        return overdraftLimit;
    }
    public void setOverdraftLimit(int overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public String toString() {
        return super.toString() + " (마이너스 한도 : -" + getOverdraftLimit() + "원)";
    }

    @Override
    public void withdraw(int 출금) {
        int totalMoney = get잔액() + getOverdraftLimit();
        if(출금 > totalMoney){
            System.out.println(get예금주() + "님 계좌에서 " + 출금 + "원 출금 시도...");
            System.out.println("[출금 오류] 잔액이 부족합니다. (요청 : " + 출금 + ", 현재 : " + 잔액 +", 한도 : -" + getOverdraftLimit() + ")");
        } else {
            if(잔액 > 출금){
                잔액 =  잔액 - 출금;
                System.out.println(get예금주() + "님 계좌에서 " + 출금 + "원 출금 시도... 성공. 현재 잔액 " + 잔액 + "원");

            } else {
                잔액 =  잔액 - 출금;
                System.out.println(get예금주() + "님 계좌에서 " + 출금 + "원 출금 시도... 성공. 현재 잔액 " + 잔액 + "원");
            }
        }
    }

}