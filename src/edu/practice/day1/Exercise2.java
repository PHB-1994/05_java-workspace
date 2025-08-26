package edu.practice.day1;

import java.util.Scanner;

public class Exercise2 {
    public void method1(){

        /**
         *         첫 번째 정수 입력: 10
         *         두 번째 정수 입력: 3
         *
         *         === 계산 결과 ===
         *         10 + 3 = 13
         *         10 - 3 = 7
         *         10 * 3 = 30
         *         10 / 3 = 3.33
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 정수 입력 : ");
        int num1 = sc.nextInt();

        System.out.print("두 번째 정수 입력 : ");
        int num2 = sc.nextInt();

        int add = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        double div = (double)num1 / num2;

        System.out.println("=== 계산 결과 ===");
        System.out.printf("%d + %d = %d \n",num1,num2,add);
        System.out.printf("%d - %d = %d \n",num1,num2,sub);
        System.out.printf("%d * %d = %d \n",num1,num2,mul);
        System.out.printf("%d / %d = %.2f \n",num1,num2,div);
        /**
         * Exception in thread "main" java.util.IllegalFormatConversionException: d != java.lang.Double
         * 나누기 : %d 가 아니라 %.2f 를 사용해야함
         */
    }
}
