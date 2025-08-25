package edu.practice.day1;

public class Exercise1 {

    public void method1(){
//        === 개인정보 ===
//        이름: 김자바
//        나이: 25세
//        키: 175.5cm
//        성별: M
//        취미: 프로그래밍

        String name = "김자바";
        int age = 25;
        double height = 175.5;
        char gender = 'M';
        String hobby = "프로그래밍";

        System.out.println("=== 개인정보 ===");
        System.out.printf("이름 : %s\n나이 : %d세\n키 : %.1fcm\n성별 : %c\n취미 : %s",name,age,height,gender,hobby);
    }
}
