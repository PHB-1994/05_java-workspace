package edu.practice.day3;

public class PracticeRun {
    public static void main(String[] args) {
        Practice1 p1 = new Practice1();
        Practice2 p2 = new Practice2();
        Practice3 p31 = new Practice3(100000,"1234");
        Practice3 p32 = new Practice3(0,"5678");
        Student p4 = new Student();
        Car p5 = new Car();

        // 원하는 문제의 주석을 해제하고 실행하세요
        System.out.println("=== 문제 1: 도서 관리 클래스 ===");
        p1.setTitle("Java 프로그래밍");
        p1.setAuthor("김개발");
        p1.setPrice(25000);
        p1.setAvailable(true);

        p1.method1();


        System.out.println("\n=== 문제 2: 스마트폰 클래스 ===");
        p2.setModel("Galaxy S24");
        p2.setBatteryLevel(100);
        p2.setUserBattey(30);
        p2.method2();

        System.out.println("\n=== 문제 3: 은행계좌 업그레이드 ===");
        p31.setAccountHolder("홍길동");
        p32.setAccountHolder("김철수");
        p31.setAccountNumber("123-456-789");
        p31.setTransactionCount(0);

        System.out.println("=== " + p31.getAccountHolder() + "님 계좌 정보 ===");
        System.out.println("계좌번호: " + p31.getAccountNumber());
        System.out.println("잔액: " + p31.getBalance() + "원");
        System.out.println("총 거래 횟수: " + p31.getTransactionCount() + "회");
        p31.withdraw("5678",50000);
        p31.withdraw("1234",150000);
        p31.deposit(50000);
        p32.deposit(30000);
        p31.transfer1(20000,p31.getAccountHolder(), p32.getAccountHolder());
        p32.transfer2(20000);
        System.out.println(p31.getAccountHolder() + "님 현재 잔액 : " + p31.getBalance() + "원");
        System.out.println(p32.getAccountHolder() + "님 현재 잔액 : " + p32.getBalance() + "원");
        System.out.println("===" + p31.getAccountHolder() + "님 총 거래 횟수 ===");
        p31.transactionCount();
//        p31.method3();

        System.out.println("\n=== 문제 4: 학생 성적 관리 시스템 ===");
        // p4.method4();

//        p4.setName("홍길동");
//        p4.setStudentId(20241001);
//        p4.inputScores();
//        p4.getTotalScore();
//        p4.printReport();


        System.out.println("\n=== 문제 5: 자동차 관리 시스템 ===");
        //p5.method5();
        Car car = new Car("현대", "아반떼");
        car.setFuel(100);
        car.setSpeed(0);
        car.setEngineOn(false);
        car.setTotalDistance(0);
        car.carInfo();
        System.out.println();
        car.startEngine();
        System.out.println();
        car.accelerate(50);
        System.out.println();
        car.drive(500);
        System.out.println();
        car.carInfo();
        System.out.println();
        car.refuel(32);
        System.out.println();
        car.brake(10);
        System.out.println();
        car.carInfo();
        System.out.println();
        car.stopEngine();
        System.out.println();
        car.startEngine();
        System.out.println();
        car.accelerate(50);
        car.drive(820);
    }
}