package edu.practice.day1;

import java.util.Scanner;

public class Exercise5 {

    public void method1(){
//        출생년도를 입력하세요: 2000
//
//        ========= 나이 정보 =========
//        출생년도    : 2000년
//        현재 나이   :   25세
//        10년 후     :   35세
//        성인 여부   :   true
//        ============================

        Scanner sc=new Scanner(System.in);

        System.out.print("출생년도를 입력하세요 : ");
        int birthYear=sc.nextInt();

        final int CURRENT_YEAR = 2025;
        int currentAge = CURRENT_YEAR - birthYear;
        int futureAge = currentAge + 10;
        boolean isAdult = (currentAge >= 20);

        System.out.println("========= 나이 정보 =========");
        System.out.printf("출생 년도  : %d년\n현재 나이  : %d세\n10년 후  : %d세\n성인 여부 %b\n",birthYear,currentAge,futureAge,isAdult);
        System.out.print("============================");

    }
}
