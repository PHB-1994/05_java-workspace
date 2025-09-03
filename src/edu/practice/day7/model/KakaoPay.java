package edu.practice.day7.model;

public class KakaoPay extends KakaoService {
    // 필드
    private int balance;
    private String bankAccount;

    // 생성자
    public KakaoPay() {
    }
    public KakaoPay(String serviceName, String userId, String userNickname, boolean isLoggedIn) {
        super(serviceName, userId, userNickname, isLoggedIn);
    }
    public KakaoPay(int balance, String bankAccount) {
        this.balance = balance;
        this.bankAccount = bankAccount;
    }
    public KakaoPay(String serviceName, String userId, String userNickname, int balance, String bankAccount) {
        super(serviceName, userId, userNickname, true);
        this.balance = balance;
        this.bankAccount = bankAccount;
    }

    // getter setter
    public int getBalacne() {
        return balance;
    }
    public void setBalacne(int balacne) {
        this.balance = balacne;
    }
    public String getBankAccount() {
        return bankAccount;
    }
    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }


    //메서드
    @Override
    public void showUserInfo() {
        super.showUserInfo();
        System.out.println("잔액: " + getBalacne() + "원");
        System.out.println("연결 계좌: " + getBankAccount());
    }

    @Override
    public void startService() {
        System.out.println("카카오페이를 시작합니다. 간편결제 서비스가 준비되었습니다!");
        System.out.println("현재 잔액: " + getBalacne() + "원");
    }

    @Override
    public void stopService() {
        System.out.println("카카오페이를 종료합니다. 결제 내역을 저장했습니다.");
    }

    @Override
    public String getServiceType() {
        return "";
    }

    @Override
    public void performSpecialAction() {

    }

    @Override
    public void sendNotification(String message){
        System.out.println("[카카오페이 알림] " + message);
    }

    @Override
    public void receiveNotification(String message) {
            System.out.println("[카카오페이에서 알림 수신] " + message);
    }

    // 고유 메서드
    public void chargeBalance(int amount) {
        if (!"PAY".equals(getServiceType())) {
            System.out.println("카카오페이 서비스가 아닙니다!");
            return;
        }
        balance += amount;
        System.out.println(amount + "원 충전 완료. 잔액: " + balance + "원");
    }

    public boolean processPayment(int amount) {
        if (!"PAY".equals(getServiceType())) {
            System.out.println("카카오페이 서비스가 아닙니다!");
            return false;
        }
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원 결제 완료. 잔액: " + balance + "원");
            return true;
        } else {
            System.out.println("잔액이 부족합니다. 현재 잔액: " + balance + "원");
            return false;
        }
    }

    public void transferMoney(String recipient, int amount) {
        if (!"PAY".equals(getServiceType())) {
            System.out.println("카카오페이 서비스가 아닙니다!");
            return;
        }
        if (processPayment(amount)) {
            System.out.println(recipient + "에게 " + amount + "원 송금 완료");
        }
    }

    public int getBalance() {
        if (!"PAY".equals(getServiceType())) {
            System.out.println("카카오페이 서비스가 아닙니다!");
            return -1;
        }
        return balance;
    }

    public void refund(int amount) {
        System.out.println("카카오페이 서비스가 아닙니다!");
        balance += amount;
        System.out.println(amount + "원 환불 완료. 잔액: " + balance + "원");
    }

}
