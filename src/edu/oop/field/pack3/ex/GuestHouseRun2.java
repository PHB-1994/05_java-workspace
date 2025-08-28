package edu.oop.field.pack3.ex;

import java.util.Scanner;

public class GuestHouseRun2 {

    public static void main(String[] args) {
        System.out.println("=== 게스트하우스 방문자 관리 시스템 ===");

        GuestHouse guest = new GuestHouse();
        /***
         * Scanner 이용해서 고객의 정보 저장
         * while 문 활용해서 0 번을 입력하면 고객 정보 입력 종류
         */

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("----- 고객 정보 입력 -----");
            System.out.println("0번 입력 시 고객 정보 입력을 종료합니다.");
            System.out.print("고객 이름을 입력하세요 : ");
            String name = sc.nextLine();

            if(name.equals("0")){ // 0 을 String 으로 입력 받고, 0 이 String 형태로 입력된게 맞으면 true
                System.out.println("고객 정보 입력 시스템을 종료합니다.");
                break;
            }
            System.out.print("체크인 날짜를 입력하세요. (예: 2025-01-01) : ");
            String date = sc.nextLine();

            System.out.print("방 번호를 입력하세요 : ");
            // String room = sc.nextLine();
            int room = sc.nextInt();

            sc.nextLine(); // nextInt 이후 생성되는 enter 처리

            // 방문자 정보 설정
            guest.setGuestName(name);
            guest.setCheckInDate(date);
            guest.setRoomNumber(room);
            /*
            필요한 타입 : class 파일에 속성명칭 왼쪽에 작성한 자료형 타입
                    int
            제공된 타입 : class 파일이랑 일치하지 않고, 추후 class 내부에 작성한 변수이름에 데이터를 저장하겠다. 설정한 타입
                    String
            클래스에 작성한 데이터 타입을 변경할 것인가? 클래스 내부에 작성한 변수이름에 알맞게
            전달할 데이터 타입을 수정할 것인가?

            클래스에 작성한 초기 데이터 타입은 수정 자제

             */
            guest.checkIn(); // 방문자 수 1 증가
            guest.guestInfo(); // 입력된 고객 정보
        }


        // 올바른 static 접근 방식
        System.out.println("전체 방문자 수 : " + GuestHouse.totalCount);

        sc.close(); // 스캔 출력을 종료
    }
}
