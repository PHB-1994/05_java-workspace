package edu.collection.pack1.ex1;

import java.util.ArrayList;
import java.util.List;

public class ListPracticeRun {
    // model, service, run 으로 나누지 않고 한 번에 실습
    // 메인메서드에서 모든 동작을 진행할 예정
    // 왜냐하면 List - ArrayList 를 단순히 익히기 위한 실습이기 때문에 한 번에 작성
    public static void main(String[] args) {
        // problem1(); // function javascript 처럼 기능 실행 가능
        // problem2();
        // problem3();
        // problem4();
        // problem5();
        problem6();
    }
 
    // void 앞에 static 이 붙는다는 것은 ... 변수이름에 의하여 호출되지 않고,
    // 기능을 단독적으로 호출할 수 있도록 사용한다는 의미
    /**
     * 문제 1: 나의 취미 리스트 만들기
      */
    public static void problem1(){
        // System.out.println("제대로 단독적으로 실행 가능한지 확인합시다.");
        // 1. String 타입의 ArrayList를 생성하세요
        // 2. 본인의 취미 3개를 추가하세요 (예: "게임", "독서", "요리")
        // 3. 리스트의 크기를 출력하세요
        // 4. 모든 취미를 출력하세요 (반복문 사용)
        List<String> strlist = new ArrayList<String>();
        strlist.add("게임");
        strlist.add("독서");
        strlist.add("요리");
        System.out.println(strlist.size());
        for(int i=0;i<strlist.size();i++){
            System.out.println(strlist.get(i));
        }
    }

    /**
     * 문제 2: 점수 관리 시스템
     */
    public static void problem2() {
        // 1. Integer 타입의 ArrayList를 생성하세요
        // 2. 시험 점수 5개를 추가하세요 (85, 90, 78, 92, 88)
        // 3. 3번째 점수(인덱스 2)를 95로 수정하세요
        // 4. 수정 후 모든 점수를 출력하세요
        // 5. 가장 첫 번째 점수를 제거하고, 제거된 점수를 출력하세요
        List<Integer> intlist = new ArrayList<>();
        intlist.add(85);
        intlist.add(90);
        intlist.add(78);
        intlist.add(92);
        intlist.add(88);

        System.out.println(intlist);
        intlist.set(2, 95);
        System.out.println(intlist);
        int target = intlist.remove(0);
        System.out.println(target);
        System.out.println(intlist);
    }

    /**
     * 문제 3: 음식 메뉴 검색
     */
    public static void problem3() {
        // 1. 음식 메뉴 리스트를 만들고 다음 메뉴를 추가하세요
        //    "김치찌개", "된장찌개", "불고기", "비빔밥", "냉면"
        // 2. "불고기"가 몇 번째 인덱스에 있는지 출력하세요
        // 3. "라면"이 메뉴에 있는지 확인하세요 (true/false 출력)
        // 4. "김치찌개"가 메뉴에 있는지 확인하세요
        // 5. 마지막 메뉴("냉면")를 제거하고 결과를 출력하세요

        List<String> foodList = new ArrayList<>();
        foodList.add("김치찌개");
        foodList.add("된장찌개");
        foodList.add("불고기");
        foodList.add("비빔밥");
        foodList.add("냉면");

        System.out.println(foodList);
        System.out.println("불고기 index 번호 : " + foodList.indexOf("불고기"));
        System.out.println("라면 메뉴 확인 : " + foodList.contains("라면"));
        System.out.println("김치찌개 메뉴 확인 : " + foodList.contains("김치찌개"));
        foodList.remove(4);
        System.out.println(foodList);
    }

    /**
     * 문제 4: 간단한 쇼핑 카트
     */
    public static void problem4() {
        // 1. 쇼핑 카트 리스트를 만드세요
        // 2. "사과", "바나나", "우유" 를 추가하세요
        // 3. 장바구니에 총 몇 개 상품이 있는지 출력하세요
        // 4. 2번째 상품을 "오렌지"로 바꾸세요
        // 5. 모든 상품을 "상품: 사과", "상품: 오렌지" 형태로 출력하세요

        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("사과");
        shoppingList.add("바나나");
        shoppingList.add("우유");

        System.out.println(shoppingList);
        System.out.println("장바구니 사이즈 : " + shoppingList.size());
        shoppingList.set(2,"오렌지");

        for(int i=0;i<shoppingList.size();i++){
            System.out.println("상품 : " + shoppingList.get(i));
        }
    }

    /**
     * 문제 5:
     */
    public static void problem5() {
        // 1. 숫자 리스트를 만들고 [1, 3, 5, 7, 9, 2, 4, 6, 8, 10] 을 추가하세요
        // 2. 짝수만 찾아서 출력하세요 (힌트: 숫자 % 2 == 0)
        // 3. 5보다 큰 숫자의 개수를 세어보세요
        // 4. 가장 큰 숫자를 찾아서 출력하세요

        List<Integer>   list = new ArrayList<>();

//        for(int i = 1; i <= 10; i++){
//            if(i % 2 != 0){
//                list.add(i);
//            }
//        }
//        for(int i = 1; i <= 10; i++){
//            if(i % 2 == 0){
//                list.add(i);
//            }
//        }
//        System.out.println(list);
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);

        System.out.println(list);
        for(int i=0;i<list.size();i++){
            if(list.get(i) % 2 == 0){
                System.out.println(list.get(i));
            }
        }

        int count = 0;

        for(int j=0;j<list.size();j++){
            if(list.get(j) > 5){
                count++;
            }
        }

        System.out.println("5보다 큰 수의 개수 : " + count);

        int max = list.get(0);

        for(int i=0;i<list.size();i++){
            max = Math.max(max,list.get(i));
        }

        System.out.println("가장 큰 수 : " + max);
    }

    public static void problem6(){
        // System.out.println("제대로 단독적으로 실행 가능한지 확인합시다.");
        // 1. String 타입의 ArrayList를 생성하세요
        // 2. 본인의 취미 3개를 추가하세요 (예: "게임", "독서", "요리")
        // 3. 리스트의 크기를 출력하세요
        // 4. 모든 취미를 출력하세요 (반복문 사용)
        List<String> strlist = new ArrayList<String>();
        strlist.add("게임");
        strlist.add("요리");
        strlist.add("독서");
        strlist.add("요리");
        strlist.add("요리");
        System.out.println(strlist);

        System.out.println("요리가 몇 번 쨰로 들어있나 ? : " + strlist.indexOf("요리"));
        // 요리가 몇 번 쨰로 들어있나 ? : 1
        // indexOf() 는 중복된 데이터가 여러 개 있을 경우 맨 앞에 있는 index 번호만 출력
        
        // 요리가 들어 있는 모든 index 를 보고 싶어요.
        for(int i=0;i<strlist.size();i++){
            if(strlist.get(i).equals("요리")){ // equals 문자열 비교하는 속성
                                               // equals 는 비교했을 때 동일하면 true 다르면 false
                System.out.println(i + " 번 째 위치");
            }
        }

    }
}
