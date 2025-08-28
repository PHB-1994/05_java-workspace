package edu.oop.field.pack3.ex;

public class GuestHouseRun2 {

    public static void main(String[] args) {
        System.out.println("=== 게스트하우스 방문자 관리 시스템 ===");

        GuestHouse guest = new GuestHouse();
        /***
         * Scanner 이용해서 고객의 정보 저장
         * while 문 활용해서 0 번을 입력하면 고객 정보 입력 종류
         */


        // 방문자 정보 설정
        guest.setGuestName("김여행");
        guest.setCheckInDate("2024-08-27");
        guest.setRoomNumber(201);



        // static 변수 확인
        // totalCount  최초 1회 실행이기 때문에 guest1 이라고 작성해서 호출하는 대신
        // GuestHouse 라는 클래스 이름으로 호출하는 것이 맞이므로
        // 자동완성에서 누락되는 것이 맞음
        System.out.println("guest1 이 보이는 총 방문자 수 : " + guest.totalCount); // GuestHouse.totalCount

        // 체크인 진행
        System.out.println("----- 체크인 후 방문자 수 변화 -----");
        guest.checkIn(); // 방문자 수 1 증가
        System.out.println("guest1 이 보이는 총 방문자 수 : " + guest.totalCount); // GuestHouse.totalCount
        // 30번째 줄에서 실행한 방문자 수는
        // 게스트 1번 사람만 보이는 방문자 수가 아니라 GuestHouser 클래스에서 자체적으로
        // 모든 게스트 하우스 사람들에게 제공하는 숫자이므로
        // 37번째 줄에서 보이는 총 방문자 수는 guset1, guset2 모두 방문한 카운트가 보이는 것이 맞음



        // 올바른 static 접근 방식
        System.out.println("전체 방문자 수 : " + GuestHouse.totalCount);

        System.out.println("=== 게스트 하우스 공통 정보 ==="); // 게스트 하우스 자체에서 제공
        System.out.println("게스트하수스 명 : " + GuestHouse.GUESTHOUSE_NAME);
        System.out.println("Wi-Fi 비밀번호 : " + GuestHouse.WIFI_PASSWORD);

        System.out.println("=== 게스트 하우스 운영 규정(static final) ===");
        System.out.println("체크인 시간 : " + GuestHouse.CHECK_IN_TIME);
        System.out.println("체크아웃 시간 : " + GuestHouse.CHECK_OUT_TIME);
        System.out.println("최대 숙박일 수 : " + GuestHouse.MAX_STAY_DAY + "일");
        System.out.println("최소 숙박일 수 : " + GuestHouse.MIN_STAY_DAY + "일");

        System.out.println("=== 방문자별 개별 정보 ===");
        guest.guestInfo(); // 게스트 하우스가 공통적으로 제공하는 것 아닌 방문자 개별로 알아야 하는 정보

    }
}
