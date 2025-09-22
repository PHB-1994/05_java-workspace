package edu.study.problem4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CafeRun {
    public static void main(String[] args) {
        Cafe cafe = new Cafe();

        // 메뉴 항목 생성 및 추가
        MenuItem americano = new MenuItem("아메리카노", 4000, "Coffee");
        MenuItem latte = new MenuItem("카페라떼", 4500, "Coffee");
        MenuItem cheesecake = new MenuItem("치즈케이크", 6000, "Dessert");

        cafe.addMenuItem(americano);
        cafe.addMenuItem(latte);
        cafe.addMenuItem(cheesecake);

        cafe.printMenu();
        System.out.println();

        // --- 실행 예시에 맞게 특정 시간으로 주문 생성 ---
        LocalDateTime time1 = LocalDateTime.of(2025, 9, 12, 14, 30, 15);
        LocalDateTime time2 = LocalDateTime.of(2025, 9, 12, 15, 1, 20);

        // 주문 1 생성
        Map<MenuItem, Integer> orderItems1 = new HashMap<>();
        orderItems1.put(americano, 2);
        orderItems1.put(cheesecake, 1);
        Order order1 = new Order(1, orderItems1, time1);
        cafe.placeOrder(order1);
        System.out.println("주문 1: 아메리카노 2개, 치즈케이크 1개 (주문시간: " + time1 + ")");

        // 주문 2 생성
        Map<MenuItem, Integer> orderItems2 = new HashMap<>();
        orderItems2.put(latte, 1);
        Order order2 = new Order(2, orderItems2, time2);
        cafe.placeOrder(order2);
        System.out.println("주문 2: 카페라떼 1개 (주문시간: " + time2 + ")");
        System.out.println();

        // 특정 날짜 매출 현황 조회
        LocalDate targetDate = LocalDate.of(2025, 9, 12);
        int totalSales = cafe.getSalesByDate(targetDate);
        System.out.println("=== " + targetDate + " 매출 현황 ===");
        System.out.println("총 매출: " + totalSales + "원");
        System.out.println();

        // 베스트 메뉴 Top 3 조회
//        List<Map.Entry<MenuItem, Integer>> topItems = cafe.getTopSellingItems(3);
//        System.out.println("=== 베스트 메뉴 Top 3 ===");
//        int rank = 1;
//        for (Map.Entry<MenuItem, Integer> entry : topItems) {
//            MenuItem item = entry.getKey();
//            Integer quantity = entry.getValue();
//            System.out.println(rank++ + ". " + item.getName() + " (" + quantity + "개)");
//        }
    }
}