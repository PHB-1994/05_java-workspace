package edu.practice.day3;

import java.util.Scanner;

public class Practice3 {
    Scanner sc=new Scanner(System.in);

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


    public Practice3(long balance, String password) {
        this.balance = balance;
        this.password = password;
    }

    // Setter
    public void setAccountHolder(String accountHolder1) {
        this.accountHolder = accountHolder1;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(long balance1) {
        this.balance = balance1;
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


    public void withdraw(String pw, long amount){
        // 자바에서
        // - 기본 자료형 비교는 ==
        // - 객체(참조형) 비교는 A.equals(B)    대표적인 예) String 문자열 비교할 경우 equals 사용

        // 현재 계좌 비밀번호(password) 와
        // 전달 받은 비밀번호(pw) 가 같은 경우 true / 다르면 false
        if(!password.equals(pw)){ // 다를 경우
            System.out.println("비밀 번호 불일치");
            return; // 기능 종료 후 아래 코드는 더이상 수행하지 못하고 호출한 곳으로 돌아감
            // withdraw 다음에 작성되어 있는 메서드 기능을 수행하거나 기능이 없으면 종료
        }

        // 출금할 금액이 잔액보다 큰 경우
        if(amount > balance){
            System.out.println("잔액이 부족합니다.");
            return; // 출금 못하도록 돌려보내기
        }

        // 보유 잔액에서 출금할 금액만큼 차감
        this.balance -= amount;

        System.out.printf("%s 계좌에서 %d원 출금\n", accountNumber,amount);
        System.out.println(getAccountHolder() + " 의 현재 잔액 : " + balance);
    }

    public void deposit(long amount){
        transactionCount++;
        this.balance += amount; // this 이 클래스에서 변수속성에 어떤 값을 대입한다.
        // this. 생략 가능하다.
        // this.balance = Account 클래스에서 balance 라는 변수이름

        System.out.println(getAccountHolder()+ "님이 " + amount + "원 입금하셨습니다. 현재 잔액: " + balance + "원");
    }

    public void transfer1(long amount,String user1, String user2){
        balance -= amount;
        transactionCount++;
        System.out.println(user1 + "님이 " + user2 + "님께 " + amount + "원 송금했습니다.");
    }
    public void transfer2(long amount){
        balance += amount;
    }

    public void transactionCount(){
        System.out.println("총 " + transactionCount + "회 거래를 하셨습니다.");
    }


}
