package edu.practice.day9;

import java.util.HashMap;
import java.util.Map;

public class MemberPointManager {
    Map<String, Integer> pointMap = new HashMap<>();

    void registerMember(String memberId){
        if(pointMap.containsKey(memberId)){
            System.out.println("이미 존재하는 ID 입니다.");
        }else{
            System.out.println(memberId + " 님이 신규 회원으로 등록되었습니다.");
        }
    }

    void earnPoints(String memberId, int points){
        if(pointMap.containsKey(memberId)){
            int totalPoint = pointMap.get(memberId) + points;
            System.out.println(memberId + " 님에게 " + points + " 포인트가 적립되었습니다." +
                    " 현재 포인트 : " + totalPoint
                    );
        }else{
            System.out.println("존재하지 않는 회원 ID입니다.");
        }
    }

    void usePoints(String memberId, int points){}

    void displayAllMembers(){}
}
