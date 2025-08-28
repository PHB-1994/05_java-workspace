package edu.practice.day2;


import java.util.Arrays;
import java.util.Scanner;

public class Practice {

    Scanner sc = new Scanner(System.in);

    /**
     * 문제 1번 : 짝수만 출력하기
     */
    public void method1() {

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

        int max = Math.max(input1, input2);
        int min = Math.min(input1, input2);

        System.out.printf("%s부터 %s까지의 짝수\n", min, max);

        for (int i = min; i <= max; i++) {
            if (i % 2 == 0) {
                System.out.print(" " + i);
            }
        }
    }


    /**
     * 문제 2번 : 별표 삼각형 만들기
     */
    public void method2() {

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

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }


    /**
     * 문제 3번 : 팩토리얼 계산기
     */
    public void method3() {

        /**
         * 팩토리얼을 구할 숫자를 입력하세요: 5
         * 5! = 5 × 4 × 3 × 2 × 1 = 120
         */

        System.out.print("팩토리얼을 구할 숫자를 입력하세요 : ");
        int number = sc.nextInt();
        int factorial = 1;

        // 계산 과정을 넣기 위한 문자열 변수
        String process = "";

        // number 부터 1까지 내려가면서 계산
        for (int i = number; i >= 1; i--) {
            factorial *= i;

            process += i; // 문자열의 현재 숫자(i)를 추가
            if (i > 1) {
                process += " x ";
            }
        }
        System.out.printf("%d! = %s = %d\n", number, process, factorial);
    }


    /**
     * 문제 4번 : 소수 판별기
     */
    public void method4() {

        System.out.print("숫자를 입력하세요 : ");
        int number = sc.nextInt();

        // 소수를 판별해야 하는데 어찌...?
        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.printf("%d은/는 소수입니다.\n", number);
        } else {
            System.out.printf("%d은/는 소수가 아닙니다.\n", number);
        }


    }

    /**
     * 문제 5번 : 구구단 선택기
     */
    public void method5() {

        /**
         * === 구구단 프로그램 ===
         * 1. 특정 단 출력
         * 2. 전체 구구단 출력
         * 0. 종료
         * 선택: 1
         * 몇 단을 출력하시겠습니까? 7
         * [7단]
         * 7 × 1 = 7
         * 7 × 2 = 14
         * ...
         * 7 × 9 = 63
         */

        while (true) {
            System.out.println("===구구단 프로그램===");
            System.out.println("1. 특정 단 출력");
            System.out.println("2. 전체 구구단 출력");
            System.out.println("0. 종료");

            System.out.print("선택 : ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("몇 단을 출력하시겠습니까? ");
                int dan = sc.nextInt();

                System.out.printf("\n[%d단]\n", dan);
                for (int i = 1; i <= 9; i++) {
                    System.out.printf("%d x %d = %2d\n", dan, i, dan * i);
                }
            } else if (choice == 2) {
                for (int i = 1; i <= 9; i++) {
                    System.out.printf("\n[%d단]\n", i);
                    for (int j = 1; j <= 9; j++) {
                        System.out.printf("%d x %d = %2d\n", i, j, i * j);
                    }
                }
            } else if (choice == 0) {
                break;
            }
        }

    }


    /**
     * 문제 6번 : 숫자 맞히기 게임 (1~50)
     */
    public void method6() {

        /**
         * 1~50 사이의 숫자를 맞혀보세요!
         * 시도 1/7: 25
         * 입력한 숫자보다 정답이 큽니다.
         * 시도 2/7: 40
         * 입력한 숫자보다 정답이 작습니다.
         * 시도 3/7: 32
         * 정답입니다! 정답: 32, 시도횟수: 3회
         */

        int answer = (int) (Math.random() * 50) + 1;

        int count = 0;

        final int Max_TRIES = 7;

        System.out.println("1 ~ 50 사이의 숫자를 맞혀보세요!");

        while (count < Max_TRIES) {
            count++;
            System.out.printf("시도 %d/%d : ", count, Max_TRIES);
            int input = sc.nextInt();
            // 카운터가 맞는지 모르겠음

            if (answer == input) {
                System.out.printf("정답입니다! 정답: %d, 시도횟수 : %d회", answer, count);
                break;
            } else if (answer > input) {
                System.out.println("입력한 숫자보다 정답이 큽니다.");
            } else if (answer < input) {
                System.out.println("입력한 숫자보다 정답이 작습니다.");
            }
        }


    }


    /**
     * 문제 7번 : 문자열 분석기
     */
    public void method7() {

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

        for (int i = 0; i < totalCount; i++) {
            char ch = str.charAt(i); // i 번째 문자열을 ch 라는 변수이름에 담기

            /** 문자가 숫자인지 글자인지 boolean(불리언) true false 형태로 결과를 확인
             * Character.isDigit(ch)    = ch 가 숫자라면 true
             *      => 숫자가 맞군요!
             * Character.isLetter(ch)   = ch 가 문자라면 true
             *      => 문자가 맞군요!
             */

            if (Character.isDigit(ch)) { // ch 에 저장된 문자가 숫자라면
                digitCount++;          // 숫자 개수에 + 1 추가
            } else if (Character.isLetter(ch)) { // ch 에 저장된 문자가 숫자가 아닌 글자라면
                letterCount++;                // 문자 개수 + 1 추가
            } else {
                otherCount++; // 글자도 아니고 숫자도 아닌 모든 경우
            }
        }
        System.out.println("\n=== 고객이 작성한 문자열에서 숫자와 문자의 개수 확인하기 ===");
        System.out.println("총 글자수 : " + totalCount);
        System.out.println("숫자 아닌 글자수 : " + letterCount);
        System.out.println("숫자 글자수 : " + digitCount);
        System.out.println("기타 문자(공백, 기호) : " + otherCount);
    }


    /**
     * 문제 8번 : 성적 관리 프로그램
     */
    public void method8() {

        /**
         * 5명의 성적을 입력하세요.
         * 1번 학생: 85
         * 2번 학생: 92
         * 3번 학생: 78
         * 4번 학생: 96
         * 5번 학생: 84
         *
         * === 성적 통계 ===
         * 총점: 435점
         * 평균: 87.0점
         * 최고점: 96점
         * 최저점: 78점
         */

        System.out.println("5명의 성적을 입력하세요.");

        int[] scores = new int[5];

        int total = 0;
        double average = 0;
        int max = 0;
        int min = 0;

        // int max = Math.max(scores[0], scores[1]);
        // int min = Math.min(scores[0], scores[1]);

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d번 학생 : ", i + 1);
            int score = sc.nextInt();

            total += score;
            average = (double) total / scores.length;

            if (i == 0) {
                min = score;
                max = score;
            } else {
                max = Math.max(score, max);
                min = Math.min(score, min);
            }

        }

        System.out.println("\n=== 성적 통계 ===");
        System.out.printf("총점 : %d점\n", total);
        System.out.printf("평균 : %.1f점\n", average);
        System.out.printf("최고점 : %d점\n", max);
        System.out.printf("최저점 : %d점\n", min);
    }


    /**
     * 문제 9번 : 배열 뒤집기
     */
    public void method9() {

        /**
         * 배열 크기를 입력하세요 (1~10): 4
         * 1번째 숫자: 10
         * 2번째 숫자: 20
         * 3번째 숫자: 30
         * 4번째 숫자: 40
         *
         * 원본 배열: [10, 20, 30, 40]
         * 뒤집힌 배열: [40, 30, 20, 10]
         */

        System.out.print("배열 크기를 입력하세요 (1 ~ 10) : ");
        int size = sc.nextInt();

        int[] original = new int[size];
        int[] reversed = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("%d번째 숫자 : ", i + 1);
            int input = sc.nextInt();

            original[i] = input;
            reversed[size - 1 - i] = input;
        }
        System.out.println("원본 배열 : " + Arrays.toString(original));
        System.out.println("뒤집힌 배열 : " + Arrays.toString(reversed));

    }


    /**
     * 문제 10번 : 간단한 로또 번호 생성기
     */
    public void method10() {

        /**
         * === 간단 로또 번호 생성기 ===
         * 생성된 번호: 3 7 12 18 20
         * 다시 생성하시겠습니까? (y/n): y
         * 생성된 번호: 1 5 9 15 19
         * 다시 생성하시겠습니까? (y/n): n
         * 프로그램을 종료합니다.
         */

        int[] lotto = new int[5];

        boolean isDuplicate = false;

        String playAgain;

        System.out.println("=== 간단한 로또 번호 생성기 ===");

        while (true) {
            System.out.print("생성된 번호 : ");
            for (int i = 0; i < lotto.length; i++) {
//                isDuplicate = false;
                int random = (int) (Math.random() * 20) + 1;
                lotto[i] = random;

                for (int j = 0; j < i; j++) {
                    if(lotto[i] == lotto[j]){
//                        isDuplicate = true;
                        i--;
                    }
                }
            }
                System.out.print(Arrays.toString(lotto));

            System.out.print("\n다시 생성하시겠습니까? (y/n) : ");
            String input = sc.nextLine();
            if (input.equals("n")) {
                break;

            }

        }
    }
}
