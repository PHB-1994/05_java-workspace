package edu.study.problem2;

public class BankRun {
    public static void main(String[] args) {
        // 다형성: Account 타입의 변수로 자식 객체를 다룰 수 있음
        Account checkingAcc = new CheckingAccount("111-222", "홍길동", 0, 100000);
        SavingAccount savingsAcc = new SavingAccount("333-444", "김철수", 50000, 2.5);

        System.out.println(checkingAcc);
        System.out.println(savingsAcc);
        System.out.println(); // 줄바꿈

        // 입출금 계좌 테스트
        checkingAcc.deposit(50000);

        System.out.println(); // 줄바꿈

        try {
            checkingAcc.withdraw(70000); // 정상 출금 (마이너스 한도 내)
            checkingAcc.withdraw(100000); // 예외 발생

        } catch (IllegalArgumentException e) {
            System.out.println("[출금 오류] " + e.getMessage());
        }
        //catch (InsufficientFundsException e) {
        //            System.out.println("[출금 오류] " + e.getMessage());
        //        }

        System.out.println(); // 줄바꿈

        // 예금 계좌 테스트
        long interest = savingsAcc.calculateInterest();
        System.out.println(savingsAcc.get예금주() + "님 계좌의 현재 이자는 " + interest + "원 입니다.");
    }               //(이부분은 각자 사용한 변수명 따라 변경 가능!)
}