package edu.practice.day2;


import java.util.Scanner;

public class Practice {

    Scanner sc = new Scanner(System.in);
    /**
     * 문제 1번 : 짝수만 출력하기
     */
    public void method1(){
        System.out.print("첫 번째 숫자 : ");
        int input1 = sc.nextInt();

        System.out.print("두 번째 숫자 : ");
        int input2 = sc.nextInt();

        int max = Math.max(input1,input2);
        int min = Math.min(input1,input2);

        System.out.printf("%s부터 %s까지의 짝수\n",min,max);

        for(int i = min; i <= max; i++){
            if(i % 2 == 0){
                System.out.print(" " + i);
            }
        }
    }

    /**
     * 문제 4번 : 소수 판별기
     */
    public void method4(){

        System.out.print("숫자를 입력하세요 : ");
        int number = sc.nextInt();

        boolean isPrime = true;

        for(int i = 2; i < number; i++){
            if(number % i == 0){
                isPrime = false;
                System.out.printf("%d은/는 소수입니다.\n",i);
            }else {
                System.out.printf("%d은/는 소수가 아닙니다.\n",i);
            }
        }
    }


    /**
     * 문제 6번 : 숫자 맞히기 게임 (1~50)
     */
    public void method6(){
        int answer = (int)(Math.random() * 50) + 1;

        int count = 0;

        final int Max_TRIES = 7;

        System.out.println("1 ~ 50 사이의 숫자를 맞혀보세요!");

        while(count < Max_TRIES){
            System.out.printf("시도 %d/%d : ", count, Max_TRIES);
            int input = sc.nextInt();

            if(answer == input){
                System.out.printf("정답입니다! 정답: %d, 시도횟수 : %d회", answer, count);
                break;
            }else if(answer > input){
                System.out.println("입력한 숫자보다 정답이 큽니다.");
                count++;
            }else if(answer < input) {
                System.out.println("입력한 숫자보다 정답이 작습니다.");
                count++;
            }
        }


    }
}
