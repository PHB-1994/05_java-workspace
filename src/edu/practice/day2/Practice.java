package edu.practice.day2;


import java.util.Scanner;

public class Practice {

    Scanner sc = new Scanner(System.in);
    /**
     * 문제 1번 : 짝수만 출력하기
     */
    public void method1(){

        /**
         * 첫 번째 숫자: 3
         * 두 번째 숫자: 10
         *
         * 3부터 10까지의 짝수
         * 4 6 8 10
         */

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
     * 문제 2번 : 별표 삼각형 만들기
     */
    public void method2(){

        /**
         * 높이를 입력하세요: 5
         *
         * *
         * **
         * ***
         * ****
         * *****
         */

        System.out.print("높이를 입력하세요 : ");
        int height = sc.nextInt();

        for(int i = 1; i <= height; i++){
            for(int j = 1; j < i; j++){
                System.out.print(j);
            }
            System.out.println(i);
        }
        // 별 표시 어떻게 함..?
    }

    /**
     * 문제 3번 : 팩토리얼 계산기
     */
    public void method3(){

        /**
         * 팩토리얼을 구할 숫자를 입력하세요: 5
         * 5! = 5 × 4 × 3 × 2 × 1 = 120
         */

        System.out.print("팩토리얼을 구할 숫자를 입력하세요 : ");
        int num = sc.nextInt();
        long factorial = 1;

        for(int i = 1; i <= num; i++){
            factorial *= i;
            System.out.printf("%d! = %d x %d = %d", num,num,i,factorial);
        }


    }

    /**
     * 문제 4번 : 소수 판별기
     */
    public void method4(){

        System.out.print("숫자를 입력하세요 : ");
        int number = sc.nextInt();

        // 소수를 판별해야 하는데 어찌...?
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

        /**
         * 1~50 사이의 숫자를 맞혀보세요!
         * 시도 1/7: 25
         * 입력한 숫자보다 정답이 큽니다.
         * 시도 2/7: 40
         * 입력한 숫자보다 정답이 작습니다.
         * 시도 3/7: 32
         * 정답입니다! 정답: 32, 시도횟수: 3회
         */

        int answer = (int)(Math.random() * 50) + 1;

        int count = 0;

        final int Max_TRIES = 7;

        System.out.println("1 ~ 50 사이의 숫자를 맞혀보세요!");

        while(count < Max_TRIES){
            System.out.printf("시도 %d/%d : ", count, Max_TRIES);
            int input = sc.nextInt();
            // 카운터가 맞는지 모르겠음

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

    /**
     * 문제 7번 : 문자열 분석기
     */
    public void method7(){

        // java.util.Scanner sc = new java.util.Scanner(System.in);
        // 위와 같은 클래스 파일을 가져올 때
        // 파일이 위치한 경로를 매번 앞에 작성하기 번거롭기 때문에
        // import를 사용하여 패키지 명칭 아래 맨 위에 작성한다.

        /**
         * 문자열을 입력하세요: Hello123World
         * === 문자열 분석 결과 ===
         * 총 글자 수: 13
         * 영문자: 10개
         * 숫자: 3개
         */

        System.out.print("문자열을 숫자 포함해서 입력해보세요 : ");
        String str = sc.nextLine();

        // 똑같은 int 면 묶음처리 가능
        // int totalCount = 0, letterCount = 0, digitCount = 0;

        int totalCount = str.length(); // 사용자가 입력한 문자열의 전체 글자수를 세고 변수이름 저장
        int letterCount = 0;           // 문자열에서 글자의 개수
        int digitCount = 0;            // 문자열에서 숫자의 개수
        int otherCount = 0;            // 문자도 아니고 숫자도 아닌 것의 개수

        for(int i = 0; i < totalCount; i++){
            char ch = str.charAt(i); // i 번째 문자열을 ch 라는 변수이름에 담기

            /** 문자가 숫자인지 글자인지 boolean(불리언) true false 형태로 결과를 확인
             * Character.isDigit(ch)    = ch 가 숫자라면 true
             *      => 숫자가 맞군요!
             * Character.isLetter(ch)   = ch 가 문자라면 true
             *      => 문자가 맞군요!
             */

            if(Character.isDigit(ch)){ // ch 에 저장된 문자가 숫자라면
                digitCount++;          // 숫자 개수에 + 1 추가
            }else if(Character.isLetter(ch)){ // ch 에 저장된 문자가 숫자가 아닌 글자라면
                letterCount++;                // 문자 개수 + 1 추가
            }else {
                otherCount++; // 글자도 아니고 숫자도 아닌 모든 경우
            }
        }
        System.out.println("\n=== 고객이 작성한 문자열에서 숫자와 문자의 개수 확인하기 ===");
        System.out.println("총 글자수 : " + totalCount);
        System.out.println("숫자 아닌 글자수 : " + letterCount);
        System.out.println("숫자 글자수 : " + digitCount);
        System.out.println("기타 문자(공백, 기호) : " + otherCount);
    }
}
