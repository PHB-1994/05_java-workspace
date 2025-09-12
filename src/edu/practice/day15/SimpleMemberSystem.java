package edu.practice.day15;

public class SimpleMemberSystem {
    public static void main(String[] args) {
        try {
            // MenuSystem 객체 생성 및 start() 호출
            MenuSystem menuSystem = new MenuSystem();
            menuSystem.start();

        } catch (Exception e) {
            // 예외 발생시 에러 메시지 출력
        }
    }
}