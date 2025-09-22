package edu.study.problem2;

public class SavingAccount extends Account{
    private double interestRate; // 이자율

    public SavingAccount() {
    }
    public SavingAccount(String 계좌번호, String 예금주, int 잔액, double interestRate) {
        super(계좌번호, 예금주, 잔액);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return super.toString() + " (이자율 : -" + getInterestRate() + "%)";
    }

    @Override
    public void withdraw(int 출금) {

    }

    public long calculateInterest(){
        return (long) (잔액 * getInterestRate()) / 100;
    }
}
