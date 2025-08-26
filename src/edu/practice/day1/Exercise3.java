package edu.practice.day1;

import java.util.Scanner;

public class Exercise3 {

    // 클래스에서 변수이름을 설정할 때 제외하고 모두 메서드 형태로 작성
    public void method1(){

        /**
         *         섭씨온도를 입력하세요: 25.5
         *         섭씨 25.5도는 화씨 77.9도입니다.
         */
        Scanner sc=new Scanner(System.in);

        final double RATIO = 9.0 / 5.0;
        final int OFFSET = 32;

        System.out.print("섭씨온도를 입력하세요 : ");
        double celsius = sc.nextDouble();
        double fahrenheit = celsius * 9 / 5 + 32;

        /**
         *         추가 문제 double fahrenheit = celsius * RATIO + OFFSET;
         *
         *         final double RATIO = 9.0 / 5.0;
         *         final int OFFSET = 32
         */

        System.out.printf("섭씨 %.1f도는 화씨 %.1f도입니다.",celsius,fahrenheit);

    }
}
